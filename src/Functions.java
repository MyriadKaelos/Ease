import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Functions extends JPanel implements MouseListener,KeyListener {
    int width;
    int height;
    int res;
    Graphics2D g2d;
    public Functions(int width, int height, int res) {
        this.width = width;
        this.res = res;
        this.height = height;
        JFrame frame = new JFrame();
        frame.add(this);
        frame.addKeyListener(this);
        frame.addMouseListener(this);
        frame.setVisible(true);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


    public void paintComponent(Graphics g) {
        this.g2d = (Graphics2D)g;
        super.paintComponent(g);  // paint background
        setBackground(Color.WHITE);
        Graphics2D g2d = (Graphics2D)g;
        paintStuff(g2d);
    }
    public void paintStuff(Graphics2D g2d) {

    }
    public void p(int x, int y, Color color) {
        g2d.setColor(color);
        g2d.fillRect(x*res,y*res,res,res);
    }
}
