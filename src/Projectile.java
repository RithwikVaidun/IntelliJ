import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Projectile {
    public static final double ACCELERATION = -9.81;

         public static void main(String[] args) {
             Scanner console = new Scanner(System.in);
             DrawingPanel panel = new DrawingPanel(1000, 600);



             //System.out.print("velocity (meters/second)? ");
             //double velocity = console.nextDouble();
             System.out.print("Please enter the start angle in degrees:");
             double angle = console.nextDouble();
             System.out.println("Please enter the final angle in degrees:");
             int lastAng = console.nextInt();
             System.out.println("Please enter the step size in degrees:");
             int degIncre = console.nextInt();
             //System.out.print("number of steps to display? ");
             //int steps = console.nextInt()
             for(double i = angle; i <= lastAng; i+= degIncre) {
                 printData(50,i,100,panel);
             }

         }

        public static void printData(double velocity, double angle, int steps, DrawingPanel p) {
            Graphics g = p.getGraphics();
            angle = Math.toRadians(angle);

            double xVelocity = velocity * Math.cos(angle);
            double yVelocity = velocity * Math.sin(angle);
            double totalTime = -2.0 * yVelocity / ACCELERATION;
            double timeIncrement = totalTime / steps;
            double xIncrement = xVelocity * timeIncrement;

            double x = 0.0;
            double y = 0.0;
            double t = 0.0;

            double greatestY = 0;
            double greatestX = 0;
            double[] yData = new double[steps];
            yData[0] = 0;
            double[] xData = new double[steps];
            xData[0] = 0;

            for (int i = 1; i < steps; i++) {
                t += timeIncrement;
                xData[i] += xData[i-1] + xIncrement;
                yData[i] =  displacement(yVelocity, t, ACCELERATION);

                if(yData[i] > greatestY)
                    greatestY = yData[i];
                if(xData[i] > greatestX)
                    greatestX = xData[i];
            }

            int scaleX = (int) (p.getWidth()/greatestX);
            int scaleY = (int) (p.getHeight()/greatestY);
            double scale = Math.min(scaleX, scaleY) - 0.5;

            for(int i = 0; i < steps; i++) {
                g.fillOval((int)((xData[i]*scale)+5) ,(int)(p.getHeight()-(yData[i]*scale)-5),5,5);
            }
         }







//    public static void printTable(double velocity, double angle, int steps) {
//         double xVelocity = velocity * Math.cos(angle);
//         double yVelocity = velocity * Math.sin(angle);
//         double totalTime = -2.0 * yVelocity / ACCELERATION;
//         double timeIncrement = totalTime / steps;
//         double xIncrement = xVelocity * timeIncrement;
//
//         double x = 0.0;
//         double y = 0.0;
//         double t = 0.0;
//         System.out.println("step\tx\ty\ttime");
//         System.out.println("0\t0.0\t0.0\t0.0");
//         for (int i = 1; i <= steps; i++) {
//             t += timeIncrement;
//             x += xIncrement;
//             y = displacement(yVelocity, t, ACCELERATION);
//             //System.out.println(i + "\t" + round2(x) + "\t" + round2(y) + "\t" + round2(t));
//             System.out.println(round2(y));
//             }
//         }




         public static void giveIntro() {
         System.out.println("This program computes the");
         System.out.println("trajectory of a projectile given");
         System.out.println("its initial velocity and its");
         System.out.println("angle relative to the");
         System.out.println("horizontal.");
         System.out.println();
         }


         public static double displacement(double v, double t, double a) {
         return v * t + 0.5 * a * t * t;
         }


         public static double round2(double n) {
         return Math.round(n * 100.0) / 100.0;
         }
 }


