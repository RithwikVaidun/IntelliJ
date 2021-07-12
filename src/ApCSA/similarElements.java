package ApCSA;

public class similarElements {
    public static void main(String[] args) {
        String a[] = {"Mosy", "tues"};
        for(int i = 0; i < a.length; i++) {
            if(a[i].charAt(a[i].length() - 1) == 'y') {
                System.out.println(a[i]);
            }
        }
    }
}
