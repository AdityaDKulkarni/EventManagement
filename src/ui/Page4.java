package ui;

import javax.swing.*;
import javax.swing.border.Border;

import global.Globals;
import sql.SQLHelper;

import java.awt.*;
import java.awt.event.*;

class Page4 implements ActionListener
{
	private JFrame frame;
	private JTextField textFieldCeleb;
	private JTextField textFieldAmount,textFieldDance,textFieldSLang ,textFieldMLang ;
	private JComboBox<String> comboBoxDance, comboBoxSkit, comboBoxMusic;
	private JCheckBox chckbxDance, chckbxMusic, chckbxSkit;
	JButton btnEnd,btnQuit,btnViewSummaryOf;
	JPanel p1;
	String extras="";

	Page4()
	{

		frame = new JFrame("Event Details");

		makeFrameFullSize();
		p1=(JPanel)frame.getContentPane();
		p1.setLayout(null);


		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblDetailsOfEvent = new JLabel("Extra requirements");
		lblDetailsOfEvent.setBounds(316, 22, 190, 14);
		lblDetailsOfEvent.setFont(new Font("Arial",Font.BOLD,18));
		frame.add(lblDetailsOfEvent);

		chckbxDance = new JCheckBox("Dance");
		chckbxDance.setBounds(51, 94, 90, 23);
		chckbxDance.setFont(new Font("Arial",Font.BOLD,14));
		frame.getContentPane().add(chckbxDance);
		chckbxDance.setBackground(new Color(215,255,230));

		comboBoxDance = new JComboBox<String>();
		comboBoxDance.setBounds(160, 94, 142, 23);
		comboBoxDance.addItem("Classical");
		comboBoxDance.addItem("Bollywood");
		comboBoxDance.addItem("Folk");
		comboBoxDance.addItem("Western");
		comboBoxDance.setBackground(new Color(215,255,230));
		frame.getContentPane().add(comboBoxDance);




		chckbxSkit = new JCheckBox("Skit");
		chckbxSkit.setBounds(51, 140, 90, 23);
		chckbxSkit.setFont(new Font("Arial",Font.BOLD,14));
		frame.getContentPane().add(chckbxSkit);
		chckbxSkit.setBackground(new Color(215,255,230));

		comboBoxSkit = new JComboBox<String>();
		comboBoxSkit.setBounds(160, 140, 142, 23);
		comboBoxSkit.addItem("Mimicry");
		comboBoxSkit.addItem("Funny");
		comboBoxSkit.addItem("Social Awareness");
		comboBoxSkit.setBackground(new Color(215,255,230));
		frame.getContentPane().add(comboBoxSkit);



		chckbxMusic = new JCheckBox("Music");
		chckbxMusic.setBounds(51,190, 90, 23);
		chckbxMusic.setFont(new Font("Arial",Font.BOLD,14));
		frame.getContentPane().add(chckbxMusic);
		chckbxMusic.setBackground(new Color(215,255,230));


		comboBoxMusic = new JComboBox<String>();
		comboBoxMusic.setBounds(160, 190, 142, 23);
		comboBoxMusic.addItem("Orchestra");
		comboBoxMusic.addItem("Fusion");
		comboBoxMusic.addItem("Instrumental");
		comboBoxMusic.setBackground(new Color(215,255,230));
		frame.getContentPane().add(comboBoxMusic);


		JLabel lblCelebrityAppointment = new JLabel("Celebrity Preferred:");
		lblCelebrityAppointment.setBounds(51, 340, 190, 14);
		lblCelebrityAppointment.setFont(new Font("Arial",Font.BOLD,14));
		frame.getContentPane().add(lblCelebrityAppointment);

		textFieldCeleb = new JTextField();
		textFieldCeleb.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textFieldCeleb.setBounds(360, 340, 200, 20);
		frame.getContentPane().add(textFieldCeleb);
		textFieldCeleb.setColumns(10);
		textFieldCeleb.setBackground(new Color(245,255,250));


		JLabel lblEArrangements = new JLabel("Any extra arrangements needed:");
		lblEArrangements.setBounds(51, 390, 270, 20);
		lblEArrangements.setFont(new Font("Arial",Font.BOLD,14));
		frame.getContentPane().add( lblEArrangements);

		JTextArea textAreaEArrangement = new JTextArea();
		textAreaEArrangement.setColumns(6);
		textAreaEArrangement.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textAreaEArrangement.setRows(4);
		textAreaEArrangement.setBounds(360, 390, 300, 53);
		frame.getContentPane().add(textAreaEArrangement);
		textAreaEArrangement.setBackground(new Color(245,255,250));


		JCheckBox chckbxVideoPresentation = new JCheckBox("Video Presentation");
		chckbxVideoPresentation.setBounds(51, 240, 190, 23);
		chckbxVideoPresentation.setFont(new Font("Arial",Font.BOLD,14));
		frame.getContentPane().add(chckbxVideoPresentation);
		chckbxVideoPresentation.setBackground(new Color(215,255,230));

		JCheckBox chckbxPhotographer = new JCheckBox("Photographer");
		chckbxPhotographer.setBounds(51, 290, 140, 23);
		chckbxPhotographer.setFont(new Font("Arial",Font.BOLD,14));
		frame.getContentPane().add(chckbxPhotographer);
		chckbxPhotographer.setBackground(new Color(215,255,230));


		JButton btnEnd = new JButton("Finish");
		btnEnd.setBounds(117, 600, 89, 23);
		btnEnd.setFont(new Font("Arial",Font.BOLD,14));
		frame.getContentPane().add(btnEnd);
		btnEnd.setBackground(new Color(30,180,255));
		btnEnd.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnEnd.setMnemonic('F');
		btnEnd.addActionListener(this);

		JButton btnQuit = new JButton("Quit");
		btnQuit.setBounds(269, 600, 89, 23);
		btnQuit.setFont(new Font("Arial",Font.BOLD,14));
		frame.getContentPane().add(btnQuit);
		btnQuit.setBackground(new Color(30,180,255));
		btnQuit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnQuit.setMnemonic('Q');
		btnQuit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		JButton btnViewSummaryOf = new JButton("View summary of my event");
		btnViewSummaryOf.setBounds(425, 600, 260, 23);
		btnViewSummaryOf.setFont(new Font("Arial",Font.BOLD,14));
		frame.getContentPane().add(btnViewSummaryOf);
		btnViewSummaryOf.setBackground(new Color(30,180,255));
		btnViewSummaryOf.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnViewSummaryOf.setMnemonic('V');
		btnViewSummaryOf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if(chckbxDance.isSelected()) {
						extras += chckbxDance.getLabel() + "(" + comboBoxDance.getSelectedItem().toString() + "),";
					}
					if(chckbxSkit.isSelected()) {
						extras += chckbxSkit.getLabel() + "(" + comboBoxSkit.getSelectedItem().toString() + "),";
					}
					if(chckbxMusic.isSelected()) {
						extras += chckbxMusic.getLabel() + "(" + comboBoxMusic.getSelectedItem().toString() + "),";
					}
					if(chckbxVideoPresentation.isSelected()) {
						extras += chckbxVideoPresentation.getLabel() + ",";
					}
					if(chckbxPhotographer.isSelected()) {
						extras += chckbxPhotographer.getLabel() +  ",";
					}

					Globals.details.setCelebrity(textFieldCeleb.getText().toString());
					Globals.details.setArrangements(textAreaEArrangement.getText().toString());

					System.out.println(extras);

					boolean resultFlag = SQLHelper.insertEvent(Globals.details.getDate(), Globals.details.getVenue(), Globals.details.getScale(),
							Globals.details.getAvgNoOfPeople(), Globals.details.getEventId(), Globals.details.getPurpose(),
							Globals.details.getAgeGroup(), Globals.details.getStartTime(), Globals.details.getEndTime(), 
							Globals.details.getPhone(), Globals.details.getBudget());

					if(resultFlag) {
						SQLHelper.insertCustomer(Globals.details.getName(), Globals.details.getEmail(),
								Globals.details.getEventId(), Globals.details.getPhone());

						SQLHelper.insertFood(Globals.details.getEventId(), Globals.details.getAvgNoOfPeople(),
								Globals.details.getPlateBudget(), Globals.details.getFoodPreference(), Globals.details.getMenu());

						SQLHelper.insertEntertainment(Globals.details.getEventId(), extras,
								Globals.details.getCelebrity(), Globals.details.getArrangements());
					}
				}catch(Exception e1) {
					e1.printStackTrace();
				}

			}
		});


		p1.setBackground(new Color(153,255,255));
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==btnEnd ){

		}
	}

	private void makeFrameFullSize(){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screenSize.width, screenSize.height);
	}

}