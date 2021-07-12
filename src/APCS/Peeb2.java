package APCS;

import java.util.Scanner;

public class Peeb2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String planet = inp.next();

        double distance = inp.nextDouble();

        int radius = inp.nextInt();

        double albedo = inp.nextDouble();

        double phSP = (64.2*(Math.pow(10,6)*Math.pow(700000,2))/Math.pow((distance*1.5*Math.pow(10, 8)), 2));
        double tempK = (phSP/4*(1-albedo)) / (Math.pow(10,-8)*(5.67));



        System.out.println("Calculate radiant power per unit area for Sun and Planet using");
        System.out.println("Stefan-Boltzman Law. From balance equation for Planet,");
        System.out.println("(Power in) = (Power out), predict temperature of Planet.");
        System.out.println("Planet: distance of Planet from Sun (AU): radius of Planet (km): albedo of Planet: photon flux SP = " + Math.round(phSP));
        System.out.println("average photon flux SAve = " + Math.round((phSP/4)));
        System.out.println("including albedo SAve x (1 - alpha) = " + Math.round(phSP/4*(1-albedo)));
        System.out.println("temperature TP (K) = " + Math.round(Math.sqrt(Math.sqrt(tempK))));
        System.out.println("temperature TP (C) = " + Math.round(Math.sqrt(Math.sqrt(tempK))-273.15));



    }
}
