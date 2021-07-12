package APCS;

import java.util.Scanner;

public class PrimeNumbers {
    static boolean isPrime (int n) {
        if(n == 1) return false;
        for (int x = 3; x < n/2; x+=2) {
            if (n%x == 0) {
                return false;
            }
        }
        return true;
    }

    public static int getPrime(int n) {
        int i = 3;
        int count = 1;

        while(true){
            if(isPrime(i)){
                count++;
                if(count == n)
                    return i;
            }
            i+=2;
        }

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        if(n == 1)
            System.out.println("enter integer n for nth prime (1st prime = 2): Prime #1 is 2");
        else
            System.out.println("enter integer n for nth prime (1st prime = 2): Prime #" + n + " is " + getPrime(n));
    }
}
