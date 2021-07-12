package APCS;

public class CheckerboardTest12 {
    public static void main(String[] args) {
        for(int i = 0, k = 0; i < 5; k++, i = (k%10 == 0) ? i + 1 : i) { //10 lines each i
            for(int j = k ; j < 50 + k ; j++) { // 0 - 50, 1 - 51...
                System.out.print((i + j) % 2);
            }
            System.out.println();
        }
    }
}
