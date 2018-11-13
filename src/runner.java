import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class runner extends Functions {
    public runner(int width, int height, int res) throws InterruptedException {
        super(width, height, res);
        int x = 0;
        while(true) {
            System.out.println("Wait" + x);
            Thread.sleep(100);
            x++;
        }
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
public static void main(String args[]) throws InterruptedException {
        runner r = new runner(300,300,10);

        while(true) {
            paint();
            Thread.sleep(100);
        }
    }
    public void paint() {
        p(0,0,Color.RED);
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
