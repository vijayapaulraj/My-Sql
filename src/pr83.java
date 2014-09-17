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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.Caret;
import javax.xml.soap.Text;

	public class pr83 implements ActionListener {
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
		JButton bt11=null;
		JPanel pn9=null;
		JPanel pn10=null;
		JButton bt12=null;
		//String y=null;
	//	String ID2=null;
		
		JComboBox bt10=null;
		
		
		JTextField tx4=null;
		JTextField tx5=null;
		JTextField tx6=null;
		JTextField tx7=null;
		JTextField tx8=null;
		JTextField tx9=null;
		JTextField tx10=null;
		JTextField tx11=null;
		JTextField tx12=null;
		JTextField tx13=null;
		JTextField tx14=null;
		
		JLabel lb4=null;
		JLabel lb5=null;
		JLabel lb6=null;
		JLabel lb7=null;
		JLabel lb8=null;
		JLabel lb9=null;
		JLabel lb10=null;
		JLabel lb11=null;
		JLabel lb12=null;
		
		JPanel pn11=null;
		JPanel pn12=null;
						
		JPanel mpnl=null;
		JFrame frm=null;
		
		public void fun(){   //Main Frame
			lb1=new JLabel("username");
			pn1=new JPanel();
			pn1.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn1.add(lb1);
			
			tx1=new JTextField();
			tx1.setPreferredSize(new Dimension(100,20));
			pn2=new JPanel();
			pn2.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn2.add(tx1);
			
			lb2=new JLabel("Password");
			pn3=new JPanel();
			pn3.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn3.add(lb2);
			
			tx2=new JTextField();
			tx2.setPreferredSize(new Dimension(100,20));
			pn4=new JPanel();
			pn4.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn4.add(tx2);
			
			bt1=new JButton("Sign up");
			bt1.addActionListener(this);
			bt2=new JButton("Cancel");
			pn5=new JPanel();
			pn5.setLayout(new FlowLayout(FlowLayout.LEADING));
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
		
					
		}
		
		void inser(){
			lb1=new JLabel("ID");
			tx1=new JTextField();
			tx1.setPreferredSize(new Dimension(100,20));
			bt7=new JButton("Insert");
			bt7.addActionListener(this);
			pn1=new JPanel();
			pn1.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn1.add(lb1);
			pn1.add(tx1);
			pn1.add(bt7);
			
			lb2=new JLabel("First Name");
			lb3=new JLabel("Last Name");
			tx2=new JTextField();
			tx2.setPreferredSize(new Dimension(100,20));
			tx3=new JTextField();
			tx3.setPreferredSize(new Dimension(100,20));
			pn2=new JPanel();
			pn2.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn2.add(lb2);
			pn2.add(tx2);
			pn2.add(lb3);
			pn2.add(tx3);
			
			
			lb4=new JLabel("Choose your usename");
			tx4=new JTextField();
			tx4.setPreferredSize(new Dimension(100,20));
			pn3=new JPanel();
			pn3.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn3.add(lb4);
			pn3.add(tx4);
			
			lb5=new JLabel("Create the Password");
			tx5=new JTextField();
			tx5.setPreferredSize(new Dimension(100,20));
			pn4=new JPanel();
			pn4.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn4.add(lb5);
			pn4.add(tx5);
			
			lb6=new JLabel("Confirm the Password");
			tx6=new JTextField();
			tx6.setPreferredSize(new Dimension(100,20));
			pn5=new JPanel();
			pn5.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn5.add(lb6);
			pn5.add(tx6);
			
			lb7=new JLabel("Birthday");
			tx7=new JTextField("Month");
			tx7.setPreferredSize(new Dimension(100,20));
			tx8=new JTextField("Day");
			tx8.setPreferredSize(new Dimension(100,20));
			tx9=new JTextField("Year");
			tx9.setPreferredSize(new Dimension(100,20));
			pn6=new JPanel();
			pn6.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn6.add(lb7);
			pn6.add(tx7);
			pn6.add(tx8);
			pn6.add(tx9);
			
			lb8=new JLabel("Gender");
			tx10=new JTextField();
			tx10.setPreferredSize(new Dimension(100,20));
			pn7=new JPanel();
			pn7.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn7.add(lb8);
			pn7.add(tx10);
			
			lb9=new JLabel("Mobile Phone");
			tx11=new JTextField();
			tx11.setPreferredSize(new Dimension(100,20));
			pn8=new JPanel();
			pn8.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn8.add(lb9);
			pn8.add(tx11);
			
			lb10=new JLabel("Your current Address");
			tx12=new JTextField();
			tx12.setPreferredSize(new Dimension(100,20));
			pn9=new JPanel();
			pn9.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn9.add(lb10);
			pn9.add(tx12);
			
			lb11=new JLabel("Type the text");
			tx13=new JTextField();
			tx13.setPreferredSize(new Dimension(100,20));
			pn10=new JPanel();
			pn10.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn10.add(lb11);
			pn10.add(tx13);
			
			lb12=new JLabel("Location");
			tx14=new JTextField();
			tx14.setPreferredSize(new Dimension(100,20));
			pn11=new JPanel();
			pn11.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn11.add(lb12);
			pn11.add(tx14);
			
			
			JPanel mpnl=new JPanel();
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
			mpnl.add(pn6);
			mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
			mpnl.add(pn7);
			mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
			mpnl.add(pn8);
			mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
			mpnl.add(pn9);
			mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
			mpnl.add(pn10);
			mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
			mpnl.add(pn11);
			mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
			
			frm=new JFrame();
			frm.add(mpnl);
			frm.setTitle("Select the table value");
			frm.setSize(500,500);
			frm.setVisible(true);
			
		}
		void sele(){  //Selection Window Frame
			lb1=new JLabel("ID");
			tx1=new JTextField();
			tx1.setPreferredSize(new Dimension(100,20));
			bt8=new JButton("GO");
			bt8.addActionListener(this);
			pn1=new JPanel();
			pn1.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn1.add(lb1);
			pn1.add(tx1);
			pn1.add(bt8);
			
			lb2=new JLabel("First Name");
			lb3=new JLabel("Last Name");
			tx2=new JTextField();
			tx2.setPreferredSize(new Dimension(100,20));
			tx3=new JTextField();
			tx3.setPreferredSize(new Dimension(100,20));
			pn2=new JPanel();
			pn2.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn2.add(lb2);
			pn2.add(tx2);
			pn2.add(lb3);
			pn2.add(tx3);
			
			
			lb4=new JLabel("Choose your usename");
			tx4=new JTextField();
			tx4.setPreferredSize(new Dimension(100,20));
			pn3=new JPanel();
			pn3.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn3.add(lb4);
			pn3.add(tx4);
			
			lb5=new JLabel("Create the Password");
			tx5=new JTextField();
			tx5.setPreferredSize(new Dimension(100,20));
			pn4=new JPanel();
			pn4.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn4.add(lb5);
			pn4.add(tx5);
			
			lb6=new JLabel("Confirm the Password");
			tx6=new JTextField();
			tx6.setPreferredSize(new Dimension(100,20));
			pn5=new JPanel();
			pn5.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn5.add(lb6);
			pn5.add(tx6);
			
			lb7=new JLabel("Birthday");
			tx7=new JTextField("Month");
			tx7.setPreferredSize(new Dimension(100,20));
			tx8=new JTextField("Day");
			tx8.setPreferredSize(new Dimension(100,20));
			tx9=new JTextField("Year");
			tx9.setPreferredSize(new Dimension(100,20));
			pn6=new JPanel();
			pn6.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn6.add(lb7);
			pn6.add(tx7);
			pn6.add(tx8);
			pn6.add(tx9);
			
			lb8=new JLabel("Gender");
			tx10=new JTextField();
			tx10.setPreferredSize(new Dimension(100,20));
			pn7=new JPanel();
			pn7.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn7.add(lb8);
			pn7.add(tx10);
			
			lb9=new JLabel("Mobile Phone");
			tx11=new JTextField();
			tx11.setPreferredSize(new Dimension(100,20));
			pn8=new JPanel();
			pn8.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn8.add(lb9);
			pn8.add(tx11);
			
			lb10=new JLabel("Your current Address");
			tx12=new JTextField();
			tx12.setPreferredSize(new Dimension(100,20));
			pn9=new JPanel();
			pn9.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn9.add(lb10);
			pn9.add(tx12);
			
			lb11=new JLabel("Type the text");
			tx13=new JTextField();
			tx13.setPreferredSize(new Dimension(100,20));
			pn10=new JPanel();
			pn10.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn10.add(lb11);
			pn10.add(tx13);
			
			lb12=new JLabel("Location");
			tx14=new JTextField();
			tx14.setPreferredSize(new Dimension(100,20));
			pn11=new JPanel();
			pn11.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn11.add(lb12);
			pn11.add(tx14);
			
			
			JPanel mpnl=new JPanel();
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
			mpnl.add(pn6);
			mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
			mpnl.add(pn7);
			mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
			mpnl.add(pn8);
			mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
			mpnl.add(pn9);
			mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
			mpnl.add(pn10);
			mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
			mpnl.add(pn11);
			mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
			
			frm=new JFrame();
			frm.add(mpnl);
			frm.setTitle("Select the table value");
			frm.setSize(500,500);
			frm.setVisible(true);
			
		}
		void update(){    //Update process
						
			lb1=new JLabel("ID");
			tx1=new JTextField();
			tx1.setPreferredSize(new Dimension(100,20));
			bt9=new JButton("Select");
			bt9.addActionListener(this);
			pn1=new JPanel();
			pn1.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn1.add(lb1);
			pn1.add(tx1);
			pn1.add(bt9);
			
			lb2=new JLabel("First Name");
			lb3=new JLabel("Last Name");
			tx2=new JTextField();
			tx2.setPreferredSize(new Dimension(100,20));
			tx3=new JTextField();
			tx3.setPreferredSize(new Dimension(100,20));
			pn2=new JPanel();
			pn2.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn2.add(lb2);
			pn2.add(tx2);
			pn2.add(lb3);
			pn2.add(tx3);
			
			
			lb4=new JLabel("Choose your usename");
			tx4=new JTextField();
			tx4.setPreferredSize(new Dimension(100,20));
			pn3=new JPanel();
			pn3.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn3.add(lb4);
			pn3.add(tx4);
			
			lb5=new JLabel("Create the Password");
			tx5=new JTextField();
			tx5.setPreferredSize(new Dimension(100,20));
			pn4=new JPanel();
			pn4.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn4.add(lb5);
			pn4.add(tx5);
			
			lb6=new JLabel("Confirm the Password");
			tx6=new JTextField();
			tx6.setPreferredSize(new Dimension(100,20));
			pn5=new JPanel();
			pn5.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn5.add(lb6);
			pn5.add(tx6);
			
			lb7=new JLabel("Birthday");
			tx7=new JTextField("Month");
			tx7.setPreferredSize(new Dimension(100,20));
			tx8=new JTextField("Day");
			tx8.setPreferredSize(new Dimension(100,20));
			tx9=new JTextField("Year");
			tx9.setPreferredSize(new Dimension(100,20));
			pn6=new JPanel();
			pn6.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn6.add(lb7);
			pn6.add(tx7);
			pn6.add(tx8);
			pn6.add(tx9);
			
			lb8=new JLabel("Gender");
			tx10=new JTextField();
			tx10.setPreferredSize(new Dimension(100,20));
			pn7=new JPanel();
			pn7.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn7.add(lb8);
			pn7.add(tx10);
			
			lb9=new JLabel("Mobile Phone");
			tx11=new JTextField();
			tx11.setPreferredSize(new Dimension(100,20));
			pn8=new JPanel();
			pn8.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn8.add(lb9);
			pn8.add(tx11);
			
			lb10=new JLabel("Your current Address");
			tx12=new JTextField();
			tx12.setPreferredSize(new Dimension(100,20));
			pn9=new JPanel();
			pn9.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn9.add(lb10);
			pn9.add(tx12);
			
			lb11=new JLabel("Type the text");
			tx13=new JTextField();
			tx13.setPreferredSize(new Dimension(100,20));
			pn10=new JPanel();
			pn10.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn10.add(lb11);
			pn10.add(tx13);
			
			lb12=new JLabel("Location");
			tx14=new JTextField();
			tx14.setPreferredSize(new Dimension(100,20));
			pn11=new JPanel();
			pn11.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn11.add(lb12);
			pn11.add(tx14);
			
			bt12=new JButton("Update");
			bt12.addActionListener(this);
			pn12=new JPanel();
			pn12.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn12.add(bt12);
			
			
			
			
			JPanel mpnl=new JPanel();
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
			mpnl.add(pn6);
			mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
			mpnl.add(pn7);
			mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
			mpnl.add(pn8);
			mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
			mpnl.add(pn9);
			mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
			mpnl.add(pn10);
			mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
			mpnl.add(pn11);
			mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
			mpnl.add(pn12);
			mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
			
			
			
			frm=new JFrame();
			frm.add(mpnl);
			frm.setTitle("Select the table value");
			frm.setSize(500,500);
			frm.setVisible(true);
			
		}
		
		void delete(){
			lb3=new JLabel("ID");
			tx3=new JTextField();
			tx3.setPreferredSize(new Dimension(100,20));
			bt11=new JButton("GO");
			bt11.addActionListener(this);
			pn10=new JPanel();
			pn10.setLayout(new FlowLayout(FlowLayout.LEADING));
			pn10.add(lb3);
			pn10.add(tx3);
			pn10.add(bt11);
			
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
			pr83 rahu=new pr83();
			rahu.fun();

		}


		@Override
		public void actionPerformed(ActionEvent f) {
			// TODO Auto-generated method stub
			
			
			if(f.getSource()==bt1){ // when Sign up button is pressed
				pr83 tyur=new pr83();
				tyur.display();
			}
			
			else if(f.getSource()==bt3){//insert window form
				pr83 yr=new pr83();
				yr.inser();
				
			}
							
			
			else if(f.getSource()==bt7){  // Insert button to insert the values in the particular database
				try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/appa","root","");
				java.sql.Statement r=con.createStatement();
				
				System.out.println("Insert button is clicked");
				String ID =tx1.getText();
				String Fse=tx2.getText();
				String Lame=tx3.getText();
				String Ch =tx4.getText();
				String Cr=tx5.getText();
				String Conf=tx6.getText();
				String Mn=tx7.getText();
				String Da=tx8.getText();
				String Y=tx9.getText();
				String Ge=tx10.getText();
				String MN=tx11.getText();
				String Ca=tx12.getText();
				String Te=tx13.getText();
				String Ln=tx14.getText();
				r.execute("insert into amma values('"+ID+"','"+Fse+"','"+Lame+"','"+Ch+"','"+Cr+"','"+Conf+"','"+Mn+"','"+Da+"','"+Y+"','"+Ge+"','"+MN+"','"+Ca+"','"+Te+"','"+Ln+"')");
				
				
				/*r.setString(1,tx1.getText());
				//rs.setInt(1,tx1.getText());
				rs.setString(2,tx2.getText());
				rs.setString(3,tx3.getText());
				rs.setString(4,tx4.getText());
				rs.setString(5,tx5.getText());
				rs.setString(6,tx6.getText());
				rs.setString(7,tx7.getText());
				rs.setString(8,tx8.getText());
				rs.setString(9,tx9.getText());
				rs.setString(10,tx10.getText());
				rs.setString(11,tx11.getText());
				rs.setString(12,tx12.getText());
				rs.setString(13,tx13.getText());
				rs.setString(14,tx2.getText());*/
				
				
				}
				catch(Exception d){
					d.printStackTrace();
				}
			}
				else if(f.getSource()==bt4){ // Select button to display the particular database
					pr83 tye=new pr83();
					tye.sele();
					
				}
			
				else if(f.getSource()==bt8){ // Go button for Select option
					try{
						Class.forName("com.mysql.jdbc.Driver");
						Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/appa","root","");
						java.sql.Statement r=con.createStatement();
						ResultSet rs=r.executeQuery("SELECT * FROM amma");
						System.out.println("Select button is clicked");
						rs.next();
						int id_col=rs.getInt("ID");
						String id=Integer.toString(id_col);
						String First=rs.getString("First Name");
						String Last=rs.getString("Last Name");
						String Ur=rs.getString("Choose your Username");
						String cr=rs.getString("Create the Password");
						String ty=rs.getString("Confirm the Password");
						String MN=rs.getString("Month");
						String DT=rs.getString("Date");
						int Yr_col=rs.getInt("Year");
						String Yr=Integer.toString(Yr_col);
						String Gr=rs.getString("Gender");
						String MP=rs.getString("Mobile Phone");
						String cur=rs.getString("Your current Address");
						String type=rs.getString("Type the Text");
						String Lc=rs.getString("Location");
						
						tx1.setText(id);
						tx2.setText(First);
						tx3.setText(Last);
						tx4.setText(Ur);
						tx5.setText(cr);
						tx6.setText(ty);
						tx7.setText(MN);
						tx8.setText(DT);
						tx9.setText(Yr);
						tx10.setText(Gr);
						tx11.setText(MP);
						tx12.setText(cur);
						tx13.setText(type);
						tx14.setText(Lc);
																	
					}
					catch(Exception d){
						d.printStackTrace();
					}
				}
					
					else if(f.getSource()==bt5){  //update window click
						pr83 hyr=new pr83();
						hyr.update();
						
					}
			
					else if(f.getSource()==bt9){  //Go button for update option
						try{
							Class.forName("com.mysql.jdbc.Driver");
							Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/appa","root","");
							java.sql.Statement r=con.createStatement();
							//r.executeUpdate("UPDATE amma SET Date=19 WHERE ID="+tx2.getText());
							ResultSet rs=r.executeQuery("SELECT * FROM amma");
						    // ResultSet rs=r.getResultSet();
							rs.next();
							System.out.println("Update button is clicked");
							int id_col=rs.getInt("ID");
							String id=Integer.toString(id_col);
							String First=rs.getString("First Name");
							String Last=rs.getString("Last Name");
							String Ur=rs.getString("Choose your Username");
							String cr=rs.getString("Create the Password");
							String ty=rs.getString("Confirm the Password");
							String MN=rs.getString("Month");
							String DT=rs.getString("Date");
							int Yr_col=rs.getInt("Year");
							String Yr=Integer.toString(Yr_col);
							String Gr=rs.getString("Gender");
							String MP=rs.getString("Mobile Phone");
							String cur=rs.getString("Your current Address");
							String type=rs.getString("Type the Text");
							String Lc=rs.getString("Location");
							
							tx1.setText(id);
							tx2.setText(First);
							tx3.setText(Last);
							tx4.setText(Ur);
							tx5.setText(cr);
							tx6.setText(ty);
							tx7.setText(MN);
							tx8.setText(DT);
							tx9.setText(Yr);
							tx10.setText(Gr);
							tx11.setText(MP);
							tx12.setText(cur);
							tx13.setText(type);
							tx14.setText(Lc);
						}
							catch(Exception d){
								d.printStackTrace();
							}		
					}
							
						else if(f.getSource()==bt12){
							try{
								Class.forName("com.mysql.jdbc.Driver");
								Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/appa","root","");
								java.sql.Statement r=con.createStatement();
								
							String ID =tx1.getText();
							String Fse=tx2.getText();
							String Lame=tx3.getText();
							String Ch =tx4.getText();
							String Cr=tx5.getText();
							String Conf=tx6.getText();
							String Mn=tx7.getText();
							String Da=tx8.getText();
							String Y=tx9.getText();
							String Ge=tx10.getText();
							String Mt=tx11.getText();
							String Ca=tx12.getText();
							String Te=tx13.getText();
							String Ln=tx14.getText();
							r.executeUpdate("Update amma set ID='"+(ID)+"',First Name='"+(Fse)+"',Last Name='"+(Lame)+"',Choose your Username='"+(Ch)+"',Create the Password='"+(Cr)+"',Confirm the Password='"+(Conf)+"',Month='"+(Mn)+"',Date='"+(Da)+"',Year='"+(Y)+"',Gender='"+(Ge)+"',Mobile Phone='"+(Mt)+"',Your current Address='"+(Ca)+"',Type the Text='"+(Te)+"',Location='"+(Ln)+"')");
							}
						
						catch(Exception d){
							d.printStackTrace();
							
						}
					}
					
		
					else if(f.getSource()==bt6){    //Delete option click
						pr83 rah=new pr83();
						rah.delete();
					}
			
					else if(f.getSource()==bt11){    //Go button for delete option
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
		
