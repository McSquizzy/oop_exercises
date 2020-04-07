/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw04;

/**
 *
 * @author lmettler
 */
public class LineByVariables {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    /**
     * Constructor for objects of class Line
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    public LineByVariables(int x1, int y1, int x2, int y2) {
       this.x1 = x1;
       this.y1 = y1;
       this.x2 = x2;
       this.y2 = y2;
    }
    
    public int getX1() {
        return this.x1;
    }
    
    public int getY1() {
        return this.y1;
    }
    
    public int getX2() {
        return this.x2;
    }
    
    public int getY2() {
        return this.y2;
    }
    
    public void setX1(final int x1) {
        this.x1 = x1;
    }
    
    public void setY1(final int y1) {
        this.y1 = y1;
    }
    
    public void setX2(final int x2) {
        this.x2 = x2;
    }
    
    public void setY2(final int y2) {
        this.y2 = y2;
    }
}
