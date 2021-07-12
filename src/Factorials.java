import java.util.Scanner;

public class Factorials {
    public static long factorial(long n) {
        long ans = 1;
        for(long i = n; i > 1; i--) {
            ans = (ans*i)%179424691;
        }
        return ans;
    }

    public static long superfactorial(long n){
        long ans = 1;
        for(long i = n; i > 1; i--){
            ans = (ans *factorial(i))%179424691;
        }
        return ans;
    }

    public static long ultrafactorial(long n){
        long ans = 1;
        for(long i = n; i > 1; i--){
            ans = (ans *superfactorial(i))%179424691;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        System.out.println("Enter a natural number (non-negative integer): ");
        System.out.println("factorial       " + factorial(x));
        System.out.println("superfactorial: " + superfactorial(x));
        System.out.println("ultrafactorial: " + ultrafactorial(x));


    }
}
