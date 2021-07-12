package APCS;

public class simpleRoman {
    public static String intToRom(int n) {
        String[] t = {"", "M", "MM", "MMM"};
        String[] h = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] ten = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] o = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        String thousands = t[n/1000];
        String hun = h[(n%1000)/100];
        String tens = ten[(n%100)/10];
        String ones = o[n%10];

        return thousands + hun + tens + ones;
    }


    public static void main(String []args) {
        for(int i = 1; i <= 200; i++){
            //System.out.print(intToRom(i) + " ");
        }
        System.out.println(intToRom(3659));

    }

}

