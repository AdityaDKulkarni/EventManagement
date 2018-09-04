package ui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class page3 extends JFrame {

	JFrame frame;
	JPanel panel;  
	JLabel lblCause,lblAvgAge,lblBudget,lblFoodPrefer,lblMenu,lblExtraItem,lblDetail,lblApproxCost;
	JTextField TextFieldCause,TextFieldAge,TextFieldBudget,TextFieldApprox;
	JTextArea TextAreaMenu;
	JComboBox<String> ComboFood;
	JCheckBox ChkSweets,ChkDrinks,ChkCake;
	JButton btnNext;
	
	public page3()
	{
		frame=new JFrame("Stage Two");
		makeFrameFullSize();
		panel=(JPanel)frame.getContentPane();
		panel.setLayout(null);
		
		lblDetail=new JLabel("Enter the details");
		lblDetail.setBounds(190,20,160,20);
		lblDetail.setFont(new Font("Arial",Font.BOLD,14));
		
		lblCause=new JLabel("Cause of the event");
	    lblCause.setFont(new Font("Arial",Font.BOLD,14));
		lblCause.setBounds(50,70,140,20);
		
		TextFieldCause=new JTextField(60);
		TextFieldCause.setBounds(220,70,220,20);
		TextFieldCause.setFont(new Font("Arial",Font.BOLD,14));
		TextFieldCause.setBackground(new Color(245,255,250));
		
		lblAvgAge=new JLabel("Average age group of people");
	    lblAvgAge.setFont(new Font("Arial",Font.BOLD,14));
		lblAvgAge.setBounds(50,120,200,20);
		
		TextFieldAge=new JTextField(60);
		TextFieldAge.setBounds(270,120,90,20);
		TextFieldAge.setFont(new Font("Arial",Font.BOLD,14));
		TextFieldAge.setBackground(new Color(245,255,250));
		
		lblBudget=new JLabel("Budget per plate:");
	    lblBudget.setFont(new Font("Arial",Font.BOLD,14));
		lblBudget.setBounds(50,170,150,20);
		
		TextFieldBudget=new JTextField(60);
		TextFieldBudget.setBounds(220,170,90,20);
		TextFieldBudget.setFont(new Font("Arial",Font.BOLD,14));
		TextFieldBudget.setBackground(new Color(245,255,250));
		
		lblFoodPrefer=new JLabel("Food preference:");
	    lblFoodPrefer.setFont(new Font("Arial",Font.BOLD,14));
		lblFoodPrefer.setBounds(50,220,160,20);
		
		ComboFood=new JComboBox<String>();
		
		ComboFood.addItem("Indian Cuisine");
		ComboFood.addItem("Chinese");
		ComboFood.addItem("Continental");
		ComboFood.addItem("Mexican");
		ComboFood.setFont(new Font("Arial",Font.PLAIN,14));
		ComboFood.setBounds(220,220,130,20);
		
		lblMenu=new JLabel("Menu:");
	    lblMenu.setFont(new Font("Arial",Font.BOLD,14));
		lblMenu.setBounds(50,270,50,20);
		
		TextAreaMenu=new JTextArea("Enter Menu",3,7);
		TextAreaMenu.setFont(new Font("Arial",Font.ITALIC,14));
		TextAreaMenu.setBounds(130,270,300,70);
		TextAreaMenu.setBackground(new Color(245,255,250));
		
		lblExtraItem=new JLabel("Extra Items");
	    lblExtraItem.setFont(new Font("Arial",Font.BOLD,14));
		lblExtraItem.setBounds(200,370,100,20);
		
		ChkSweets=new JCheckBox("Sweets");
		ChkSweets.setFont(new Font("Arial",Font.BOLD,14));
		ChkSweets.setBounds(50,410,100,20);
		ChkSweets.setBackground(new Color(215,255,230));
		
		ChkDrinks=new JCheckBox("Drinks");
		ChkDrinks.setFont(new Font("Arial",Font.BOLD,14));
		ChkDrinks.setBounds(180,410,100,20);
		ChkDrinks.setBackground(new Color(215,255,230));
		
		ChkCake=new JCheckBox("Cake");
		ChkCake.setFont(new Font("Arial",Font.BOLD,14));
		ChkCake.setBounds(300,410,100,20);
		ChkCake.setBackground(new Color(215,255,230));
		
		lblApproxCost=new JLabel("Approximate total price:");
	    lblApproxCost.setFont(new Font("Arial",Font.BOLD,14));
		lblApproxCost.setBounds(50,460,170,20);
		
		TextFieldApprox=new JTextField(60);
		TextFieldApprox.setBounds(240,460,100,20);
		TextFieldApprox.setFont(new Font("Arial",Font.BOLD,14));
		TextFieldApprox.setBackground(new Color(245,255,250));
		
		btnNext=new JButton("Next");
		btnNext.setMnemonic('N');
		btnNext.setToolTipText("Click Here");
		btnNext.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNext.setFont(new Font("Arial",Font.BOLD,14));
        btnNext.setBounds(250,550,70,20);
		btnNext.setBackground(new Color(30,180,255));
		
		JLabel labelImg1=new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/img1.jpg")).getImage();
		labelImg1.setIcon(new ImageIcon(img));
		labelImg1.setBounds(500,300,220,150);
		
		
			
	    panel.add(labelImg1);
		panel.add(lblCause);
		panel.add(lblAvgAge);
		panel.add(lblBudget);
		panel.add(TextFieldCause);
		panel.add(TextFieldAge);
		panel.add(TextFieldBudget);
		panel.add(ComboFood);
		panel.add(lblFoodPrefer);
		panel.add(lblDetail);
		panel.add(lblMenu);
		panel.add(lblExtraItem);
		panel.add(ChkSweets);
		panel.add(ChkDrinks);
		panel.add(ChkCake);
		panel.add(TextAreaMenu);
		panel.add(TextFieldApprox);
		panel.add(lblApproxCost);
		panel.add(btnNext);
		
		panel.setBackground(new Color(153,255,255));
		frame.setVisible(true);
		
	}
	
	private void makeFrameFullSize(){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screenSize.width, screenSize.height);
	}

	public static void main(String a[]){
		 new page3();
	}
}
