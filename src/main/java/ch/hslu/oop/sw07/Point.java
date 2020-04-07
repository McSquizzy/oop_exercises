/**
 * 
 * @author Lukas Mettler
 * @version (a version number or a date)
 */

package ch.hslu.oop.sw07;

import java.util.Objects;

public final class Point
{
    private int x;
    private int y;

    public static void main(String[] args) {
        
        Point point = new Point(2, 6);
        System.out.println(point.toString());
        System.out.println("Point is in quadrant: " + point.getQuadrant() + "");
    }
    
    /**
     * Constructor for objects of class Point
     * @param x
     * @param y 
     */
    public Point(int x, int y) {
        // initialise instance variables
        this.x = x;
        this.y = y;
    }
    
    //Aufgabe 1.3 d.)
    public Point(Point point) {
        this(2, 3);
        //this.x = point.x;
        //this.y = point.y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }

    /**
     * return quadrant in which point x/y is
     */
    public int getQuadrant() {
        if (x > 0 && y > 0){
            return 1; // 1. Quadrant
        } else if (x < 0 && y > 0){
            return 2; // 2. Quadrant
        } else if (x < 0 && y < 0){
            return 3; // 3. Quadrant
        } else if (x > 0 && y < 0){
            return 4; // 4. Quadrant
        } else if (x == 0 || y == 0){
            System.out.println("Punkt liegt auf Achse");
        } return 0; //Ungültige Eingabe
    }
    
    public void moveRelative(int x, int y) {
        this.x += x;
        this.y += y;
    }
    
    public void moveRelative(Point point) {
        this.x += point.x;
        this.y += point.y;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    
    @Override
    public final boolean equals(final Object object) {
        if (object == this) {                           //Test auf Identität
            return true;
        }
        if (!(object instanceof Point)) {               //Test auf denselben Typ und nicht null
            return false;
        }
        final Point other = (Point) object;             //Vergleich der Attributwerte
        return (other.x == this.x) && (other.y == this.y);
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(this.x, this.y);
    }
    
    
}