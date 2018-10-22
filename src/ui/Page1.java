package ui;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import global.Globals;
import sql.SQLHelper;


public class Page1 extends JFrame{
	 
	JPanel panel;  
	JLabel labelImg1,labelImg2,labelImg3,labelImg4,labelImg5,labelImg6,labelImg7,labelImg8,lblBday,lblDance,lblWedding;
    JButton btnManage, btnView;
	
    public Page1(){
		makeFrameFullSize();
		panel=(JPanel)getContentPane();
		panel.setLayout(null);
		
		JLabel labellogo=new JLabel("");
		Image Logo=new ImageIcon(this.getClass().getResource("/assets/Logo.jpg")).getImage();
		labellogo.setIcon(new ImageIcon(Logo));
		labellogo.setBounds(470,10,340,140);
		
		JLabel labelImg2=new JLabel("");
		Image img2=new ImageIcon(this.getClass().getResource("/assets/img2.jpg")).getImage();
		labelImg2.setIcon(new ImageIcon(img2));
		labelImg2.setBounds(100,160,226,150);
		
		JLabel labelImg3=new JLabel("");
		Image img3=new ImageIcon(this.getClass().getResource("/assets/img4.jpg")).getImage();
		labelImg3.setIcon(new ImageIcon(img3));
		labelImg3.setBounds(370,160,226,150);
		
		JLabel labelImg4=new JLabel("");
		Image img4=new ImageIcon(this.getClass().getResource("/assets/img5.jpg")).getImage();
		labelImg4.setIcon(new ImageIcon(img4));
		labelImg4.setBounds(650,160,220,150);
		
		JLabel labelImg5=new JLabel("");
		Image img5=new ImageIcon(this.getClass().getResource("/assets/img7.jpg")).getImage();
		labelImg5.setIcon(new ImageIcon(img5));
		labelImg5.setBounds(925,160,225,150);
		
		JLabel labelImg6=new JLabel("");
		Image img6=new ImageIcon(this.getClass().getResource("/assets/img8.jpg")).getImage();
		labelImg6.setIcon(new ImageIcon(img6));
		labelImg6.setBounds(50,350,300,225);
		
		JLabel lblBday=new JLabel("Weddings");
		lblBday.setBounds(50,580,150,15);
		lblBday.setFont(new Font("Arial",Font.BOLD,14));
		lblBday.setForeground(Color.WHITE);
			
		JLabel labelImg7=new JLabel("");
		Image img7=new ImageIcon(this.getClass().getResource("/assets/img3.jpg")).getImage();
		labelImg7.setIcon(new ImageIcon(img7));
		labelImg7.setBounds(850,350,300,225);	
		
		JLabel lblWedding=new JLabel("Birthday Celebration");
		lblWedding.setBounds(850,580,200,15);
		lblWedding.setFont(new Font("Arial",Font.BOLD,14));
		lblWedding.setForeground(Color.WHITE);
		
		
		JLabel labelImg8=new JLabel("");
		Image img8=new ImageIcon(this.getClass().getResource("/assets/img6.jpg")).getImage();
		labelImg8.setIcon(new ImageIcon(img8));
		labelImg8.setBounds(450,350,300,225);	
		
		JLabel lblDance=new JLabel("Classical Events");
		lblDance.setBounds(450,580,150,15);
		lblDance.setFont(new Font("Arial",Font.BOLD,14));
		lblDance.setForeground(Color.WHITE);
		
		btnManage = new JButton("Manage my Event");
		btnManage.setBounds(300, 630, 200, 23);
		btnManage.setFont(new Font("Arial",Font.BOLD,14));
		btnManage.setBackground(new Color(200,240,250));
		btnManage.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnManage.setMnemonic('M');
		
		btnView = new JButton("View Records");
		btnView.setBounds(700, 630, 170, 23);
		btnView.setFont(new Font("Arial",Font.BOLD,14));
		btnView.setBackground(new Color(200,240,250));
		btnView.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnView.setMnemonic('V');
		
		btnManage.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Page2 pg2 = new Page2();
				dispose();
			}
		});
		
		btnView.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AllRecords allRecords = new AllRecords();
				Globals.page1.dispose();
			}
		});
				
		panel.add(labellogo);
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
		panel.add(btnView);
		
		SQLHelper.connect();
		
		panel.setBackground(new Color(100,130,230));
		setVisible(true);
		
	}
	
	private void makeFrameFullSize(){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screenSize.width, screenSize.height);
	}

	public static void main(String a[]){
		 Globals.page1 = new Page1();
	}
}