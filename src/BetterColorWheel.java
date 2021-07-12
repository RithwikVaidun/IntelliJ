import java.awt.*;

public class BetterColorWheel {

    static Graphics gr;

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int w = 4;
        int h = w;
        int panelW = (1 << 9);
        int panelH = panelW;
        int colorInc = 1 << (24/2 - 9 - 2); //max colors per line of square - max pixels in panel + pixels occupied by one rectangle

        DrawingPanel p = new DrawingPanel(panelW,panelH);
        gr = p.getGraphics();

        for (int r = 0; r <= 255; r += colorInc) {
            for (int g = 0; g <= 255; g += colorInc) {
                for (int b = 0; b <= 255; b += colorInc) {
                    Color c = new Color(r, g, b);
                    gr.setColor(c);
                    gr.fillRect(x, y, w, h);
                    x = (x + w) % panelW;
                    if (x == 0) {
                        y = (y + h) % panelH;
                    }
                }
            }
        }
    }
}
