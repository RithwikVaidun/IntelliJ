public class pythTriple {
    public static void main(String[] args) {
        for(int a = 3, b = 4, c = 5; a < 1000; a++,b++,c++){
            if((a*a) + (b*b) == (c*c))
                System.out.println("(" + a + ", " + b + ", " + c + ")");
        }
    }
}
