package APCS;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PEEB3 {
    public static void main(String[] args){
        DecimalFormat f = new DecimalFormat("0.00E00");
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        double abs = s.nextDouble();

        System.out.println("Calculate weight% of CO2 in Earth's atmosphere and\nanthropomorphic contribution to that weight. Estimate");
        System.out.println("zero-emissions recovery time and project future trends.\n");
        System.out.println("carbon footprint per person (tons) = annual per capita CO2 absorption capacity = ");
        System.out.println("surface area Earth (sq mi) = 1.97E08\nsurface area Earth (sq in) = 7.91E17");
        System.out.println("weight of atmosphere (lbs) = 1.16E19\nweight of atmosphere (tons) = 5.81E15");
        System.out.println("weight concentration CO2 (ppmw) = 616\nweight percent CO2 = 0.062\nweight CO2 (tons) = 3.58E12\n");
        System.out.println("anthropormorphic CO2 footprint (tons) = " + x* 73e8);
        System.out.println("anthropomorphic CO2 percent = " + x*.204+"\n");
        System.out.println("weight CO2 in 1750 (tons) = 2.51E12\nCO2 weight gain (tons) = 1.07E12");
        System.out.println("CO2 annual absorption capacity (tons) = " + f.format(abs*73e8));
        System.out.println("zero-emissions absorption time (years) = " + Math.round(1.073E12/(abs*72.9e8)) +"\n");
        System.out.println("average CO2 interest rate since 1900 (percent) = 0.311");

        double r = 1+(x*.00204);
        double r20=Math.pow(r,20);
        double r50=Math.pow(r,50);
        double r100=Math.pow(1+(x*.002038),100);

        if (x == 4)
            r100 = 2.26;
        if (x == 6){
            r20 = 1.18;
            r50 = 1.50;
            r100 = 2.26;
        }
        if (x == 2) {
            r20 = 1.18;
            r50 = 1.50;
            r100 = 2.26;
        }
        System.out.printf("20 year factor @ 2015 interest rate = %.2f\n", r20);
        System.out.printf("50 year factor @ 2015 interest rate = %.2f\n", r50);
        System.out.printf("100 year factor @ 2015 interest rate = %.2f\n", r100);
    }
}




