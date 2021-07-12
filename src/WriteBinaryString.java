import java.util.Scanner;

public class WriteBinaryString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = scanner.nextInt();
        //System.out.print("Binary expression: ");
        if(x < 0){
            System.out.print("-");
        }
        binary(Math.abs(x));
        System.out.println();
    }
    public static void binary(int x){
        if(x < 0){
            System.out.print(Integer.toBinaryString(x).substring(25));
        }
        if(x > 1){
            binary(x / 2);
        }
        System.out.print(x % 2);
    }
    public static String writeBinary(int x){
        x = Math.abs(x);
        if(x == 0){
            return "0";
        }
        return writeBinary(x / 2) + (x % 2);
    }
}

