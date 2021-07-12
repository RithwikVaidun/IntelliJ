package APCS;

import java.util.Scanner;

public class FindGCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.print("Enter an integer: ");
        int n1 = input.nextInt();
        System.out.println("GCD = " + GCD(n, n1));
    }
    public static int GCD(int n1, int n2) {
        if (n2 != 0)
            return GCD(n2, n1 % n2);
        else
            return n1;
    }
}
