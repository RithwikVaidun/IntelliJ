import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        int a[] = {1,4,63,2,6,23,4,8,9,3,99};
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter a number to find: ");
        int number = kbd.nextInt();
        boolean found = false;
        for (int i = 0; i<a.length; i++) {
            if (number == a[i] ) {
                found = true;
                System.out.println( number + " is in position " + (i +1));
                break;
            }
        }
        if (!found)
            System.out.println(number + " is not in the array");
    }
}
