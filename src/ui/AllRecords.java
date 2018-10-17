package ui;

import javax.swing.*;

import global.Globals;
import models.EventDetails;
import sql.SQLHelper;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class AllRecords extends JFrame{

	JLabel name,Cause,budgetplate,date,time,venue,totalbudget,entertainment;
	JComboBox<String> records;
	JTextField tfname,tfcause,tfbudgetplate,tfdate,tftime,tftotalbudget;
	JTextArea tfentertainment;
	JTextArea tfvenue;
	JFrame frame;
	JPanel panel;
	JButton btnBack, btnSearch;
	ResultSet set;

	AllRecords(){
		frame=new JFrame("SHOW ALL ADDED RECORDS");
		makeFrameFullSize();
		panel=(JPanel)frame.getContentPane();
		panel.setLayout(null);

		records=new JComboBox<String>();
		records.setFont(new Font("Arial",Font.PLAIN,14));
		records.setBounds(70,100,150,20);

		try {
			set = SQLHelper.getCustomerList();
			while(set.next()) {
				records.addItem(set.getString("name"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		JLabel labelimg=new JLabel("");
		Image pic=new ImageIcon(this.getClass().getResource("/assets/p12.png")).getImage();
		labelimg.setIcon(new ImageIcon(pic));
		labelimg.setBounds(850,30,370,470);
		panel.add(labelimg);
		
		JLabel labelimg1=new JLabel("");
		Image pic1=new ImageIcon(this.getClass().getResource("/assets/p13.jpg")).getImage();
		labelimg1.setIcon(new ImageIcon(pic1));
		labelimg1.setBounds(50,330,300,230);
		panel.add(labelimg1);

		name=new JLabel("Name");
		name.setFont(new Font("Arial",Font.BOLD,14));
		name.setForeground(Color.white);
		name.setBounds(440,70,100,20);

		tfname=new JTextField(60);
		tfname.setBounds(600,70,230,20);
		tfname.setEditable(false);
		tfname.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		tfname.setFont(new Font("Arial",Font.BOLD,14));
		tfname.setBackground(new Color(245,255,250));

		Cause=new JLabel("Cause of Event");
		Cause.setFont(new Font("Arial",Font.BOLD,14));
		Cause.setForeground(Color.white);
		Cause.setBounds(440,110,120,20);

		tfcause=new JTextField(60);
		tfcause.setBounds(600,110,230,20);
		tfcause.setEditable(false);
		tfcause.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		tfcause.setFont(new Font("Arial",Font.BOLD,14));
		tfcause.setBackground(new Color(245,255,250));

		venue=new JLabel("Venue of Event");
		venue.setFont(new Font("Arial",Font.BOLD,14));
		venue.setForeground(Color.white);
		venue.setBounds(440,150,140,20);

		tfvenue=new JTextArea();
		tfvenue.setBounds(600,150,230,120);
		tfvenue.setEditable(false);
		tfvenue.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		tfvenue.setFont(new Font("Arial",Font.BOLD,14));
		tfvenue.setBackground(new Color(245,255,250));

		date=new JLabel("Date of Event");
		date.setFont(new Font("Arial",Font.BOLD,14));
		date.setForeground(Color.white);
		date.setBounds(440,300,120,20);

		tfdate=new JTextField(60);
		tfdate.setBounds(600,300,230,20);
		tfdate.setEditable(false);
		tfdate.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		tfdate.setFont(new Font("Arial",Font.BOLD,14));
		tfdate.setBackground(new Color(245,255,250));

		time=new JLabel("Time of Event");
		time.setFont(new Font("Arial",Font.BOLD,14));
		time.setForeground(Color.white);
		time.setBounds(440,340,120,20);

		tftime=new JTextField(60);
		tftime.setBounds(600,340,230,20);
		tftime.setEditable(false);
		tftime.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		tftime.setFont(new Font("Arial",Font.BOLD,14));
		tftime.setBackground(new Color(245,255,250));

		budgetplate=new JLabel("Budged per plate");
		budgetplate.setFont(new Font("Arial",Font.BOLD,14));
		budgetplate.setForeground(Color.white);
		budgetplate.setBounds(440,420,140,20);

		tfbudgetplate=new JTextField(60);
		tfbudgetplate.setEditable(false);
		tfbudgetplate.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		tfbudgetplate.setBounds(600,420,230,20);
		tfbudgetplate.setFont(new Font("Arial",Font.BOLD,14));
		tfbudgetplate.setBackground(new Color(245,255,250));

		totalbudget=new JLabel("Total Budget");
		totalbudget.setFont(new Font("Arial",Font.BOLD,14));
		totalbudget.setForeground(Color.white);
		totalbudget.setBounds(440,380,140,20);

		tftotalbudget=new JTextField(60);
		tftotalbudget.setEditable(false);
		tftotalbudget.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		tftotalbudget.setBounds(600,380,230,20);
		tftotalbudget.setFont(new Font("Arial",Font.BOLD,14));
		tftotalbudget.setBackground(new Color(245,255,250));

		entertainment=new JLabel("Entertainment");
		entertainment.setFont(new Font("Arial",Font.BOLD,14));
		entertainment.setForeground(Color.white);
		entertainment.setBounds(440,460,120,20);
		
		tfentertainment=new JTextArea(5,100);
		tfentertainment.setEditable(false);
		tfentertainment.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		tfentertainment.setBounds(600,460,430,70);
		tfentertainment.setFont(new Font("Arial",Font.BOLD,14));
		tfentertainment.setBackground(new Color(245,255,250));

		btnBack=new JButton("Back");
		btnBack.setMnemonic('B');
		btnBack.setToolTipText("Click Here");
		btnBack.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnBack.setFont(new Font("Arial",Font.BOLD,14));
		btnBack.setBounds(450,600,150,20);
		btnBack.setBackground(new Color(200,240,250));
		btnBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				frame.disable();
				Globals.page1.setVisible(true);
			}
		});

		btnSearch = new JButton("Search");
		btnSearch.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnSearch.setFont(new Font("Arial",Font.BOLD,14));
		btnSearch.setBounds(70,150,150,20);
		btnSearch.setBackground(new Color(200,240,250));

		btnSearch.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ResultSet viewSet = SQLHelper.getEventDetails(records.getSelectedItem().toString());
					while(viewSet.next()) {
						tfname.setText(viewSet.getString("name"));
						tfvenue.setText(viewSet.getString("venue"));
						tfcause.setText(viewSet.getString("purpose"));
						tfbudgetplate.setText(viewSet.getString("platebudget"));
						tfdate.setText(viewSet.getString("dateofevent"));
						tftime.setText(viewSet.getString("starttime") + " to " + viewSet.getString("endtime"));
						tftotalbudget.setText(viewSet.getString("budget"));
						tfentertainment.setText("Extras: " + viewSet.getString("extras") + "\n"
								+ "Celebrity: " + viewSet.getString("celebrity") + "\n"
								+ "Arrangements: " + viewSet.getString("arrangements"));
					}
				}catch(Exception e1) {
					e1.printStackTrace();
				}

			}
		});

		panel.add(venue);
		panel.add(tfvenue);
		panel.add(name);
		panel.add(tfname);
		panel.add(records);
		panel.add(Cause);
		panel.add(tfcause);
		panel.add(budgetplate);
		panel.add(tfbudgetplate);
		panel.add(totalbudget);
		panel.add(tftotalbudget);
		panel.add(date);
		panel.add(tfdate);
		panel.add(time);
		panel.add(tftime);
		panel.add(entertainment);
		panel.add(tfentertainment);
		panel.add(btnBack);
		panel.add(btnSearch);

		panel.setBackground(new Color(100,130,230));
		frame.setVisible(true);

	}


	private void makeFrameFullSize(){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screenSize.width, screenSize.height);
	}

}