import ApCSA.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//import ApCSA.Array;

//import java.awt.*;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.text.DecimalFormat;
//import java.util.Arrays;
//import java.util.Scanner;


public class test {
    static int c =0;
    public static void main(String[] args) {
        String[][] subjects = {
                { "hat",
                        "hop"},                       // row 1

                { "paper", "plan"},                             // row2

                { "bark", "bat",
                         }                            // row3
        };
        System.out.println(fun(3,2));
        System.out.println(c);


    }
    public static int fun(int x,int y){
        c++;
     if((x<y)||(y<0)){
         return 0;

     }
     else if((x == y) || (y == 0)){
         return 1;
     }
     else {
         return fun(x-1,y)+fun(x-1,y-1);
     }
    }
    public static int rowCheck(String[]row){
        int max = 0;
        for(int k =0; k < row.length;k++){
            if (row[k].length() > max){
                max = row[k].length();
            }
        }
        return max;
    }

}












