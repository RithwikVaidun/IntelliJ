import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = inp.nextInt();
        int z = 1;
        for (int i = 1; i <= x; i++) {
             z = z*i;
        }
        System.out.println(z);

    }
}