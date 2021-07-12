package APCS;

import java.util.Scanner;
//CODED IN ONE TRY LETS GO

public class lastIndexOf {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] a = new int[7];
        for(int i = 0; i < a.length; i++){
            a[i] = inp.nextInt();
        }
        int findI = inp.nextInt();

        int ans = -1;
        for(int i = 0; i < a.length; i++){
            if(a[i] == findI)
                ans = i;
        }
        System.out.println("Please enter seven elements of an integer array and a value: ");
        System.out.println("Last index of value = " + ans);

    }
}
