package ui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import global.Globals;
import sql.SQLHelper;

class Page4 extends JFrame implements ActionListener{
	private JTextField textFieldCeleb;
	private JComboBox<String> comboBoxDance, comboBoxSkit, comboBoxMusic;
	private JCheckBox chckbxDance, chckbxMusic, chckbxSkit;
	JButton btnEnd,btnQuit,btnViewSummaryOf;
	JPanel p1;
	String extras="";

	Page4(){

		makeFrameFullSize();
		p1=(JPanel)getContentPane();
		p1.setLayout(null);


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1.setLayout(null);

		JLabel labelimg=new JLabel("");
		Image pic=new ImageIcon(this.getClass().getResource("/assets/p11.jpg")).getImage();
		labelimg.setIcon(new ImageIcon(pic));
		labelimg.setBounds(760,20,480,640);
		p1.add(labelimg);
		
		JLabel lblDetailsOfEvent = new JLabel("Extra requirements");
		lblDetailsOfEvent.setBounds(316, 22, 230, 14);
		lblDetailsOfEvent.setFont(new Font("Arial",Font.BOLD,18));
		lblDetailsOfEvent.setForeground(Color.WHITE);
		add(lblDetailsOfEvent);

		chckbxDance = new JCheckBox("Dance");
		chckbxDance.setBounds(51, 94, 90, 23);
		chckbxDance.setFont(new Font("Arial",Font.BOLD,14));
		chckbxDance.setForeground(Color.WHITE);
		chckbxDance.setBackground(new Color(100,130,230));
		p1.add(chckbxDance);

		comboBoxDance = new JComboBox<String>();
		comboBoxDance.setBounds(160, 94, 142, 23);
		comboBoxDance.addItem("Classical");
		comboBoxDance.addItem("Bollywood");
		comboBoxDance.addItem("Folk");
		comboBoxDance.addItem("Western");
		p1.add(comboBoxDance);




		chckbxSkit = new JCheckBox("Skit");
		chckbxSkit.setBounds(51, 140, 90, 23);
		chckbxSkit.setFont(new Font("Arial",Font.BOLD,14));
		chckbxSkit.setForeground(Color.WHITE);
		chckbxSkit.setBackground(new Color(100,130,230));
		p1.add(chckbxSkit);

		comboBoxSkit = new JComboBox<String>();
		comboBoxSkit.setBounds(160, 140, 142, 23);
		comboBoxSkit.addItem("Mimicry");
		comboBoxSkit.addItem("Funny");
		comboBoxSkit.addItem("Social Awareness");
		p1.add(comboBoxSkit);



		chckbxMusic = new JCheckBox("Music");
		chckbxMusic.setBounds(51,190, 90, 23);
		chckbxMusic.setFont(new Font("Arial",Font.BOLD,14));
		chckbxMusic.setForeground(Color.WHITE);
		chckbxMusic.setBackground(new Color(100,130,230));
		p1.add(chckbxMusic);


		comboBoxMusic = new JComboBox<String>();
		comboBoxMusic.setBounds(160, 190, 142, 23);
		comboBoxMusic.addItem("Fusion");
		comboBoxMusic.addItem("Orchestra");
		comboBoxMusic.addItem("Instrumental");
		comboBoxMusic.setBackground(new Color(215,255,230));
		p1.add(comboBoxMusic);


		JLabel lblCelebrityAppointment = new JLabel("Celebrity Preferred:");
		lblCelebrityAppointment.setBounds(51, 340, 190, 14);
		lblCelebrityAppointment.setFont(new Font("Arial",Font.BOLD,14));
		lblCelebrityAppointment.setForeground(Color.WHITE);
		p1.add(lblCelebrityAppointment);

		textFieldCeleb = new JTextField();
		textFieldCeleb.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textFieldCeleb.setBounds(360, 340, 200, 20);
		p1.add(textFieldCeleb);
		textFieldCeleb.setColumns(10);
		textFieldCeleb.setBackground(new Color(205,255,250));


		JLabel lblEArrangements = new JLabel("Any extra arrangements needed:");
		lblEArrangements.setBounds(51, 390, 270, 20);
		lblEArrangements.setFont(new Font("Arial",Font.BOLD,14));
		lblEArrangements.setForeground(Color.WHITE);
		p1.add( lblEArrangements);

		JTextArea textAreaEArrangement = new JTextArea();
		textAreaEArrangement.setColumns(6);
		textAreaEArrangement.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textAreaEArrangement.setRows(4);
		textAreaEArrangement.setBounds(360, 390, 300, 53);
		p1.add(textAreaEArrangement);
		textAreaEArrangement.setBackground(new Color(205,255,250));


		JCheckBox chckbxVideoPresentation = new JCheckBox("Video Presentation");
		chckbxVideoPresentation.setBounds(51, 240, 190, 23);
		chckbxVideoPresentation.setFont(new Font("Arial",Font.BOLD,14));
		chckbxVideoPresentation.setForeground(Color.WHITE);
		chckbxVideoPresentation.setBackground(new Color(100,130,230));
		p1.add(chckbxVideoPresentation);

		JCheckBox chckbxPhotographer = new JCheckBox("Photographer");
		chckbxPhotographer.setBounds(51, 290, 140, 23);
		chckbxPhotographer.setFont(new Font("Arial",Font.BOLD,14));
		chckbxPhotographer.setForeground(Color.WHITE);
		chckbxPhotographer.setBackground(new Color(100,130,230));
		p1.add(chckbxPhotographer);


		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(117, 600, 100, 23);
		btnSubmit.setFont(new Font("Arial",Font.BOLD,14));
		p1.add(btnSubmit);
		btnSubmit.setBackground(new Color(200,240,250));
		btnSubmit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnSubmit.setMnemonic('F');
		btnSubmit.addActionListener(this);

		JButton btnQuit = new JButton("Quit");
		btnQuit.setBounds(269, 600, 89, 23);
		btnQuit.setFont(new Font("Arial",Font.BOLD,14));
		p1.add(btnQuit);
		btnQuit.setBackground(new Color(200,240,250));
		btnQuit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnQuit.setMnemonic('Q');
		btnQuit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		JButton btnViewSummaryOf = new JButton("View summary of my event");
		btnViewSummaryOf.setBounds(425, 600, 260, 23);
		btnViewSummaryOf.setFont(new Font("Arial",Font.BOLD,14));
		p1.add(btnViewSummaryOf);
		btnViewSummaryOf.setBackground(new Color(200,240,250));
		btnViewSummaryOf.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnViewSummaryOf.setMnemonic('V');

		btnSubmit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if(chckbxDance.isSelected()) {
						extras += chckbxDance.getLabel() + "(" + comboBoxDance.getSelectedItem().toString() + "),";
					}
					if(chckbxSkit.isSelected())	 {
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
						
						JOptionPane.showMessageDialog(Page4.this, "Event created successfuly.");
					}else {
						JOptionPane.showMessageDialog(Page4.this, "Something went wrong!");
					}
				}catch(Exception e1) {
					e1.printStackTrace();
				}

			}
		});

		btnViewSummaryOf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				writePDF();
			}
		});
		
		btnQuit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});


		p1.setBackground(new Color(100,130,230));
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==btnEnd ){

		}
	}

	private void makeFrameFullSize(){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screenSize.width, screenSize.height);
	}

	private void writePDF() {
		try {
			Document document = new Document(PageSize.A4, 50, 50, 50, 50);
			PdfWriter.getInstance(document, new FileOutputStream("/home/aditya/Desktop/Records.pdf"));
			document.open();
			Paragraph title1 = new Paragraph("");
			Chapter chapter1 = new Chapter(title1, 1);
			chapter1.setNumberDepth(0);

			Paragraph title11 = new Paragraph("");
			Section section1 = chapter1.addSection(title11);
			
			Paragraph someSectionText = new Paragraph("");
			section1.add(someSectionText);
			someSectionText = new Paragraph("");
			section1.add(someSectionText);

			PdfPTable pdfTable = new PdfPTable(2);
			
			pdfTable.setSpacingBefore(25);
			pdfTable.setSpacingAfter(25);
			
			pdfTable.addCell("Name");			
			pdfTable.addCell(Globals.details.getName());
			
			pdfTable.addCell("Contact");
			pdfTable.addCell(Globals.details.getPhone());
			
			pdfTable.addCell("Venue");
			pdfTable.addCell(Globals.details.getVenue());
			
			pdfTable.addCell("Date");
			pdfTable.addCell(Globals.details.getDate());
			
			pdfTable.addCell("Time");
			pdfTable.addCell(Globals.details.getStartTime() + " to " + Globals.details.getEndTime());

			pdfTable.addCell("Purpose");
			pdfTable.addCell(Globals.details.getPurpose());
			
			pdfTable.addCell("No of people");
			pdfTable.addCell(String.valueOf(Globals.details.getAvgNoOfPeople()));
			
			pdfTable.addCell("Age group");
			pdfTable.addCell(String.valueOf(Globals.details.getAgeGroup()));
			
			pdfTable.addCell("Food preference");
			pdfTable.addCell(Globals.details.getFoodPreference());
			
			pdfTable.addCell("Menu");
			pdfTable.addCell(Globals.details.getFoodPreference());
			
			pdfTable.addCell("Celebrity");
			pdfTable.addCell(Globals.details.getCelebrity());
			
			pdfTable.addCell("Arrangements");
			pdfTable.addCell(Globals.details.getArrangements());

			section1.add(pdfTable);
			document.add(chapter1);
			document.close();
			JOptionPane.showMessageDialog(Page4.this, "The PDF document has beed exported to desktop.");
		}catch(Exception e1) {
			e1.printStackTrace();
			JOptionPane.showMessageDialog(Page4.this, "There was a problem exporting the PDF.");
		}
	}

}