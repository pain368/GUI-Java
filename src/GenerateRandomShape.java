import javax.swing.*;
import java.awt.*;

public class GenerateRandomShape extends JFrame {

    /*
    This class are responisble for crate new shape such as Trojkat, owal i kwardra
     */

    private int posX, posY;
    private int sideA, sideB;
    private int  radius;
    private int red , green, blue;

    public GenerateRandomShape() {
        this.posX = 0;
        this.posY = 0;
        this.sideA = 0;
        this.sideB = 0;
        this.radius = 0;
        this.red = 0;
        this.green = 0;
        this.blue = 0;
    };

    public GenerateRandomShape(int oX, int oY, int bokA, int bokB) {
        this.posX = oX;
        this.posY = oY;
        this.sideA = bokA;
        this.sideB = bokB;
        this.radius = 0;
    };

    void setColor(int redColor, int greenColor, int blueColor) {
        this.red = redColor;
        this.green = greenColor;
        this.blue =blueColor;
    }

    public void paint(Graphics ob) {
        ob.clearRect(0,0,getWidth(),getHeight());
        ob.setColor(new Color(82, 255, 43));
        ob.drawOval(this.posX, this.posY, this.sideA, this.sideB);
    }





}
