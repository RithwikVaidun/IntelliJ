package APCS;

import java.text.DecimalFormat;
import java.util.Scanner;

public class StanDeviation {

    public static double getAvg(double[] n) {
        double sum = 0;
        double len = n.length;

        for (double value : n) {
            sum += value;
        }
        return sum/len;
    }
    static double getSum(double[]n) {
        double sum = 0;
        for (double value : n) {
            sum += value;
        }
        return sum;
    }

    public static String calcStanDev(double[] n){
        double avg = getAvg(n);
        DecimalFormat df = new DecimalFormat("##.###");


        for(int i = 0; i < n.length; i++){
            n[i] = Math.pow((n[i] - avg),2);
        }

        double num = getSum(n);
        double frac = num/(double)(n.length-1);
        return df.format(Math.sqrt(frac));
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int len = inp.nextInt();
        double[] a = new double[len];
        for(int i = 0; i < a.length; i++){
            a[i] = inp.nextDouble();
        }

//        double[] a = {1, -2, 4 ,-4 ,9 ,-6 ,16, -8, 25, -10};

        System.out.println("Please enter the integer array dimension: ");
        System.out.println("Please enter the array elements: ");
        System.out.println("Standard deviation = " + calcStanDev(a));

//        for (int value : a) {
//            System.out.print(value + " ");
//        }
    }
}
