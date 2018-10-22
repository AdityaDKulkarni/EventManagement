package ui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import custom.HintTextArea;
import global.Globals;

public class Page3 extends JFrame {

	JPanel panel;  
	JLabel lblCause,lblAvgAge,lblBudget,lblFoodPrefer,lblMenu,lblExtraItem,lblApproxCost, errorLabel;
	JTextField tfPurposeCause,tfAge,tfBudget;
	JTextArea taMenu;
	JComboBox<String> comboFoodPref;
	JButton btnNext;

	public Page3(){
		makeFrameFullSize();
		panel=(JPanel)getContentPane();
		panel.setLayout(null);
		
		JLabel labelimg=new JLabel("");
		Image pic3=new ImageIcon(this.getClass().getResource("/assets/p3.jpg")).getImage();
		labelimg.setIcon(new ImageIcon(pic3));
		labelimg.setBounds(10,10,1340,230);
		
		lblCause=new JLabel("Cause of the event");
		lblCause.setFont(new Font("Arial",Font.BOLD,14));
		lblCause.setBounds(50,270,200,20);
		lblCause.setForeground(Color.WHITE);

		tfPurposeCause=new JTextField(60);
		tfPurposeCause.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		tfPurposeCause.setBounds(300,270,220,20);
		tfPurposeCause.setFont(new Font("Arial",Font.PLAIN,14));
		tfPurposeCause.setBackground(new Color(205,255,250));

		lblAvgAge=new JLabel("Average age group of people");
		lblAvgAge.setFont(new Font("Arial",Font.BOLD,14));
		lblAvgAge.setBounds(50,320,250,20);
		lblAvgAge.setForeground(Color.WHITE);
		
		tfAge=new JTextField(60);
		tfAge.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		tfAge.setBounds(300,320,90,20);
		tfAge.setFont(new Font("Arial",Font.PLAIN,14));
		tfAge.setBackground(new Color(205,255,250));

		lblBudget=new JLabel("Budget per plate:");
		lblBudget.setFont(new Font("Arial",Font.BOLD,14));
		lblBudget.setBounds(50,370,150,20);
		lblBudget.setForeground(Color.WHITE);

		tfBudget=new JTextField(60);
		tfBudget.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		tfBudget.setBounds(300,370,90,20);
		tfBudget.setFont(new Font("Arial",Font.PLAIN,14));
		tfBudget.setBackground(new Color(205,255,250));

		lblFoodPrefer=new JLabel("Food preference:");
		lblFoodPrefer.setFont(new Font("Arial",Font.BOLD,14));
		lblFoodPrefer.setBounds(50,420,160,20);
		lblFoodPrefer.setForeground(Color.WHITE);
		
		comboFoodPref=new JComboBox<String>();

		comboFoodPref.addItem("Indian Cuisine");
		comboFoodPref.addItem("Chinese");
		comboFoodPref.addItem("Continental");
		comboFoodPref.addItem("Mexican");
		comboFoodPref.setFont(new Font("Arial",Font.PLAIN,14));
		comboFoodPref.setBounds(300,420,130,20);

		lblMenu=new JLabel("Menu:");
		lblMenu.setFont(new Font("Arial",Font.BOLD,14));
		lblMenu.setBounds(50,470,50,20);
		lblMenu.setForeground(Color.WHITE);

		taMenu=new HintTextArea("Enter menu items seperated by comma");
		taMenu.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		taMenu.setFont(new Font("Arial",Font.PLAIN,14));
		taMenu.setBounds(300,470,300,70);
		taMenu.setBackground(new Color(205,255,250));

		btnNext=new JButton("Next");
		btnNext.setMnemonic('N');
		btnNext.setToolTipText("Click Here");
		btnNext.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNext.setFont(new Font("Arial",Font.BOLD,14));
		btnNext.setBounds(250,590,170,23);
		btnNext.setBackground(new Color(200,240,250));
		btnNext.setForeground(Color.BLACK);
		btnNext.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if(!isDataValid()) {
						errorLabel.setText("Please fill all the fields!");
						return;
					}
					System.out.println("Age group: " + Integer.parseInt(tfAge.getText().toString()));
					System.out.println("Purpose: " + tfPurposeCause.getText().toString());
					Globals.details.setPurpose(tfPurposeCause.getText().toString());
					Globals.details.setAgeGroup(Integer.parseInt(tfAge.getText().toString()));
					Globals.details.setPlateBudget(tfBudget.getText().toString());
					Globals.details.setFoodPreference(comboFoodPref.getSelectedItem().toString());
					Globals.details.setMenu(taMenu.getText().toString());
					dispose();
					Page4 name = new Page4();
				}catch(Exception e1) {
					e1.printStackTrace();
					Page4 name = new Page4();
				}
			}
		});
		
		errorLabel = new JLabel();
		errorLabel.setBackground(Color.WHITE);
		errorLabel.setSize(new Dimension(300,100));
		errorLabel.setLocation(700, 300);
		errorLabel.setForeground(Color.WHITE);

		panel.add(labelimg);
		panel.add(lblCause);
		panel.add(lblAvgAge);
		panel.add(lblBudget);
		panel.add(errorLabel);
		panel.add(tfPurposeCause);
		panel.add(tfAge);
		panel.add(tfBudget);
		panel.add(comboFoodPref);
		panel.add(lblFoodPrefer);
		panel.add(lblMenu);
		panel.add(taMenu);
		panel.add(btnNext);
		
		panel.setBackground(new Color(100,130,230));
		setVisible(true);

	}
	
	private boolean isDataValid() {
		if(tfPurposeCause.getText().toString().isEmpty()
				|| tfAge.getText().isEmpty()
				|| tfBudget.getText().toString().isEmpty()
				|| taMenu.getText().toString().isEmpty()) {
			return false;
		}
		
		return true;
	}

	private void makeFrameFullSize(){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screenSize.width, screenSize.height);
	}
	
}