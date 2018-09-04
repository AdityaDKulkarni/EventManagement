package ui;

import javax.swing.*;

import global.Globals;

import java.awt.*;
import java.awt.event.*;

  class Pg4 implements ActionListener{
	 private JFrame frame;
	 private JTextField textFieldEntShows;
	 private JTextField textFieldCeleb;
     private JTextField textFieldAmount;
     JButton btnEnd,btnQuit,btnViewSummaryOf;
     
     JPanel p1;

	  Pg4(){
		  
		    frame = new JFrame("Stage four");
		 
		    makeFrameFullSize();
		    p1=(JPanel)frame.getContentPane();
		    p1.setLayout(null);
		    p1.setFont(new Font("Arial",Font.ITALIC,18));
		    
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
			chckbxDance.setBounds(51, 94, 99, 23);
			chckbxDance.setFont(new Font("Arial",Font.BOLD,14));
			frame.getContentPane().add(chckbxDance);
			chckbxDance.setBackground(new Color(215,255,230));
			
			JCheckBox chckbxSkit = new JCheckBox("Skit");
			chckbxSkit.setBounds(235, 94, 99, 23);
			chckbxSkit.setFont(new Font("Arial",Font.BOLD,14));
			frame.getContentPane().add(chckbxSkit);
			 chckbxSkit.setBackground(new Color(215,255,230));
			
			JCheckBox chckbxMusic = new JCheckBox("Music");
			chckbxMusic.setBounds(425, 94, 99, 23);
			chckbxMusic.setFont(new Font("Arial",Font.BOLD,14));
			frame.getContentPane().add(chckbxMusic);
			chckbxMusic.setBackground(new Color(215,255,230));
			
			JLabel lblCelebrityAppointment = new JLabel("Celebrity Preferred:");
			lblCelebrityAppointment.setBounds(40, 156, 140, 14);
			lblCelebrityAppointment.setFont(new Font("Arial",Font.BOLD,14));
			frame.getContentPane().add(lblCelebrityAppointment);
			
			textFieldCeleb = new JTextField();
			textFieldCeleb.setBounds(205, 156, 185, 20);
			frame.getContentPane().add(textFieldCeleb);
			textFieldCeleb.setColumns(10);
			textFieldCeleb.setBackground(new Color(245,255,250));
			
			
			JLabel lblNamesOfAvailable = new JLabel("Names of available celebrities from our end:");
			lblNamesOfAvailable.setBounds(40, 199, 330, 20);
			lblNamesOfAvailable.setFont(new Font("Arial",Font.BOLD,14));
			frame.getContentPane().add(lblNamesOfAvailable);
			
			JComboBox comboBoxCeleb = new JComboBox();
			comboBoxCeleb.setBounds(380, 199, 142, 22);
			frame.getContentPane().add(comboBoxCeleb);
			
			JLabel lblEArrangements = new JLabel("Any extra arrangements needed:");
			 lblEArrangements.setBounds(40, 259, 240, 20);
			 lblEArrangements.setFont(new Font("Arial",Font.BOLD,14));
			frame.getContentPane().add( lblEArrangements);
			
			JTextArea textAreaEArrangement = new JTextArea();
			textAreaEArrangement.setColumns(6);
			textAreaEArrangement.setRows(4);
			textAreaEArrangement.setBounds(296, 259, 300, 53);
			frame.getContentPane().add(textAreaEArrangement);
			textAreaEArrangement.setBackground(new Color(245,255,250));
			
			
			JCheckBox chckbxVideoPresentation = new JCheckBox("Video Presentation");
			chckbxVideoPresentation.setBounds(40, 374, 190, 23);
			chckbxVideoPresentation.setFont(new Font("Arial",Font.BOLD,14));
			frame.getContentPane().add(chckbxVideoPresentation);
			chckbxVideoPresentation.setBackground(new Color(215,255,230));
			 
			JCheckBox chckbxSpecialArtistsFor = new JCheckBox("Special artists for entertainment shows");
			chckbxSpecialArtistsFor.setBounds(325, 374, 350, 23);
            chckbxSpecialArtistsFor.setFont(new Font("Arial",Font.BOLD,14));
			frame.getContentPane().add(chckbxSpecialArtistsFor);
			chckbxSpecialArtistsFor.setBackground(new Color(215,255,230));
			
			JLabel lblExtraRequirements = new JLabel("Extra requirements");
			lblExtraRequirements.setFont(new Font("Arial",Font.BOLD,14));
			lblExtraRequirements.setBounds(181, 347, 235, 14);
			frame.getContentPane().add(lblExtraRequirements);
			
			JCheckBox chckbxPhotographer = new JCheckBox("Photographer");
			chckbxPhotographer.setBounds(40, 417, 140, 23);
			chckbxPhotographer.setFont(new Font("Arial",Font.BOLD,14));
			frame.getContentPane().add(chckbxPhotographer);
			chckbxPhotographer.setBackground(new Color(215,255,230));
			  
			
			JLabel lblAmount = new JLabel("Amount");
			lblAmount.setBounds(755, 32, 58, 20);
			lblAmount.setFont(new Font("Arial",Font.BOLD,14));
			frame.getContentPane().add(lblAmount);
			
			  
			
			textFieldAmount = new JTextField();
			textFieldAmount.setBounds(730, 60, 108, 20);
			frame.getContentPane().add(textFieldAmount);
			textFieldAmount.setColumns(10);
			textFieldAmount.setEditable(false);
			textFieldAmount.setBackground(new Color(245,255,250));
			  
			
			JButton btnEnd = new JButton("FINISH");
			btnEnd.setBounds(117, 500, 89, 23);
			btnEnd.setFont(new Font("Arial",Font.BOLD,14));
			frame.getContentPane().add(btnEnd);
			btnEnd.setBackground(new Color(30,180,255));
			btnEnd.setCursor(new Cursor(Cursor.HAND_CURSOR));
			btnEnd.setMnemonic('F');
			btnEnd.addActionListener(this);
			
			JButton btnQuit = new JButton("QUIT");
			btnQuit.setBounds(269, 500, 89, 23);
			btnQuit.setFont(new Font("Arial",Font.BOLD,14));
			frame.getContentPane().add(btnQuit);
			btnQuit.setBackground(new Color(30,180,255));
			btnQuit.setCursor(new Cursor(Cursor.HAND_CURSOR));
			btnQuit.setMnemonic('Q');
			btnQuit.addActionListener(this);
			
			JButton btnViewSummaryOf = new JButton("View summary of my event");
			btnViewSummaryOf.setBounds(425, 500, 230, 23);
		    btnViewSummaryOf.setFont(new Font("Arial",Font.BOLD,14));
			frame.getContentPane().add(btnViewSummaryOf);
		    btnViewSummaryOf.setBackground(new Color(30,180,255));
			btnViewSummaryOf.setCursor(new Cursor(Cursor.HAND_CURSOR));
			btnViewSummaryOf.setMnemonic('V');
			btnViewSummaryOf.addActionListener(this);
			
			p1.setBackground(new Color(153,255,255));
			frame.setVisible(true);
	  }
	  
	  public void actionPerformed(ActionEvent ae){
		  if(ae.getSource()==btnEnd ){
			  
		  }else if(ae.getSource()==btnViewSummaryOf){
			  System.out.println(Globals.details.getEventId());
			  System.out.println(Globals.details.getName());
			  System.out.println(Globals.details.getPhone());
			  System.out.println(Globals.details.getEmail());
			  System.out.println(Globals.details.getTypeOfEvent());
			  System.out.println(Globals.details.getScale());
			  System.out.println(Globals.details.getDate());
			  System.out.println(Globals.details.getBudget());
			  System.out.println(Globals.details.getAvgNoOfPeople());
			  System.out.println(Globals.details.getVenue());
		  }
	  }
	  
	  private void makeFrameFullSize(){
	      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	      frame.setSize(screenSize.width, screenSize.height);
	  }
	  
	  public static void main(String a[]){
		 Pg4 obj1= new Pg4();
		
	  }
  }