package ui;

import javax.swing.*;
//import global.Globals;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Pg2 extends JFrame{

	JFrame frame; 
	JTextField nameField,phoneField,emailField,typeField,dateField,averageNoField,budgetField,toRsField;
	JButton nextButton;
	JTextArea addressArea,venueAddressArea;  
	JLabel nameLabel,addressLabel,phoneLabel,emailLabel,typeLabel,dateLabel,timingLabel,amToLabel,pmLabel,
	venueLabel,scaleLabel,averageNoLabel,budgetLabel,toRsLabel, errorLabel;
	JPanel panel;  
	JComboBox<Integer> amComboBox,pmComboBox;
	JComboBox<String> scaleComboBox;
	Cursor cursor;
	int eventId;

	public Pg2(){

		frame=new JFrame("Stage One");
		makeFrameFullSize();
		panel=(JPanel)frame.getContentPane();
		panel.setLayout(null);

		nameLabel=new JLabel("Name");
		nameLabel.setBounds(60,30,100,20);
		nameLabel.setFont(new Font("Arial",Font.BOLD,14));

		nameField=new JTextField(30);
		nameField.setBounds(180,30,230,20);
		nameField.setBackground(new Color(245,255,250));

		addressLabel=new JLabel("Address");
		addressLabel.setBounds(60,70,100,50);
		addressLabel.setFont(new Font("Arial",Font.BOLD,14));

		addressArea=new JTextArea("  Enter your address",3,7);
		addressArea.setBounds(180,70,250,75);
		addressArea.setBackground(new Color(245,255,250));

		phoneLabel=new JLabel("Phone No.");
		phoneLabel.setBounds(510,30,100,20);
		phoneLabel.setFont(new Font("Arial",Font.BOLD,14));

		phoneField=new JTextField(30);
		phoneField.setBounds(600,30,150,20);
		phoneField.setBackground(new Color(245,255,250));

		emailLabel=new JLabel("Email");
		emailLabel.setBounds(510,70,70,20); 
		emailLabel.setFont(new Font("Arial",Font.BOLD,14));

		emailField=new JTextField(40);
		emailField.setBounds(600,70,200,20);
		emailField.setBackground(new Color(245,255,250));

		typeLabel=new JLabel("Type of Event");
		typeLabel.setBounds(60,170,150,20); 
		typeLabel.setFont(new Font("Arial",Font.BOLD,14));

		typeField=new JTextField(100);
		typeField.setBounds(180,170,200,20);
		typeField.setBackground(new Color(245,255,250));

		dateLabel=new JLabel("Date");
		dateLabel.setBounds(60,210,150,20);
		dateLabel.setFont(new Font("Arial",Font.BOLD,14));

		dateField=new JTextField(60);
		dateField.setBounds(180,210,100,20);
		dateField.setBackground(new Color(245,255,250));

		timingLabel=new JLabel("Event Timings");
		timingLabel.setBounds(60,250,150,20);
		timingLabel.setFont(new Font("Arial",Font.BOLD,14));
		
		errorLabel = new JLabel();
		errorLabel.setBackground(Color.WHITE);
		errorLabel.setSize(new Dimension(300,100));
		errorLabel.setLocation(600, 300);
		

		amComboBox=new JComboBox<Integer>();
		amComboBox.addItem(1);
		amComboBox.addItem(2);
		amComboBox.addItem(3);
		amComboBox.addItem(4);
		amComboBox.addItem(5);
		amComboBox.addItem(6);
		amComboBox.addItem(7);
		amComboBox.addItem(8);
		amComboBox.addItem(9);
		amComboBox.addItem(10);
		amComboBox.addItem(11);
		amComboBox.addItem(12);
		amComboBox.setBounds(180,250,50,20);
		amComboBox.setBackground(new Color(245,255,250));

		amToLabel=new JLabel("AM    to");
		amToLabel.setBounds(240,250,60,20);
		amToLabel.setFont(new Font("Arial",Font.BOLD,14));

		pmComboBox=new JComboBox<Integer>();
		pmComboBox.addItem(1);
		pmComboBox.addItem(2);
		pmComboBox.addItem(3);
		pmComboBox.addItem(4);
		pmComboBox.addItem(5);
		pmComboBox.addItem(6);
		pmComboBox.addItem(7);
		pmComboBox.addItem(8);
		pmComboBox.addItem(9);
		pmComboBox.addItem(10);
		pmComboBox.addItem(11);
		pmComboBox.addItem(12);
		pmComboBox.setBounds(310,250,50,20);
		pmComboBox.setBackground(new Color(245,255,250));

		pmLabel=new JLabel("PM");
		pmLabel.setBounds(370,250,30,20); 
		pmLabel.setFont(new Font("Arial",Font.BOLD,14));

		venueLabel=new JLabel("Venue");
		venueLabel.setBounds(60,290,70,20); 
		venueLabel.setFont(new Font("Arial",Font.BOLD,14));

		venueAddressArea=new JTextArea("  Enter the Venue address",3,7);
		venueAddressArea.setBounds(180,290,300,75);
		venueAddressArea.setBackground(new Color(245,255,250));

		scaleLabel=new JLabel("Scale of Event");
		scaleLabel.setBounds(60,390,150,20); 
		scaleLabel.setFont(new Font("Arial",Font.BOLD,14));

		scaleComboBox=new JComboBox<String>();
		scaleComboBox.addItem("Select");
		scaleComboBox.addItem("Small Scale");
		scaleComboBox.addItem("Medium Scale");
		scaleComboBox.addItem("Large Scale");
		scaleComboBox.setBounds(180,390,100,20);
		scaleComboBox.setBackground(new Color(245,255,250));

		averageNoLabel=new JLabel("Average number of people");
		averageNoLabel.setBounds(60,430,200,20); 
		averageNoLabel.setFont(new Font("Arial",Font.BOLD,14));

		averageNoField=new JTextField(60);
		averageNoField.setBounds(250,430,100,20);
		averageNoField.setBackground(new Color(245,255,250));

		budgetLabel=new JLabel("Budget range:     Rs");
		budgetLabel.setBounds(60,470,140,20);  
		budgetLabel.setFont(new Font("Arial",Font.BOLD,14));

		budgetField=new JTextField(30);
		budgetField.setBounds(210,470,70,20);
		budgetField.setBackground(new Color(245,255,250));

		toRsLabel=new JLabel(" to    Rs");
		toRsLabel.setBounds(300,470,60,20);
		toRsLabel.setFont(new Font("Arial",Font.BOLD,14));

		toRsField=new JTextField(30);
		toRsField.setBounds(380,470,70,20);
		toRsField.setBackground(new Color(245,255,250));

		cursor=new Cursor(Cursor.HAND_CURSOR);

		nextButton=new JButton("Next");
		nextButton.setBounds(370, 550, 100, 30);
		nextButton.setBackground(new Color(30,180,255));
		nextButton.setMnemonic('N');
		nextButton.setToolTipText("Click Here");
		nextButton.setCursor(cursor);
		nextButton.setFont(new Font("Arial",Font.BOLD,14));

		nextButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				/*try {
					eventId = ThreadLocalRandom.current().nextInt(100, 999 + 1);
					Globals.details.setEventId(eventId);
					Globals.details.setName(nameField.getText().toString());
					Globals.details.setPhone(phoneField.getText().toString());
					Globals.details.setEmail(emailField.getText().toString());
					Globals.details.setTypeOfEvent(typeField.getText().toString());
					Globals.details.setScale(scaleComboBox.getSelectedItem().toString());
					Globals.details.setDate(dateField.getText().toString());
					Globals.details.setBudget(budgetField.getText().toString() + toRsField.getText().toString());
					Globals.details.setAvgNoOfPeople(Integer.parseInt(averageNoField.getText()));
					Globals.details.setVenue(venueAddressArea.getText().toString());

					Pg4 pg4 = new Pg4();
				}catch (NumberFormatException e1) {
					errorLabel.setText("Please fill required fields!");
				} */
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
		panel.add(amToLabel);
		panel.add(pmLabel);
		panel.add(amComboBox);
		panel.add(pmComboBox);
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
		frame.setVisible(true);
	}

	private void makeFrameFullSize(){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screenSize.width, screenSize.height);
	}

	public static void main(String a[]){
		 new Pg2();
	}
}
