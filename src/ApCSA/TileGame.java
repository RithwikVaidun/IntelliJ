/*
package ApCSA;

import java.util.ArrayList;

public class TileGame {
    private ArrayList<NumberTile> board;

    public TileGame() {
        board = new ArrayList<NumberTile>();
    }

    public int getIndexForFit(NumberTile tile) {
        if(board == null) {
            return 0;
        }
        for(int i = 0; i<board.size(); i++) {
            if(board.get(i).getLeft == tile.getRight
                    || board.get(i).getRight == tile.getLeft) {
                return i;
            }
        }
        return -1;
    }
}
*/
