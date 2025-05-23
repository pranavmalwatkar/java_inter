package internal;
import java.io.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class java4 extends Applet implements ActionListener,Runnable{
	Thread t;
	Button b1,b2;
	Boolean red,yellow,green;
	
	public void init()
	{
		t=new Thread(this);
		red=true;
	}
	public void start()
	{
		red=true;
		b1=new Button("Start");
		b2=new Button("Stop");
		
		add(b1);
		add(b2);
		
		setSize(1000,1000);
		setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void  actionPerformed(ActionEvent ae) {
		Object ob=ae.getSource();
		if(ob==b1) {
			t.start();
		}else if(ob==b2){
			
		}
	}
}
