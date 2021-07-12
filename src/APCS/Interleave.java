package APCS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Interleave {

    public static ArrayList<Integer> getInts(Scanner inp, ArrayList<Integer> list, int val){
        System.out.println("Please enter a sequence of integers separated");
        System.out.println("by spaces. End the sequence with the sentinel");
        System.out.println("value 0, followed by a return.\n");

        while (true) {
            int s = inp.nextInt();
            if(s == (val)){
                break;
            }
            list.add(s);
        }
        return list;
    }

    public static ArrayList<Integer> interleave(ArrayList<Integer> a1, ArrayList<Integer> a2){
      ArrayList<Integer> ans = new ArrayList<>();

      int small = Math.min(a1.size(),a2.size());
      int dif = Math.abs(a1.size() - a2.size());
      ArrayList<Integer> bigger = (a1.size() > a2.size()) ? a1 : a2;

      for(int i = 0; i < small; i++){
          ans.add(a1.get(i));
          ans.add(a2.get(i));
      }
      for(int i = 0; i < dif; i++){
          ans.add(bigger.get(small+i));
      }
      return ans;

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();
        getInts(inp, list, 0);
        System.out.println("Your first list: " + list +"\n");

        ArrayList<Integer> list1 = new ArrayList<>();
        getInts(inp, list1, 0);
        System.out.println("Your second list: " + list1 +"\n");

        System.out.println("Your interleaved list: " + interleave(list,list1));

//        ArrayList<Integer> t = new ArrayList<>(Arrays.asList(10,20,30,40,50));
//        ArrayList<Integer> t1 = new ArrayList<>(Arrays.asList(6,7,8));

//        System.out.println(interleave(t,t1));

    }
}
