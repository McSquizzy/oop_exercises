/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw05;

/**
 * Stellt Auto dar mit:
 * Motor
 * Licht
 * 
 * @author lmettler
 */
public class Car implements Switchable, Named {

    public boolean state = false;
    String name;
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
        audi.setName("Audi S3");
        System.out.println(audi.isSwitchedOn());
        System.out.println("Motor an: " + audi.isEngineOn());
        System.out.println("Licht an: " + audi.isLightOn());
        System.out.println(audi.toString());
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

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Car{" + "state=" + state + ", name=" + name + '}';
    }
    
}
