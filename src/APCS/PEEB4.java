package APCS;

import java.util.Scanner;

public class PEEB4 {

    public static void main(String[] args){
        System.out.println("Calculate surface temperature as a function of");
        System.out.println("emissivity for the single-layer atmosphere model.");
        System.out.print("enter emissivity: emissivity (= absorptivity) = ");
        Scanner inp = new Scanner(System.in);
        double emi = inp.nextDouble();
        System.out.println(emi);

        double sigma = Math.pow(10, -8)*5.67;
        double t = Math.pow(((2*(1-.3)*342))/(sigma*(2-emi)), 0.25);
        int st = (int)Math.round(t);
        System.out.println("surface temperature = " + st +"K");
    }

}
