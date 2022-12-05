import java.applet.Applet;
import java.awt.*;

public class Backgorund {
    //ground
    public static void drawGround(Graphics g) {
      g.drawLine(0, 350, 999, 350);
      g.setColor(new Color(72, 107, 59, 226));
      g.fillRect(0, 350, 999, 450);

    }

    //night sky
    public static void drawNightSky(Graphics g) {
        g.drawRect(0,0, 999, 350);
        g.setColor(new Color(55, 4, 129, 240));
        g.fillRect(0,0,999, 350);

    }

    //mountain 1
    public static void drawMountain1(Graphics g) {
        g.drawLine(25, 350, 125, 325);
        g.drawLine(125, 325, 175, 325);
        g.drawLine(125,325, 200, 300);
        g.drawLine(125, 350, 175, 325);
        g.drawLine(175, 325, 200, 300);
        g.drawLine(200, 300, 250, 275);
        g.drawLine( 250, 275, 300, 225);
        g.drawLine(300, 225, 325, 250);
        g.drawLine(325, 250, 375, 275);
        g.drawLine(300, 225, 425, 275);

        Polygon MntnI = new Polygon();
        MntnI.addPoint(25, 350);
        MntnI.addPoint(125, 325);
        MntnI.addPoint(175, 325);
        MntnI.addPoint(200, 300);
        MntnI.addPoint(125, 350);
        MntnI.addPoint(175, 325);
        MntnI.addPoint(250, 275);


        g.setColor(new Color (105, 101, 101));
        g.fillPolygon(MntnI);
    // mountain 2
        g.drawLine(275, 350, 300, 325);
        g.drawLine(300, 325, 325, 325);
        g.drawLine(325,  325, 375, 275);
        g.drawLine(375, 275, 425, 250);
        g.drawLine(425, 250, 475, 175);
        g.drawLine(475, 175, 650, 350);
        g.drawLine(475, 175, 725, 325);
        g.drawLine(575, 275, 750, 325);
        g.drawLine(750, 325, 825, 350);

    }
}