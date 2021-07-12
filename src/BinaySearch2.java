import java.util.Arrays;
import java.util.Scanner;

public class BinaySearch2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < num; i++){
            arr[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        Arrays.sort(arr);
        System.out.println(binarySearch(arr, x, 0, arr.length - 1));
    }
    public static int binarySearch(int[] arr, int x, int left, int right){
        if(left < arr.length - 1 && left <= right){
            int mid = left + right - 1 / 2;
            if(arr[mid] == x){
                return mid;
            }
            if(arr[mid] > x){
                return binarySearch(arr, x, left, mid - 1);
            }
            return binarySearch(arr, x, mid + 1, right);
        }
        return -1;
    }

}
