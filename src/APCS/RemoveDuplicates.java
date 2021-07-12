package APCS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


//This class takes in an array list and modifies it so that there are no duplicates or repeats of the same String object.For example, the list
//[be, be, is, not, or, the, to, to] is be converted to [be, is, not, or, the, to]. The method is not case sensitive. For example, if be and Be were in the same list,
// be would remain because it is the first element.

public class RemoveDuplicates {
    public static ArrayList<String> removeDuplicates(ArrayList<String> list){//This method actually does the work of modifying the list.
        for(int i = 0; i < list.size() -1 ; i++){ //Iterating through the arrary
            while(list.get(i).equalsIgnoreCase(list.get(i+1))){ //If the element being checked is equal(ignoring case) to the next element in the list.
                list.remove(list.get(i+1)); // then you are removing the second element checked.
                if(i == list.size() -1)
                    break;

            }
        }
        return list; //return the modified list
    }

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



    public static void main(String[] args) {
        //Directions for user input
        System.out.println();
        System.out.println("Please enter an alphabetical sequence of strings separated");
        System.out.println("by spaces. The end of the sequence must be signified using");
        System.out.println("the sentinel value lastString, followed by a return.");
        System.out.println();

        //Making the Scanner and the list
        Scanner inp = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        //Populating the list with the user's inputs.
        list = getStrings(inp,list,"lastString");

        System.out.println();
//

        //Output
        System.out.println("Your original list: " + list);
        System.out.println();
        removeDuplicates(list); //Method call to remove the duplicates
        System.out.println("Your list with duplicates removed: " + list);
        System.out.println();

    }
}
