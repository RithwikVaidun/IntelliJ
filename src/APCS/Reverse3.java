package APCS;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse3 {

    public static ArrayList<Integer> getInts(Scanner inp, ArrayList<Integer> list, int val){
        while (true) {
            int s = inp.nextInt();
            if(s == (val)){
                break;
            }
            list.add(s);
        }
        return list;
    }

    public static ArrayList<Integer> reverse(ArrayList<Integer> l){
        for(int i = 0; i < l.size()-2; i+=3){
            Integer temp = l.get(i);
            l.set(i,l.get(i+2));
            l.set(i+2,temp);
        }
        return l;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();


        System.out.println("\nPlease enter a sequence of integers separated");
        System.out.println("by spaces. End the sequence with the sentinel");
        System.out.println("value 0, followed by a return.\n");

        getInts(inp,list,0);
        System.out.println("Your original list: " + list);
        System.out.println();
        System.out.println("Your reversed3 list: " + reverse(list));
    }
}
