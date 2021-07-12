package APCS;

public class CheckBoard01 {
    public static void main(String[] args) {
        for(int i = 0,k=0; i < 5;k++,i=(k%10==0)? i+1:i) {
            for(int j =0; j<50;j++) {
                System.out.print((i+j)%2);
            }
            System.out.println();
        }
    }
}
