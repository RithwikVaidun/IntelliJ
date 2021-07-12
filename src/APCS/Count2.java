package APCS;

import java.util.*;
class Occurence{
    private String el;
    private int num;
    public Occurence(String el, int num){
        this.el = el;
        this.num = num;
    }
    public String getEl(){
        return el;
    }
    public int getNum(){
        return num;
    }
    public boolean compare(Occurence other){
        return el.equals(other.getEl());
    }
    public void print(){
        System.out.println(el + " " + num);
    }
}

public class Count2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner inp = new Scanner(System.in);

        System.out.println("\n" + "Please enter a sequence of strings separated");
        System.out.println("by spaces. The end of the sequence must be signified using");
        System.out.println("the sentinel value lastString, followed by a return." + "\n");
        getStrings(inp, list, "lastString");
        frequency(list);
    }

    public static void frequency(ArrayList<String> list){
        ArrayList<Occurence> ans = new ArrayList<>();
        ArrayList<String> characters = new ArrayList<>();
        for(String str : list) {
            Occurence occ = new Occurence(str, Collections.frequency(list, str));
            if(characters.isEmpty()){
                ans.add(occ);
                characters.add(occ.getEl());
                continue;
            }
            if(!characters.contains(occ.getEl())){
                ans.add(occ);
                characters.add(occ.getEl());
            }
        }
        for(int i = 0; i < ans.size(); i++){
            for(int j = i + 1; j < ans.size(); j++){
                if(ans.get(i).getNum() > ans.get(j).getNum()){
                    Occurence temp = ans.get(i);
                    ans.set(i, ans.get(j));
                    ans.set(j, temp);
                    continue;
                }
                if(ans.get(i).getNum() == ans.get(j).getNum()){
                    if(list.indexOf(ans.get(j).getEl()) < list.indexOf(ans.get(i).getEl())){
                        Occurence temp = ans.get(i);
                        ans.set(i, ans.get(j));
                        ans.set(j, temp);
                    }
                }
            }
        }
        for (Occurence an : ans) {
            an.print();
        }
    }

    public static ArrayList<String> getStrings(Scanner inp, ArrayList<String> list, String prompt){
        while (true) {
            String s = inp.next();
            if(s.equals(prompt)){
                break;
            }
            list.add(s);
        }
        return list;
    }
}