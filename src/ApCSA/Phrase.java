package ApCSA;

public class Phrase {
    private String currentPhrase;

    public Phrase(String p) {
        currentPhrase = p;
    }

    public int findNthOccurrence(String s, int n) {
        int counter = 0;
        for(int i = 0; i < currentPhrase.length(); i++) {
            if(s.equals(currentPhrase.substring(i,s.length()+i))) {
                counter++;
                if (n == counter) {
                    return i;
                }
            }
        }
        return -1;
    }

    public String replaceNthOccurrence(String s, int n, String repl) {
        int index = findNthOccurrence(s,n); // gives you where to replace
        if(index != -1) {
            currentPhrase = currentPhrase.substring(0,index) + repl + currentPhrase.substring(index + s.length());
            return currentPhrase;
        }
        return "-";
    }
    

    public int findLastOccurrence(String str) {
        int n = 1;
        while(findNthOccurrence(str,n+1) != -1) {
            n++;
        }
        return findNthOccurrence(str,n);
    }

    public static void main(String[] args) {
        Phrase p = new Phrase("aaaa");
        int x = p.findNthOccurrence("s",2);
        System.out.println(x);
        System.out.println(p.replaceNthOccurrence("aa",2,"bbb"));
    }
}
