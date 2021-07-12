package ApCSA;

public class NumberCube {

    public int toss() {
        return (int) ((Math.random() * 6) +1);
    }

    public static int[] getCubeTosses(NumberCube cube, int numTosses) {
        int a[] = new int[numTosses];
        for(int i = 0; i < numTosses; i++) {
           a[i] = cube.toss();
        }
        return a;
    }

    public static int getLongestRun(int [] values) {

        int maxLen = 0;
        int currentLen = 0;

        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] == values[i+1]) {
                currentLen++;
                if(currentLen > maxLen) {
                    maxLen = currentLen;
                }
            }
        }
        return 2;
    }

    public static void main(String[] args) {
        int a[] =  {1,5,5,4,3,1,2,2,2,2};
        getLongestRun(a);
    }
}
