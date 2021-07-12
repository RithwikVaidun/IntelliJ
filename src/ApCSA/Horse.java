package ApCSA;

public class Horse {
    public String name;
    public int weight;

    public Horse(String n, int w) {
        name = n;
        weight = w;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public class HorseBarn {

        private Horse[] spaces;

        public int findHorseSpace(String name) {
            for(int i = 0; i < spaces.length; i++) {
                if(spaces[i].getName() != null &&spaces[i].getName().equals(name)) {
                    return i;
                }
            }
            return -1;
        }

        public void consolidate() { //MOVE NULL TO RIGHT
            for(int i = 0; i < spaces.length; i++) {
                if(spaces[i] == null) {
                    for(int j = i + 1; j < spaces.length ; j++) {
                        if(spaces[j] != null) {
                            spaces[i] = spaces[j];
                            spaces[j] = null;
                            j = spaces.length;
                        }
                        spaces[j] = spaces[j+1];
                    }
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Horse rith = new Horse("Rith",32);
        Horse rah = new Horse("rah",32);
        Horse dad = new Horse("dad",32);
        Horse ama = new Horse("ama",32);
        Horse[] ppl = {rith,rah,dad,ama};
    }

}
