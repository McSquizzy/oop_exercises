/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw04;

/**
 * Stellt Auto dar mit:
 * Motor
 * Licht
 * 
 * @author lmettler
 */
public class Car implements Switchable {

    public boolean state = false;
    Engine engine = new Engine();
    Light light = new Light();

    /**
     * Constructor
     */
    public Car() {
        this.state = false;
    }
    
    public static void main(String[] args) {
        
        Car audi = new Car();
        audi.switchOn();
        //audi.switchOff();
        System.out.println(audi.isSwitchedOn());
        System.out.println("Motor an: " + audi.isEngineOn());
        System.out.println("Licht an: " + audi.isLightOn());
    }
    
    /**
     * nur zu Testzwecken für main Methode
     * @return 
     */
    public boolean isLightOn() {
        return light.isSwitchedOn();
    }
    
    public boolean isEngineOn() {
        return engine.isSwitchedOn();
    }
    
    /**
     * Override Methods
     */
    @Override
    public void switchOn() {
        this.state = true;
        this.engine.switchOn();
        this.light.switchOn();
    }

    @Override
    public void switchOff() {
        this.state = false;
        this.engine.switchOff();
        this.light.switchOff();
    }

    @Override
    public boolean isSwitchedOn() {
        return this.state == true;
    }

    @Override
    public boolean isSwitchedOff() {
        return this.state == false;
    }
    
}
