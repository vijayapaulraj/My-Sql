
import java.awt.Adjustable;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.sql.DriverManager;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.ScrollPaneLayout;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import com.mysql.jdbc.Connection;


public class pr78 implements ActionListener,AdjustmentListener {
	JLabel lb1=null;
	JPanel pn=null;
	JTextField txt1=null;
	JTextField txt2=null;
	JPanel pn1=null;
	
	JLabel lb2=null;
	JPanel pn2a=null;
	JTextField txt3=null;
	JPanel pn2=null;
	
	JLabel lb3=null;
	JTextField txt4=null;
	JPanel pn3a=null;
	JPanel pn3=null;
	
	JLabel lb4=null;
	JTextField txt5=null;
	JPanel pn4=null;
	JPanel pn4a=null;
	
	JLabel lb5=null;
	//JTextField txt6=null;
	//JTextField txt7=null;
	//JTextField txt8=null;
	JComboBox bt8=null;
	JComboBox bt9=null;
	JComboBox bt10=null;
	JPanel pn5=null;
	JPanel pn5a=null;
	
	JLabel lb6=null;
	JTextField txt9=null;
	//JRadioButton btn1=null;
	//JRadioButton btn2=null;
	//ButtonGroup bt=null;
	JComboBox bt=null;
	JPanel pn6=null;
	JPanel pn6a=null;
	JPanel pn6b=null;
	
	JLabel lb7=null;
	JTextField txt10=null;
	JPanel pn7=null;
	JPanel pn7a=null;
	
	
	JLabel lb8=null;
	JTextField txt11=null;
	JPanel pn8=null;
	JPanel pn8a=null;
	
	JLabel lb9=null;
	JCheckBox btn3=null;
	JLabel lb10=null;
	JPanel pn9=null;
	JPanel pn9a=null;
	JPanel pn9b=null;
	
	JLabel lb11=null;
	JTextField txt12=null;
	JComboBox bt7=null;
	JPanel pn10=null;
	JPanel pn10a=null;
	JPanel pn10b=null;
	
	JLabel lb12=null;
	JTextField txt13=null;
	JPanel pn11=null;
	JPanel pn11a=null;
	
	JLabel lb13=null;
	JCheckBox btn4=null;
	JPanel pn12=null;
	JPanel pn12a=null;
	
	JButton btn5=null;
	JButton btn6=null;
	JPanel pn13=null;
	JPanel pn13a=null;
	
	JLabel lb15=null;
	JPanel pn15=null;
	BufferedImage im=null;
	
	JLabel lb14=null;
	JScrollBar hbr=null;
	JScrollBar vbr=null;
	JPanel pn16=null;
	JScrollPane scroller=null;
	Container ContentPane=null;
	
	ScrollPaneLayout sp=null;
	
	
		
	JPanel mpnl=null;
	JFrame frm=null;
	//JTextFrame yu=null;
	
	public  pr78()
	{
		lb1=new JLabel("Name");
		txt1=new JTextField("First");
		txt2=new JTextField("last");
		txt1.setPreferredSize(new Dimension(100,20));
		txt2.setPreferredSize(new Dimension(100,20));
		pn1=new JPanel();
		pn1.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn1.add(lb1);
		pn=new JPanel();
		pn.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn.add(txt1);
		pn.add(txt2);
				
		lb2=new JLabel("Choose your UserName");
		pn2=new JPanel();
		pn2.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn2.add(lb2);
		txt3=new JTextField("\t"+"\t"+"\t"+"\t"+"@gmail.com");
		txt3.setPreferredSize(new Dimension(100,20));
		pn2a=new JPanel();
		pn2a.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn2a.add(txt3);
		
		lb3=new JLabel("Create a Password");
		txt4=new JTextField();
		txt4.setPreferredSize(new Dimension(100,20));
		pn3=new JPanel();
		pn3.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn3.add(lb3);
		pn3a=new JPanel();
		pn3a.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn3a.add(txt4);
		
		lb4=new JLabel("Confirm Your Password");
		txt5=new JTextField();
		txt5.setPreferredSize(new Dimension(100,20));
		pn4=new JPanel();
		pn4.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn4.add(lb4);
		pn4a=new JPanel();
		pn4a.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn4a.add(txt5);
		
		lb5=new JLabel("BirthDay");
	  // txt6=new JTextField("Month");
		//txt7=new JTextField("Day");
		//txt8=new JTextField("Year");
		//txt6.setPreferredSize(new Dimension(100,20));
		//txt7.setPreferredSize(new Dimension(100,20));
		//txt8.setPreferredSize(new Dimension(100,20));
		
		pn5=new JPanel();
		pn5.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn5.add(lb5);
		bt8=new JComboBox();
		bt9=new JComboBox();
		bt10=new JComboBox();
		pn5a=new JPanel();
		pn5a.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn5a.add(bt8);
		pn5a.add(bt9);
		pn5a.add(bt10);
		
		//pn5a.add(txt7);
		//pn5a.add(txt8);
		String a[]={"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
		for(int i=0;i<12;i++){
			bt8.addItem(a[i]);
		}
		 
		int b[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
		for(int i=0;i<31;i++){
			bt9.addItem(b[i]);
		}
		
		int c[]={2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015};
		for(int i=0;i<16;i++){
			bt10.addItem(c[i]);
		}
		/*int g[]=new int[1];
		Scanner r=new Scanner(System.in);
		for(int i=0;i<1;i++){
			g[i]=r.nextInt();
			}
		for(int i=0;i<1;i++)
		{
			bt10.addItem(g[i]);
		}*/
		
				
		lb6=new JLabel("Gender");
		txt9=new JTextField("I am");
		txt9.setPreferredSize(new Dimension(100,20));
		bt=new JComboBox();
		bt.addItem("Male");
		bt.addItem("Female");
		
		//btn1=new JRadioButton("Male");
		//btn2=new JRadioButton("Female");
		pn6=new JPanel();
		pn6.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn6.add(lb6);
		pn6a=new JPanel();
		pn6a.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn6a.add(txt9);
		//bt=new ButtonGroup();
		//bt.add(btn1);
		//bt.add(btn2);
		pn6b=new JPanel();
		pn6b.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn6b.add(bt);
	//	pn6b.add(btn1);
		//pn6b.add(btn2);
		
		lb7=new JLabel("Mobile Phone");
		txt10=new JTextField();
		txt10.setPreferredSize(new Dimension(100,20));
		pn7=new JPanel();
		pn7.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn7.add(lb7);
		pn7a=new JPanel();
		pn7a.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn7a.add(txt10);
		
		lb8=new JLabel("Your Current Email Address");
		txt11=new JTextField();
		txt11.setPreferredSize(new Dimension(100,20));
		pn8=new JPanel();
		pn8.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn8.add(lb8);
		pn8a=new JPanel();
		pn8a.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn8a.add(txt11);
		
		lb9=new JLabel("Prove you're not a robot ");
		btn3=new JCheckBox();
		lb10=new JLabel("Skip this Verification(phone verification may be required");
		pn9=new JPanel();
		pn9.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn9.add(lb9);
		pn9a=new JPanel();
		pn9a.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn9a.add(btn3);
		pn9a.add(lb10);
		
		lb13=new JLabel("Type the Text");
		txt12=new JTextField();
		txt12.setPreferredSize(new Dimension(100,20));
		pn13=new JPanel();
		pn13.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn13.add(lb13);
		pn13a=new JPanel();
		pn13a.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn13a.add(txt12);
		
		lb11=new JLabel("Location");
		//txt13=new JTextField();
		//txt13.setPreferredSize(new Dimension(100,20));
		pn10=new JPanel();
		pn10.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn10.add(lb11);
		//pn10a=new JPanel();
		//pn10a.setLayout(new FlowLayout(FlowLayout.LEADING));
		//pn10a.add(txt13);
		bt7=new JComboBox();
		/*bt7.addItem("INDIA");
		bt7.addItem("Pakistan");
		bt7.addItem("Israel");
		bt7.addItem("Australia");
		bt7.addItem("Russia");
		bt7.addItem("USA");
		bt7.addItem("United Kingdom");*/
		pn10b=new JPanel();
		pn10b.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn10b.add(bt7);
		
	   String d[]={"INDIA","PAKISTAN","AUSTRALIA"};
		//Scanner y=new Scanner(System.in);
		
			for(int i=0;i<3;i++)
		{
				bt7.addItem(d[i]);
		}
				
		btn4=new JCheckBox();
		lb12=new JLabel("I agree to Google terms of service and policies");
		pn11=new JPanel();
		pn11.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn11.add(btn4);
		pn11.add(lb12);
			
		btn5=new JButton("Sign Up");
		btn5.addActionListener(this);
		btn6=new JButton("Cancel");
		btn6.addActionListener(this);
		pn12=new JPanel();
		pn12.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn12.add(btn5);
		pn12.add(btn6);
		
	/*im= new BufferedImageIO.read(new File("C:\\Users\\USER\\Downloads\\Boss.jpg"));
		lb15=new JLabel("",im,JLabel.CENTER);
		pn15=new JPanel();
		//pn15.setLayout(new BorderLayout());
		pn15.add(lb15,BorderLayout.CENTER);*/
		
		
		lb14=new JLabel();
		pn16=new JPanel(new BorderLayout());
		//pn16.setLayout(new BorderLayout());
		hbr=new JScrollBar(SwingConstants.HORIZONTAL,50,10,0,100);
		vbr=new JScrollBar(SwingConstants.VERTICAL,50,10,0,100);
		vbr.setBlockIncrement(1);
		vbr.setUnitIncrement(1);
		
		hbr.addAdjustmentListener(this);
		vbr.addAdjustmentListener(this);
	
		pn16.add(lb14);
		pn16.add(hbr,BorderLayout.SOUTH);
		pn16.add(vbr,BorderLayout.EAST);
		pn16.add(lb14,BorderLayout.CENTER);
		
	/*	pn16=new JPanel();
		scroller=new JScrollPane(pn16);
		this.getContentPane().add(pn16);*/
		
			
		mpnl=new JPanel();
		mpnl.add(pn1);
		mpnl.add(pn);
	    mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn2);
		mpnl.add(pn2a);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn3);
		mpnl.add(pn3a);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn4);
		mpnl.add(pn4a);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn5);
		mpnl.add(pn5a);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn6);
		mpnl.add(pn6a);
		mpnl.add(pn6b);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn7);
		mpnl.add(pn7a);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn8);
		mpnl.add(pn8a);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn9);
		mpnl.add(pn9a);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn13);
		mpnl.add(pn13a);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn10);
		//mpnl.add(pn10a);
		mpnl.add(pn10b);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn11);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn12);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn16);
		//mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		
		JPanel container=new JPanel();
		container.add(mpnl);
		JScrollPane pane=new JScrollPane(container);
		pane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
				
		frm=new JFrame();
		frm.add(mpnl);
		
		frm.setTitle("Create your google Account");
		frm.setSize(450,1000);
		frm.setVisible(true);
		        
		//frm.getContentPane().add(pane,BorderLayout.CENTER);
		
		/*frm.getContentPane().add(lb14);
		frm.getContentPane().add(hbr,BorderLayout.SOUTH);
		frm.getContentPane().add(vbr,BorderLayout.EAST);
		frm.getContentPane().add(pn16,BorderLayout.CENTER);*/
		//frm.add(pane);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
   new pr78();
  	}


	@Override
	public void actionPerformed(ActionEvent f) {
		// TODO Auto-generated method stub
		if(f.getSource()==btn5){
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection t=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/ghost","root","");
			   String query="insert into raj values('Vijaya','Bhaskar','paulraj.bhaskar@gmail.com','samuvelpaulraj07','samuvelpaulraj07','JUN','14','1989','Male','909272911','spv.kutty@gmail.com','bhu999','INDIA')";
				java.sql.Statement s=t.createStatement();
				System.out.println("Sign up button is clicked");
				s.execute(query);
			}
			catch(Exception a){
				a.printStackTrace();
			}
			if(f.getSource()==btn5){
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/bhaskar","root","");
					String query="insert into sam values('User','samu')";
					java.sql.Statement st=con.createStatement();
					System.out.println("Submit button is clicked");
					st.execute(query); 
			}
				catch(Exception h){
					h.printStackTrace();
				}
				
			}
			
			if(f.getSource()==btn6){
				System.out.println("Cancel button is clicked");
			}
			/*else{
				System.out.println("nothing");
			}*/
		}
				
			
		}



	@Override
	public void adjustmentValueChanged(AdjustmentEvent i) {
		// TODO Auto-generated method stub
			
	/*	if(i.getSource()==vbr){
			//vbr.getValue();
			vbr.setBlockIncrement(1);
			vbr.setUnitIncrement(1);
			
		}*/
		//Object source=i.getSource();
		frm.setLocationRelativeTo(null);
		frm.repaint();
		
	}
		
	}
	


	

