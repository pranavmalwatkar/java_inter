package internal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class xyz extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1;
	JCheckBox c1,c2,c3,c4,c5,c6;
	public xyz()
	{
		setSize(500,500);
		setTitle("Admission Enquiry Form");
		setLayout(new GridLayout(10,3,10,10));
		
		l1=new JLabel("Name : ");
		t1=new JTextField(20);
		
		l2=new JLabel("Email :  ");
		t2=new JTextField(20);
		
		JLabel courseLabel = new JLabel("Select course");
		c1=new JCheckBox("BCA");
		c2=new JCheckBox("BBA");
		c3=new JCheckBox("MCA");
		c4=new JCheckBox("MTECT");
		c5=new JCheckBox("CA");
		c6=new JCheckBox("Bcom");
		
		b1=new JButton("Submit");
		
		add(l1);
		add(t1);
		
		add(l2);
		add(t2);
		
		
		add(courseLabel);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
		add(c6);
		add(b1);
		
		setVisible(true);
		b1.addActionListener(this);
	}

public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b1) {
		System.out.println("Admission form submitted");
	}
}


}
class java5{
public static void main(String args[]) {
	new xyz();
}
}