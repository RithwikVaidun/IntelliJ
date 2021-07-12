import java.util.Scanner;

public class ProjectileBook {
    public static final double ACCELERATION = -9.81;

    public static void main(String[] args) {
         Scanner console = new Scanner(System.in);
         giveIntro();

         //System.out.print("velocity (meters/second)? ");
         double velocity = console.nextDouble();
         //System.out.print("angle (degrees)? ");
         double angle = Math.toRadians(console.nextDouble());
         //System.out.print("number of steps to display? ");
         int steps = console.nextInt();
         System.out.println();

         printTable(velocity, angle, steps);
    }


    public static void printTable(double velocity, double angle, int steps) {
         double xVelocity = velocity * Math.cos(angle);
         double yVelocity = velocity * Math.sin(angle);
         double totalTime = -2.0 * yVelocity / ACCELERATION;
         double timeIncrement = totalTime / steps;
         double xIncrement = xVelocity * timeIncrement;

         double x = 0.0;
         double y = 0.0;
         double t = 0.0;
         System.out.println("step\tx\ty\ttime");
         System.out.println("0\t\t0.0\t0.0\t0.0");
         for (int i = 1; i <= steps; i++) {
             t += timeIncrement;
             x += xIncrement;
             y = displacement(yVelocity, t, ACCELERATION);
             System.out.println(i + "\t" + round2(x) + "\t" +
                     round2(y) + "\t" + round2(t));
             }
    }


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

