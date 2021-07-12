package APCS;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = inp.nextInt();
        if (x < 1) {
            throw new IllegalArgumentException();
        }
        writeNums(x,0);

//        System.out.println("Infinite recursion");
//        infiniteRecursion(x);

//        System.out.println("printStarsForLoop");
//        printStarsForLoop(x);

//        System.out.println("printStarsRecursion");
//        printStarsRecursion(x);

//        System.out.println("printBackwardsRecursion");
//        printBackwardsRecursion(x);

//        System.out.println("printFowardRecursion");
//        printFowardRecursion(x);

//        System.out.println("printBackwardsThenFowards");
//        printBackwardsThenFowards(x);

//        System.out.println("printFowardsThenBackwards");
//        printFowardsThenBackwards(x);


    }

    public static void writeNums(int n, int c){
        if(n == 0){
            return;
        }
        else{
           writeNums(n-1,++c);
           c--;
           if(c != 0)
               System.out.print(n + ", ");
           else
               System.out.println(n);
        }

    }

    public static void infiniteRecursion(int n){
        System.out.println(n);
        infiniteRecursion(n+1);
    }

    public static void printStarsForLoop(int n){
        for(int i = 0; i < n; i++){
            System.out.println("*");
        }
    }
    public static void printStarsRecursion(int n){
        if(n == 0) {
            System.out.println();
            return;

        }
        else{
            System.out.println("*");
            printStarsRecursion(n-1);
            System.out.println("*");
        }

    }

    public static void printBackwardsRecursion(int n){
        if(n == 0){
            return;
        }
        else{
            System.out.println(n);
            printBackwardsRecursion(n-1);
        }
    }

    public static void printFowardRecursion(int n){
        if(n == 0){
            return;
        }
        else{
           printFowardRecursion(n-1);
           System.out.println(n);
        }

    }

    public static void printBackwardsThenFowards(int n){
        if(n == 0){
            return;
        }
        else{
            System.out.println(n);
            printBackwardsThenFowards(n-1);
            System.out.println(n);
        }
    }
    public static void printFowardsThenBackwards(int n){
        if(n == 0){
            return;
        }
        else{
            printFowardRecursion(n-1);
        }
        printBackwardsRecursion(n);
    }
}
