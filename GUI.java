package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * A minimal Java program with a graphical user interface. The
 * GUI prints out the number of times the user clicks a button.
 *  
 * from: https://introcs.cs.princeton.edu/java/15inout/GUI.java.html 
 */

public class GUI implements ActionListener{
	
	private int count = 0;
	private JLabel label; 
	private JFrame frame;
	private JPanel panel;
	
	public GUI(){
		
		frame = new JFrame();
		
		JButton button = new JButton("Click me");
		button.addActionListener(this);
		
		label = new JLabel("Number of clicks: 0");
		
		panel = new JPanel();		
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30)); // top, bottom, left, right in pixels
		panel.setLayout(new GridLayout(0, 1)); // columns and rows
		panel.add(button);
		panel.add(label);
		
		// obligatory stuff that almost every program has
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Our GUI");
		frame.pack();
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		new GUI();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number of clicks: " + count);
	}

}
