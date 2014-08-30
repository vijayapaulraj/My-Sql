import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class pr77 implements ActionListener{
	
	JLabel lb1=null;
	JTextField txt1=null;
	JPanel pn1=null;
	JPanel pn2=null;
	
	JPanel pn3=null;
	JLabel lb2=null;
	JTextField txt2=null;
	JPanel pn4=null;
	
	JButton bt1=null;
	JButton bt2=null;
	JPanel pn5=null;
	
	
	JPanel mpnl=null;
	JFrame frm=null;
	
	public pr77(){
		lb1=new JLabel("username");
		pn1=new JPanel();
		pn1.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn1.add(lb1);
		pn2=new JPanel();
		txt1=new JTextField();
		txt1.setPreferredSize(new Dimension(100,20));
		pn2.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn2.add(txt1);
		
		lb2=new JLabel("password");
		pn3=new JPanel();
		pn3.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn3.add(lb2);
		txt2=new JTextField();
		txt2.setPreferredSize(new Dimension(100,20));
		pn4=new JPanel();
		pn4.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn4.add(txt2);
		
		bt1=new JButton("Submit");
		bt1.addActionListener(this);
		bt2=new JButton("Cancel");
		bt2.addActionListener(this);
		pn5=new JPanel();
		pn5.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn5.add(bt1);
		pn5.add(bt2);
		
		mpnl =new JPanel();
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
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
          new pr77();
	}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		
						
			if(e.getSource()==bt1){
				try{
					Class.forName("com.mysql.jdbc.Driver");//what database are we using 
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/bhaskar","root","");//database name username password
					String query="insert into sam values('Rajesh','juli')";//insert query
					java.sql.Statement st=con.createStatement();//statement creation
					System.out.println("Submit button is clicked");
					st.execute(query);
					//st.execute("drop database arun"); //statement execution
			}
				catch(Exception a){
					a.printStackTrace();
				}
			}
				else if(e.getSource()==bt2){
				 System.out.println("cancel button is click");
				}
			}
			}
			
			
			 
		

