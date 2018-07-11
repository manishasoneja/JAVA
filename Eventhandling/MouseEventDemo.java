import java.awt.*;
import java.awt.event.*;
import java.util.*;
class MouseEventDemo extends Frame implements MouseListener{
	Label l;
	MouseEventDemo(){
		add(l = new Label(),"South");
		l.setFont(new Font("Timenewroman",Font.BOLD,10));  // type of font,style, size of font
                l.setBackground(Color.white);                                                   //style is of type final
		addMouseListener(this);
		setSize(500,500);  //size of frame
		setVisible(true);
		
	}
	public void mouseEntered(MouseEvent e){
		setBackground(Color.red);
		l.setText("Mouse Entered" );
	}
	 public void mouseExited(MouseEvent e){
                setBackground(Color.green);
                l.setText("Mouse Exited" );
        }

	 public void mouseReleased(MouseEvent e){
                setBackground(Color.yellow);
                l.setText("Mouse released" );
        }

	 public void mouseClicked(MouseEvent e){
                setBackground(Color.blue);
                l.setText("Mouse clicked" );
        }
	 public void mousePressed(MouseEvent e){
                setBackground(Color.red);
                l.setText("Mouse pressed" );
        }



	public static void main(String arg[]){
		new MouseEventDemo();
	}
}
