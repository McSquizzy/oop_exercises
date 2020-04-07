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
public class Square extends Shape {
    
    private int side;
    
    public static void main(String[] args) {
        
        Square newSquare = new Square(1, 1, 5);
        System.out.println(newSquare.getSide());
        
        newSquare.setSide(9);
        System.out.println(newSquare.getSide());
        
        System.out.println(newSquare.getPerimeter());
        System.out.println(newSquare.getArea());
    }
    
    public Square(int x, int y, int side) {
        super(x, y);
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    
    public int getSide() {
        return side;
    }
        
    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }
    
    @Override
    public double getArea() {
        return this.side * this.side;
    }   
}
