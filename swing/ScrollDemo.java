import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ScrollDemo extends JFrame implements AdjustmentListener{
	JScrollBar sred;
	JScrollBar sgreen;
	JScrollBar sblue;
	JLabel red;
	JLabel green;
	JLabel blue;
	JLabel l1= new JLabel();
	JPanel p1;
	JPanel p2;
	ScrollDemo(){
		setTitle("changing color using scroll bar");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		p1 = new JPanel();
		p2= new JPanel();
		p1.setLayout(new GridLayout(3,1,5,5));		
		p2.setLayout(new FlowLayout());
		//setLayout(null);
		sred = new JScrollBar(JScrollBar.HORIZONTAL,0,5,0,260);
		sgreen = new JScrollBar(JScrollBar.HORIZONTAL,0,5,0,260);
		sblue = new JScrollBar(JScrollBar.HORIZONTAL,0,5,0,260);
		red = new JLabel("RED");
		green = new JLabel("GREEN");
		blue = new JLabel("BLUE");	
		//red.setBounds(0,0,30,50);
		//sred.setBounds(50,0,50,50);
		 add (p1,BorderLayout.NORTH);
		p1.add(red);
		p1.add(sred);
                p1.add(green);
		p1.add(sgreen);
                p1.add(blue);
		p1.add(sblue);
		//add (p1,"NORTH");
		//add(p2,BorderLayout.CENTER);
		add(l1,BorderLayout.CENTER);
		sred.addAdjustmentListener(this);
		sgreen.addAdjustmentListener(this);
		sblue.addAdjustmentListener(this);
		/*add(sred);
		add(sgreen);
		add(sblue);*/
	
	}
	public void adjustmentValueChanged(AdjustmentEvent e){
		int cred;
		int cgreen;
		int cblue;
		cred=sred.getValue();
		cgreen=sgreen.getValue();
		cblue=sblue.getValue();
		Container c = getContentPane();
		c.setBackground(new Color(cred,cgreen,cblue));
		l1.setText("red: "+cred+" green: "+cgreen+ " blue: "+cblue);
		
		}
	public static void main(String args[]){
		new ScrollDemo();
	}	
	}	

