import java.util.Scanner;

public class SentenceOOPClient {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter sentence: ");
        Sentence s = new Sentence(inp.nextLine());
        System.out.println(s.getBlankPositions());
        System.out.println(s.countWords());
        String[] words = s.getWords();
        System.out.print("{");
        for(int i = 0; i < words.length;i++){

            if(i == words.length-1){
                System.out.print(words[i]);
            }
            else{
                System.out.print(words[i] + ", ");
            }

        }
        System.out.println("}");
    }
}
