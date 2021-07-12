package APCS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListCount {
    public static ArrayList<String> getStrings(Scanner inp, ArrayList<String> list, String prompt){
        while (true) {
            String s = inp.next();
            if(s.equals(prompt)){
                break;
            }
            list.add(s);
        }

        return list;
    }
    public static ArrayList<String> lowerCase(ArrayList<String> l){
        for(int i = 0; i < l.size(); i++){
            l.set(i,l.get(i).toLowerCase());
        }
        return l;
    }

    public static ArrayList<Integer> count(ArrayList<String> l){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < l.size();i++){
            int c = 1;
            while(i+1 < l.size() && l.get(i).equalsIgnoreCase(l.get(i+1))){
                c++;
                i++;
            }
            ans.add(c);
        }

        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner inp = new Scanner(System.in);

        System.out.println("\n" + "Please enter an alphabetical sequence of strings separated");
        System.out.println("by spaces. The end of the sequence must be signified using");
        System.out.println("the sentinel value lastString, followed by a return." + "\n");
        getStrings(inp, list, "lastString");
        System.out.println();
        lowerCase(list);
        System.out.println("Your original list: " + list);
//        list.add("a");
//        list.add("a");
//        list.add("A");
//        list.add("a");
//        list.add("a");
//        list.add("the");
//        list.add("to");
//        list.add("to");

        System.out.println("Count: " + count(list));

    }
}
