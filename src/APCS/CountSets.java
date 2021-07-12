package APCS;

import java.util.Scanner;

public class CountSets {
    public static int getCount(int[] n){
        int count = 0;
        for(int i = 0; i < n.length-1;){
            if(n[i] == n[i+1])
                count++;
            while(i < n.length-1 && n[i] == n[i+1])
                i++;
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int len = inp.nextInt();
        int[] a = new int[len];
        for(int i = 0; i < a.length; i++){
            a[i] = inp.nextInt();
        }
//        int[] a = {1,1,1,2,2,3,3,3,4,1};
        System.out.println(getCount(a));
    }
}
