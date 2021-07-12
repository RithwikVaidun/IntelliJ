import java.util.Arrays;
import java.util.Scanner;

public class sortInsertion {
    public static void sort(int a[]) {
        for (int i = 1; i < a.length; ++i) {
            int k = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > k) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = k;
            System.out.println(Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int[] a = new int[10];
        for(int i = 0; i < 10; i++){
            a[i] = inp.nextInt();
        }
        System.out.println("insertionSort");
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println();
    }
}
