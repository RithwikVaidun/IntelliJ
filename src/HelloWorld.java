import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.print("Enter another number");
        int number1 = input.nextInt();
        int sum = number + number1;

        System.out.println("The sum is " + sum);
        System.out.println("The difference is " + (number - number1));
        if (number > number1) {
            System.out.println(number + " is the greater number");
        } else if (number < number1) {
            System.out.println(number1 + " is the greater number");
        }
        else {
            System.out.println("Both are equal");
        }
        System.out.print("The first number squared plus the second number squared is " + ((number * number) + (number1 * number1)));
    }
}
