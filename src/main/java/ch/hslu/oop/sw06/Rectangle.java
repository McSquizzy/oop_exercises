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
public class Rectangle extends Shape {
    
    private int height;
    private int width;
    
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle(1, 1, 4, 5);
        System.out.println(rectangle.toString());
        
        rectangle.changeDimension(20, 30);
        System.out.println(rectangle.toString());
        
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
    }
    
    /**
     * Constructor for objects of class Rectangle
     * @param x
     * @param y
     * @param height
     * @param width 
     */
    public Rectangle(int x, int y, int height, int width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }
    
    public void changeDimension(int newHeight, int newWidth) {
        this.height = newHeight;
        this.width = newWidth;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public int getWidth() {
        return this.width;
    }
    
    @Override
    public double getPerimeter() {
        return 2 * (this.height + this.width);
    }
    
    @Override
    public double getArea() {
        return this.height * this.width;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "height=" + height + ", width=" + width + '}';
    }
    
}
