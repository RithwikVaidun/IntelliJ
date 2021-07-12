package APCS;

import java.util.Scanner;

public class greatestDeviation {
    public static double getAvg(int[] n) {
        double sum = 0;
        double len = n.length;

        for (double value : n) {
            sum += value;
        }
        return sum/len;
    }

    public static int greatestDevi(int[] n){
        double avg = getAvg(n);
        double gDev = Math.abs(n[0] - avg);
        int ans = n[0];
        for(int i = 0; i < n.length; i++){
            if(Math.abs(n[i] - avg) > gDev)
                ans = n[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int len = inp.nextInt();
        int[] a = new int[len];
        for(int i = 0; i < a.length; i++){
            a[i] = inp.nextInt();
        }
        System.out.println(greatestDevi(a));

    }
}
