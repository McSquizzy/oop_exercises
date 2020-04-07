/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw06;

/**
 *
 * @author lmettler
 */
public abstract class Shape {
    
    private int x;
    private int y;
    
    public static void main(String[] args) {
        
        /**
         * Statischer Datentyp: zur Programmierzeit  (SHAPE shape1 = new Circle())
         * Dynamischer Datentyp: zur Laufzeit (Shape shape1 = new CIRCLE())
         */
        
        Shape shape1 = new Circle(2, 7, 8);  //Shape = statischer Datentyp, Circle = dynamischer Datentyp    impizites Upcasting
        Shape shape2 = (Shape) new Rectangle(1, 2, 5, 8); //explizite Angabe des Upcasting (nicht zwingend nötig) (Rectangle wird zu Shape)
        
        shape1.move(4, 1);
        System.out.println(shape1.toString());
        
        Circle shape3 = new Circle(1, 2, 20);
        System.out.println(shape3.getDiameter()); //weil shape3 vom statischen Datentyp Circle ist, kann Methode getDiameter aufgerufen werden
    }
    
    protected Shape(final int x, final int y) {
        this.x = x;
        this.y = y;
    }
    
    public void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public abstract double getPerimeter();
    
    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape{" + "x=" + x + ", y=" + y + '}';
    }
    
}
