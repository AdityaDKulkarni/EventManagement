package ui;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

class file_awt
{
	Frame f1;
	TextArea t1;
	Button b1,b2,b3,b4;

file_awt()
{
	f1= new Frame("FILE");
	makeFrameFullSize();
	f1.setLayout(null);
	
	t1 = new TextArea(40,60);
	t1.setBounds(50,50,700,600);
	t1.setFont(new Font("Arial",Font.BOLD,18));
	t1.setForeground(Color.black);
	b1 = new Button("Clear");
	b1.setBounds(940,150,50,23);
	b2 = new Button("Open");
	b2.setBounds(800,150,50,23);
	b3 = new Button("Save");
	b3.setBounds(870,150,50,23);
	b4 = new Button("Exit");
	b4.setBounds(1010,150,50,23);
	
	b1.addActionListener(new ActionListener()
                    {
                         public void actionPerformed(ActionEvent ae)
 						 {
      							t1.setText("");   
 						 }
 					}
 					);	 

    b2.addActionListener(new ActionListener()
                    {
                         public void actionPerformed(ActionEvent ae)
 						 {     
 						    String fname,s1,s2;
      							try
      							{
      							    FileDialog fd=new FileDialog(f1,"Open File", FileDialog.LOAD);
      							    fd.setVisible(true);
      							    
      							    fname=fd.getDirectory()+fd.getFile();
      							    
      							    BufferedReader br=new BufferedReader(new FileReader(fname));
      							    StringBuffer sb=new StringBuffer();
      							    s1=br.readLine();
      							    while(s1!=null)
      							    {
      							       sb.append(s1+"\n");
      							       s1=br.readLine();
      							    }
      							    s2=sb.toString();
      							    t1.setText(s2);
      							    
      							    System.out.println("File Name :"+fname);
      							}   
      							catch(Exception e)
      							{
      							    
      							}
 						 }
 					}
 					);	 

    b3.addActionListener(new ActionListener()
                    {
                         public void actionPerformed(ActionEvent ae)
 						 {
 						     String fname, str1,str2;
 						     try
 						     {
      						     FileDialog fd=new FileDialog(f1,"Save file",FileDialog.SAVE);
      						     fd.setVisible(true);
      						     
      						     str1=t1.getText();
      						     fname=fd.getDirectory()+fd.getFile();
      						     
      						     
      						     
      						     BufferedReader br=new BufferedReader(new StringReader(str1));
      				            DataOutputStream ds=new  DataOutputStream(new  FileOutputStream(fname));
      							    str2=br.readLine();
      							    while(str2!=null)
      							    {
      							       ds.writeBytes(str2+"\n");
      							       str2=br.readLine();
      							    }
      							  ds.close();
      							  }
      							  catch(Exception e)
      							{
      							    
      							}
 						 }
 					}
 				);	 

        b4.addActionListener(new ActionListener()
              {
                         public void actionPerformed(ActionEvent ae)
 						 {
      							   f1.dispose();
 						 }
 			  }
 			);	  					

		f1.add(t1);
		f1.add(b1);
		f1.add(b2);
		f1.add(b3);
		f1.add(b4);
		f1.setBackground(new Color(153,255,255));
		
		f1.setVisible(true);
}

private void makeFrameFullSize()
{
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	f1.setSize(screenSize.width, screenSize.height);
}


public static void main(String args[])
{
     new file_awt();
}

}

