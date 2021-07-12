package APCS;

public class Stewie2 {

    public static void printFowSlashes() {
        for(int i = 0; i < 22; i++) {
            System.out.print("/");
        }
    }

    public static void printVic() {
        System.out.print("|| Victory is mine! ||");
    }

    public static void printBackSlashes() {
        for(int i = 0; i < 22; i++) {
            System.out.print("\\");
        }
    }

    public static void printVicBack() {
        printVic();
        System.out.println();
        printBackSlashes();
    }
    public static void main(String[] args) {
        printFowSlashes();
        System.out.println();
        for(int i = 0; i < 5; i++) {
            printVicBack();
            System.out.println();
        }

    }
}
