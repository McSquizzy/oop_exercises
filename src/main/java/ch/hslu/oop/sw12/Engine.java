/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw12;

import ch.hslu.oop.sw10.*;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lmettler
 */
public final class Engine implements Switchable {
    
    private int rpm;
    private Car car;
    private State state = State.OFF;
    // Datenstruktur zur Speicherung aller Listener.
    private final List<PropertyChangeListener> changeListeners = new ArrayList<>();
    
    public static void main(String[] args) {
        
        Engine engine = new Engine();
        engine.switchOn();
        //engine.switchOff();
        System.out.println(engine.rpm);
        System.out.println(engine.isSwitchedOn());
        System.out.println(engine.isSwitchedOff());
    }
    
    /**
     * Constructor
     */
    public Engine() {
        
        this.rpm = 0;
    }
    
    @Override
    public void switchOn() {
        if (this.isSwitchedOff()) {
            this.state = State.ON;
            this.rpm = 1000;
            final PropertyChangeEvent pcEvent = new PropertyChangeEvent(this, "state", State.OFF, State.ON);
            this.firePropertyChangeEvent(pcEvent);
        }
    }
    
    @Override
    public void switchOff() {
        if (this.isSwitchedOn()) {
            this.rpm = 0;
            this.state = State.OFF;
            final PropertyChangeEvent pcEvent = new PropertyChangeEvent(this, "state", State.ON, State.OFF);
            this.firePropertyChangeEvent(pcEvent);
        }
    }
    
    @Override
    public boolean isSwitchedOn() {
        return this.rpm != 0;
    }
    
    @Override
    public boolean isSwitchedOff() {
        return this.rpm == 0;
    }
    
    /**
     * Registriert einen PropertyChangeListener
     * @param listener
     */
    public void addPropertyChangeListener(final PropertyChangeListener listener) {
        this.changeListeners.add(listener);
    }
    
    /**
     * Deregistriert einen PropertyChangeListener
     * @param listener 
     */
    public void removePropertyChangeListener(final PropertyChangeListener listener) {
        this.changeListeners.remove(listener);
    }
    
    /**
     * Informiert alle PropertyChangeListeners über PropertyChangeEvent
     * @param pcEvent 
     */
    private void firePropertyChangeEvent(final PropertyChangeEvent pcEvent)  {
        for (final PropertyChangeListener listener : this.changeListeners) {
            listener.propertyChange(pcEvent);
        }
    }
    
    
}