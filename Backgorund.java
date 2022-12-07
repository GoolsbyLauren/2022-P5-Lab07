import java.applet.Applet;
import java.awt.*;

public class Backgorund {
    //ground
    public static void drawGround(Graphics g) {
      g.drawLine(0, 350, 826, 350);
      g.setColor(new Color(72, 107, 59, 226));
      g.fillRect(0, 350, 826, 400);

    }

    //night sky
    public static void drawNightSky(Graphics g) {
        g.drawRect(0,0, 826, 350);
        g.setColor(new Color(55, 4, 129, 255));
        g.fillRect(0,0,826, 350);

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


        Polygon Mntne = new Polygon();
        Mntne.addPoint(300, 225);
        Mntne.addPoint(325, 275);
        Mntne.addPoint(375, 275);
        Mntne.addPoint(425, 275);
        g.setColor(new Color (49, 47, 47));
        g.fillPolygon(Mntne);

        Polygon Mntna = new Polygon();
        Mntna.addPoint(25, 350);
        Mntna.addPoint(125, 325);
        Mntna.addPoint(175, 325);
        Mntna.addPoint(200, 300);
        Mntna.addPoint(250, 275);
        Mntna.addPoint(300, 225);
        Mntna.addPoint(325, 250);
        Mntna.addPoint(375, 275);
        Mntna.addPoint(375, 350);
        g.setColor(new Color(56, 55, 53));
        g.fillPolygon(Mntna);

        Polygon Mntnb = new Polygon();
        Mntnb.addPoint(150, 325);
        Mntnb.addPoint(175, 325);
        Mntnb.addPoint(200, 300);
        g.setColor(new Color (49, 47, 47));
        g.fillPolygon(Mntnb);



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

        Polygon Mntnd = new Polygon();
        Mntnd.addPoint(475, 175);
        Mntnd.addPoint(575, 275);
        Mntnd.addPoint(725, 325);
        g.setColor(new Color (52, 51, 51));
        g.fillPolygon(Mntnd);

        Polygon Mntnf = new Polygon();
        Mntnf.addPoint(575, 275);
        Mntnf.addPoint(650, 350);
        Mntnf.addPoint(825, 350);
        Mntnf.addPoint(750, 325);
        g.setColor(new Color (62, 60, 60));
        g.fillPolygon(Mntnf);

        Polygon Mntnc = new Polygon();
        Mntnc.addPoint(275, 350);
        Mntnc.addPoint(300, 325);
        Mntnc.addPoint(325, 325);
        Mntnc.addPoint(375, 275);
        Mntnc.addPoint(425, 250);
        Mntnc.addPoint(475, 175);
        Mntnc.addPoint(575, 275);
        Mntnc.addPoint(650, 350);
        g.setColor(new Color(68, 67, 64));
        g.fillPolygon(Mntnc);

    }
}