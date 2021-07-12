package APCS;

import java.util.Scanner;

public class EuclidGCD {
    public static int getGCD(int a,int b) {
        if(a == 0)
            return b;
        if(b == 0)
            return a;
        return getGCD(b,a%b);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String x = inp.nextLine();
        String[] splited = x.split(" ");
        int n = Integer.parseInt(splited[0]);
        int k = Integer.parseInt(splited[1]);
        int gcd = getGCD(n,k);
        System.out.println("Enter positive integer a: ");
        System.out.println("Enter positive integer b: ");
        System.out.println("Greatest common divisor (GCD) = " + gcd);
    }
}
