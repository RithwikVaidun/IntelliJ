package APCS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Clump {
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

    public static ArrayList<String> clump(ArrayList<String> l){
        ArrayList<String> ans = new ArrayList<>();
        int j = 0;
        for(int i = 0; i < l.size()/2; i++){
            ans.add("(" + l.get(j) + " " + l.get(j+1) + ")");
            j+=2;
        }
        if(l.size()%2 != 0)
            ans.add(l.get(l.size()-1));
        return ans;
    }



    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("\nPlease enter a sequence of strings separated");
        System.out.println("by spaces. End the sequence with the sentinel");
        System.out.println("value \"stop\", followed by a return.\n");

        ArrayList<String> list = new ArrayList<>();
        list = getStrings(inp,list,"stop");
        System.out.println("Your original list: " + list + "\n");
        System.out.println("Your clumped list: " + clump(list));

//        ArrayList<String> gfg = new ArrayList<String>(
//                Arrays.asList("Good",
//                        "judgment",
//                        "comes",
//                        "from",
//                        "experience"));
//        System.out.println(clump(gfg));

    }
}
