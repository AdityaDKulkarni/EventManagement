package ui;

import javax.swing.*;
import assets.*;
import sql.SQLHelper;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Page1 {
	
	JFrame frame; 
	JPanel panel;  
	JLabel labelImg1,labelImg2,labelImg3,labelImg4,labelImg5,labelImg6,labelImg7,labelImg8,lblGallery,lblBday,lblDance,lblWedding;
    JButton btnManage;
	
	Page1(){
	    frame=new JFrame("Stage One");
		makeFrameFullSize();
		panel=(JPanel)frame.getContentPane();
		panel.setLayout(null);
		
		JLabel lblGallery=new JLabel("Our Work Gallery");
		lblGallery.setBounds(500,15,150,15);
		lblGallery.setFont(new Font("Arial",Font.BOLD,14));
		
		JLabel labelImg2=new JLabel("");
		Image img2=new ImageIcon(this.getClass().getResource("/assets/img2.jpg")).getImage();
		labelImg2.setIcon(new ImageIcon(img2));
		labelImg2.setBounds(100,50,226,150);
		
		JLabel labelImg3=new JLabel("");
		Image img3=new ImageIcon(this.getClass().getResource("/assets/img4.jpg")).getImage();
		labelImg3.setIcon(new ImageIcon(img3));
		labelImg3.setBounds(370,50,226,150);
		
		JLabel labelImg4=new JLabel("");
		Image img4=new ImageIcon(this.getClass().getResource("/assets/img5.jpg")).getImage();
		labelImg4.setIcon(new ImageIcon(img4));
		labelImg4.setBounds(650,50,220,150);
		
		JLabel labelImg5=new JLabel("");
		Image img5=new ImageIcon(this.getClass().getResource("/assets/img7.jpg")).getImage();
		labelImg5.setIcon(new ImageIcon(img5));
		labelImg5.setBounds(925,50,225,150);
		
		JLabel labelImg6=new JLabel("");
		Image img6=new ImageIcon(this.getClass().getResource("/assets/img8.jpg")).getImage();
		labelImg6.setIcon(new ImageIcon(img6));
		labelImg6.setBounds(50,250,300,225);
		
		JLabel lblBday=new JLabel("Weddings");
		lblBday.setBounds(50,500,150,15);
		lblBday.setFont(new Font("Arial",Font.BOLD,14));
			
		JLabel labelImg7=new JLabel("");
		Image img7=new ImageIcon(this.getClass().getResource("/assets/img3.jpg")).getImage();
		labelImg7.setIcon(new ImageIcon(img7));
		labelImg7.setBounds(850,250,300,225);	
		
		JLabel lblWedding=new JLabel("Birthday Celebration");
		lblWedding.setBounds(850,500,200,15);
		lblWedding.setFont(new Font("Arial",Font.BOLD,14));
		
		
		JLabel labelImg8=new JLabel("");
		Image img8=new ImageIcon(this.getClass().getResource("/assets/img6.jpg")).getImage();
		labelImg8.setIcon(new ImageIcon(img8));
		labelImg8.setBounds(450,250,300,225);	
		
		JLabel lblDance=new JLabel("Classical Events");
		lblDance.setBounds(450,500,150,15);
		lblDance.setFont(new Font("Arial",Font.BOLD,14));
		
		JButton btnManage = new JButton("Manage my Event");
		btnManage.setBounds(500, 600, 200, 23);
		btnManage.setFont(new Font("Arial",Font.BOLD,14));
		
		btnManage.setBackground(new Color(30,180,255));
		btnManage.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnManage.setMnemonic('M');
		btnManage.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Page2 pg2 = new Page2();
				frame.dispose();
				SQLHelper.connect();
			}
		});
		panel.setBackground(new Color(153,255,255));
		
		panel.add(lblGallery);
		panel.add(labelImg2);
		panel.add(labelImg3);
		panel.add(labelImg4);
		panel.add(labelImg5);
		panel.add(labelImg6);
		panel.add(labelImg7);
		panel.add(labelImg8);
		panel.add(lblBday);
		panel.add(lblDance);
		panel.add(lblWedding);
		panel.add(btnManage);
		
		frame.setVisible(true);
		
	}
	
	private void makeFrameFullSize(){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screenSize.width, screenSize.height);
	}

	public static void main(String a[]){
		 new Page1();
	}
	
	
}
