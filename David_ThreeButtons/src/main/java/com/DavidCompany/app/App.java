package com.DavidCompany.app;

// import java.awt.*;
// import java.swing.*;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * Hello world!
 *
 */
public class App extends JFrame implements ActionListener {

	private JLabel label;
	
	public App(String title) {
	      super(title); // calling JFrame constructor
	      
	      getContentPane().setLayout(new FlowLayout());
	      
	      setBounds(10,10,600,400);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      JButton button1 = new JButton("button 1");
	      JButton button2 = new JButton("button 2");
	      JButton button3 = new JButton("button 3");
			
	      // add listeners to respond when button is clicked
			button1.addActionListener(this); 
			button2.addActionListener(this);
			button3.addActionListener(this);
			
			// add the three buttons to the content pane
			getContentPane().add(button1);
			getContentPane().add(button2);
			getContentPane().add(button3);
			
			// create a label to display text 
			label = new JLabel(); 
			
			// add text to label 
			label.setText("label text"); 
			
			// create a panel 
			JPanel panel = new JPanel(); 
			
			// add label to panel 
			panel.add(label); 
			
			// add panel to frame 
			add(panel); 
			
			// set the size of frame 
			setSize(300, 300); 
	   }
	   // actionPerformed() required when implementing ActionListener
	   public void actionPerformed(ActionEvent ae) {
		   label.setText(((JButton) ae.getSource()).getText());
	   }
	   public static void main(String[] args) {
		   App myApp = new App("Three Buttons Assignment");
	      myApp.setVisible(true);
	   }
}
