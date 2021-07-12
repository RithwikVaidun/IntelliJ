package ApCSA;

public class sumArr {
    static int computeSum(int[]arrayOfInts) {
        int sum = 0;
        for (int i = 0; i < arrayOfInts.length; i++){
            sum +=  arrayOfInts[i];}
        return sum;
    }
}
