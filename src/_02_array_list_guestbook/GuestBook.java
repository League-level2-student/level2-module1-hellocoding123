package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import _01_array_list_visualizer.data.ArrayList;

public class GuestBook implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;
	ArrayList<String> list= new ArrayList<String>();
	
	
	public GuestBook() {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
		frame = new JFrame();
		panel = new JPanel();
		button1 = new JButton("Add Name");
		button2 = new JButton("View Names");
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
		
		list.add("Guest #1: Bob Banders");
		list.add("Guest #2: Sandy Summers");
		list.add("Guest #3: Greg Ganders");
		list.add("Guest #4: Donny Doners");
		button1.addActionListener(this);
		button2.addActionListener(this);
		frame.setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button1) {
			String answer = JOptionPane.showInputDialog("What name do you want to add to the guest list?");
			list.add("Guest #"+(list.size()+1)+": "+answer);
		}
		else if(e.getSource() == button2) {
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
		}
	}
		
}
