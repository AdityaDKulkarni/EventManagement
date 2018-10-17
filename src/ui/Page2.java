package ui;

import javax.swing.*;

import com.itextpdf.text.Document;

import custom.HintTextArea;
import custom.HintTextField;
import global.Globals;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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

		JLabel labelimg=new JLabel("");
		Image pic1=new ImageIcon(this.getClass().getResource("/assets/p7.png")).getImage();
		labelimg.setIcon(new ImageIcon(pic1));
		labelimg.setBounds(680,20,540,650);

		nameLabel=new JLabel("Name");
		nameLabel.setBounds(60,10,100,20);
		nameLabel.setFont(new Font("Arial",Font.BOLD,14));
		nameLabel.setForeground(Color.WHITE);

		nameField=new JTextField(30);
		nameField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		nameField.setBounds(300,10,230,20);
		nameField.setBackground(new Color(205,255,250));


		addressLabel=new JLabel("Address");
		addressLabel.setBounds(60,50,100,50);
		addressLabel.setFont(new Font("Arial",Font.BOLD,14));
		addressLabel.setForeground(Color.WHITE);

		addressArea=new HintTextArea("Enter your address");
		addressArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		addressArea.setBounds(300,50,250,75);
		addressArea.setBackground(new Color(205,255,250));

		phoneLabel=new JLabel("Phone No.");
		phoneLabel.setBounds(60,140,100,20);
		phoneLabel.setFont(new Font("Arial",Font.BOLD,14));
		phoneLabel.setForeground(Color.WHITE);

		phoneField=new JTextField(30);
		phoneField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		phoneField.setBounds(300,140,150,20);
		phoneField.setBackground(new Color(205,255,250));

		emailLabel=new JLabel("Email");
		emailLabel.setBounds(60,180,70,20); 
		emailLabel.setFont(new Font("Arial",Font.BOLD,14));
		emailLabel.setForeground(Color.WHITE);

		emailField=new JTextField(40);
		emailField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		emailField.setBounds(300,180,200,20);
		emailField.setBackground(new Color(205,255,250));

		typeLabel=new JLabel("Type of Event");
		typeLabel.setBounds(60,220,150,20); 
		typeLabel.setFont(new Font("Arial",Font.BOLD,14));
		typeLabel.setForeground(Color.WHITE);

		typeField=new JTextField(100);
		typeField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		typeField.setBounds(300,220,200,20);
		typeField.setBackground(new Color(205,255,250));

		dateLabel=new JLabel("Date");
		dateLabel.setBounds(60,260,150,20);
		dateLabel.setFont(new Font("Arial",Font.BOLD,14));
		dateLabel.setForeground(Color.WHITE);

		dateField = new JTextField("YYYY-MM-DD");
		//	dateField = new HintTextField("YYYY-MM-DD");
		dateField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		dateField.setBounds(300,260,100,20);
		dateField.setBackground(new Color(205,255,250));

		timingLabel=new JLabel("Event Timings");
		timingLabel.setBounds(60,300,150,20);
		timingLabel.setFont(new Font("Arial",Font.BOLD,14));
		timingLabel.setForeground(Color.WHITE);

		errorLabel = new JLabel();
		errorLabel.setBackground(Color.WHITE);
		errorLabel.setSize(new Dimension(300,100));
		errorLabel.setForeground(Color.WHITE);
		errorLabel.setBounds(370, 610, 170, 23);
		
		hyphenLabel = new JLabel("to");
		hyphenLabel.setFont(new Font("Arial",Font.BOLD,14));
		hyphenLabel.setBounds(400,300,75,20);
		hyphenLabel.setForeground(Color.WHITE);
		hyphenLabel.setForeground(Color.WHITE);



		amComboBox=new JComboBox<String>();
		for(int i = 1; i <= 24; i++) {
			if(i < 12) {
				amComboBox.addItem(String.valueOf(i) + " AM");
			}else {
				amComboBox.addItem(String.valueOf(i) + " PM");
			}
		}
		amComboBox.setBounds(300,300,75,20);
		amComboBox.setBackground(new Color(205,255,250));

		pmComboBox=new JComboBox<String>();
		for(int i = 1; i <= 24; i++) {
			if(i < 12) {
				pmComboBox.addItem(String.valueOf(i) + " AM");
			}else {
				pmComboBox.addItem(String.valueOf(i) + " PM");
			}
		}
		pmComboBox.setBounds(450,300,75,20);
		pmComboBox.setBackground(new Color(205,255,250));

		venueLabel=new JLabel("Venue");
		venueLabel.setBounds(60,340,70,20); 
		venueLabel.setFont(new Font("Arial",Font.BOLD,14));
		venueLabel.setForeground(Color.WHITE);


		//	venueAddressArea=new HintTextArea("Enter the Venue address");
		venueAddressArea=new JTextArea("Enter the Venue address");
		venueAddressArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		venueAddressArea.setBounds(300,340,300,75);
		venueAddressArea.setBackground(new Color(205,255,250));

		scaleLabel=new JLabel("Scale of Event");
		scaleLabel.setBounds(60,440,150,20); 
		scaleLabel.setFont(new Font("Arial",Font.BOLD,14));
		scaleLabel.setForeground(Color.WHITE);

		scaleComboBox=new JComboBox<String>();
		scaleComboBox.addItem("Select");
		scaleComboBox.addItem("Small Scale");
		scaleComboBox.addItem("Medium Scale");
		scaleComboBox.addItem("Large Scale");
		scaleComboBox.setBounds(300,440,100,20);
		scaleComboBox.setBackground(new Color(205,255,250));

		averageNoLabel=new JLabel("Average number of people");
		averageNoLabel.setBounds(60,480,200,20); 
		averageNoLabel.setFont(new Font("Arial",Font.BOLD,14));
		averageNoLabel.setForeground(Color.WHITE);

		averageNoField=new JTextField(60);
		averageNoField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		averageNoField.setBounds(300,480,100,20);
		averageNoField.setBackground(new Color(205,255,250));

		budgetLabel=new JLabel("Budget range:(Rs)");
		budgetLabel.setBounds(60,520,140,20);  
		budgetLabel.setFont(new Font("Arial",Font.BOLD,14));
		budgetLabel.setForeground(Color.WHITE);

		budgetField=new JTextField(30);
		budgetField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		budgetField.setBounds(300,520,70,20);
		budgetField.setBackground(new Color(205,255,250));

		toRsLabel=new JLabel(" to ");
		toRsLabel.setBounds(380,520,60,20);
		toRsLabel.setForeground(Color.WHITE);
		toRsLabel.setFont(new Font("Arial",Font.BOLD,14));

		toRsField=new JTextField(30);
		toRsField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		toRsField.setBounds(420,520,70,20);
		toRsField.setBackground(new Color(205,255,250));

		cursor=new Cursor(Cursor.HAND_CURSOR);
		nextButton=new JButton("Next");
		nextButton.setBounds(370, 570, 170, 23);
		nextButton.setBackground(new Color(200,240,250));
		nextButton.setMnemonic('N');
		nextButton.setToolTipText("Click Here");
		nextButton.setCursor(cursor);
		nextButton.setFont(new Font("Arial",Font.BOLD,14));

		nextButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					/*if(!isDataValid()) {
						errorLabel.setText("Please fill all the fields!");
						return;
					}
					if(!isEmailValid(emailField.getText().toString())) {
						errorLabel.setText("Please enter valid email!");
						return;
					}
					if(!isPhoneValid()){
						errorLabel.setText("Please enter valid phone number!");
						return;
					}
					if(budgetField.getText().toString().isEmpty() || toRsField.getText().toString().isEmpty()){
						errorLabel.setText("Budget cannot be empty!");
						return;
					}
					if(!isBudgetValid()){
						errorLabel.setText("Please enter valid budget!");
						return;
					}
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
					Globals.details.setAvgNoOfPeople(Integer.parseInt(averageNoField.getText().toString()));
					Globals.details.setBudget(budgetField.getText().toString() + " - " +  toRsField.getText().toString());*/
					frame.dispose();
					Page3 page3 = new Page3();

				}catch (Exception e1) {
					errorLabel.setText("Please fill required fields!");
					frame.dispose();
					Page3 page3 = new Page3();
				}
			}
		});

		panel.add(labelimg);
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

		panel.setBackground(new Color(100,130,230));
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

	private boolean isBudgetValid() {
		if(Integer.valueOf(budgetField.getText().toString()) > Integer.valueOf(toRsField.getText().toString())) {
			return false;
		}	
		return true;
	}

	private boolean isPhoneValid() {
		if(phoneField.getText().toString().length() < 10) {
			return false;
		}

		return true;
	}

	private boolean isDataValid() {
		if(nameField.getText().toString().isEmpty() || typeField.getText().toString().isEmpty() || dateField.getText().toString().isEmpty()
				|| averageNoField.getText().toString().isEmpty() || addressArea.getText().toString().isEmpty()
				|| venueAddressArea.getText().toString().isEmpty()
				|| scaleComboBox.getSelectedItem().toString().equalsIgnoreCase("Select")
				|| (amComboBox.getSelectedItem().toString().equalsIgnoreCase("1 AM")
						&& pmComboBox.getSelectedItem().toString().equalsIgnoreCase("1 AM"))) {
			return false;
		}

		return true;
	}

	private void makeFrameFullSize(){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screenSize.width, screenSize.height);
	}

}