import java.util.ArrayList;
import java.util.Scanner;

public class FrequencyDistribution {

    public int getFrequency(String [] x) {

        return 2;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("How much data?");
        int n = inp.nextInt();

        String[] data;
        System.out.println("Enter data separated by comma");
        String row = inp.next();
        data = row.split(",");

        int count = 0;
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data.length; j++) {
                if(data[i].equals(data[j])) {
                    count++;
                }
            }
        }
        System.out.println(count);




    }
}
