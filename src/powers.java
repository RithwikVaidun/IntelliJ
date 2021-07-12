public class powers {

    public static void printPowersOfN(int base, int exp) {
        int ans = 1;
        System.out.print(ans + " ");
        for(int i = 0; i<exp; i++) {
            ans = ans*base;
            System.out.print(ans + " ");
        }
    }
    public static void main(String[] args) {
        printPowersOfN(5,6);
    }
}
