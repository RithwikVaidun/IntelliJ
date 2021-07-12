package ApCSA;

public class arrMode {

    public static int findMode(int[]arrayOfInts) {
        int start = 0;
        int modeCount = 0;

        for (int i = 0; i < arrayOfInts.length; i++) {
            int count = 0;
            for (int j = 0; j < arrayOfInts.length; j++) {
                if (arrayOfInts[j] == arrayOfInts[i])
                    count++;
            }
            if (count > modeCount) {
                modeCount = count;
                start = arrayOfInts[i];
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int a[] = {3,2,5,4};
        System.out.println(findMode(a));
    }
}
