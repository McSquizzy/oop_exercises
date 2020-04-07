/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw04;

import ch.hslu.oop.sw03.point.Point;

/**
 *
 * @author lmettler
 */

public class LineByPoint {
    
    private Point start;
    private Point end;

    /**
     * Constructor for objects of class Line
     * @param start
     * @param end
     */
    public LineByPoint(Point start, Point end) {
           setStartPoint(start);
           setEndPoint(end);
    }
    
    public static void main(String[] args) {
        
        Point start = new Point(1, 2);
        Point end = new Point(6, 8);
        
        LineByPoint line = new LineByPoint(start, end);
        
        System.out.println(line.getStartPoint());
        System.out.println(line.getEndPoint());
    }
    
    public Point getStartPoint() {
        return this.start;
    }
    
    public Point getEndPoint() {
        return this.end;
    }
    
    public final void setStartPoint(final Point start) {
        this.start = start;
    }
    
    public final void setEndPoint(final Point end) {
        this.end = end;
    }
    
    public void aufgabeF() {
        getStartPoint().setX(10);
        getStartPoint().setY(20);
    }
}