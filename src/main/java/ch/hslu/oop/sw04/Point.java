/**
 * Übung Kontrollstrukturen
 * 
 * @author Lukas Mettler
 * @version (a version number or a date)
 */

package ch.hslu.oop.sw04;

public final class Point
{
    private int x;
    private int y;

    public static void main(String[] args) {
        
        Point point = new Point(1, 6);
        System.out.println(point.toString());
        System.out.printf("Point is in quadrant: %d", point.getQuadrant());
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
    
    public void setX(final int x) {
        this.x = x;
    }
    
    public void setY(final int y) {
        this.y = y;
    }

    /**
     * return quadrant in which point x/y is
     */
    public int getQuadrant(){
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

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    
}