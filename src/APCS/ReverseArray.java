package APCS;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static int[] getReverse(int[] n) {
        int[] temp = new int[n.length];
        for(int i = 1; i <= n.length; i++){
            temp[i-1] = n[n.length-i];
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int len = inp.nextInt();
        int[] a = new int[len];
        for(int i = 0; i < a.length; i++){
            a[i] = inp.nextInt();
        }
        int[] ans = getReverse(a);
        System.out.print(Arrays.toString(ans));

    }
}
