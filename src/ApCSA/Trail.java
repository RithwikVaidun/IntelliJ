package ApCSA;

public class Trail {

    private int markers[] = {100,150,105,120,90,80,50,75};

    public boolean isLevelTrailSegment(int start, int end) {

        int max = markers[end];
        for (int i = 0; i < markers.length; i++) {
            if(markers[i] > max) {
                max = markers[i];
            }
        }

        int min = markers[start];
        for (int i = 0; i < markers.length; i++) {
            if(markers[i] < min) {
                min = markers[i];
            }
        }
        return max - min <= 10;
    }

    public boolean isDifficult() {
        int counter = 0;
        for (int i = 0; i < markers.length - 1; i++) {
            if(Math.abs(markers[i+1] - markers[i]) >= 30) {
                counter++;
            }
        }
        return counter >=3;
    }

    public static void main(String[] args) {
        Trail d = new Trail();
        System.out.println(d.isLevelTrailSegment(0,2));
        System.out.println(d.isDifficult());

        int loop[] = {1,2,3};
        for(int value: loop) {
            value += 1;
            System.out.println(value);
        }

    }
}
