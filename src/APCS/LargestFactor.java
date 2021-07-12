package APCS;

import java.util.Scanner;

public class LargestFactor {
    public static int findGreatest(int n) {
        int i = 2;
        int count = 0;
        while(i <= n/i){
            if(n % i == 0){
                return n/i;
            }
            i += (i%2 ==0) ? 1 : 2;
            count++;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        System.out.println(findGreatest(n));
//256203161
    }
}
