package ui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import assets.*;
import global.Globals;
import sql.SQLHelper;

import java.io.IOException;

public class Page3 extends JFrame {

	JFrame frame;
	JPanel panel;  
	JLabel lblCause,lblAvgAge,lblBudget,lblFoodPrefer,lblMenu,lblExtraItem,lblDetail,lblApproxCost;
	JTextField tfPurposeCause,tfAge,tfBudget,TextFieldApprox;
	JTextArea taMenu;
	JComboBox<String> comboFoodPref;
	JCheckBox chkSweets,chkDrinks,chkCake;
	JButton btnNext;

	public Page3()
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

		tfPurposeCause=new JTextField(60);
		tfPurposeCause.setBounds(220,70,220,20);
		tfPurposeCause.setFont(new Font("Arial",Font.BOLD,14));
		tfPurposeCause.setBackground(new Color(245,255,250));

		lblAvgAge=new JLabel("Average age group of people");
		lblAvgAge.setFont(new Font("Arial",Font.BOLD,14));
		lblAvgAge.setBounds(50,120,200,20);

		tfAge=new JTextField(60);
		tfAge.setBounds(270,120,90,20);
		tfAge.setFont(new Font("Arial",Font.BOLD,14));
		tfAge.setBackground(new Color(245,255,250));

		lblBudget=new JLabel("Budget per plate:");
		lblBudget.setFont(new Font("Arial",Font.BOLD,14));
		lblBudget.setBounds(50,170,150,20);

		tfBudget=new JTextField(60);
		tfBudget.setBounds(220,170,90,20);
		tfBudget.setFont(new Font("Arial",Font.BOLD,14));
		tfBudget.setBackground(new Color(245,255,250));

		lblFoodPrefer=new JLabel("Food preference:");
		lblFoodPrefer.setFont(new Font("Arial",Font.BOLD,14));
		lblFoodPrefer.setBounds(50,220,160,20);

		comboFoodPref=new JComboBox<String>();

		comboFoodPref.addItem("Indian Cuisine");
		comboFoodPref.addItem("Chinese");
		comboFoodPref.addItem("Continental");
		comboFoodPref.addItem("Mexican");
		comboFoodPref.setFont(new Font("Arial",Font.PLAIN,14));
		comboFoodPref.setBounds(220,220,130,20);

		lblMenu=new JLabel("Menu:");
		lblMenu.setFont(new Font("Arial",Font.BOLD,14));
		lblMenu.setBounds(50,270,50,20);

		taMenu=new JTextArea("Enter Menu",3,7);
		taMenu.setFont(new Font("Arial",Font.ITALIC,14));
		taMenu.setBounds(130,270,300,70);
		taMenu.setBackground(new Color(245,255,250));

		btnNext=new JButton("Next");
		btnNext.setMnemonic('N');
		btnNext.setToolTipText("Click Here");
		btnNext.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNext.setFont(new Font("Arial",Font.BOLD,14));
		btnNext.setBounds(250,550,200,20);
		btnNext.setBackground(new Color(30,180,255));
		btnNext.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Globals.details.setPurpose(tfPurposeCause.getText().toString());
				Globals.details.setAgeGroup(Integer.parseInt(tfAge.getText().toString()));
				Globals.details.setPlateBudget(tfBudget.getText().toString());
				Globals.details.setFoodPreference(comboFoodPref.getSelectedItem().toString());
				Globals.details.setMenu(taMenu.getText().toString());

				SQLHelper.insertEvent(Globals.details.getDate(), Globals.details.getVenue(), Globals.details.getScale(),
				Globals.details.getAvgNoOfPeople(), Globals.details.getEventId(), Globals.details.getPurpose(),
				Globals.details.getAgeGroup(), Globals.details.getStartTime(), Globals.details.getEndTime(), 
				Globals.details.getPhone(), Globals.details.getBudget(), Globals.details.getName(), Globals.details.getEmail());
				/*frame.dispose();
				Page4 name = new Page4();*/
			}
		});

		JLabel labelImg1=new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/assets/img2.jpg")).getImage();
		labelImg1.setIcon(new ImageIcon(img));
		labelImg1.setBounds(500,300,220,150);



		panel.add(labelImg1);
		panel.add(lblCause);
		panel.add(lblAvgAge);
		panel.add(lblBudget);
		panel.add(tfPurposeCause);
		panel.add(tfAge);
		panel.add(tfBudget);
		panel.add(comboFoodPref);
		panel.add(lblFoodPrefer);
		panel.add(lblDetail);
		panel.add(lblMenu);
		panel.add(taMenu);
		panel.add(btnNext);

		panel.setBackground(new Color(153,255,255));
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.setVisible(true);

	}

	private void makeFrameFullSize(){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screenSize.width, screenSize.height);
	}
}
