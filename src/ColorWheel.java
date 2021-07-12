import java.awt.*;

public class ColorWheel {
    public static void main(String[] args) {
        DrawingPanel p = new DrawingPanel(512,512);
        Graphics g = p.getGraphics();

        int red = 255;
        int green = 0;
        int blue = 0;

        int stAng = 90;


        for(int i = 0; i < 360; i++) {
            int arcAng = -1;
            Color current = new Color(red,blue,green);
            g.setColor(current);

            g.fillArc(256,256,200,200,stAng,arcAng);
            stAng -= 1;

            int constant = 4;

            if(i <= 60 && i != 0) {
                green += constant;
            }
            if(i > 60 && i <= 120) {
                red -= constant;
            }
            if(i > 120 && i <= 180) {
                blue += constant;
            }
            if(i > 180 && i <= 240) {
                green -= constant;
            }
            if(i > 240 && i <= 300) {
                red += constant;
            }
            if(i > 300) {
                blue -= constant;
            }





        }

    }
}
