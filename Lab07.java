import java.applet.Applet;
import java.awt.*;

public class Lab07 extends Applet{
    public void paint(Graphics g){
        Backgorund.drawNightSky(g);
        Backgorund.drawMountain1(g);
        Backgorund.drawGround(g);


        Star.drawShootingStar(g);
        Star.drawFlameI(g);
        Star.drawFlameII(g);
        Star.drawFlameIII(g);
        Star.drawStarOne(g);
        Star.drawStarTwo(g);
        Star.drawStarThree(g);

        Planet.drawPlanet(g);
        Planet.drawRingI(g);
        Planet.drawRingII(g);

    }
}
