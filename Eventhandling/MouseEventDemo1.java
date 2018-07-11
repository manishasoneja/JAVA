import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
	<applet code = "MouseEventDemo1" width ="300" height="500">
	</applet>
*/
class MouseEventDemo1 extends Applet implements MouseListener, MouseMotionListener{
	int mousex=0;
	int mousey=0;
	String str="";
	public void init(){
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mousePressed(MouseEvent me){
		mousex=me.getX();
		mousey=me.getY();
		str="down";
		repaint();
		
	}
	public void mouseReleased(MouseEvent me){
		mousex=me.getX();
		mousey=me.getY();
		str="up";
		repaint();
	}
	 public void mouseEntered(MouseEvent me){
                mousex=0;
                mousey=10;
                str="entered";
                repaint();
        } 
	public void mouseExited(MouseEvent me){
                mousex=0;
                mousey=0;
                str="exit";
                repaint();
        }
	 public void mouseClicked(MouseEvent me){
                mousex=0;
                mousey=10;
                str="clicked";
                repaint();
        }
	public void mouseMoved(MouseEvent me){
		mousex=me.getX();
		mousey=me.getY();
		//str="*";
		showStatus("mouse moving at "+mousex+ " "+mousey);
	}
	   public void mouseDragged(MouseEvent me){
                mousex=me.getX();
                mousey=me.getY();
                str="*";
                showStatus("dragging moving at "+mousex+ " "+mousey);
		repaint();
        }
	public void paint(Graphics g){
		g.drawString(str,mousex,mousey);
	}
}




