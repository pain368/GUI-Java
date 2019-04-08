import javax.swing.*;
import java.awt.*;

public class MainWindowDisplay extends JFrame {
    private int posX, posY;
    private int sideA, sideB;
    private int  radius;
    private int red , green, blue;
    private int [] arrCol = new int[3];
    GenerateRandomShape ob;

    public MainWindowDisplay() {
        this.posX = 0;
        this.posY = 0;
        this.sideA = 0;
        this.sideB = 0;
        this.radius = 0;
        this.red = 0;
        this.green = 0;
        this.blue = 0;
        this.arrCol[0] = 0;
        this.arrCol[1] = 0;
        this.arrCol[2] = 0;
    }
    void setColor(int redColor, int greenColor, int blueColor) {
        this.red = redColor;
        this.green = greenColor;
        this.blue =blueColor;
    }

    public MainWindowDisplay(String title, int width, int height, int [] colArr)
    {
        this.setTitle(title);
        this.setSize(width, height);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        if (colArr.length == 3) {
            // zrobic petle
            this.arrCol[0] = colArr[0];
            this.arrCol[1] = colArr[1];
            this.arrCol[2] = colArr[2];
        }


    }





    public void paint(Graphics ob) {

        // DEBUG -> System.out.println(this.arrCol[0] + " " + this.arrCol[1] +" " + this.arrCol[2]);

        ob.clearRect(0,0,getWidth(),getHeight());
        ob.setColor(new Color(this.arrCol[0],this.arrCol[1], this.arrCol[2]));
        ob.drawOval(getWidth()/2, getHeight()/2, 40, 50);
    }
}
