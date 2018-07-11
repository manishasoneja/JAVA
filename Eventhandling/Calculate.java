import java.awt.event.*;
import java.util.Stack;
import java.awt.*;
public class Calculate extends Frame {
	Calculate(){
		Frame thisframe;
		thisframe=this;
		

		 setTitle("CALCULATOR"); //to set title of a frame
		 setSize(500,500); // to set size of frame
		 setVisible(true);		
		setLayout(null);
		Button b1 = new Button("exit");
		Button b2 = new Button("MAXIMIZE/RESTORE");
		Button b3 = new Button("MINIMIZED");
		 b1.setBounds(0,0,50,25);
		 add(b1);
		 b2.setBounds(50,0,200,25);
		 add(b2);
		b3.setBounds(250,0,100,25);
		add(b3);	
		Label l1 = new Label("INPUT 1");
		Label l2 = new Label("INPUT 2");
		Label l3 = new Label("RESULT");
		l1.setBounds(0, 25, 100, 25);
		add(l1);
		TextField t1 = new TextField();
		t1.setBounds(100,25,100,25);
		 add(t1);
		 l2.setBounds(0, 50, 100, 25);
		 add(l2); 
		TextField t2 = new TextField();
		 add(t2);
		 t2.setBounds(100,50,100,25);
		 l3.setBounds(0, 75, 100, 25);
		 add(l3);
		 TextField t3 = new TextField();
		 t3.setBounds(100,75,100,25);
		 add(t3);
		 Button b4 = new Button("+");
		 b4.setBounds(0,100,100,25);
		 add(b4);
		 
		 Button b5 = new Button("-");
		 b5.setBounds(100,100,100,25);
		 add(b5);
		 
		 Button b6 = new Button("*");
		 b6.setBounds(200,100,100,25);
		 add(b6);
		 
		 Button b7 = new Button("/");
		 b7.setBounds(300,100,100,25);
		 add(b7);
		 
		 Button b8 = new Button("^");
		 b8.setBounds(400,100,100,25);
		 add(b8);
		 
		 Button b9 = new Button("CLEAR");
		 b9.setBounds(0, 125, 100, 25);
		 add(b9);
		 b1.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 System.exit(0);
			 }
		 });
		 b2.addActionListener(new ActionListener(){
			 	public void actionPerformed(ActionEvent e){
			 		if(thisframe.getExtendedState()==Frame.NORMAL){
			 			setExtendedState(Frame.MAXIMIZED_BOTH);
			 		}
			 		else if(thisframe.getExtendedState()==Frame.MAXIMIZED_BOTH){
			 			setExtendedState(Frame.NORMAL);
			 		}
			 	}
		 });
		 b3.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 setExtendedState(Frame.ICONIFIED);
			 }
			 
		 });
		
		 b4.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 float x = Float.parseFloat(t1.getText());
				 float y = Float.parseFloat(t2.getText());
				 float z= x+y;
				 t3.setText(String.valueOf(z));
				 
			 }
		 });
		 
		 b5.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 float x = Float.parseFloat(t1.getText());
				 float y = Float.parseFloat(t2.getText());
				 float z= x-y;				 
				 t3.setText(String.valueOf(z));
				 
			 }
		 });
		 b6.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 float x = Float.parseFloat(t1.getText());
				 float y = Float.parseFloat(t2.getText());
				 float z= x*y;
				 t3.setText(String.valueOf(z));
				 
			 }
		 });
		 b7.addActionListener(new ActionListener(){
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
		 b8.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				
				 double x = Float.parseFloat(t1.getText());
				 double y = Float.parseFloat(t2.getText());
				 double z= Math.pow(x,y);
				 t3.setText(String.valueOf(z));}
			
				 
				 
			 
		 });
		 b9.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 t3.setText(null);
				 t1.setText(null);
				 t2.setText(null);
			 }
		 });	 
		 
	}
	
	
	 
	 
	 public static void main(String[] args){
		 Calculate c = new Calculate();
		 
	 }

}
