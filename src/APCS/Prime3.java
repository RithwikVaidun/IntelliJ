package APCS;

import java.util.Scanner;

public class Prime3 {
    public static boolean isPrime (int n) {
        if(n == 1 || (n > 2 && (n % 2 == 0)))
            return false;
        for (int x = 3; x < n/2; x+=2) {
            if (n%x == 0) {
                return false;
            }
        }
        return true;
    }

    public static int greatestPrimeLess(int n){
        if(n % 2 == 0)
            n = n-1;

        for(int i = n; i > 2; i -= 2){
            if(isPrime(i))
                return i;
        }
        return 2;
    }

    public static int leastPrimeAbove(int n) {
        if(n > 2 && n % 2 == 0)
            n = n+1;

        while(true) {
            if (isPrime(n))
                return n;
            n+=2;
        }
    }


    public static int greatestPFactor(int n){
        int greatest = 0;
        int i = 2;

        while(!isPrime(n)){
            if(n % i == 0){
                int f = n/i; // f is the other factor
                if(isPrime(i)) {
                    greatest = Math.max(greatest, i);
                }
                n = f;
                i = 1;
            }
            i += (i % 2 == 0) ? 1 : 2;
        }

        if (isPrime(n)) greatest = Math.max(greatest, n);
        return greatest;
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        while(true){
            int n = inp.nextInt();
            System.out.println(greatestPrimeLess(n));
            System.out.println(leastPrimeAbove(n));
            System.out.println(greatestPFactor(n));
        }
//        int n = inp.nextInt();
//        System.out.println(greatestPrimeLess(n));
//        System.out.println(leastPrimeAbove(n));
//        System.out.println(greatestPFactor(n));
    }

}
