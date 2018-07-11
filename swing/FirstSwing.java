import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FirstSwing extends JFrame{

	JButton b1;
	JButton b2;
	JTextField a;
	JButton b3;

	FirstSwing(){
	setLayout(new FlowLayout());
	setSize(500,500);
	setVisible(true);
	b1= new JButton("close");
	b2 = new JButton("open");
	b3 = new JButton("SUBMIT");
	b3.setBounds(250,250,30,30);
	b3.setEnabled(false);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	setLayout(new FlowLayout());

	add(b1);
	add(b2);
	//b2.addActionListener(this);
	a= new JTextField("enter something",30);
	setBackground(Color.blue);	
	a.setToolTipText("enter some text here"); //  you can have html tags in here
	a.setToolTipText("<html><font size=20>"+"enter some text here....<>"+"</font></html>"); 
	a.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			b3.setEnabled(false);
		}
	});
	add(a);
	add(b3);
	a.addKeyListener(new KeyAdapter()	{
		public void keyTyped(KeyEvent e){
			setTitle(a.getText());
		}
		public void keyReleased(KeyEvent e){
			String cont = a.getText();
			if(cont.equals("")){
				b3.setEnabled(false);
			} 
			else{
				b3.setEnabled(true);
			}
		}
	});	
	}
	public static void main(String args[]){
		new FirstSwing();
	}
}
