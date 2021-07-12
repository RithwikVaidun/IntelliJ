import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {
   static void sort (int[] a) {
       System.out.println(Arrays.toString(a));
       for (int i = 0; i < a.length-1; i++) { //to find the highest ith item
           for (int j = 0; j < a.length - i - 1; j++) {
               if (a[j] > a[j+1]) {
                   int x = a[j];
                   a[j] = a[j+1];
                   a[j+1] = x;
               }
           }
           System.out.println(Arrays.toString(a));
       }
   }
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
       int[] x = new int[10];

       for (int i = 0; i < x.length; i++) {
           x[i] = inp.nextInt();
       }
        System.out.println("bubbleSort");
       sort(x);
        System.out.println();
    }
}
