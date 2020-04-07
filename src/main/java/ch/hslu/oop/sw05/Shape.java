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
public abstract class Shape {
    
    private int x;
    private int y;
    
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
    
}
