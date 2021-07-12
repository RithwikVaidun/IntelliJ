import java.util.Scanner;

public class SigFig {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number");
            String str = input.next();
            int start = 0;
            int end = str.length() - 1; //index value
            if (!str.contains(".")) {  //no decimal. removing leading and trailing zeros
                while (str.charAt(start) == '0' && start < end) start++; //to remove leading zeroes
                while (str.charAt(end) == '0' && end > start) end--;
            } else {
                while (str.charAt(start) == '0' && start <= end) start++;
                start++;

            }
            System.out.println("SigFig for " + str + " is " + (end - start + 1)); //to remove leading zeros
        }
    }
}
