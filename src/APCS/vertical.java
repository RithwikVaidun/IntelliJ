package APCS;

public class vertical {
    public static void verticals(String x) {
        int n = x.length();
        for(int i = 0; i < n; i++) {
            System.out.println(x.charAt(i));
        }
    }
    public static void main(String[] args) {
        String l = "hey there";
        verticals(l);

    }
}
