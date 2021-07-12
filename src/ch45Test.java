import java.util.Scanner;

public class ch45Test {
    public static boolean isPrime(int n) {
        if(n == 1)
            return false;
        for(int i = 2; i < n; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isMersennePrime(int n){
        if(!isPrime(n))
            return false;
        return ((int) (n & n+1) == 0);
    }

    public static int nthMersennePrime(int n){
        int x = 4;
        for(int i = 0; i < 31; i++){
            if(isMersennePrime(x-1)){
                n--;
                if(n == 0)
                    return x-1;
            }
            x <<= 1; //x = 2 * x
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println(nthMersennePrime(3));


        while(true){
            int n = inp.nextInt();
            System.out.println(isMersennePrime(n)); //nthMersennePrime(n)
        }

    }
}
