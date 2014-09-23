import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class pr71 {
	
	JLabel lb1=null;
	JTextField txt1=null;
	JTextField txt=null;
	JPanel pn1=null;
	
	JLabel lb2=null;
	JTextField txt2=null;
	JPanel pn2=null;
	
	JLabel lb3=null;
	JTextField txt3=null;
	JPanel pn3=null;
	
	JLabel lb4=null;
	JTextField txt4=null;
	JPanel pn4=null;
	
	JLabel lb5=null;
	JTextField txt5=null;
	JTextField txt6=null;
	JTextField txt7=null;
	JPanel pn5=null;
	
	JLabel lb6=null;
	JTextField txt8=null;
	JRadioButton btn1=null;
	JRadioButton btn2=null;
	JPanel pn6=null;
	
	JLabel lb7=null;
	JTextField txt9=null;
	JPanel pn7=null;
	
	JLabel lb8=null;
	JTextField txt10=null;
	JPanel pn8=null;
	
	JLabel lb9=null;
	JCheckBox btn3=null;
	JLabel lb10=null;
	JPanel pn9=null;
	
	JLabel lb11=null;
	JTextField txt11=null;
	JPanel pn10=null;
	
	JLabel lb12=null;
	JTextField txt12=null;
	JPanel pn11=null;
	
	JLabel lb13=null;
	JCheckBox btn4=null;
	JPanel pn12=null;
	
	JButton btn5=null;
	JButton btn6=null;
	JPanel pn13=null;
	
	JPanel mpnl=null;
	JFrame frm=null;
	
	public pr71()
	{
		
		lb1=new JLabel("Name");
		txt1=new JTextField("First");
		txt=new JTextField("last");
		txt1.setPreferredSize(new Dimension(200,20));
		txt.setPreferredSize(new Dimension(200,20));
		pn1=new JPanel();
		pn1.add(lb1);
		pn1.add(txt1);
		pn1.add(txt);

		
		lb2=new JLabel("Choose your UserName");
		txt2=new JTextField("\t"+"@gmail.com");
		txt2.setPreferredSize(new Dimension(500,20));
		pn2=new JPanel();
		pn2.add(lb2);
		pn2.add(txt2);
		
		lb3=new JLabel("Create a Password");
		txt3=new JTextField();
		txt3.setPreferredSize(new Dimension(300,20));
		pn3=new JPanel();
		pn3.add(lb3);
		pn3.add(txt3);
		
		lb4=new JLabel("Confirm Your Password");
		txt4=new JTextField();
		txt4.setPreferredSize(new Dimension(300,20));
		pn4=new JPanel();
		pn4.add(lb4);
		pn4.add(txt4);
		
		lb5=new JLabel("BirthDay");
		txt5=new JTextField();
		txt6=new JTextField();
		txt7=new JTextField();
		txt5.setPreferredSize(new Dimension(100,20));
		txt6.setPreferredSize(new Dimension(100,20));
		txt7.setPreferredSize(new Dimension(100,20));
		pn5=new JPanel();
		pn5.add(lb5);
		pn5.add(txt5);
		pn5.add(txt6);
		pn5.add(txt7);
		
		
		lb6=new JLabel("Gender");
		txt8=new JTextField("I am");
		txt8.setPreferredSize(new Dimension(300,20));
		btn1=new JRadioButton("Male");
		btn2=new JRadioButton("Female");
		pn6=new JPanel();
		pn6.add(lb6);
		pn6.add(txt8);
		pn6.add(btn1);
		pn6.add(btn2);
		
		lb7=new JLabel("Mobile Phone");
		txt9=new JTextField();
		txt9.setPreferredSize(new Dimension(300,20));
		pn7=new JPanel();
		pn7.add(lb7);
		pn7.add(txt9);
		
		lb8=new JLabel("Your Current Email Address");
		txt10=new JTextField();
		txt10.setPreferredSize(new Dimension(300,20));
		pn8=new JPanel();
		pn8.add(lb8);
		pn8.add(txt10);
		
		lb9=new JLabel("Prove you're not a robot ");
		btn3=new JCheckBox();
		lb10=new JLabel("Skip this Verification(phone verification may be required");
		pn9=new JPanel();
		pn9.add(lb9);
		pn9.add(btn3);
		pn9.add(lb10);
		
		lb11=new JLabel("Location");
		txt11=new JTextField();
		txt11.setPreferredSize(new Dimension(300,20));
		pn10=new JPanel();
		pn10.add(lb11);
		pn10.add(txt11);
		
		btn4=new JCheckBox();
		lb12=new JLabel("I agree to Google terms of service and policies");
		pn11=new JPanel();
		pn11.add(btn4);
		pn11.add(lb12);
		
		btn5=new JButton("Sign Up");
		btn6=new JButton("Cancel");
		pn12=new JPanel();
		pn12.add(btn5);
		pn12.add(btn6);
		
		mpnl=new JPanel();
		mpnl.add(pn1);
		mpnl.add(pn2);
		mpnl.add(pn3);
		mpnl.add(pn4);
		mpnl.add(pn5);
		mpnl.add(pn6);
		mpnl.add(pn7);
		mpnl.add(pn8);
		mpnl.add(pn9);
		mpnl.add(pn10);
		mpnl.add(pn11);
		mpnl.add(pn12);
		
		frm=new JFrame();
		frm.getContentPane().add(mpnl,"East");
		frm.setTitle("Create your google Account");
		frm.setSize(500,500);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new pr71();

	}

}
