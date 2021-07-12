import java.util.Random;

public class RandomNumberPicker {
    public static void main(String[] args) {
        int a[] = new int[3];
        Random rand = new Random();
            int n = 0;
            int i;
                while (n<3) {
                    int num = rand.nextInt(30);
                    for (i = 0; i < n; i++) {
                        if (a[i]== num) //if the random number repeats
                            break;
                    }
                    if (i == n) {
                        a[n] = num;
                        n++;
                    }
                }
        System.out.println("The winners are " + a[0] + "," + a[1] + ",and " + a[2]);

    }

}
