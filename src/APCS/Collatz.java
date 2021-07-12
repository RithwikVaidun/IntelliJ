package APCS;

import java.util.Scanner;

public class Collatz {
    public static int numSeq(int n){
        int count = 0;
        while(n != 1){
            if(n % 2 == 0)
                n /= 2;
            else
                n = 3*n + 1;
            count++;
        }
        return count+1;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number of terms followed by terms: ");
        int numN = inp.nextInt();
        int greatest = 0;
        for(int i = 0; i < numN; i++){
            int n = inp.nextInt();
            int length = numSeq(n);
            System.out.println(length);
            if(length > greatest)
                greatest = length;
        }

        System.out.println("Longest: " + greatest);
    }
}
