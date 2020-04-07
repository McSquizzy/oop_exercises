
/**
 * Write a description of class Demo here.
 *
 * @author Lukas Mettler
 * @version 11.10.19
 */

package ch.hslu.oop.sw03.loop;

public class Demo
{
    // instance variables - replace the example below with your own
    //private int a;
    
    public static void main(String[] args) {
        while0to10();
        printBox(5, 5);
        dowhile0to10();
        forloop0to10();
        whilefloat();
    }

    // a.)
    public static void while0to10() {
        int i = 0;
        
        while (i <= 10) {
            System.out.println(i);
            ++i;
        }
    }

    // b.)
    public static void dowhile0to10() {
        int i = 0;
        
        do {
            System.out.println(i);
            ++i;
        } while (i <= 10);
    }

    public static void forloop0to10() {
        for (int i = 0 ; i <= 10 ; i++ ) {
            System.out.println(i);                
        }
    }

    // c.)
    public static void whilefloat() {
        float i = 0.9f;
        int count = 0;

        while (i <= 1.0f) {
            i = i + 0.000025f;
            System.out.println(i);
            ++count;
        }

        System.out.println(count);
    }

    public static void forloop4000() {
        float i = 0.9f;

        for (int c = 0; c <= 4000; c++) {
            System.out.println(i);
            i = i + 0.000025f;
        }
    }

    // f.)
    public static void printBox(final int height, final int with) {
        System.out.print("\n");

        for (int w = 1 ; w <= with ; w++ ) {
            System.out.print("#");
        }

        System.out.print("\n");

        for (int h = 1 ; h <= height-2 ; h++ ) {
            System.out.print("#");

            for (int x = 0 ; x < with-2 ; x++ ) {
                System.out.print(" ");
                //int with = with - 1
            }

            System.out.print("#");
            System.out.print("\n");
        }

        for (int w = 1 ; w <= with ; w++ ) {
            System.out.print("#");
        }
    }
}
