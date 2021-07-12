package APCS;

import java.util.Scanner;

public class AddE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of integer array: ");
        int x = input.nextInt();
        System.out.println("Enter n integers separated by spaces: ");

        int[] ar = new int[x];
        for (int i = 0; i < x; i++){
            int n = input.nextInt();
            ar[i] = n;
        }
        System.out.println("The sum of the elements in your list: " + add(ar, ar.length));
    }
    public static int add(int A[], int n) {
        if (n <= 0)
            return 0;
        return (add(A, n - 1) + A[n - 1]);
    }
}

