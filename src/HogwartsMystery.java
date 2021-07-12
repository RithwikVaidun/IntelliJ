import java.util.Scanner;

public class HogwartsMystery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] codes = new int[8];
        int temp1 = 0;
        int temp2 = 0;
        int num1 = 0;
        int num2 = 0;
        char first = 'a';
        char second = 'a';
        if((length/4)%2!=0){
            for(int i = 0;i<length-4;i++){
                codes[i%8]=scan.nextInt();
                if(i%8 == 7){
                    temp1= codes[1];
                    temp2=codes[2];
                    codes[1]= codes[5];
                    codes[2]= codes[6];
                    codes[5] = temp1;
                    codes[6]= temp2;
                    num1 = codes[0]+codes[1]+codes[2]+codes[3];
                    num2 = codes[4]+codes[5]+codes[6]+codes[7];
                    first = (char)num1;
                    second = (char)num2;
                    System.out.print((char)first);
                    System.out.print((char)second);
                }
            }
            for(int i = 0; i<4;i++){
                codes[i] = scan.nextInt();
            }
            num1 = codes[0]+codes[1]+codes[2]+codes[3];
            first = (char)num1;
            System.out.println(first);
        }
        else{
            for(int i = 0;i<length;i++){
                codes[i%8]=scan.nextInt();
                if(i%8 == 7){
                    temp1 = codes[1];
                    temp2= codes[2];
                    codes[1]= codes[5];
                    codes[2]= codes[6];
                    codes[5] = temp1;
                    codes[6]= temp2;
                    num1 = codes[0]+codes[1]+codes[2]+codes[3];
                    num2 = codes[4]+codes[5]+codes[6]+codes[7];
                    first = (char)num1;
                    second = (char)num2;
                    System.out.print((char)first);
                    System.out.print((char)second);
                }
            }
            System.out.println();
        }
    }
}

