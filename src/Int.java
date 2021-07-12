import java.util.Scanner;

public class Int {
    int n;

    public Int(int x) {
        this.n = x;
    }

    public int sumof() {
        int s = 0;
        int x = n;
        while (x > 0) {
            s += x;
            x--;
        }

        System.out.println("The sum of " + n + " is: " + s);
        return s;
    }

    public static int sum(int n, int x) {
        return n + x;
    }

    public static void main(String[] args) {
        int x = sum(3, 4);
        System.out.println(x);
    }
}
