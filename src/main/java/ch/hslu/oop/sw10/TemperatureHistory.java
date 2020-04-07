/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author lmettler
 */
public final class TemperatureHistory {

    private final Collection<Temperature> history = new ArrayList<>();

    public void addTemperature(Temperature temp) {
        history.add(temp);
    }

    public void clearTemperature() {
        history.clear();
    }

    public int getHistorySize() {
        return history.size();
    }

    public float getMaxTemp() {
        if (history.size() > 0) {
            return Collections.max(history).getCelsius();
        } else {
            return 0;
        }
    }

    public float getMinTemp() {
        if (history.size() > 0) {
            return Collections.min(history).getCelsius();
        } else {
            return 0;
        }
    }

    public float getAverageTemp() {
        if (history.size() > 0) {
            Iterator<Temperature> iterator = history.iterator();
            float sum = 0;
            while (iterator.hasNext()) {
                final Temperature next = iterator.next();
                sum += next.getCelsius();
            }
            return sum / history.size();
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        TemperatureHistory obj = new TemperatureHistory();
        Scanner scan = new Scanner(System.in);  //System.in = input by the user

        System.out.println("Type in Temperature: ");
        System.out.println("Type 'exit' to quit");

        while (scan.hasNext()) {
            String input = scan.next();

            if (input.equals("exit")) {
                System.out.println("History Size: " + obj.getHistorySize() + "");
                System.out.println("MaxTemp: " + obj.getMaxTemp() + "");
                System.out.println("MinTemp: " + obj.getMinTemp() + "");
                System.out.println("AverageTemp: " + obj.getAverageTemp() + "");
                break;
            } else {
                try {
                    float temp1 = Float.parseFloat(input);
                    Temperature temp = new Temperature(temp1);
                    obj.addTemperature(temp);
                } catch (NumberFormatException e) {
                    System.out.println("please enter a number or quit with 'exit'");
                }

            }
        }

    }

}
