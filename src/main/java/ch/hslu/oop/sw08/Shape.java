/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw08;

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
        
        Shape shape1 = new Circle(2, 7, 8);  //Shape = statischer Datentyp, Circle = dynamischer Datentyp
        Rectangle shape2 = new Rectangle(1, 2, 5, 8);
        
        shape1.move(4, 1);
        System.out.println(shape1.toString());
        
        shape2.changeDimension(12, 5);
        System.out.println(shape2.getHeight());
        System.out.println(shape2.getWidth());  
        
        Circle shape3 = new Circle(1, 2, 20);
        System.out.println(shape3.getDiameter()); //weil shape3 vom statischen Datentyp Circle ist, kann Methode getDiameter aufgerufen werden
        System.out.println(shape3.getArea());
        
        Square shape4 = new Square(1, 2, 3);
        System.out.println(shape4.getArea());
    }
    
    protected Shape(final int x, final int y) {
        this.x = x;
        this.y = y;
    }
    
    public final void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }
    
    public final int getX() {
        return this.x;
    }
    
    public final int getY() {
        return this.y;
    }
    
    public abstract double getPerimeter();
    
    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape{" + "x=" + x + ", y=" + y + '}';
    }
    
}
