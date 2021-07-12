package APCS;

import java.util.Scanner;

public class Prime2 {
    public static int getPrime(int n){
        int ans = 1;
        int count = 1;
        boolean check;

        if(n==1)
            return 2;
        else if(n > 1){
            while(count < n){
                ans +=2;
                check = true;
                for (int i = 3; i <= (int)(Math.sqrt(ans)+1); i+= 2) {
                    if (ans % i == 0) {
                        check = false;
                        break;
                    }
                }
                if (check){
                    count++;
                    if(count % 100000 == 0)
                        System.out.println(ans);
                }
            }
        }

        return ans;
    }
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        System.out.println("enter integer n for nth prime (1st prime = 2): Prime #" + n + " is " + getPrime(n));

    }
}
