package APCS;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PEEB1Graph {
    public static double h = 6.626068e-34;
    public static double c = 299792500;
    public static double k = 1.38066E-23;
    public static double e = 2.718;

    public static double calcPowFlux(double temp, double wavelength) {
        wavelength = wavelength / Math.pow(10, 6);

        double numerator = 2 * h * (Math.pow(c, 2.0) * (Math.pow(wavelength, -5.0)));
        double exp = (h * c) / (wavelength * k * temp);
        double denom = Math.pow(e, (exp)) - 1;
        return numerator / denom;
    }

    public static void main(String[] args) {
        DecimalFormat df1 = new DecimalFormat("0.00E00");
        DecimalFormat r = new DecimalFormat("0.0");
        int t1 = 5800;
        int t2 = 288;

        for(double i = 0.1; i <= 0.8; i += 0.1) {
            System.out.println(r.format(i) + ", " + df1.format(calcPowFlux(t1,i)).toLowerCase() + ", " + df1.format(calcPowFlux(t2,i)).toLowerCase());
        }

        for(int i = 1; i <= 8; i++) {
            System.out.println(r.format(i) + ", " + df1.format(calcPowFlux(t1,i)).toLowerCase() + ", " + df1.format(calcPowFlux(t2,i)).toLowerCase());
        }

        for(int i = 10; i <= 80; i+=10) {
            System.out.println(r.format(i) + ", " + df1.format(calcPowFlux(t1,i)).toLowerCase() + ", " + df1.format(calcPowFlux(t2,i)).toLowerCase());
        }

    }
}
