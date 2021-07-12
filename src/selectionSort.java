import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {

    public static void swap(int[] a, int x, int y){
        int t = a[x];
        a[x] = a[y];
        a[y] = t;
        //System.out.println(Arrays.toString(a));
    }

    public static int getMin(int[] a,int s) {
        int min = a[s];
        int ans = s;

        for (int i = s; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                ans = i;
            }
        }
        return ans;
    }
    public static void printSteps(int[] a){
        System.out.println(Arrays.toString(a));
        for(int i = 0; i < a.length-1; i++){
            int small = getMin(a,i);
            swap(a,i,small);
            System.out.println(Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int[] a = new int[10];
        for(int i = 0; i < 10; i++){
            a[i] = inp.nextInt();
        }
        System.out.println("selectionSort");
        printSteps(a);
        System.out.println();

    }
}
