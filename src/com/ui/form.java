package com.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

public class form {
	public static int counter = 0;
	
	public static void main(String[] args) {
		
		JFrame f=new JFrame();
		JButton b=new JButton("add test step");
		b.setBounds(700,50,150, 40);
		String controls[]={"openurl","click","type"};
		final JComboBox cb=new JComboBox(controls);  
		cb.setBounds(50, 50,90,20);  
		final JFormattedTextField area =  new JFormattedTextField();
		area.setBounds(250,50,150,30);  
		final JFormattedTextField area1 =  new JFormattedTextField();  
		area1.setBounds(500,50,150,30); 
		JButton b1=new JButton("Run");
		b1.setBounds(450,200,100, 40);
		
		JLabel input = new JLabel("Input Field");		
		JLabel xpath = new JLabel("xpath");
		
		input.setBounds(180,50,90,20);
		xpath.setBounds(450,50,90,20);
		
		JButton b3=new JButton("Sumbit TC");
		b3.setBounds(200,200,100, 40);
		
		f.add(b);
		f.add(b1);
		f.add(cb);
		f.add(b3);
	
		f.add(area);
		f.add(area1);
		f.add(input);
		f.add(xpath);
		f.setSize(900,300);
		f.setLayout(null);
		f.setVisible(true);
		
		//// Write data
		b.addActionListener(new ActionListener() {
		       @Override
			public void actionPerformed(ActionEvent ae){
		         String abc = (String) cb.getSelectedItem();
		         String bbb = area.getText();
		         String dfdd = area1.getText();
		         String[] case1 = {abc, bbb, dfdd};
		         variables.mymap.put(counter, case1);
		         counter++;
		       } 
		    });
		

		//// start execution
		b1.addActionListener(new ActionListener() {
		       @Override
			public void actionPerformed(ActionEvent ae){
		    	   executorclass.startexecution();
		       }
		    });
		
		//// Start TC //// Open File
		b3.addActionListener(new ActionListener() {
		       @Override
			public void actionPerformed(ActionEvent ae){
		    	try {
					saveexcel.begin();
				} catch (ParserConfigurationException | TransformerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
		       }
		    });			
	}
	}


