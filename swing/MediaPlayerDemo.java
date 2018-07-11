import sun.audio.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;


public class MediaPlayerDemo extends JFrame implements ActionListener  {
	
	//private static final long serialVersionUID = 1L;
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JTextField l1 = new JTextField("media player");
	JButton addMusic = new JButton("Add Music");
	JButton play = new JButton("Play");
	JButton stop = new JButton("Stop");
	JButton loop = new JButton("loop");
	JButton remove = new JButton("remove");
	JComboBox list = new JComboBox();
	JFileChooser browse = new JFileChooser();
	FileNameExtensionFilter filter = new FileNameExtensionFilter("WAV sound","wav");
	Font custfont = new Font("TimesNewRoman",Font.ITALIC,20);
	int returnValue;
	String musics[] = new String[10];
	File selectedfile;
	int index=0;
	File sound;
	AudioInputStream ais;
	Clip clip;
	JSlider slider = new JSlider(JSlider.HORIZONTAL);
	MediaPlayerDemo(){
		setLayout(new BorderLayout());
		setBackground(Color.WHITE);
		setTitle("MEDIA PLAYER");
		setSize(500,500);
		setVisible(true);
	//	add(l1,BorderLayout.PAGE_END);
		l1.setFont(new Font("TimesNewRoman",Font.BOLD,20 ));
		l1.setBackground(Color.GRAY);
		l1.setForeground(Color.WHITE);
		add(p1,BorderLayout.CENTER);
		add(p2,BorderLayout.PAGE_END);
		add(list,BorderLayout.PAGE_START);
		list.setBackground(Color.cyan);
		list.setForeground(Color.GRAY);
		p1.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		p1.add(addMusic);
		addMusic.setFont(custfont);
		addMusic.setBackground(Color.cyan);
		addMusic.setForeground(Color.RED);
		//addMusic.addActionListener(this);		
		p1.add(play);
		play.setFont(custfont);
		play.setBackground(Color.cyan);
		play.setForeground(Color.RED);
		addMusic.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					returnValue = browse.showOpenDialog(null);
				
				if(returnValue==browse.APPROVE_OPTION){
					selectedfile=browse.getSelectedFile();
					musics[index]=selectedfile.toString();
					JOptionPane.showMessageDialog(null, selectedfile.toString());
					list.addItem(selectedfile.toString());
					index++;
				}
			}
			
		});
		play.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a){
				try{
					if(list.getSelectedIndex()!=-1){
					sound = new File(musics[list.getSelectedIndex()]);
					System.out.println("file is"+sound);				
					//ais=AudioSystem.getAudioInputStream(sound);
					l1.setText("song playing:"+selectedfile.toString());
					clip=AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					//System.out.println("1");
					clip.start();
					
					
		
					}
				}
				catch(Exception e){
				JOptionPane.showMessageDialog(null, e); 
				}
			}

	
		});
		p1.add(stop);
		stop.setFont(custfont);		
		stop.setBackground(Color.cyan);
		stop.setForeground(Color.RED);

		
		p1.add(loop);
		loop.setFont(custfont);
		loop.setBackground(Color.cyan);
		loop.setForeground(Color.red);
		/*stop.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			clip.stop();
			}
		});*/
		stop.addActionListener(this);
		p2.add(l1);
		loop.addActionListener(new ActionListener(){	
						
					public void actionPerformed(ActionEvent e){	
						try{						
                                                       sound = new File(musics[list.getSelectedIndex()]);
                                                       System.out.println("file is"+sound);
							l1.setText("looping");
                                                       clip = AudioSystem.getClip();
                                                       clip.open(AudioSystem.getAudioInputStream(sound));
                                                       clip.loop(clip.LOOP_CONTINUOUSLY);
                                                       clip.start();
                                                       Thread.sleep(10000);
							}
						catch(Exception e1){}                                                        
							}
			
				
			});
		p1.add(remove);
		remove.setFont(custfont);
		remove.setBackground(Color.cyan);
		remove.setForeground(Color.red);		
		remove.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					int x = list.getSelectedIndex();
					list.removeItemAt(x);
					
				}
			});
		browse.setFileFilter(filter);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
        public void actionPerformed(ActionEvent ae) {
                if(ae.getSource()==stop){
			clip.stop();
			l1.setText("stop");
			}

        }
	
	
	
	public static void main(String args[]){
		new MediaPlayerDemo();
		
	}



}
