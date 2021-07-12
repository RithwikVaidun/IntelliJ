package APCS;

public class AlphabetDiagonal {
    public static void main(String[] args) {
        int radius = 8;
        char ch = 'A';

        for(int i = 0; i < radius; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(".");
            }
            System.out.println(ch);
            ch = (char) ((int) ch +2);
        }
    }
}
