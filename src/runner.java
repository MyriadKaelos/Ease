import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class runner extends Functions {
    public runner(int width, int height, int res) {
        super(width, height, res);
    }

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
