/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw09;

import java.util.Scanner;

/**
 *
 * @author lmettler
 */
public class ExceptionHandling {

    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Bitte Temperatur eingeben ('exit' zum Beenden): ");
            input = scanner.next();
            
            try {
                float value = Float.valueOf(input);
            } catch (NumberFormatException e) {
                System.err.println("Bitte eine Float Zahl eingeben...");
            }
        } while (!input.equals("exit"));
        System.out.println("Programm beendet.");
    }
}
