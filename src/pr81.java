import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.Caret;

public class pr81 implements ActionListener {
	JLabel lb1=null; 
	JPanel pn1=null;
	
	JTextField tx1=null;
	JPanel pn2=null;
	
	JLabel lb2=null;
	JPanel pn3=null;
	
	JTextField tx2=null;
	JPanel pn4=null;
	
	JButton bt1=null;   //Sign up button
	JButton bt2=null;    //Cancel button
	JPanel pn5=null;
	
	JButton bt3=null;     //Insert button
	JButton bt4=null;     //Select button
	JPanel pn6=null;
	
	JButton bt5=null;     //Update Button   
	JButton bt6=null;      //Delete Button
	JPanel pn7=null;
	
	JPanel pn8=null;
	JLabel lb3=null;
	JTextField tx3=null;
	JButton bt7=null;      //Go Button
	JButton bt8=null;   //Go Button
	JButton bt9=null;      //Go button
	JPanel pn9=null;
	JPanel pn10=null;
	//String y=null;
	String ID2=null;

		
	JPanel mpnl=null;
	JFrame frm=null;
	
	public void fun(){   //Main Frame
		lb1=new JLabel("username");
		pn1=new JPanel();
		pn1.setLayout(new FlowLayout(FlowLayout.TRAILING));
		pn1.add(lb1);
		
		tx1=new JTextField();
		tx1.setPreferredSize(new Dimension(100,20));
		pn2=new JPanel();
		pn2.setLayout(new FlowLayout(FlowLayout.TRAILING));
		pn2.add(tx1);
		
		lb2=new JLabel("Password");
		pn3=new JPanel();
		pn3.setLayout(new FlowLayout(FlowLayout.TRAILING));
		pn3.add(lb2);
		
		tx2=new JTextField();
		tx2.setPreferredSize(new Dimension(100,20));
		pn4=new JPanel();
		pn4.setLayout(new FlowLayout(FlowLayout.TRAILING));
		pn4.add(tx2);
		
		bt1=new JButton("Sign up");
		bt1.addActionListener(this);
		bt2=new JButton("Cancel");
		pn5=new JPanel();
		pn5.setLayout(new FlowLayout(FlowLayout.TRAILING));
		pn5.add(bt1);
		pn5.add(bt2);
		
	
		mpnl=new JPanel();
		mpnl.add(pn1);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn2);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn3);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn4);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn5);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		
				
		frm=new JFrame();
		frm.add(mpnl);
		frm.setTitle("Login");
		frm.setSize(200,200);
		frm.setVisible(true);
		frm.getContentPane().setBackground(Color.red);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}
	void display() //Database command
	{
	    bt3=new JButton("Insert");
		bt3.addActionListener(this);
	    bt4=new JButton("Select");
	    bt4.addActionListener(this);
		pn6=new JPanel();
		pn6.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn6.add(bt3);
		pn7=new JPanel();
		pn7.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn7.add(bt4);
		
	     bt5=new JButton("Update");
	     bt5.addActionListener(this);
		 bt6=new JButton("Delete");
		 bt6.addActionListener(this);
		 pn8=new JPanel();
		 pn8.setLayout(new FlowLayout(FlowLayout.LEADING));
		 pn8.add(bt5);
		 pn9=new JPanel();
		 pn9.setLayout(new FlowLayout(FlowLayout.LEADING));
		 pn9.add(bt6);
		
		JPanel mpnl=new JPanel();
		mpnl.add(pn6);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn7);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn8);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn9);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		  
		
	      Frame frm=new JFrame();
		  frm.add(mpnl);
		  frm.setTitle("Database Command");
		  frm.setVisible(true);
		  frm.setSize(300,300);
		  frm.setBackground(Color.blue);
	
				
	}
	void sele(){  //Selection Window Frame
		lb3=new JLabel("ID");
		tx3=new JTextField();
		tx3.setPreferredSize(new Dimension(100,20));
		bt7=new JButton("GO");
		bt7.addActionListener(this);
		pn10=new JPanel();
		pn10.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn10.add(lb3);
		pn10.add(tx3);
		pn10.add(bt7);
		
	
		
		JPanel mpnl=new JPanel();
		mpnl.add(pn10);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		
		frm=new JFrame();
		frm.add(mpnl);
		frm.setTitle("Select the table value");
		frm.setSize(200,200);
		frm.setVisible(true);
		
	}
	void update(){    //Update process
		lb3=new JLabel("ID");
		tx3=new JTextField();
		tx3.setPreferredSize(new Dimension(100,20));
		bt8=new JButton("GO");
		bt8.addActionListener(this);
		pn10=new JPanel();
		pn10.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn10.add(lb3);
		pn10.add(tx3);
		pn10.add(bt8);
		
		JPanel mpnl=new JPanel();
		mpnl.add(pn10);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		
		frm=new JFrame();
		frm.add(mpnl);
		frm.setTitle("Update the table value");
		frm.setSize(200,200);
		frm.setVisible(true);
	}
	
	void delete(){
		lb3=new JLabel("ID");
		tx3=new JTextField();
		tx3.setPreferredSize(new Dimension(100,20));
		bt9=new JButton("GO");
		bt9.addActionListener(this);
		pn10=new JPanel();
		pn10.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn10.add(lb3);
		pn10.add(tx3);
		pn10.add(bt9);
		
		JPanel mpnl=new JPanel();
		mpnl.add(pn10);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		
		frm=new JFrame();
		frm.add(mpnl);
		frm.setTitle("delete the table value");
		frm.setSize(200,200);
		frm.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pr81 rahu=new pr81();
		rahu.fun();

	}


	@Override
	public void actionPerformed(ActionEvent f) {
		// TODO Auto-generated method stub
		
		
		if(f.getSource()==bt1){ // when Sign up button is pressed
			pr81 tyur=new pr81();
			tyur.display();
			frm.dispose();
		}
						
		
		else if(f.getSource()==bt3){  // Insert button to insert the values in the particular database
			try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/appa","root","");
			String w="insert into amma values('04','Reeny','Rauy','sunny','sunny','Rahyu','MAR','18','1956','Female','9842106776','yttydaraj','gttsj','pakistan')";
			java.sql.Statement r=con.createStatement();
			System.out.println("Insert button is clicked");
			r.execute(w);
			}
			catch(Exception d){
				d.printStackTrace();
			}
		}
			else if(f.getSource()==bt4){ // Select button to display the particular database
				pr81 tye=new pr81();
				tye.sele();
				
			}
		
			else if(f.getSource()==bt7){ // Go button for Select option
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/appa","root","");
					java.sql.Statement r=con.createStatement();
					ResultSet rs=r.executeQuery("SELECT * FROM amma WHERE ID LIKE '%' ");
					System.out.println("Select button is clicked");
					
					String y=tx3.getText();
					 String ID2= rs.getString("ID");
					 if(y==ID2){
					// ResultSet rs=r.executeQuery("SELECT ID FROM amma");
					 
						 r.executeQuery("SELECT * FROM amma WHERE ID LIKE '%'");
				}
				}
				catch(Exception d){
					d.printStackTrace();
				}
			}
				
				else if(f.getSource()==bt5){  //update window click
					pr81 hyr=new pr81();
					hyr.update();
					
				}
		
				else if(f.getSource()==bt8){  //Go button for update option
					try{
						Class.forName("com.mysql.jdbc.Driver");
						Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/appa","root","");
						java.sql.Statement r=con.createStatement();
						String y="tx3.getInt()";
					    r.execute("SET @ID:=y");
						r.executeUpdate("UPDATE amma SET Date=19 WHERE ID='y'");
						ResultSet rs=r.getResultSet();
						System.out.println("Update button is clicked");
						//while(rs.next()){
						//String y=tx3.getText();
						 //String ID2= rs.getString("ID");
						 //if(y==ID2)
						// {
					//	r.execute("SET @ y:=ID2()" );
						//	 r.executeUpdate("UPDATE amma SET Date=30 WHERE ID=@y");
					   //  }
						 }
						//}
					catch(Exception d){
						d.printStackTrace();
						
					}
				}
				
	
				else if(f.getSource()==bt6){    //Delete option click
					pr81 rah=new pr81();
					rah.delete();
				}
		
				else if(f.getSource()==bt9){    //Go button for delete option
					try{
						Class.forName("com.mysql.jdbc.Driver");
						Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/appa","root","");
						java.sql.Statement r=con.createStatement();
						System.out.println("Delete button is clicked");
						r.execute("DELETE FROM amma WHERE ID=3 ");
					}
					catch(Exception d){
						d.printStackTrace();
						
					}
					
				}
			}
	
		
		}
		



