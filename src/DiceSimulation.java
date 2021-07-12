import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class DiceSimulation {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int dSum = inp.nextInt();
        double nRolls = inp.nextDouble();

        Random r = new Random();

        double count = 0;
        for(int i = 0; i < nRolls; i++){
            int r1 = r.nextInt(6) + 1;
            int r2 = r.nextInt(6) + 1;
            if(r1 + r2 == dSum)
                count++;
        }
        double prob = count/nRolls;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println();
        System.out.println("Enter desired sum of two dice: Enter number of rolls: probability: " + df.format(prob) );
    }
}
