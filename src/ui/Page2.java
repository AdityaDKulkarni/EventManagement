package ui;

import javax.swing.*;

import custom.HintTextArea;
import custom.HintTextField;
import global.Globals;
import sql.SQLHelper; 

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Page2 extends JFrame{

	JFrame frame; 
	JTextField nameField,phoneField,emailField,typeField,dateField,averageNoField,budgetField,toRsField;
	JButton nextButton;
	JTextArea addressArea,venueAddressArea;  
	JLabel nameLabel,addressLabel,phoneLabel,emailLabel,typeLabel,dateLabel,timingLabel,venueLabel,
	scaleLabel,averageNoLabel,budgetLabel,toRsLabel, errorLabel, hyphenLabel;
	JPanel panel;  
	JComboBox<String> amComboBox,pmComboBox;
	JComboBox<String> scaleComboBox;
	Cursor cursor;

	int eventId;

	public Page2(){

		frame=new JFrame("Event Details");
		makeFrameFullSize();
		panel=(JPanel)frame.getContentPane();
		panel.setLayout(null);

		nameLabel=new JLabel("Name");
		nameLabel.setBounds(60,30,100,20);
		nameLabel.setFont(new Font("Arial",Font.BOLD,14));

		nameField=new JTextField(30);
		nameField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		nameField.setBounds(300,30,230,20);
		nameField.setBackground(new Color(245,255,250));

		addressLabel=new JLabel("Address");
		addressLabel.setBounds(60,70,100,50);
		addressLabel.setFont(new Font("Arial",Font.BOLD,14));

		addressArea=new JTextArea();
		//addressArea=new HintTextArea("Enter your address");
		addressArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		addressArea.setBounds(300,70,250,75);
		addressArea.setBackground(new Color(245,255,250));

		phoneLabel=new JLabel("Phone No.");
		phoneLabel.setBounds(600,30,100,20);
		phoneLabel.setFont(new Font("Arial",Font.BOLD,14));

		phoneField=new JTextField(30);
		phoneField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		phoneField.setBounds(690,30,150,20);
		phoneField.setBackground(new Color(245,255,250));

		emailLabel=new JLabel("Email");
		emailLabel.setBounds(600,70,70,20); 
		emailLabel.setFont(new Font("Arial",Font.BOLD,14));

		emailField=new JTextField(40);
		emailField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		emailField.setBounds(690,70,200,20);
		emailField.setBackground(new Color(245,255,250));

		typeLabel=new JLabel("Type of Event");
		typeLabel.setBounds(60,170,150,20); 
		typeLabel.setFont(new Font("Arial",Font.BOLD,14));

		typeField=new JTextField(100);
		typeField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		typeField.setBounds(300,170,200,20);
		typeField.setBackground(new Color(245,255,250));

		dateLabel=new JLabel("Date");
		dateLabel.setBounds(60,210,150,20);
		dateLabel.setFont(new Font("Arial",Font.BOLD,14));

		dateField = new HintTextField("YYYY-MM-DD");
		dateField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		dateField.setBounds(300,210,100,20);
		dateField.setBackground(new Color(245,255,250));

		timingLabel=new JLabel("Event Timings");
		timingLabel.setBounds(60,250,150,20);
		timingLabel.setFont(new Font("Arial",Font.BOLD,14));

		errorLabel = new JLabel();
		errorLabel.setBackground(Color.WHITE);
		errorLabel.setSize(new Dimension(300,100));
		errorLabel.setLocation(700, 300);

		hyphenLabel = new JLabel("to");
		hyphenLabel.setFont(new Font("Arial",Font.BOLD,14));
		hyphenLabel.setBounds(400,250,75,20);

		amComboBox=new JComboBox<String>();
		for(int i = 1; i <= 24; i++) {
			if(i < 12) {
				amComboBox.addItem(String.valueOf(i) + " AM");
			}else {
				amComboBox.addItem(String.valueOf(i) + " PM");
			}
		}
		amComboBox.setBounds(300,250,75,20);
		amComboBox.setBackground(new Color(245,255,250));

		pmComboBox=new JComboBox<String>();
		for(int i = 1; i <= 24; i++) {
			if(i < 12) {
				pmComboBox.addItem(String.valueOf(i) + " AM");
			}else {
				pmComboBox.addItem(String.valueOf(i) + " PM");
			}
		}
		pmComboBox.setBounds(450,250,75,20);
		pmComboBox.setBackground(new Color(245,255,250));

		venueLabel=new JLabel("Venue");
		venueLabel.setBounds(60,290,70,20); 
		venueLabel.setFont(new Font("Arial",Font.BOLD,14));

		venueAddressArea=new HintTextArea("Enter the Venue address");
		venueAddressArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		venueAddressArea.setBounds(300,290,300,75);
		venueAddressArea.setBackground(new Color(245,255,250));

		scaleLabel=new JLabel("Scale of Event");
		scaleLabel.setBounds(60,390,150,20); 
		scaleLabel.setFont(new Font("Arial",Font.BOLD,14));

		scaleComboBox=new JComboBox<String>();
		scaleComboBox.addItem("Select");
		scaleComboBox.addItem("Small Scale");
		scaleComboBox.addItem("Medium Scale");
		scaleComboBox.addItem("Large Scale");
		scaleComboBox.setBounds(300,390,100,20);
		scaleComboBox.setBackground(new Color(245,255,250));

		averageNoLabel=new JLabel("Average number of people");
		averageNoLabel.setBounds(60,430,250,20); 
		averageNoLabel.setFont(new Font("Arial",Font.BOLD,14));

		averageNoField=new JTextField(60);
		averageNoField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		averageNoField.setBounds(300,430,100,20);
		averageNoField.setBackground(new Color(245,255,250));

		budgetLabel=new JLabel("Budget range:(Rs)");
		budgetLabel.setBounds(60,470,140,20);  
		budgetLabel.setFont(new Font("Arial",Font.BOLD,14));

		budgetField=new JTextField(30);
		budgetField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		budgetField.setBounds(300,470,70,20);
		budgetField.setBackground(new Color(245,255,250));

		toRsLabel=new JLabel(" to ");
		toRsLabel.setBounds(380,470,60,20);
		toRsLabel.setFont(new Font("Arial",Font.BOLD,14));

		toRsField=new JTextField(30);
		toRsField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		toRsField.setBounds(420,470,70,20);
		toRsField.setBackground(new Color(245,255,250));

		cursor=new Cursor(Cursor.HAND_CURSOR);

		nextButton=new JButton("Next");
		nextButton.setBounds(370, 550, 170, 23);
		nextButton.setBackground(new Color(30,180,255));
		nextButton.setMnemonic('N');
		nextButton.setToolTipText("Click Here");
		nextButton.setCursor(cursor);
		nextButton.setFont(new Font("Arial",Font.BOLD,14));

		nextButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if(isEmailValid(emailField.getText().toString())) {
						eventId = ThreadLocalRandom.current().nextInt(1, 1000);
						Globals.details.setEventId(eventId);
						Globals.details.setName(nameField.getText().toString());
						Globals.details.setPhone(phoneField.getText().toString());
						Globals.details.setEmail(emailField.getText().toString());
						Globals.details.setAddress(addressArea.getText().toString());
						Globals.details.setTypeOfEvent(typeField.getText().toString());
						Globals.details.setDate(dateField.getText().toString());
						Globals.details.setStartTime(amComboBox.getSelectedItem().toString());
						Globals.details.setEndTime(pmComboBox.getSelectedItem().toString());
						Globals.details.setVenue(venueAddressArea.getText().toString());
						Globals.details.setScale(scaleComboBox.getSelectedItem().toString());
						Globals.details.setAvgNoOfPeople(Integer.parseInt(averageNoField.getText()));
						Globals.details.setBudget(budgetField.getText().toString() + " - " +  toRsField.getText().toString());
						frame.dispose();
						Page3 page3 = new Page3();
					}else {
						errorLabel.setText("Please enter valid email!");
					}
				}catch (NumberFormatException e1) {
					errorLabel.setText("Please fill required fields!");
					frame.dispose();
					Page3 page3 = new Page3();
				}
			}
		});

		panel.add(nameLabel);
		panel.add(nameField);
		panel.add(addressLabel);
		panel.add(addressArea);
		panel.add(phoneLabel);
		panel.add(phoneField);
		panel.add(emailLabel);
		panel.add(emailField);
		panel.add(typeField);
		panel.add(dateField);
		panel.add(typeLabel);
		panel.add(dateLabel);
		panel.add(timingLabel);
		panel.add(amComboBox);
		panel.add(pmComboBox);
		panel.add(hyphenLabel);
		panel.add(venueLabel);
		panel.add(scaleLabel);
		panel.add(averageNoLabel);
		panel.add(budgetLabel);
		panel.add(toRsLabel);
		panel.add(averageNoField);
		panel.add(budgetField);
		panel.add(toRsField);
		panel.add(scaleComboBox);
		panel.add(nextButton);
		panel.add(venueAddressArea);
		panel.add(errorLabel);

		panel.setBackground(new Color(153,255,255));
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.setVisible(true);
	}

	private boolean isEmailValid(String email) {
		Matcher matcher = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$").matcher(email);
		return matcher.find();
	}

	private void makeFrameFullSize(){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screenSize.width, screenSize.height);
	}

}