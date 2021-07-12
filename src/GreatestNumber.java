public class GreatestNumber {
    static int max (int a[]) {
        int greatest = a[0];
        for (int i=1; i<a.length; i++ ) {
            if (greatest<a[i]) {
                greatest = a[i];
            }
        }
        return greatest;
    }
    public static void main(String[] args) {
        int a[] = {3, 4, 99, 10};
        int x = max(a);
        System.out.println(x);
    }
}
