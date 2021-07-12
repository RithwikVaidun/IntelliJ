package APCS;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        printTriangle(n);
    }
    public static long factorial(long n) {
        long ans = 1;
        for(long i = n; i > 1; i--) {
            ans *= i;
        }
        return ans;
    }
    public static void printTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < rows - i-1; j++) {
                System.out.print("  ");
            }
            System.out.printf("%d", 1);
            for(int j = 1; j <= i; j++) {
                System.out.printf("%4d", (factorial(i))/(factorial(j)*factorial(i-j)));
            }
            System.out.println();
        }
    }
}