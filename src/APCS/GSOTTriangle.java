package APCS;

public class GSOTTriangle {
    public static final int h = 2;
    public static void printTriangle() {
        System.out.println("   /\\   ");
        System.out.println("  /  \\ ");
        System.out.println(" /0o0\"\\");
        System.out.println("/______\\");
    }

    public static void main(String[] args) {
        int spaces = h*3;
        for(int k = 0; k < 4; k++) {
            for(int i = 0; i < spaces; i++) {
                System.out.print(".");
            }
            System.out.println();
            spaces--;
        }

        printTriangle();

    }
}
