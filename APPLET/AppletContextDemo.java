import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.net.*;

public class AppletContextDemo extends Applet implements ActionListener{
	public void init(){
		Button b1 = new Button("GO TO HTML");
		b1.addActionListener(this);
		add(b1);
	}
	public void actionPerformed(ActionEvent e){
//	URL url = getCodeBase();
	try{
		AppletContext context = getAppletContext();
		URL url = new URL(getCodeBase()+"Simplehtml.html");
		context.showDocument(url,"Simplehtml.html");
	}
	catch(MalformedURLException e1){
		showStatus("URL  NOT FOUND");
	}
	}
}
