public class Methods {

    public static int factorial(int x) {
        int z = 1;
        for (int i = 1; i <= x; i++) {
            z = z*i;
        }
        return z;
    }

    public static int exp(int base, int exp) {
        int ans = 1;
        for(int i = 0; i<exp; i++) {
            ans = ans*base;
        }
        return ans;
    }

    public static int log2(int x) {
        int q = 0;
        for(; x > 1; x /= 2) {
            q++;
        }
        return q;
    }

    public static String backwards(String stg) {
        String kb = "";
        for (int i = stg.length() - 1; i >= 0; i--) {
            kb = kb + stg.charAt(i);
        }
        return kb;
    }

    public static String oddlyBackwards(String s){
        String back = backwards(s);
        String ans = "";


        for(int i = 0; i < back.length(); i+=2) {
            ans = ans +  (back.charAt(i));
        }
        return  ans;
    }

    public static String doublestr(String s) {
        String ans = "";
        for(int i = 0; i < s.length(); i++) {
            ans = ans + s.charAt(i) + s.charAt(i);
        }
        return ans;
    }
    public static boolean isPrime (int n) {
        if(n == 1 || (n > 2 && n % 2 == 0)) return false;
        for (int i = 3; i < n/2; i+=2) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int getRand(int min, int max) {
        return (int) ((Math.random() * max) + min);
    }

    public static boolean consecutive(int a, int b, int c){ //returns if three nums are all one next to each other
        if(Math.abs(a-b) == 1 || Math.abs(a-b) == 2){
            if(Math.abs(a-c) == 1 || Math.abs(a-c) == 2){
                if(Math.abs(b-c) == 1 || Math.abs(b-c) ==2)
                    return true;
            }
        }
        return false;
    }




    public static void main(String[] args) {
//        System.out.println(factorial(5));
//        System.out.println(exp(4,2));
        System.out.println(log2(4));
//        System.out.println(backwards("hello there"));
        //System.out.println(oddlyBackwards("when is this due"));
        System.out.println(doublestr("you are the bold"));

    }
}
