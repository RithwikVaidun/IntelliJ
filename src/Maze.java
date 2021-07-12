public class Maze {
    public static String[][] m;
    static int xAr[];
    static int yAr[];
    static int top = 0;

    public static void printArray(String[][] a) {
        for (String[] ints : a) {
            for (String j : ints) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void solveMaze(){
        int sR = 0;
        int sC = 0;
        for(int r = 0; r < m.length-2; r++){
            for(int c = 0; c < m[0].length-2; c++){
                if(m[r][c].equals("S")){
                    sR = r;
                    sC = c;
                    break;
                }
            }
        }

        while (true) {
            m[sR][sC] = "1";
            findPossibleMoves(sR, sC);
            if (top == 0) break;
            top--;
            sR = xAr[top];
            sC = yAr[top];
            if(m[sR][sC].equals("E"))
                System.out.println("Found");
        }

    }



    public static boolean saveIfCanMove(int x, int y){
        if(
        (y+1 < m.length  && m[x][y+1].equals("#")) //right
         ||(y-1 > m.length && m[x][y-1].equals("#")) //left
         ||(x-1 > m.length-1 && m[x-1][y].equals("#") ) //up
         ||(x+1 < m.length && m[x+1][y].equals("#")) //down
        ){
            return false;
        }
        xAr[top] = x;
        yAr[top] = y;
        top++;
        return true;

    }
    public static void findPossibleMoves(int row, int col) {
        int colm1 = col-1;
        if (col == 0) {
            colm1= col;
        }
        saveIfCanMove(row-1,col);
        saveIfCanMove(row+1,col);
        saveIfCanMove(row,col+1);
        saveIfCanMove(row,colm1);
    }


    public static void main(String[] args) {
        m = new String[][]{
                {"#","#","#","#","#","#","#","#","#","#","#","#"}, //1
                {"#",".",".",".","#",".",".",".",".",".",".","#"}, //2
                {"S",".","#",".","#",".","#","#","#","#",".","#"}, //3
                {"#","#","#",".","#",".",".",".",".","#",".","#"}, //4
                {"#",".",".",".",".","#","#","#",".","#",".","E"}, //5
                {"#","#","#","#",".","#",".","#",".","#",".","#"}, //6
                {"#",".",".","#",".","#",".","#",".","#",".","#"}, //7
                {"#","#",".","#",".","#",".","#",".","#",".","#"}, //8
                {"#",".",".",".",".",".",".",".",".","#",".","#"}, //9
                {"#","#","#","#","#","#",".","#","#","#",".","#"}, //10
                {"#",".",".",".",".",".",".","#",".",".",".","#"}, //11
                {"#","#","#","#","#","#","#","#","#","#","#","#"}  //12
        };
        //m[0][1] = "J";
        xAr = new int[m.length * m.length-1];
        yAr = new int[m.length * m.length-1];
        solveMaze();
        printArray(m);


    }
}
