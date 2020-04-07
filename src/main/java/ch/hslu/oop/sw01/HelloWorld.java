/**
 *OOP-Intro.
 */

package ch.hslu.oop.sw01;
import java.util.Scanner;

public final class HelloWorld{

    /**
     * @param args not  used.
     */

    public static void main(final String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String name;
        int age;
        
        System.out.println("Whats your name? ");
        name = input.nextLine();
        System.out.println("How old are you? ");
        age = input.nextInt();
        
        System.out.printf("Your name is %s and you are %d years old.", name, age);      
    }
}