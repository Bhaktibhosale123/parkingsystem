package frameexit;
import javax.swing.*;
import java.sql.*;

import java.awt.Color;
import java.awt.event.*;

public class employeeinfo extends JFrame implements ActionListener{
	
	JTable t1;
	JButton b1,b2;
	
	employeeinfo(){
		
		t1=new JTable();
		t1.setBounds(0,40,1000,450);
		add(t1);
		
		b1=new JButton("Load Data");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setBounds(330,510,130,40);
		add(b1);
		b1.addActionListener(this);
		
		
		b2=new JButton("Back");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setBounds(530,510,130,40);
		add(b2);
		b2.addActionListener(this);
		
		setLayout(null);
		setBounds(300,200,1000,600);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		 if(ae.getSource()==b1) {
			 
			 try {
				 conn c=new conn();
				 String str="select * from ";
				 ResultSet rs=c.s.executeQuery(str);
			 }catch(Exception e) {
				 
			 }
			 
		 }else if(ae.getSource()==b2){
			 
		 }
		
	}

	public static void main(String[] args) {
		new employeeinfo().setVisible(true);

	}

}
