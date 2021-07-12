import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class Keeling{

    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        int[][] Filters = new int[][]{
                {0,0,-3,12,17,12,-3,0,0},
                {0,-2,3,6,7,6,3,-2,0},
                {-21,14,39,54,59,54,39,14,-21},
                {0,5,-30,75,131,75,-30,5,0},
                {15,-55,30,135,179,135,30,-55,15},
                {0,0,0,-1,0,1,0,0,0},
                {0,0,-2,-1,0,1,2,0,0},
                {0,-3,-2,-1,0,1,2,3,0},
                {-4,-3,-2,-1,0,1,2,3,4},
                {0,0,1,-8,0,8,-1,0,0},
                {0,22,-67,-58,0,58,67,-22,0},
                {86,-142,-193,-126,0,126,193,142,-86}
        };

        System.out.println("select Savitsky-Golay filter: ");
        System.out.println("smoothing");
        System.out.println(" quadratic or cubic");
        System.out.println("  0   {  0, 0,-3,12,17,12,-3, 0,  0}");
        System.out.println("  1   {  0,-2, 3, 6, 7, 6, 3,-2,  0}");
        System.out.println("  2   {-21,14,39,54,59,54,39,14,-21}");
        System.out.println(" quartic or quintic");
        System.out.println("  3   { 0,  5,-30, 75,131, 75,-30,  5, 0}");
        System.out.println("  4   {15,-55, 30,135,179,135, 30,-55,15}");
        System.out.println();
        System.out.println("1st derivative");
        System.out.println(" linear or quadratic");
        System.out.println("  5   { 0, 0, 0,-1,0,1,0,0,0}");
        System.out.println("  6   { 0, 0,-2,-1,0,1,2,0,0}");
        System.out.println("  7   { 0,-3,-2,-1,0,1,2,3,0}");
        System.out.println("  8   {-4,-3,-2,-1,0,1,2,3,4}");
        System.out.println(" cubic or quartic");
        System.out.println("  9   { 0,   0,   1,  -8,0,  8, -1,  0,  0}");
        System.out.println("  10  { 0,  22, -67, -58,0, 58, 67,-22,  0}");
        System.out.println("  11  {86,-142,-193,-126,0,126,193,142,-86}");
        System.out.print("Enter an integer 0 - 11 corresponding to desired filter: ");

        int filt = console.nextInt();

        System.out.print("Enter interval size, in months, for smoothing data: ");
        int monthInt = console.nextInt();

        Scanner data = new Scanner(new File("C:\\Users\\Anita Vaidun\\IdeaProjects\\Explore\\src\\KeelingDataSavGol"));

        int[] xVals = new int[697];
        double[] yVals = new double[697];
        double[] avgVals = new double[697];
        int c = 0;

        for (int i = 0; i < 697; i ++) {
            xVals[i] = i;
        }
        while(data.hasNext()) {
            yVals[c] = data.nextDouble();
            c++;
        }

        DrawingPanel panel = new DrawingPanel(800, 400);
        Graphics g = panel.getGraphics();
        g.setFont(new Font("SansSerif", Font.PLAIN, 8));

        for (int i = 0; i < xVals.length; i ++) {
            g.drawOval(xVals[i], 399 - (int) Math.round(4 * (yVals[i] - 310)), 1, 1);

            if (i >= monthInt/2 && i < 697 - monthInt/2) {
                double avg = 0;
                for (int j = 0; j < monthInt; j++) {
                    avg += yVals[j+i-monthInt/2];
                }
                avg = avg/monthInt;
                avgVals[i] = avg;
                g.drawOval(xVals[i], 399 - (int) Math.round(4 * (avgVals[i] - 310)), 1, 1);
            }
        }

        for (int i = monthInt/2; i < 697 - monthInt/2; i ++) {
            double dVal = 0;
            for (int j = 0; j < 9; j ++) {
                dVal += avgVals[i - 4 + j] * Filters[filt][j];
            }
            g.drawOval(xVals[i], 399 - (int) Math.round(15*dVal), 1, 1);
        }

        for (int i = 0; i < 56/2 + 1; i ++) {
            g.drawLine(24*(i+1), 390, 24*(i+1), 380);
            g.drawString(Integer.toString(1960 + 2 * i), -10 + 24*(i + 1), 398);
        }
    }
}
