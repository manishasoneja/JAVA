import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
	<applet code = "KeyEventDemo" width=500 height=500>
	</applet>
*/
	
public class KeyEventDemo extends Applet implements KeyListener{
	String message = "";
	public void init(){
		addKeyListener(this);
	}
public void keyPressed(KeyEvent e){
	showStatus("key is pressed");
}
public void keyReleased(KeyEvent e){ 
        showStatus("key is released");
}
public void keyTyped(KeyEvent e){ 
	message = message+e.getKeyChar();
        showStatus("key is typed");
	repaint();


}	
public void paint(Graphics g){
	g.drawString(message,40,50);
	
}			
}
