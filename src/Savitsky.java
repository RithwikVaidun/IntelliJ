import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Savitsky {
    public static void main (String [] args)throws FileNotFoundException {
        DrawingPanel p = new DrawingPanel(800,400);
        Graphics g = p.getGraphics();
        Scanner inp = new Scanner(new File("C:\\Users\\Anita Vaidun\\IdeaProjects\\Explore\\src\\SGFilterData"));
        ArrayList<Float> data = new ArrayList<>();
        while (inp.hasNextLine()){
            int x = inp.nextInt();
            float y = inp.nextFloat();
            data.add(y);
            g.drawOval(x,400-Math.round(y),1,1);
        }

        for (int i = 10; i < 799; i += 24){
            g.setFont(new Font("SansSerif", Font.PLAIN, 9));
            g.drawString(""+(1960+i/12),i-5,397);
            g.drawLine(i,390,i,380);
        }

        inp = new Scanner(System.in);
        int[][] fil = new int[12][9];
        for (int i=0;i<9;i++){
            fil[8][i]=i-4;
        }

        System.out.println("select Savitsky-Golay filter: ");
        System.out.println("smoothing");
        System.out.println(" quadratic or cubic");
        System.out.println("   0    {   0, 0,-3,12,17,12,-3, 0,   0}");
        System.out.println("   1    {   0,-2, 3, 6, 7, 6, 3,-2,   0}");
        System.out.println("   2    {-21,14,39,54,59,54,39,14,-21}");

        System.out.println(" quartic or quintic");
        System.out.println("   3    { 0,   5,-30, 75,131, 75,-30,   5, 0}");
        System.out.println("   4    {15,-55, 30,135,179,135, 30,-55,15}");

        System.out.println();

        System.out.println("1st derivative");
        System.out.println(" linear or quadratic");
        System.out.println("   5    { 0, 0, 0,-1,0,1,0,0,0}");
        System.out.println("   6    { 0, 0,-2,-1,0,1,2,0,0}");
        System.out.println("   7    { 0,-3,-2,-1,0,1,2,3,0}");
        System.out.println("   8    {-4,-3,-2,-1,0,1,2,3,4}");

        System.out.println(" cubic or quartic");
        System.out.println("   9    { 0,    0,    1,   -8,0,   8, -1,   0,   0}");
        System.out.println("   10   { 0,   22, -67, -58,0, 58, 67,-22,   0}");
        System.out.println("   11   {86,-142,-193,-126,0,126,193,142,-86}");

        System.out.print("Enter an integer 0 - 11 corresponding to desired filter: ");
        int chooFlit = inp.nextInt();
        System.out.println();

        for (int i = 5; i < 795; i++){
            float YSum = 0;
            for (int j=0; j< 9; j++){
                YSum+= data.get(j+i-4)* fil[chooFlit][j];
            }
            g.drawOval(i,400-Math.round(4*YSum),1,1);
        }
    }
}
