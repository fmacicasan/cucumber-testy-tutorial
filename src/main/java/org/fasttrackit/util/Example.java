package org.fasttrackit.util;

/**
 * @author flo
 * @since 08/12/2016.
 */
public class Example {
    public static void main(String[] a) {
        System.out.println("main body");

        int sum = Calc.add(2, 8);
        System.out.println("Sum is:" + sum);
    }

}

class Calc {
    public static int add(int a, int b) {
        return a + b;
    }
}
