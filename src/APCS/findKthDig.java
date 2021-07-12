package APCS;

import java.util.Scanner;

public class findKthDig {

    public static int getK(int n, int k) {
        k++;
        double pow = Math.pow(10.0,k);
        double pow1 = Math.pow(10.0, k-1);
        int x  = (int) pow1;
        return ((int) (n % pow) / x);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String x = inp.nextLine();
        String[] splited = x.split(" ");
        int n = Integer.parseInt(splited[0]);
        int k = Integer.parseInt(splited[1]);
        System.out.println(getK(n,k));
    }
}
