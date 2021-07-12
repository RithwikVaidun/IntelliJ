import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int len = inp.nextInt();
        int[] a = new int[len];
        for(int i = 0; i < a.length ;i++){
            a[i] = inp.nextInt();
        }
        int find = inp.nextInt();
        int ans = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == find){
                ans = i;
                break;
            }
            else
                ans = -1;
        }

        System.out.println("Enter number of elements in array: Enter " + len + " integers and the element to be searched: ");
        if(ans == -1)
            System.out.println("value " + find + " not found");
        else
            System.out.println("value " + find + " found at index " + ans);


//        for(int v : a)
//            System.out.print(v + " ");
//        System.out.println();
//        System.out.println("Find is " +find);
    }
}
