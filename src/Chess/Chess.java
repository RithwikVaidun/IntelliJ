package Chess;

import Chess.Pieces.Pawn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Chess extends JFrame{
    public static DrawingPanel p = new DrawingPanel(900,900);
    public Graphics g = p.getGraphics();
    public static Board b;
    //WHITE IS TRUE
    //BLACK IS FALSE

    public static void main(String[] args) {
        //setJFrame();
        p.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
        b = new Board();
        p.setBackground(Color.WHITE);
        b.setBoard();

    }


//    public static void setJFrame(){
//        p = new JFrame("Chess");
//        p.setSize(900,900);
//        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        p.setLocationRelativeTo(null);
//        p.setVisible(true);
//    }
}


