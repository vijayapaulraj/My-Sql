import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.SelectionKey;
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
import javax.swing.JTextField;

import com.mysql.jdbc.Connection;


public class pr79 implements ActionListener {
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
	JPanel pn16=null;
	
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
	
	JPanel mpn=null;
	
	JPanel mpnl=null;
	JFrame frm=null;
	
	public  pr79() throws IOException
	{
		lb1=new JLabel("Name");
		txt1=new JTextField("First");
		txt2=new JTextField("last");
		txt1.setPreferredSize(new Dimension(100,20));
		txt2.setPreferredSize(new Dimension(100,20));
		pn1=new JPanel();
		pn1.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn1.setBackground(Color.BLUE);
		pn1.add(lb1);
		pn=new JPanel();
		pn.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn.setBackground(Color.BLUE);
		pn.add(txt1);
		pn.add(txt2);
				
		lb2=new JLabel("Choose your UserName");
		pn2=new JPanel();
		pn2.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn2.setBackground(Color.BLUE);
		pn2.add(lb2);
		txt3=new JTextField("\t"+"\t"+"\t"+"\t"+"@gmail.com");
		txt3.setPreferredSize(new Dimension(100,20));
		pn2a=new JPanel();
		pn2a.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn2a.setBackground(Color.BLUE);
		pn2a.add(txt3);
		
		lb3=new JLabel("Create a Password");
		txt4=new JTextField();
		txt4.setPreferredSize(new Dimension(100,20));
		pn3=new JPanel();
		pn3.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn3.setBackground(Color.BLUE);
		pn3.add(lb3);
		pn3a=new JPanel();
		pn3a.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn3a.setBackground(Color.BLUE);
		pn3a.add(txt4);
		
		lb4=new JLabel("Confirm Your Password");
		txt5=new JTextField();
		txt5.setPreferredSize(new Dimension(100,20));
		pn4=new JPanel();
		pn4.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn4.setBackground(Color.BLUE);
		pn4.add(lb4);
		pn4a=new JPanel();
		pn4a.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn4a.setBackground(Color.BLUE);
		pn4a.add(txt5);
		
		lb5=new JLabel("BirthDay");
	  // txt6=new JTextField("Month");
		//txt7=new JTextField("Day");
		//txt8=new JTextField("Year");
		//txt6.setPreferredSize(new Dimension(100,20));
		//txt7.setPreferredSize(new Dimension(100,20));
		//txt8.setPreferredSize(new Dimension(100,20));
	//	lb14=new JLabel(new ImageIcon(ImageIO.read(new File("E:\\FFOutput\\go.png"))));
		
		pn5=new JPanel();
		pn5.setLayout(new FlowLayout(FlowLayout.LEADING));
		//pn5.add(lb14);
		pn5.setBackground(Color.BLUE);
		pn5.add(lb5);
		bt8=new JComboBox();
		bt9=new JComboBox();
		bt10=new JComboBox();
		pn5a=new JPanel();
		pn5a.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn5a.setBackground(Color.BLUE);
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
		
		//int c[]={2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015};
		for(int i=2000;i<2015;i++){
			bt10.addItem(i);
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
		pn6.setBackground(Color.BLUE);
		pn6.add(lb6);
		pn6a=new JPanel();
		pn6a.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn6a.setBackground(Color.BLUE);
		pn6a.add(txt9);
		//bt=new ButtonGroup();
		//bt.add(btn1);
		//bt.add(btn2);
		pn6b=new JPanel();
		pn6b.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn6b.setBackground(Color.BLUE);
		pn6b.add(bt);
	//	pn6b.add(btn1);
		//pn6b.add(btn2);
		
		lb7=new JLabel("Mobile Phone");
		txt10=new JTextField();
		txt10.setPreferredSize(new Dimension(100,20));
		pn7=new JPanel();
		pn7.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn7.setBackground(Color.BLUE);
		pn7.add(lb7);
		pn7a=new JPanel();
		pn7a.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn7a.setBackground(Color.BLUE);
		pn7a.add(txt10);
		
		lb8=new JLabel("Your Current Email Address");
		txt11=new JTextField();
		txt11.setPreferredSize(new Dimension(100,20));
		pn8=new JPanel();
		pn8.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn8.setBackground(Color.BLUE);
		pn8.add(lb8);
		pn8a=new JPanel();
		pn8a.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn8a.setBackground(Color.BLUE);
		pn8a.add(txt11);
		
		lb9=new JLabel("Prove you're not a robot ");
		btn3=new JCheckBox();
		lb10=new JLabel("Skip this Verification(phone verification may be required");
		pn9=new JPanel();
		pn9.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn9.setBackground(Color.BLUE);
		pn9.add(lb9);
		pn9a=new JPanel();
		pn9a.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn9a.setBackground(Color.BLUE);
		pn9a.add(btn3);
		pn9a.add(lb10);
		
		lb13=new JLabel("Type the Text");
		txt12=new JTextField();
		txt12.setPreferredSize(new Dimension(100,20));
		pn13=new JPanel();
		pn13.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn13.setBackground(Color.BLUE);
		pn13.add(lb13);
		pn13a=new JPanel();
		pn13a.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn13a.setBackground(Color.BLUE);
		pn13a.add(txt12);
		
		lb11=new JLabel("Location");
		//txt13=new JTextField();
		//txt13.setPreferredSize(new Dimension(100,20));
		pn10=new JPanel();
		pn10.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn10.setBackground(Color.BLUE);
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
		pn10b.setBackground(Color.BLUE);
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
		pn11.setBackground(Color.BLUE);
		pn11.add(btn4);
		pn11.add(lb12);
			
		btn5=new JButton("Sign Up");
		btn5.addActionListener(this);
		btn6=new JButton("Cancel");
		btn6.addActionListener(this);
		pn12=new JPanel();
		pn12.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn12.setBackground(Color.BLUE);
		pn12.add(btn5);
		pn12.add(btn6);
		
	/*im= new BufferedImageIO.read(new File("C:\\Users\\USER\\Downloads\\Boss.jpg"));
		lb15=new JLabel("",im,JLabel.CENTER);
		pn15=new JPanel();
		//pn15.setLayout(new BorderLayout());
		pn15.add(lb15,BorderLayout.CENTER);*/
		
		/*lb14=new JLabel();
		setLayout(new BorderLayout());
		hbr=new JScrollBar(JScrollBar.HORIZONTAL,30,20,0,200);
		vbr=new JScrollBar(JScrollBar.VERTICAL,30,40,0,200);
	
		add(hbar,BorderLayout.SOUTH);*/
		
		/*pn13=new JPanel();
		lb13=new JLabel();
		lb13.*/
    	lb14=new JLabel(new ImageIcon(ImageIO.read(new File("E:\\FFOutput\\go.png"))));
		pn16=new JPanel();
		pn16.setLayout(new FlowLayout(FlowLayout.CENTER));
		pn.setBackground(Color.BLUE);
		pn16.add(lb14);
		mpn=new JPanel();
		mpn.setBackground(Color.BLUE);
		mpn.add(pn16);
		mpn.setLayout(new BoxLayout(mpn,BoxLayout.Y_AXIS));
		
		
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
		//mpnl.add(pn15);
		//mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		
		Toolkit tk  = Toolkit.getDefaultToolkit();
		  Image   titleIcon = tk.getImage("E:\\FFOutput\\go.png");
		  
		frm=new JFrame();
		frm.setBackground(Color.blue);
		//frm.add(mpnl);
		frm.setTitle("Create your google Account");
		frm.setSize(450,400);
		frm.setVisible(true);
		frm.setIconImage(titleIcon);
		frm.add(mpn);
		frm.add(mpnl,"East");
		//frm.getContentPane().add(mpnl,"East");
		//frm.setContentPane(new JLabel(new ImageIcon("E:\\FFOutput\\go.png")));
	//	frm.getContentPane().setBackground(Color.blue);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*frm.setLocationRelativeTo(null);
		JLabel background=new JLabel(new ImageIcon("C:\\Users\\USER\\Downloads\\raj.png"));
		frm.add(background);
		background.setLayout(new FlowLayout());
		background.add(mpnl);*/
		
		
	}
	


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   new pr79();
   	}


	@Override
	public void actionPerformed(ActionEvent f) {
		// TODO Auto-generated method stub
		if(f.getSource()==btn5){
			
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection t=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/ghost","root","");
			   String query="insert into raj values('thamarai','Rajini','fggtt','qwwwd','fddeu','Mar','31','1945','female','9092729113','drdhd','sd','Aust')";
			  // int num =Integer.parseInt("9092729113");
			   Connection w=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/bhaskar","root","");
				String r="insert into sam values('Raju','gdedj')";
			   java.sql.Statement s=t.createStatement();
			   java.sql.Statement y=w.createStatement();
				System.out.println("Sign up button is clicked");
			  s.execute(query);
			// s.execute("SELECT Location, Date FROM raj WHERE Gender='female'");
			  // s.execute("Truncate raj");
			   //y.execute("Truncate sam");
				y.execute(r);
			}
			catch(Exception a){
				a.printStackTrace();
			}
		}	
			else if(f.getSource()==btn6){
				System.out.println("Cancel button is clicked");
			}
			
					
	
			}
	}	
	
