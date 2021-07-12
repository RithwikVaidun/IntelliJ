package APCS;

import java.text.DecimalFormat;
import java.util.Scanner;

public class real {
    public static double stringToRad(String x) {
        String[] splited = x.split(" ");
        double n = Integer.parseInt(splited[0]);
        double k = Integer.parseInt(splited[1]);
        double ans = n + (k / 60);
        return Math.toRadians(ans);
    }

    public static double getAngDist(double x, double y, double x1, double y1) {
        double change = y1 - y;
        double ans = Math.acos(Math.sin(x) * Math.sin(x1) + Math.cos(x) * Math.cos(x1) * Math.cos(change));
        return ans;
    }
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00000");

        Scanner inp = new Scanner(System.in);
        double x = stringToRad(inp.nextLine());
        double y = stringToRad(inp.nextLine());
        double x1 = stringToRad(inp.nextLine());
        double y1 = stringToRad(inp.nextLine());
        double dist = (6372.795 * getAngDist(x,y,x1,y1));
        int distKM =(int) (dist + 0.5);
        int distM = (int) ((dist * 0.621371) + 0.5);


        System.out.println();
        System.out.println("This program computes the spherical distance");
        System.out.println("between two points, 1 and 2");
        System.out.println();
        System.out.println("Please enter the latitude and longitude for");
        System.out.println("each point as a pair of integers, degrees");
        System.out.println("followed by minutes:");
        System.out.println();
        System.out.println("latitude 1: longitude 1: ");
        System.out.println("latitude 2: longitude 2: ");
        System.out.println("Angular distance = " + df.format(getAngDist(x,y,x1,y1)) + " radians");
        System.out.println("Distance = " + distKM + " kilometers");
        System.out.println("Distance = " + distM + " miles");
        System.out.println();

    }
}
