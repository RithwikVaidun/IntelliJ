package ApCSA;

public class Hailstone {

    public static int hailstoneLength(int n) {
        int counter = 1;
        while (n>1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            counter++;
        }
        return counter;
    }

    public static boolean isLongSeq (int n) { //n is starting term
        return hailstoneLength(n) > n;
    }
    public static double propLong (int n) { //n is how many sequences from 1 to n
        int counter = 0;
        for(int i = 1; i <= n; i++) {
            if(isLongSeq(i)) {
                counter++;
            }
        }
        return (double) counter/n;
    }

    public static void main(String[] args) {
        for(int i=1; i<=10; i++) {
            System.out.println(hailstoneLength(i));
        }
        System.out.println(propLong(10));
    }

}
