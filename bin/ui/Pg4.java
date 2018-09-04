//package Design;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

  class Pg4 implements ActionListener
  {
	 private JFrame frame;
	 private JTextField textFieldEntShows;
	 private JTextField textFieldCeleb;
     private JTextField textFieldAmount,textFieldDance,textFieldSLang ,textFieldMLang ;
     JButton btnEnd,btnQuit,btnViewSummaryOf;
     
     JPanel p1;

	  Pg4()
	  {
		  
		    frame = new JFrame("Stage four");
		 
		    makeFrameFullSize();
		    p1=(JPanel)frame.getContentPane();
		    p1.setLayout(null);
		   
		    
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JLabel lblDetailsOfEvent = new JLabel("Details of Event");
			lblDetailsOfEvent.setBounds(316, 22, 190, 14);
			lblDetailsOfEvent.setFont(new Font("Arial",Font.BOLD,18));
			frame.getContentPane().add(lblDetailsOfEvent);
			
			JLabel lblTypesOfEntertainment = new JLabel("Types of entertainment shows needed :");
			lblTypesOfEntertainment.setBounds(40, 55, 295, 20);
			lblTypesOfEntertainment.setFont(new Font("Arial",Font.BOLD,14));
			frame.getContentPane().add(lblTypesOfEntertainment);
			
			textFieldEntShows = new JTextField();
			textFieldEntShows.setBounds(350, 55, 260, 20);
			frame.getContentPane().add(textFieldEntShows);
			textFieldEntShows.setColumns(10);
			textFieldEntShows.setBackground(new Color(245,255,250));
			
			JCheckBox chckbxDance = new JCheckBox("Dance");
			chckbxDance.setBounds(51, 94, 70, 23);
			chckbxDance.setFont(new Font("Arial",Font.BOLD,14));
			frame.getContentPane().add(chckbxDance);
			chckbxDance.setBackground(new Color(215,255,230));
			
			JComboBox comboBoxDance = new JComboBox();
			comboBoxDance.setBounds(145, 94, 142, 23);
				 comboBoxDance.addItem("Classical");
				 comboBoxDance.addItem("Bollywood");
				 comboBoxDance.addItem("Folk");
				 comboBoxDance.addItem("Western");
				 comboBoxDance.addItem("None");
			frame.getContentPane().add(comboBoxDance);
			
			JLabel lblDance = new JLabel("Other specifications of Dance:");
			lblDance.setBounds(320, 94, 230, 23);
			lblDance.setFont(new Font("Arial",Font.BOLD,14));
			frame.getContentPane().add(lblDance);
			
			textFieldDance = new JTextField();
			textFieldDance.setBounds(570, 94, 225, 23);
			frame.getContentPane().add(textFieldDance);
			textFieldDance.setColumns(10);
			textFieldDance.setBackground(new Color(245,255,250));
			
			
			JCheckBox chckbxSkit = new JCheckBox("Skit");
			chckbxSkit.setBounds(51, 140, 70, 23);
			chckbxSkit.setFont(new Font("Arial",Font.BOLD,14));
			frame.getContentPane().add(chckbxSkit);
			 chckbxSkit.setBackground(new Color(215,255,230));
			 
			 JComboBox comboBoxSkit = new JComboBox();
				comboBoxSkit.setBounds(145, 140, 142, 23);
					 comboBoxSkit.addItem("Mimicry");
					 comboBoxSkit.addItem("Funny");
					 comboBoxSkit.addItem("Social Awareness");
					 comboBoxSkit.addItem("None");
				frame.getContentPane().add(comboBoxSkit);
				
				JLabel lblSkit = new JLabel("Language:");
				lblSkit.setBounds(320, 140, 80, 23);
				lblSkit.setFont(new Font("Arial",Font.BOLD,14));
				frame.getContentPane().add(lblSkit);
				
				textFieldSLang = new JTextField();
				textFieldSLang .setBounds(420, 140, 100, 23);
				frame.getContentPane().add(textFieldSLang );
				textFieldSLang .setColumns(10);
				textFieldSLang .setBackground(new Color(245,255,250));
			
			JCheckBox chckbxMusic = new JCheckBox("Music");
			chckbxMusic.setBounds(51,190, 70, 23);
			chckbxMusic.setFont(new Font("Arial",Font.BOLD,14));
			frame.getContentPane().add(chckbxMusic);
			chckbxMusic.setBackground(new Color(215,255,230));
			
			JLabel lblMusic = new JLabel("Language:");
			lblMusic.setBounds(320, 190, 100, 23);
			lblMusic.setFont(new Font("Arial",Font.BOLD,14));
			frame.getContentPane().add(lblMusic);
			
			JComboBox comboBoxMusic = new JComboBox();
			     comboBoxMusic.setBounds(145, 190, 142, 23);
				 comboBoxMusic.addItem("Orchestra");
				 comboBoxMusic.addItem("Fusion");
				 comboBoxMusic.addItem("Instrumental");
				 comboBoxMusic.addItem("None");
			frame.getContentPane().add(comboBoxMusic);
			
			textFieldMLang = new JTextField();
			textFieldMLang .setBounds(420, 190, 100, 23);
			frame.getContentPane().add(textFieldMLang );
			textFieldMLang .setColumns(10);
			textFieldMLang .setBackground(new Color(245,255,250));
			
			JLabel lblCelebrityAppointment = new JLabel("Celebrity Preferred:");
			lblCelebrityAppointment.setBounds(40, 256, 140, 14);
			lblCelebrityAppointment.setFont(new Font("Arial",Font.BOLD,14));
			frame.getContentPane().add(lblCelebrityAppointment);
			
			textFieldCeleb = new JTextField();
			textFieldCeleb.setBounds(205, 256, 185, 20);
			frame.getContentPane().add(textFieldCeleb);
			textFieldCeleb.setColumns(10);
			textFieldCeleb.setBackground(new Color(245,255,250));
			
			
			JLabel lblNamesOfAvailable = new JLabel("Names of available celebrities from our end:");
			lblNamesOfAvailable.setBounds(40, 299, 330, 20);
			lblNamesOfAvailable.setFont(new Font("Arial",Font.BOLD,14));
			frame.getContentPane().add(lblNamesOfAvailable);
			
			JComboBox comboBoxCeleb = new JComboBox();
			comboBoxCeleb.setBounds(380, 299, 142, 22);
			frame.getContentPane().add(comboBoxCeleb);
			
			JLabel lblEArrangements = new JLabel("Any extra arrangements needed:");
			 lblEArrangements.setBounds(40, 359, 240, 20);
			 lblEArrangements.setFont(new Font("Arial",Font.BOLD,14));
			frame.getContentPane().add( lblEArrangements);
			
			JTextArea textAreaEArrangement = new JTextArea();
			textAreaEArrangement.setColumns(6);
			textAreaEArrangement.setRows(4);
			textAreaEArrangement.setBounds(296, 359, 300, 53);
			frame.getContentPane().add(textAreaEArrangement);
			textAreaEArrangement.setBackground(new Color(245,255,250));
			
			
			JCheckBox chckbxVideoPresentation = new JCheckBox("Video Presentation");
			chckbxVideoPresentation.setBounds(40, 474, 190, 23);
			chckbxVideoPresentation.setFont(new Font("Arial",Font.BOLD,14));
			frame.getContentPane().add(chckbxVideoPresentation);
			chckbxVideoPresentation.setBackground(new Color(215,255,230));
			 
			JCheckBox chckbxSpecialArtistsFor = new JCheckBox("Special artists for entertainment shows");
			chckbxSpecialArtistsFor.setBounds(325, 474, 350, 23);
            chckbxSpecialArtistsFor.setFont(new Font("Arial",Font.BOLD,14));
			frame.getContentPane().add(chckbxSpecialArtistsFor);
			chckbxSpecialArtistsFor.setBackground(new Color(215,255,230));
			
			JLabel lblExtraRequirements = new JLabel("Extra requirements");
			lblExtraRequirements.setFont(new Font("Arial",Font.BOLD,14));
			lblExtraRequirements.setBounds(181, 447, 235, 14);
			frame.getContentPane().add(lblExtraRequirements);
			
			JCheckBox chckbxPhotographer = new JCheckBox("Photographer");
			chckbxPhotographer.setBounds(40, 517, 140, 23);
			chckbxPhotographer.setFont(new Font("Arial",Font.BOLD,14));
			frame.getContentPane().add(chckbxPhotographer);
			chckbxPhotographer.setBackground(new Color(215,255,230));
			  
			
			/*JLabel lblAmount = new JLabel("Amount");
			lblAmount.setBounds(755, 32, 58, 20);
			lblAmount.setFont(new Font("Arial",Font.BOLD,14));
			frame.getContentPane().add(lblAmount);
			
			  
			
			textFieldAmount = new JTextField();
			textFieldAmount.setBounds(730, 60, 108, 20);
			frame.getContentPane().add(textFieldAmount);
			textFieldAmount.setColumns(10);
			textFieldAmount.setEditable(false);
			textFieldAmount.setBackground(new Color(245,255,250));  */
			  
			
			JButton btnEnd = new JButton("FINISH");
			btnEnd.setBounds(117, 600, 89, 23);
			btnEnd.setFont(new Font("Arial",Font.BOLD,14));
			frame.getContentPane().add(btnEnd);
			btnEnd.setBackground(new Color(30,180,255));
			btnEnd.setCursor(new Cursor(Cursor.HAND_CURSOR));
			btnEnd.setMnemonic('F');
			btnEnd.addActionListener(this);
			
			JButton btnQuit = new JButton("QUIT");
			btnQuit.setBounds(269, 600, 89, 23);
			btnQuit.setFont(new Font("Arial",Font.BOLD,14));
			frame.getContentPane().add(btnQuit);
			btnQuit.setBackground(new Color(30,180,255));
			btnQuit.setCursor(new Cursor(Cursor.HAND_CURSOR));
			btnQuit.setMnemonic('Q');
			btnQuit.addActionListener(this);
			
			JButton btnViewSummaryOf = new JButton("View summary of my event");
			btnViewSummaryOf.setBounds(425, 600, 230, 23);
		    btnViewSummaryOf.setFont(new Font("Arial",Font.BOLD,14));
			frame.getContentPane().add(btnViewSummaryOf);
		    btnViewSummaryOf.setBackground(new Color(30,180,255));
			btnViewSummaryOf.setCursor(new Cursor(Cursor.HAND_CURSOR));
			btnViewSummaryOf.setMnemonic('V');
			btnViewSummaryOf.addActionListener(this);
			
			
			p1.setBackground(new Color(153,255,255));
			frame.setVisible(true);
	  }
	  
	  public void actionPerformed(ActionEvent ae)
	  {
		  if(ae.getSource()==btnEnd )
		  {
			  
		  }
		  
		  else if(ae.getSource()==btnViewSummaryOf)
		  {
			  
		  }
		  else
		  {
			  System.exit(0);
		  }
	  }
	  
	  private void makeFrameFullSize()
	  {
	      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	      frame.setSize(screenSize.width, screenSize.height);
	  }
	  
	  public static void main(String a[])
	  {
		 Pg4 obj1= new Pg4();
		
	  }
  }
