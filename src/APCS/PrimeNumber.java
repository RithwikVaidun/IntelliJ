package APCS;

import java.util.Scanner;

public class PrimeNumber {
    static boolean isPrime (int n) {
        if(n == 1) return false;
        for (int x = 3; x < n/2; x+=2) {
            if (n%x == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        while (true) {
            Scanner kbd = new Scanner(System.in);
            System.out.println("Enter a number");
            int number = kbd.nextInt();
            if (number == 0)
                break;
            if (isPrime(number))
                System.out.println(number + " is a prime number");
            else
                System.out.println(number + " is not a prime number");
        }
    }
}
