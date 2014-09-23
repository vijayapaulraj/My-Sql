import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Timer;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class pr89 extends Thread implements ActionListener  {
	JLabel lb1=null;
	JTextField tx1=null;
	JPanel pn1=null;
	
	JLabel lb2=null;
	JTextField tx2=null;
	JPanel pn2=null;
	
	JButton bt1=null;
	JButton bt2=null;
	JPanel pn3=null;
	
	JLabel lb3=null;
	JPanel pn4=null;
	
	JLabel lb4=null;
	JPanel pn5=null;
	
	
	JPanel mpnl=null;
	JFrame frm=null;
	ImageIcon im=null;
	Image ii=null;
	Dimension dm=null;
	Timer ty1=null;
	int x; 
	
	public void add() throws InterruptedException{
		lb1=new JLabel("WELCOME TO KBC GAME");
		lb1.setFont(new Font("Times New Roman",Font.BOLD,20));
		pn1=new JPanel();
		pn1.setLayout(new FlowLayout(FlowLayout.CENTER));
		pn1.setBackground(Color.blue);
		pn1.add(lb1);
		
		Toolkit tk=Toolkit.getDefaultToolkit();
		Image ty=tk.getImage("C:\\Users\\USER\\Downloads\\KBClogo.png");
			
		frm=new JFrame();
		frm.add(pn1);
		frm.setBackground(Color.blue);
		frm.setContentPane(new JLabel(new ImageIcon("C:\\Users\\USER\\Downloads\\KBClogo.png")));
		//frm.getContentPane().add(new pain());
		frm.setSize(200,200);
		frm.setVisible(true);
		frm.setTitle("Welcome Page");
		frm.setIconImage(ty);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								
		}
		
	//long start = System.currentTimeMillis();
	public void run(){
		 
		try{
			Thread.sleep(10000);
		lb1=new JLabel ("Username");
	//	lb1.setForeground(Color.white);
		tx1=new JTextField();
		tx1.setPreferredSize(new Dimension(100,20));
		pn1=new JPanel();
		pn1.setLayout(new FlowLayout(FlowLayout.CENTER));
		pn1.setBackground(Color.blue);
		pn1.add(lb1);
		pn1.add(tx1);
		
		lb2=new JLabel("Password");
		tx2=new JTextField();
		tx2.setPreferredSize(new Dimension(100,20));
		pn2=new JPanel();
		pn2.setLayout(new FlowLayout(FlowLayout.CENTER));
		pn2.setBackground(Color.blue);
		pn2.add(lb2);
		pn2.add(tx2);
		
		bt1=new JButton("Submit");
		bt1.addActionListener(this);
		bt2=new JButton("Cancel");
		bt2.addActionListener(this);
		pn3=new JPanel();
		pn3.setLayout(new FlowLayout(FlowLayout.CENTER));
		pn3.setBackground(Color.blue);
		pn3.add(bt1);
		pn3.add(bt2);
		
	/*	lb3=new JLabel();
		lb3.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\KBC.jpeg"));
		pn4=new JPanel();
		pn4.setLayout(new FlowLayout(FlowLayout.CENTER));
		pn4.setBackground(Color.blue);
		pn4.add(lb3);*/
		
		mpnl=new JPanel();
		mpnl.add(pn1);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn2);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn3);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		//mpnl.add(pn4);
	//	mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		Toolkit tk=Toolkit.getDefaultToolkit();
		Image ty=tk.getImage("C:\\Users\\USER\\Downloads\\KBClogo.png");
			
		
		
		
		frm=new JFrame();
		//frm.add(mpnl);
		frm.setBackground(Color.blue);
		frm.setTitle("Login");
		frm.setSize(300,300);
		frm.setVisible(true);
		frm.setIconImage(ty);
					
	  frm.setLayout(new GridBagLayout());
	    //frm.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\USER\\Downloads\\raj.png")))));
		frm.setContentPane(new JLabel(new ImageIcon("C:\\Users\\USER\\Downloads\\KBClogo.png")));
		frm.setResizable(true);
		frm.getContentPane().add(mpnl,"West");
	   frm. setLayout(new FlowLayout());
	 //   frm.add(mpnl,new GridBagConstraints());
	    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*frm.setLayout(new BorderLayout());
		frm.setLocationRelativeTo(null);
		JLabel background=new JLabel(new ImageIcon("C:\\Users\\USER\\Downloads\\raj.png"));
		frm.add(background);
		background.setLayout(new FlowLayout());
		background.add(mpnl);*/
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
	
	}
	
	public void wel() throws InterruptedException{
		{
	
		lb1=new JLabel("Welcome to the KBC game");
		lb1.setFont(new Font("Times New Roman",Font.BOLD,50));
		pn1=new JPanel();
		pn1.setLayout(new FlowLayout(FlowLayout.CENTER));
		pn1.setBackground(Color.blue);
		pn1.add(lb1);
		
		lb2=new JLabel("The Rules are Simple");
		lb2.setFont(new Font("Times New Roman",Font.BOLD,20));
		pn2=new JPanel();
		pn2.setLayout(new FlowLayout(FlowLayout.CENTER));
		pn2.setBackground(Color.blue);
		pn2.add(lb2);
				
		lb3=new JLabel("1.Total 10 Questions");
		lb3.setFont(new Font("Times New Roman",Font.BOLD,20));
		pn3=new JPanel();
		pn3.setLayout(new FlowLayout(FlowLayout.CENTER));
		pn3.setBackground(Color.blue);
		pn3.add(lb3);
		
		lb4=new JLabel("2.Each Questions Carry Rs.5000");
		lb4.setFont(new Font("Times New Roman",Font.BOLD,20));
		pn4=new JPanel();
		pn4.setLayout(new FlowLayout(FlowLayout.CENTER));
		pn4.setBackground(Color.blue);
		pn4.add(lb4);
		
				
		mpnl=new JPanel();
		mpnl.add(pn1);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn2);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn3);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn4);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		
		Toolkit tk=Toolkit.getDefaultToolkit();
		Image ty=tk.getImage("C:\\Users\\USER\\Downloads\\KBClogo.png");
			
		frm=new JFrame();
		
		frm.add(mpnl);
		frm.setTitle("Welcome page");
		frm.setBackground(Color.blue);
		frm.setVisible(true);
		frm.setSize(200,200);
		frm.setIconImage(ty);
		frm.setLayout(new GridBagLayout());
	    frm.setContentPane(new JLabel(new ImageIcon("C:\\Users\\USER\\Downloads\\KBClogo.png")));
	    frm.setLayout(new FlowLayout());
	    frm.add(mpnl,new GridBagConstraints());
	    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	
	    try {
			Thread.sleep(5000);
			frm.getContentPane().add(frm,new qu1());
			frm.dispose();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		pr89 bha=new pr89();
		bha.add();
		Thread t=new Thread(new pr89());
		t.start();
		try{
			File sound = new File("E://FFOutput//KBC.wav");
			AudioInputStream audio = AudioSystem.getAudioInputStream(sound);
			Clip clip = AudioSystem.getClip();
	         clip.open(audio);
	        clip.start();
	        clip.loop(1);
			}
			catch(Exception  e)
			{
				e.printStackTrace();
			}
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent i) {
		// TODO Auto-generated method stub
		if(i.getSource()==bt1){
			frm.dispose();
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/guru","root","");
				java.sql.Statement r=con.createStatement();
				ResultSet rs=r.executeQuery("select * from pure where Username='"+tx1.getText()+"'and Password='"+tx2.getText()+"'");
				String uname="",pass="";
				if(rs.next())
				{
				uname=rs.getString("Username");
				pass=rs.getString("Password");
			    }
				if(tx1.getText().equals(uname)&&tx2.getText().equals(pass)){
					System.out.println("login successfull");
					pr89 dr=new pr89();
					dr.wel();
					}

					else
					{

					JOptionPane.showMessageDialog(null,"Incorrect login or password","Error",JOptionPane.ERROR_MESSAGE);
				}
		}
			catch(Exception e){
				e.printStackTrace();
			}
		
	}

}
	
	}