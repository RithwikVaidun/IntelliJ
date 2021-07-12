import java.util.Scanner;

public class StatsBook {
    public static int[][] prob = new int[][] {{8,9,8,9},{0,6,5,7}};
    //public static int[][] tests = new int[][] {{3,4,1,10},{2,1,6,9},{1,2,7,10},{3,9,10,5}};
    public static int state; //0 = success, 1 = fail
    //Problem 6.81

    public static int getRand(int min, int max) {
        return (int) ((Math.random() * max) + min);
    }

    public static void getStats(int x) {
        int success = 0;

       // x = tests.length;
        for(int i = 0; i < x; i++){
            state = 0;
            for(int t = 0; t < prob[state].length; t++){
               int p = getRand(1,10);
               // int p = tests[i][t];

                if(p <= prob[state][t])
                    state = 0;
                else state = 1;
                //System.out.println("state = " + state + " P = " + p);
            }

            if(state == 0)
                success++;
        }

        System.out.println("For " +  x + " trials, " + success/(double)x + " were on time");

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("How many trials?");
        while(true){
            int numT = inp.nextInt();
            getStats(numT);
            if(numT == 0)
                break;
        }

    }
}
