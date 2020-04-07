

/**
 * Write a description of class Demo here.
 *
 * @author Lukas Mettler
 * @version 10.10.19
 */

package ch.hslu.oop.sw03.ifelse;

import java.util.Scanner;

public class Demo
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);  //System.in = input by the user
        System.out.println("Type in value for a: ");
        int a = input.nextInt();
        System.out.println("Type in value for b: ");
        int b = input.nextInt();
        System.out.println("Type in value for c: ");
        int c = input.nextInt();
        
        Demo value = new Demo();
        System.out.printf("Maximum of %d and %d is: %d\n", a, b, value.max(a, b));
        System.out.printf("Minimum of %d and %d is: %d\n", a, b, value.min(a, b));
        System.out.printf("Maximum of %d and %d and %d is: %d\n", a, b, c, value.max1(a, b, c));
        System.out.printf("Maximum of %d and %d and %d is: %d\n", a, b, c, value.max2(a, b, c));

    }

    // a.)
    public int max(final int  a, final int b) {
        if (a >= b) {
            return a;        
        } else {
            return b;
        }
    }

    public int min(final int a, final int b) {
        if (a >= b) {
            return b;        
        } else {
            return a;
        }
    }
    
    // b.)
    public int max1(final int a, final int b, final int c) {
        if (a > b && a > c) {
            return a;        
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    public int max2(final int a, final int b, final int c) { 
        return max(max(a,b),c);
    }
}
