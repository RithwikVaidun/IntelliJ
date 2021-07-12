package ApCSA;

import java.util.Scanner;

public class Array {
    static int sum(int x[]) {
        int s = 0;
        for (int i = 0; i < x.length; i++) {
            s = s + x[i];
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");

        int n = input.nextInt();
        int a[] = new int [n];


        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i+1) + " of " + n);
            a[i] = input.nextInt();
        }

        System.out.println("The sum of " + n + " numbers is: " + sum(a));
    }
}
