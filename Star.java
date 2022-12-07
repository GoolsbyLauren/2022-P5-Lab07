import java.awt.*;
import java.applet.*;
public class Star {

    //the biggest star
    public static void drawShootingStar(Graphics g){
        Polygon Shoot1 = new Polygon();
        Shoot1.addPoint(312, 90);
        Shoot1.addPoint(300, 115);
        Shoot1.addPoint(325, 115);

        g.setColor(new Color(245, 188, 64));
        g.fillPolygon(Shoot1);



        Polygon Shoot2 = new Polygon();
        Shoot2.addPoint(310, 115);
        Shoot2.addPoint(300, 100);
        Shoot2.addPoint(325, 100);

        g.setColor(new Color(245, 188, 64));
        g.fillPolygon(Shoot2);

        Polygon Shoot3 = new Polygon();
        Shoot3.addPoint(312, 108);
        Shoot3.addPoint(300, 115);
        Shoot3.addPoint(325, 115);

        g.setColor(new Color(55, 4, 129, 255));
        g.fillPolygon(Shoot3);

    }
    // the first flame
    public static void drawFlameI(Graphics g) {
        g.setColor(new Color(245, 188, 64));
        g.drawLine(298, 100, 275, 75);
        g.setColor(new Color(196, 150, 50));
        g.drawLine(270, 75, 225, 50);
        g.setColor(new Color(134, 103, 35));
        g.drawLine(218,50, 150,25);

    }
    public static void drawFlameII(Graphics g) {
        g.setColor(new Color(245, 188, 64));
        g.drawLine(298, 100, 250, 75);
        g.setColor(new Color(196, 150, 50));
        g.drawLine(245, 75, 150, 50);
        g.setColor(new Color(134, 103, 35));
        g.drawLine(145, 50, 100, 40);

    }
    public static void drawFlameIII(Graphics g) {
        g.setColor(new Color(245, 188, 64));
        g.drawLine(298, 100, 225, 85);
        g.setColor(new Color(196, 150, 50));
        g.drawLine(220, 85, 150, 75);
        g.setColor(new Color(134, 103, 35));
        g.drawLine(145, 75, 115, 70);


    }



    // small star 1
    public static void drawStarOne(Graphics g){
        g.drawOval(125, 225, 10, 10);
        g.setColor(new Color(246, 236, 190));
        g.fillOval(125, 225, 10, 10);

    }
    // small star 2
    public static void drawStarTwo(Graphics g){
        g.drawOval(425, 25, 20, 20);
        g.setColor(new Color(178, 225, 246));
        g.fillOval(425, 25, 20, 20);
    }
    // small star 3
    public static void drawStarThree(Graphics g){
        g.drawOval(675, 250, 15, 15);
        g.setColor(new Color(234, 200, 200));
        g.fillOval(675, 250, 15, 15);
    }
}