package APCS;

import java.util.Scanner;

public class CBizz {
    public static int getSum(int x) {
        int ans = 0;
        for(int i = 1; i < x; i++){
            if(i % 15 == 0)
                ans += 0;
            else if(i % 3 == 0 || i % 5 == 0)
                ans += i;
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        System.out.println("Enter a positive integer: " + getSum(x));
    }
}
