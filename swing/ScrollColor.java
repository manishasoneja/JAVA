import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.*;


class ScrollColor extends JFrame implements AdjustmentListener{
 private JLabel labelRed, labelGreen, labelBlue;
 private JScrollBar sBarRed, sBarGreen, sBarBlue;
 
 	ScrollColor(){
  //setting layout
  setLayout(new FlowLayout());
  
  //initializing label for each scrollbar;
  labelRed = new JLabel("Adjust Red:");
  labelGreen = new JLabel("Adjust Green:");
  labelBlue = new JLabel("Adjust Blue:");
  
  //initializing scrollbar
  sBarRed = new JScrollBar(JScrollBar.HORIZONTAL,0,5,0,255);
  sBarGreen = new JScrollBar(JScrollBar.HORIZONTAL,0,5,0,255);
  sBarBlue = new JScrollBar(JScrollBar.HORIZONTAL,0,5,0,255);
  
  //adding eventlistener
  sBarRed.addAdjustmentListener(this);
  sBarGreen.addAdjustmentListener(this);
  sBarBlue.addAdjustmentListener(this);
  
  //adding label and scrollbar to the frame;
  add(labelRed);
  add(sBarRed);
  add(labelGreen);
  add(sBarGreen);
  add(labelBlue);
  add(sBarBlue);
 }//end of constructor;
 
 public void adjustmentValueChanged(AdjustmentEvent event){
  int cRed, cGreen, cBlue; //store value of scrollbar
  cRed = sBarRed.getValue(); //getting current value of scroll bar;
  cGreen = sBarGreen.getValue();
  cBlue = sBarBlue.getValue();
  
  getContentPane().setBackground(new Color(cRed,cGreen,cBlue)); //change the background color;
 }//end of event handler
 //end of SetScrollBar class


 public static void main(String[] args){
  ScrollColor demo = new ScrollColor();
  demo.setSize(200,300);
  demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  demo.setVisible(true);
 }
} //end of main class


