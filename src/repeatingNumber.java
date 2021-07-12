public class repeatingNumber {
    static int repN (int n,int d) {
        int counter = 0;
        while (n!=0) {
            int x = n%10;
            if (x == d) {
                counter ++;
            }
            n = n/10;
        }
        return counter;
    }
    public static void main(String[] args) {
        int digit = 3;
        int num = 2334;
        int count = repN(num,digit);
            System.out.println(digit + " repeats " + count +" times in " + num);

    }
}
