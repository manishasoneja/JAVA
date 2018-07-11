import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.geom.*;

public class Ship extends Applet implements KeyListener{

    private Image ship;
    int width=640,height=480,x=width/2,y=height/2,dx,dy;
    double angle=0;

    public void init() {
        setSize(width,height);
        ship = getImage(getDocumentBase(),"SSI.png");
        dx=ship.getWidth(null);
        dy=ship.getHeight(null);
        addKeyListener(this);
        setFocusable(true);
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        AffineTransform turn = new AffineTransform();

        turn.translate(x,y);
        turn.rotate(Math.toRadians(angle));
        g2.drawImage(ship, turn, null);

    }

    public void keyPressed(KeyEvent e){
        if (e.getKeyCode()==KeyEvent.VK_LEFT){
            angle=angle-10;
        }
        if (e.getKeyCode()==KeyEvent.VK_RIGHT){
            angle=angle+10;
        }
         if (e.getKeyCode()==KeyEvent.VK_UP){
            angle=angle+180;
        }
         if (e.getKeyCode()==KeyEvent.VK_DOWN){
            angle=angle-180;
        }
        


        if (e.getKeyCode()==32){
            System.out.println("shoot");
        }
        repaint();
    }

    public void keyReleased(KeyEvent e){

    }

    public void keyTyped(KeyEvent e){

    }
}
