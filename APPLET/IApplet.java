import java.awt.*;
import java.applet.*;
import java.awt.Graphics;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
class IApplet extends Applet implements AffineTransform{
	BufferedImage image;
BufferedImage im = image;

    //Override
    public void paint(Graphics g) {
    try {
        image = ImageIO.read(new File("jet.png"));
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(image, 100, 100, Color.BLACK, null);
        image = rotateImage(-45);
        g2.drawImage(image, 250, 100, Color.BLACK, null);
    } catch (IOException ex) {

    }
    }

    public BufferedImage rotateImage(int degress) {

    double deg = Math.toRadians(degress);
    double xrot = image.getWidth()/2 ;
    double yrot = image.getHeight() /2;
    AffineTransform xt = AffineTransform.getRotateInstance(deg, xrot, yrot);
    AffineTransformOp op = new AffineTransformOp(xt, AffineTransformOp.TYPE_BILINEAR);
    return op.filter(image, im);

    }


