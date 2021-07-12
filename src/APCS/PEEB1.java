package APCS;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PEEB1 {
    public static double h = 6.626068e-34;
    public static double c = 299792500;
    public static double k = 1.38066E-23;
    public static double e = 2.718;

    public static double calcPowFlux(double temp, double wavelength) {
        wavelength = wavelength/Math.pow(10,6);

        double numerator = 2*h*(Math.pow(c,2.0)*(Math.pow(wavelength,-5.0)));
        double exp = (h*c) / (wavelength*k*temp);
        double denom = Math.pow(e,(exp)) - 1;
        return numerator/denom;
    }

    public static void main(String[] args) {
        DecimalFormat df1 = new DecimalFormat("0.00E00");

        Scanner inp = new Scanner(System.in);
        int wave = inp.nextInt();
        int t = inp.nextInt();

        double B = calcPowFlux(t,wave);
        System.out.println("Radiant photon flux at a given wavelength");
        System.out.println("and temperature using Planck's Law.");
        System.out.print("wavelength in microns: temperature in degrees Kelvin: ");
        System.out.println("radiant flux B = " + df1.format(B).toLowerCase() + " Wm-3steradian-1");

    }
}
