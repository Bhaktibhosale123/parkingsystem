package frameexit;
import java.awt.event.*;


import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;



import java.sql.*;

public class exit extends JFrame implements ActionListener {


	JLabel j1,j2,j3,j4,j6,j8,j9;
	Choice c1;
    JTextField t1,t2,t4,t5,t6;
    JButton b1,b2,b3;
    
    
    exit(){
		j1=new JLabel("License Plate No.");
		j1.setSize(150,30);
		j1.setLocation(60,30);
		j1.setFont(new Font("Tahoma",Font.PLAIN,17));
		add(j1);
		
		
		
		c1=new Choice();
		try {
			conn c=new conn();
			ResultSet rs=c.s.executeQuery("select * from exitinfo");
			while (rs.next()){
				c1.add(rs.getString("license"));
			}
				}catch(Exception e){}
		
		c1.setBounds(250,30,150,30);
		add(c1);
		
		
		
		j2=new JLabel("First Name");
		j2.setSize(150,30);
		j2.setLocation(60,80);
		j2.setFont(new Font("Tahoma",Font.PLAIN,17));
		add(j2);
		
		t1=new JTextField();
		t1.setBounds(250,80,150,30);	
		add(t1);
		
		j9=new JLabel("Last Name");
		j9.setSize(150,30);
		j9.setLocation(60,130);
		j9.setFont(new Font("Tahoma",Font.PLAIN,17));
		add(j9);
		
		t6=new JTextField();
		t6.setBounds(250,130,150,30);	
		add(t6);
		
		j3=new JLabel("Phone No.");
		j3.setSize(150,30);
		j3.setLocation(60,180);
		j3.setFont(new Font("Tahoma",Font.PLAIN,17));
		add(j3);
		
		t2=new JTextField();
		t2.setBounds(250,180,150,30);	
		add(t2);
		
		j8=new JLabel("Alloted Lot");
		j8.setSize(150,30);
		j8.setLocation(60,230);
		j8.setFont(new Font("Tahoma",Font.PLAIN,17));
		add(j8);
		
		t5=new JTextField();
		t5.setBounds(250,230,150,30);	
		add(t5);
		
		
		j4=new JLabel("EXIT TO PARKING LOT");
		j4.setSize(430,25);
		j4.setLocation(450,30);
		j4.setForeground(Color.blue);
		j4.setFont(new Font("Tahoma",Font.ROMAN_BASELINE,25));
		add(j4);
		
		
		
		
		
		
		
		
		b2=new JButton("Next");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setBounds(60,300,130,40);
		add(b2);
		b2.addActionListener(this);
		
		b3=new JButton("Cancel");
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		b3.setBounds(260,300,130,40);
		add(b3);
		b3.addActionListener(this);
		
		
		
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("frameexit/icons/exit_f.jpeg"));
		Image i2=i1.getImage().getScaledInstance(280,260,Image.SCALE_DEFAULT);
		ImageIcon i3= new ImageIcon(i2);
		JLabel j6=new JLabel(i3);
	    j6.setBounds(430,80,280,260);
		add(j6);
		
		ImageIcon i4= new ImageIcon(ClassLoader.getSystemResource("frameexit/icons/tick.png"));
		Image i5=i4.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
		ImageIcon i6= new ImageIcon(i5);
	    b1=new JButton(i6);
	    b1.setBounds(410,30,20,20);
		add(b1);
		b1.addActionListener(this);
		
	
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		setBounds(370,200,750,400);
		setVisible(true);
		
	}
    
    public void actionPerformed(ActionEvent ae) {
    	if(ae.getSource()==b1){
    		conn c=new conn();
    		String no=c1.getSelectedItem();
    		try {
    		ResultSet rs=c.s.executeQuery("select * from exitinfo where license='"+no+"'");
    		while (rs.next()){
    			t1.setText(rs.getString("first_name"));
    			t6.setText(rs.getString("last_name"));
    			t2.setText(rs.getString("phone"));
    			t5.setText(rs.getString("alloted_lot"));
    			
    		}
    		
    	}catch(Exception e) {}
    	}else if(ae.getSource()==b2){
    		new fare().setVisible(true);
    		this.setVisible(false);
    		
    		
    		
    			
    	
    		
    	}else if(ae.getSource()==b3) {
    		System.exit(0);
    	}
    	
	
	
    }
	
	public static void main(String[] args) {
		new exit();

	}




}
