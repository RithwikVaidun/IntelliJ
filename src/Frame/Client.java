package Frame;

import javax.swing.*;
import java.awt.*;

public class Client{
    public static JFrame p = new JFrame("Game");

    public static void main(String[] args) {
        setJFrame();
        MyFrame x = new MyFrame();
        MyFrame z = new MyFrame();
    }

    public static void setJFrame(){
        p = new JFrame("Chess");
        p.setSize(900,900);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }
}
