package APCS.Point;

import APCS.Point.Point;

import java.util.Scanner;


public class PointClient {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //System.out.println("mooDefault = (0, 0)");
        System.out.print("Enter x-value: ");
        int x = inp.nextInt();
        System.out.print("Enter y-value: ");
        int y = inp.nextInt();
        Point moo = new Point(x,y);

        System.out.println("moo = " + moo.toString());

        moo.translate(2,2);
        moo.setXY(moo.getX(),0);
        moo.translate(0,19);
        moo.setXY(moo.getY(),moo.getX());
        System.out.println("(" + moo.getX() + ", " + moo.getY() + ")");

        System.out.println("Quadrant: " + moo.getQuadrant());
        System.out.println("Distance to origin: " + moo.distanceToOrigin());
        System.out.println("slope = " + moo.slope(moo));
    }
}
