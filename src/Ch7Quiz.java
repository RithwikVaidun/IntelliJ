import java.util.Arrays;

public class Ch7Quiz {
    //#1
    public static void push(int[] a){
        int[] noZ = Arrays.stream(a).filter(num -> num != 0).toArray();
        int[] ans = Arrays.copyOf(noZ,a.length);
        printArray(ans);
    }

    public static void printArray(int[] a){
        for(int i = 0; i < a.length;i++){
            if(i == a.length -1){
                System.out.print(a[i]);
            }
            else
                System.out.print(a[i] + ", ");
        }
    }

    // #2
    public static String shout(char c) {
        c = (char) (c / 2);
        return ("You must pay for your" + c +  "crimes!");
    }
    public static String reply(String s) {
        return ("no" + 'u' + s + " !");
    }
    public static int totalPower(int[] stats) {
        int total = 0;
        for (int boom = 0; boom < stats.length; boom++) {
            total = total + stats[0];
        }
        return total;
    }
    public static void powerUp(int[] stats, int level) {
        for (int boss = 0; boss < stats.length; boss++) {
            stats[boss] += level;
        }
    }

    //#3
    static void diagnols(int[][] a) {
       int len = a.length;
       for(int c = 0; c < len; c++){
           for(int r = c; r >= 0 ; r--){
               System.out.print(a[c-r][r] + " ");
           }
           System.out.println();
       }

       for(int r = 0; r < len;r++){
           for(int c = len-1; c > r; c--){
               System.out.print(a[len-c+r][c] + " ");
           }
           System.out.println();
       }
    }

    //#4
    public static void insert(String[] array, int position, String word){
        for(int i = array.length-1; i >= position;i--){
            array[i] = array[i-1];
        }
        array[position-1] = word;
        System.out.println(Arrays.toString(array));

    }

    //#5
    public static void pairs(int[] array,int sum){
        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length;j++){
                if(array[i] + array[j] == sum){
                    System.out.println(array[i] + " + " + array[j] + " = " + sum);
                }
            }
        }
    }

    public static void main(String[] args) {
//        //#1
//        int[] myArray = {1, 0, 30, 9, 0, 0, 26, 15} ;
//        push(myArray); // Output: 1, 30, 9, 26, 15, 0, 0, 0
//
//        //#2
//        int[] bobStats = {19,16,12,18};
//        int[] joeStats = {14, 20, 19, 17};
//        System.out.println(shout('n')); // PRINTS: You must pay for your7crimes! //Space between 7??
//
//        System.out.println(reply("Joe")); // PRINTS: nouJoe !
//        System.out.println("Bob: " + totalPower(bobStats)); // PRINTS: Bob: 76
//        System.out.println("Joe: " + totalPower(joeStats)); // PRINTS: Joe: 56
//        powerUp(joeStats, '4');
//        powerUp(bobStats, '0');
//        System.out.println("Bob: " + totalPower(bobStats)); // PRINTS: Bob: 268
//        System.out.println("Joe: " + totalPower(joeStats)); // PRINTS: Joe: 264

        //#3
        int[][] test = new int[][] {{1,2,3,4},
                                    {2,6,1,2},
                                    {9,3,5,5},
                                    {4,3,3,10}};
        diagnols(test);

        //#4
//        String[] fren = {"Fish", "are", "not", "food", ""}; // Use the “” as an “empty” space
//        String[] sky = {"Isn’t", "the", "sky", "so", "pretty?", ""};
//        insert(fren, 3, "friends"); // {“Fish”, “are”, “friends”, “not”, “food”};
//        insert(sky, 3, "evening"); // {“Isn’t”, “the”, “evening”, “sky”, “so”, “pretty?”}
//
//        //#5
//        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
//        int[] nums2 = {2, 7, 4, -5, 11, 5, 20};
//        pairs(nums, 8);
//        pairs(nums2, 15);



    }
}
