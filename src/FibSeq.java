import java.util.Scanner;

public class FibSeq {

    public static void main(String[] args) {
        long first = 0;
        long next = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number of terms: " );
        int x = inp.nextInt();

        System.out.println(first);
        System.out.println(next);

        for (int i = 2; i < x; i++) {
            long sum = first + next;
            first = next;
            next = sum;
            System.out.println(sum);
        }
    }

}
