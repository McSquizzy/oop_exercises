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
public class Square extends Rectangle {
    
    private int side;
    
    public static void main(String[] args) {
        
        Square newSquare = new Square(1, 1, 5);
        
        System.out.println(newSquare.getPerimeter());  //aus der Rectangle Klasse
        System.out.println(newSquare.getArea());  //aus der Rectangle Klasse
    }
    
    public Square(int x, int y, int side) {
        super(x, y, side, side);
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    
    public int getSide() {
        return side;
    }
}
