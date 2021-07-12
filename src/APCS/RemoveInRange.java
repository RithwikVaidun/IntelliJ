package APCS;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveInRange {

    public static ArrayList<String> getStrings(Scanner inp, ArrayList<String> list, String prompt) {
        while (true) {
            String s = inp.next();
            if (s.equals(prompt)) {
                break;
            }
            list.add(s);
        }

        return list;
    }

    public static ArrayList<String> reduce(ArrayList<String> l,String st, String end){
        for(int i = 0; i < l.size(); i++){
            if(l.get(i).compareTo(st) >= 0 && l.get(i).compareTo(end) <= 0){
                l.remove(l.get(i));
                i--;
            }
        }

        return l;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("\nPlease enter an alphabetical sequence of strings separated");
        System.out.println("by spaces. The end of the sequence must be signified using");
        System.out.println("the sentinel value lastString, followed by a return.\n");

        getStrings(inp,list,"lastString");
        System.out.println("Your original list: " + list);
        System.out.println();

        System.out.println("Now please enter your start String");
        String st = inp.next();
        System.out.println();

        System.out.println("Finally, please enter your end String");
        String end = inp.next();
        System.out.println();


        System.out.println("Your reduced list: " + reduce(list,st,end));
//        list.add("how");
//        list.add("to");
//        list.add("get");
//        list.add("over");
//        list.add("the");
//        list.add("hill");
//        list.add("without");
//        list.add("getting");
//        list.add("to");
//        list.add("the");
//        list.add("top");
//        System.out.println(reduce(list,"fast","talk"));
    }
}
