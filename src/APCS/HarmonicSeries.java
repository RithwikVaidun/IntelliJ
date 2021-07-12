package APCS;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HarmonicSeries {
    static double sum = 0;
    static long count = 0;
    public static void getInfo(double n) {
        double i = 1;
        while(true) {
            sum += 1/i;
            count++;
            i++;
            if (sum > n) {
//                System.out.printf("Actual sum = %.5f", sum);
//                System.out.println();
//                System.out.println("Number of terms required: " + count);
                return;
            }
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        double n = inp.nextDouble();

        final long startTime = System.nanoTime();
        getInfo(n);
        final long endTime = System.nanoTime();

        long timeN = (endTime - startTime);
        float timePTermN =  ((float) timeN) / count;

        System.out.print(n + ", " + sum + ", " + count + ", " + timeN / 1000000 + ", " + df.format(timePTermN));

    }
}
