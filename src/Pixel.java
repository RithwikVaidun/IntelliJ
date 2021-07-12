public class Pixel {
    private int red;
    private int green;
    private int blue;

    public Pixel(int r, int g, int b){
        red = r;
        green = g;
        blue = b;
    }

    public static Pixel[][] genPixelArray(int[][] reds, int[][] greens, int[][] blues){
        int rows = reds.length;
        int cols;

        if(rows != blues.length || rows != greens.length)
            return null;

        Pixel[][] ans = new Pixel[reds.length][reds[0].length];

        for(int i = 0; i < reds.length;i++){
            for(int j = 0; j< reds[0].length;j++){
                Pixel p = new Pixel(reds[i][j],greens[i][j],blues[i][j]);
                ans[i][j] = p;
            }

        }
        return ans;

    }

    public static void main(String[] args) {

    }
}
