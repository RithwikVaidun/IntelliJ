package APCS;

import java.util.Scanner;

public class calc4 {
    public static double getDouble(Scanner x, String z) {
        System.out.print(z);
        double r = x.nextDouble();
        return r;
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println();

        double num1 = getDouble(console,"Please enter your first  number: ");
        double num2 = getDouble(console,"Please enter your second number: ");
        System.out.println();

        System.out.println("sum        = " + (num1 + num2));
        System.out.println("difference = " + (num1 - num2));
        System.out.println("product    = " + (num1 * num2));
        System.out.println("quotient   = " + (num1 / num2));
        System.out.println();


    }
}
