package APCS;

public class StarFigure {
    public static void main(String[] args) {
        for (int line = 1; line <= 5; line++) {
            for (int i = 1; i <= -4 * line + 20; i++) {
                System.out.print("/");
            }
            for (int i = 1; i <= 8 * line - 8; i++) {
                System.out.print("*");
            }
            for (int i = 1; i <= -4 * line + 20; i++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }

}
