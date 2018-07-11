import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

public class JTableDemo extends JFrame implements ActionListener, MouseListener, ListSelectionListener{
	JTable table;
	JTextField text;
	String[][] values = {
			{
				"manisha",
				"20",
				"100"
			},
			{
				"Neha",
				"25",
				"95"
			},
			{
				"monica",
				"15",
				"50"
			}
	};
	String[] header = {
                                "Name",
                                "Age",
                                "iq"
                };
	JTableDemo() {
		setLayout(new GridLayout(2,1 ));
		/*String[] header = {
				"Name",
				"Age",
				"Guguness"
		};*/
		
		table = new JTable(values, header);
		table.addMouseListener(this);
		text = new JTextField();
		add(table);
		add(text);
		/*table.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//ListSelectionModel list = table.getSelectionModel();
				int row = table.getSelectedRow();
				int col = table.getSelectedColumn();
				text.setText(values[row][col]);
			}
		});*/
		setSize(500, 500);
		setVisible(true);
	}
	
	public void mousePressed(MouseEvent e) {
		int row = table.getSelectedRow();
		int col = table.getSelectedColumn();
		text.setText(header[col]+" " +values[row][col]);
	}

	
	public static void main(String[] args) {
		new JTableDemo();
	}

	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		// TODO Auto-generated method stub
		int row = table.getSelectedRow();
		int col = table.getSelectedColumn();
		text.setText(values[row][col]);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int row = table.getSelectedRow();
		int col = table.getSelectedColumn();
		text.setText(values[row][col]);
	}
}
