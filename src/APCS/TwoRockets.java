package APCS;

public class TwoRockets{

    public static void nose(){
        System.out.println("  /\\         /\\");
        System.out.println(" /  \\       /  \\");
        System.out.println("/    \\     /    \\");
    }
    public static void body(){
        System.out.println("+------+ +------+");
        System.out.println("|      | |       |");
        System.out.println("|      | |       |");
        System.out.println("+------+ +------+");
    }

    public static void us(){
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
    }

    public static void main(String[]args){
        nose();
        body();
        us();
        body();
        nose();
    }
}

