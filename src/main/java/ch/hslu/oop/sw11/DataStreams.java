/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;

/**
 *
 * @author lmettler
 */
public class DataStreams {

    public static void readFromFile(final String file) {
        if (new File(file).exists()) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), Charset.forName("UTF-8")))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public static void writeToFile(final String file) {
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), Charset.forName("UTF-8"))))) {
            pw.println("Euro € und Umlaute äöü- alles da!");
            pw.println("Plattformunabhängig fix mit UTF-8 encodiert!");
            pw.flush();
        } catch (FileNotFoundException e) {
            System.out.println("Exception");
        }
    }

    public static void main(String[] args) {
        DataStreams.readFromFile("/home/lmettler/test.txt");
        //DataStreams.writeToFile("/home/lmettler/test.txt");
    }
 
}
