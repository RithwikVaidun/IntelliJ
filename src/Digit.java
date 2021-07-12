public class Digit {
    static int sumDig (int n){
        int adder = 0;
        while(n!=0) {
            int lastDig = n%10;
            adder = adder + lastDig;
            n = n/10;
            if (n == 0 && adder >= 10) {
                n = adder;
                adder = 0;
            }
        }

        return (adder);
    }

    public static void main(String[] args) {
       System.out.println(sumDig(6548));
    }
}
