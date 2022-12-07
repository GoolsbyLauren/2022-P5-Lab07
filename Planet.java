import java.awt.*;
import java.applet.*;

public class Planet {

    // the planet itself
    public static void drawPlanet(Graphics g){
        g.drawOval(650, 50, 125, 125);
        g.setColor(new Color(103, 175, 227));
        g.fillOval(650,50, 125, 125);



    }
    // ring 2 of planet
    public static void drawRingI(Graphics g){
        g.setColor(new Color(248, 246, 89));
        g.drawLine(662, 75, 767, 85);
        g.drawLine(652, 100, 775, 125);
        g.drawLine(655, 125, 769, 140);
        g.setColor(new Color(218, 39, 238));
        g.drawLine(660, 145, 748, 165);
        g.drawLine(688, 55,754, 68);

    }
   //ring 1 of planet
    public static void drawRingII(Graphics g){
        g.setColor(new Color(241, 63, 63));
        g.drawLine(672, 65, 762, 75);
        g.drawLine(652, 115, 770, 135);
        g.drawLine(655, 90, 772, 105);
        g.setColor(new Color(136, 103, 234));
        g.drawLine(655, 85, 773, 95);
        g.drawLine(655, 135, 762, 150);

    }
}
