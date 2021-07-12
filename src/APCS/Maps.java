package APCS;

import java.util.HashMap;
import java.util.Scanner;

public class Maps {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = inp.nextInt(); //Number of words
        int K = inp.nextInt(); //Number of miscounted words
        int Q = inp.nextInt(); //Number of favorite words

        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < N; i++){
            map.put(inp.next(),inp.nextInt());
        }

        for (int i = 0; i < K; i++) {
            String x = inp.next();
            int v = map.get(x);
            map.put(x,v+inp.nextInt());
        }

        int r = 0;
        for(int i = 0; i < Q; i++) {
            r += map.get(inp.next());
        }
        System.out.println(r);
    }
}
