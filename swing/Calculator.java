import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculator extends JFrame {
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;
	JButton b10;
	JButton b11;
	Calculator(){
		setTitle("CALCULATOR");
		Container c = this.getContentPane();
		c.setBackground(new Color(0,0,0));
		setSize(500,500);
		setVisible(true);
		//setBackground(Color.red);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(9,2,10,10));
		 b1 = new JButton("+");
		 b2 = new JButton("-");
		 b3 = new JButton("*");
		 b4 = new JButton("/");
		 b5 = new JButton("^");
		 b6 = new JButton("sin");
		 b7 = new JButton("cos");
		 b8 = new JButton("tan");
		 b9 = new JButton("log");
		 b10 = new JButton("log to base 10");
                 b11 = new JButton("clear");
		JLabel l1= new JLabel("INPUT 1");
		add(l1);
		JTextField t1= new JTextField();
		add(t1);
		JLabel l2 = new JLabel("INPUT 2");
		add(l2);
		JTextField t2 = new JTextField();
		add(t2);
		JLabel l3 = new JLabel("RESULT");
		add(l3);
		JTextField t3 = new JTextField();
		add(t3);
		add(b1);
		 add(b2);
		 add(b3);
		 add(b4);
		 add(b5);
		 add(b6);
		 add(b7);
		 add(b8);
		 add(b9);
	         add(b10);
		 add(b11);
		  b1.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 float x = Float.parseFloat(t1.getText());
				 float y = Float.parseFloat(t2.getText());
				 float z= x+y;
				 t3.setText(String.valueOf(z));
				 
			 }
		 });
		 
		 b2.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 float x = Float.parseFloat(t1.getText());
				 float y = Float.parseFloat(t2.getText());
				 float z= x-y;				 
				 t3.setText(String.valueOf(z));
				 
			 }
		 });
		 b3.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 float x = Float.parseFloat(t1.getText());
				 float y = Float.parseFloat(t2.getText());
				 float z= x*y;
				 t3.setText(String.valueOf(z));
				 
			 }
		 });
		 b4.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 
				 float x = Float.parseFloat(t1.getText());
				 float y = Float.parseFloat(t2.getText());
				 if(y==0){
					 t3.setText("divide error");
					 }
				 else
					 {float z= x/y;
				 t3.setText(String.valueOf(z));
					 }
				 				 
				 
			 }
		 });
		 b5.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				
				 double x = Float.parseFloat(t1.getText());
				 double y = Float.parseFloat(t2.getText());
				 double z= Math.pow(x,y);
				 t3.setText(String.valueOf(z));}
			
				 
				 
			 
		 });
		 b6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				double x =Float.parseFloat(t1.getText());
				double y =Math.toRadians(x);
				double z = Math.sin(y);
				t3.setText(String.valueOf(z));
			}		
		});
		  b7.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                                double x =Float.parseFloat(t1.getText());
				double n=x/90.0;
				if(n%2!=0 ){	
				if(x==n*90.0)
				 t3.setText(String.valueOf(0));
				}
				 else{
				double y =Math.toRadians(x);
				System.out.println(y);
                                double z = Math.cos(y);
                                t3.setText(String.valueOf(z));}
                        }
                });
		  b8.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                                double x =Float.parseFloat(t1.getText());
				double y =Math.toRadians(x);

                                double z = Math.tan(y);
                                t3.setText(String.valueOf(z));
                        }
                });
		  b9.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                                double x =Float.parseFloat(t1.getText());
                                double z = Math.log(x);
                                t3.setText(String.valueOf(z));
                        }
                });
		  b10.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                                double x =Float.parseFloat(t1.getText());
                                double z = Math.log10(x);
                                t3.setText(String.valueOf(z));
                        }
                });



		 b11.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 t3.setText(null);
				 t1.setText(null);
				 t2.setText(null);
			 }
		 });	 
		 
	}
		
	public static void main(String args[]){
	new Calculator();
	}

}
