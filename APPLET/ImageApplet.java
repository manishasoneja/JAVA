import java.awt.*;
import java.applet.*;
import java.awt.Graphics;
//import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import javax.swing.ImageIcon;
public class ImageApplet extends Applet{
		Image img;
		ImageApplet i;
		public void init(){
			setSize(500,500);
			img = getImage(getDocumentBase(),"SSI.png ");
			showStatus("applet initialized");
			repaint();
			//AffineTransform turn = new t
		}
		public void paint(Graphics g){
			g.drawImage(img,30,50,this);
			i.rotateImage(90,this);
			
		}
		public  void rotateImage(double degrees,ImageObserver o){
			ImageIcon icon = new ImageIcon(this.img);
			BufferedImage blankcanvas = new BufferedImage(icon.getIconWidth(),icon.getIconHeight(),BufferedImage.TYPE_INT_ARGB);
			Graphics2D g2 = (Graphics2D)blankcanvas.getGraphics();
			g2.rotate(Math.toRadians(degrees),icon.getIconWidth()/2,icon.getIconHeight());
			g2.drawImage(this.img, 30, 50, o);
			this.img=blankcanvas;
		}
}


