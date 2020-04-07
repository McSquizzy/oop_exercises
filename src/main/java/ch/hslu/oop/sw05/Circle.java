/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw05;

/**
 *
 * @author lmettler
 */
public class Circle extends Shape {
    
    private double diameter;
    
    public static void main(String[] args) {
        
        Circle newCircle = new Circle(1, 1, 12);
        System.out.println(newCircle.getDiameter());
        
        newCircle.setDiameter(8);
        System.out.println(newCircle.getPerimeter());
        System.out.println(newCircle.getArea());
    }
    
    /**
     * 
     * @param x
     * @param y
     * @param diameter 
     */
    public Circle(int x, int y, float diameter) {
        super(x, y);
        this.diameter = diameter;
    }
    
    
    public final void setDiameter(final float diameter) {
        this.diameter = diameter;
    }
    
    
    public final double getDiameter() {
        return this.diameter;
    }
    
    /** 
    @Override
    public int getPerimeter() {
        double circ = this.diameter * Math.PI; //Berechnung Umfang
        int perimeter = (int)circ;  //convert double to int
        return perimeter;
    }*/
    
    /**
     * 
     * @return 
     */
    @Override
    public double getPerimeter() {
        return this.diameter * Math.PI;
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public double getArea() {
        double radius = diameter / 2;
        return radius * radius * Math.PI;
    }
}
