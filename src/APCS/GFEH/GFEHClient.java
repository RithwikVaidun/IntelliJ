package APCS.GFEH;

public class GFEHClient{
    public static void main(String[] args){
        G[] elements = {new G(), new F(), new E(), new H()};
        for (G element : elements) {
            System.out.println(element); //to String
            element.method1();
            element.method2();
            System.out.println();
        }
     }
}