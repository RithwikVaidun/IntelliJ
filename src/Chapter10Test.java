import ApCSA.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Chapter10Test {

    //NUMBER 3
    public static ArrayList<String> reverse(ArrayList<String> arrayList){
        ArrayList<String> temp = new ArrayList<>();
        for(int i = 1; i <= arrayList.size(); i++){
            temp.add(i-1,arrayList.get(arrayList.size()-i));
        }
        return temp;
    }

    public static void smallerOne(ArrayList<Integer> a){
        for(int i = 0; i < a.size()-1; i++){
           int rem = (a.get(i) > a.get(i+1)) ? i : i+1;
           a.remove(rem);
        }
    }

    public static void main(String[] args) {
//        //NUMBER 1
//        ArrayList<String> arrayList = new ArrayList<String>();
//        System.out.println(arrayList.size()); // PRINTS: 0
//        System.out.println(arrayList); // PRINTS: []
//
//        for (int i = 0; i < 5; i++) {
//            arrayList.add("a");
//        }
//        for (int i = 0; i < 5; i++) {
//            arrayList.add(i + 1, "ba");
//        }
//        System.out.println(arrayList);
//
//// PRINTS: [a, ba, ba, ba, ba, ba, a, a, a, a]
//
//        for (int i = 2; i < arrayList.size(); i++) {
//            if (arrayList.get(i).equals("a") ) {
//                arrayList.remove(i);
//            }
//        }
//        System.out.println(arrayList);
//
//// PRINTS: [a, ba, ba, ba, ba, ba, a, a]


//
//        ArrayList<Cone> t = new ArrayList<>();
//        t.add(new Cone(5,2));
//        t.add(new Cone(10,2));
//        t.add(new Cone(20,2));
//        t.add(new Cone(5,2));
//
//
//        System.out.println(t);
//
//        System.out.println(largestCone(t));



        ArrayList<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(6);
        test.add(2);
        test.add(0);
        test.add(-1);
        test.add(1);
        test.add(8);
        test.add(5);
        test.add(9);
        test.add(3);
        test.add(6);
        System.out.println(test);
        smallerOne(test);
        System.out.println(test);

        ArrayList<String> gfg = new ArrayList<String>(
                Arrays.asList("Good",
                        "judgment",
                        "comes",
                        "from",
                        "experience"));
        System.out.println(reverse(gfg));




    }
    public static int largestCone(ArrayList<Cone> arrayList){
        int maxInd = 0;
        for(int i = 0; i < arrayList.size()-1; i++){
            if (arrayList.get(i).compareTo(arrayList.get(maxInd)) > 0){
                maxInd = i;
            }
        }
        return maxInd;
    }
}
class Cone implements java.lang.Comparable<Cone> {
    public int baseArea;
    public int length;
    public int height;
    public int volume;

    public int compareTo(Cone c2) {
        int v1 = (baseArea * height) /3;
        int v2 = (c2.baseArea * c2.height)/3;
        return Integer.compare(v1, v2);
    }

    public Cone(int ba,int h){
        baseArea = ba;
        height = h;
        volume = (ba*h)/3;
    }

   public String toString(){
        return ("" + volume);
   }
}


