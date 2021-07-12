package ApCSA;

public class arrAvg {
    static int computeAvg(int[]arrayOfInts) {
        int sum = 0;
        int len = arrayOfInts.length;

        for (int i = 0; i < arrayOfInts.length; i++){
            sum +=  arrayOfInts[i];
        }
        return sum/len;
    }
}
