import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class runner extends Functions {
    public runner(int width, int height, int res) {
        super(width, height, res);
    }
/*
I know it looks messy, but don't worry.
This right here is where we put in the width, the height,
and the resolution of our playing board.
The resolution is a little bit different than the normal
idea of resolution.
Here, width and height give us the amount of computer pixels
we are using, and resolution gives us the size we want our
pixels to be.
*/
public static void main(String args[]) {
        runner r = new runner(300,300,10);
    }



    public void paintStuff(Graphics2D g2d) {
        p(10,10,Color.BLACK);
    }



    public void keyTyped(KeyEvent e) {
        System.out.println(e.getKeyChar() + ": Typed");
    }
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyChar() + ": Pressed");
    }
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyChar() + ": Released");
    }
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getButton() + ": (" + e.getX() + "," + e.getY() + ")...Clicked");
    }
    public void mousePressed(MouseEvent e) {
        System.out.println(e.getButton() + ": (" + e.getX() + "," + e.getY() + ")...Pressed");
    }
    public void mouseReleased(MouseEvent e) {
        System.out.println(e.getButton() + ": (" + e.getX() + "," + e.getY() + ")...Released");
    }
}
