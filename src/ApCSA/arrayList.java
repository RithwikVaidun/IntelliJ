package ApCSA;

import java.util.ArrayList;

public class arrayList {
    static void printAS(ArrayList<String> y) {
        System.out.print("{");
        for(int x = 0; x < y.size(); x++){
            System.out.print(y.get(x) + ", ");
        }
        System.out.println("}");
    }
    public static void main(String[] args) {
        ArrayList<String> rith = new ArrayList<String>() ;
        rith.add("P");
        rith.add("Q");
        rith.add("R");
        rith.set(2,"s");
        rith.add(2,"T");
        printAS(rith);
    }
}
