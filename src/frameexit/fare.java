package frameexit;


import java.awt.Color;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class fare extends JFrame implements ActionListener {
	
	JLabel j1,j2,j3,j4,j5,j6,j7;
	JTextField t1,t2,t3;
	JButton b1,b2;
	
	fare(){
		j1=new JLabel("Entry time");
		j1.setSize(150,30);
		j1.setLocation(50,50);
		j1.setFont(new Font("Tahoma",Font.PLAIN,17));
		add(j1);
		
		t1=new JTextField();
		t1.setBounds(200,50,150,30);	
		add(t1);
		try {
			conn c=new conn();
			ResultSet rs=c.s.executeQuery("select * from parking_time");
			
		}catch(Exception e) {}
		
		
		j2=new JLabel("Exit time");
		j2.setSize(150,30);
		j2.setLocation(50,105);
		j2.setFont(new Font("Tahoma",Font.PLAIN,17));
		add(j2);
		
		t2=new JTextField();
		t2.setBounds(200,105,150,30);	
		add(t2);
		
		j7=new JLabel("Total time");
		j7.setSize(150,30);
		j7.setLocation(50,160);
		j7.setFont(new Font("Tahoma",Font.PLAIN,17));
		add(j7);
		
		t3=new JTextField();
		t3.setBounds(200,160,150,30);	
		add(t3);
		
		
		j3=new JLabel("You have to pay Rs. X");
		j3.setSize(350,40);
		j3.setLocation(50,220);
		j3.setFont(new Font("Tahoma",Font.PLAIN,30));
		add(j3);
		
		j5=new JLabel("Payment");
		j5.setSize(300,90);
		j5.setLocation(440,10);
		j5.setForeground(Color.blue);
		j5.setFont(new Font("Tahoma",Font.ROMAN_BASELINE,40));
		add(j5);
		
		b1=new JButton("Done");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setBounds(50,300,130,40);
		add(b1);
		b1.addActionListener(this);
		
		
		b2=new JButton("Cancel");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setBounds(250,300,130,40);
		add(b2);
		b2.addActionListener(this);
		
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("frameexit/icons/MONEY_a.png"));
		Image i2=i1.getImage().getScaledInstance(200,180,Image.SCALE_DEFAULT);
		ImageIcon i3= new ImageIcon(i2);
		JLabel j4=new JLabel(i3);
	    j4.setBounds(440,160,200,180);
		add(j4);
		
		ImageIcon i4= new ImageIcon(ClassLoader.getSystemResource("frameexit/icons/MONEY_B.jfif"));
		Image i5=i4.getImage().getScaledInstance(200,150,Image.SCALE_DEFAULT);
		ImageIcon i6= new ImageIcon(i5);
		JLabel j6=new JLabel(i6);
	    j6.setBounds(400,100,200,150);
		add(j6);
		
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		setBounds(380,200,670,400);
		setVisible(true);
		
	
	}
	
public void actionPerformed(ActionEvent ae) {
	if(ae.getSource()==b1) {
		
		
	}else if(ae.getSource()==b2) {
		System.exit(0);
	}
		
	}

	public static void main(String[] args) {
		new fare();

	}
	
	
}
