import java.awt.*;
import java.applet.*;
public class Star {

    //the biggest star
    public static void drawShootingStar(Graphics g){


    }
    // the first flame
    public static void drawFlameI(Graphics g){


    }
    // the second part of the flame
    public static void drawFlameII(Graphics g){


    }
    // the third part of the flame
    public static void drawFlameIII(Graphics g){


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