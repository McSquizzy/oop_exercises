/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw10;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

/**
 *
 * @author lmettler
 */
public final class Car implements PropertyChangeListener, Switchable {
    
    private State state = State.OFF;
    private Engine engine;
    
    public static void main(String[] args) {
        Engine bmw = new Engine();
        bmw.switchOn();
        System.out.println(bmw.isSwitchedOn());
        
        Car x5m = new Car(bmw);
        x5m.switchOn();
        System.out.println(x5m.isSwitchedOn());
    }

    public Car(Engine engine) {
        this.engine = engine;
        this.engine = new Engine();
        
        //Sich selber als Listener registrieren
        this.engine.addPropertyChangeListener(this);
        
    }
    
    @Override
    public void switchOn() {
        state = State.ON;
    }

    @Override
    public void switchOff() {
        state = State.OFF;
    }

    @Override
    public boolean isSwitchedOn() {
        return state == State.ON;
    }

    @Override
    public boolean isSwitchedOff() {
        return state == State.OFF;
    }

    @Override
    public void propertyChange(final PropertyChangeEvent event) {
        if (event.getSource() == this.engine) {
            this.handleEngineEvent("Engine", event);
        }
    }

    private void handleEngineEvent(String Event_of_engine, PropertyChangeEvent event) {
        System.out.println("test");
    }
    
}
