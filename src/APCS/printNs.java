package APCS;

public class printNs {
    public static String printNumbers(int n) {
        String x = "";
        for(int i = 1; i <= n; i++) {
            x += "[" + i + "] ";
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(printNumbers(10));
    }
}
