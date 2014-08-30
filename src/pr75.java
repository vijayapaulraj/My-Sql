import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class pr75 	 {
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
	JTextField txt6=null;
	JTextField txt7=null;
	JTextField txt8=null;
	JPanel pn5=null;
	JPanel pn5a=null;
	
	JLabel lb6=null;
	JTextField txt9=null;
	JRadioButton btn1=null;
	JRadioButton btn2=null;
	ButtonGroup bt=null;
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
	JPanel pn10=null;
	JPanel pn10a=null;
	
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
		
	JPanel mpnl=null;
	JFrame frm=null;
	
	public  pr75()
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
		txt6=new JTextField("Month");
		txt7=new JTextField("Day");
		txt8=new JTextField("Year");
		txt6.setPreferredSize(new Dimension(100,20));
		txt7.setPreferredSize(new Dimension(100,20));
		txt8.setPreferredSize(new Dimension(100,20));
		pn5=new JPanel();
		pn5.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn5.add(lb5);
		pn5a=new JPanel();
		pn5a.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn5a.add(txt6);
		pn5a.add(txt7);
		pn5a.add(txt8);
				
		lb6=new JLabel("Gender");
		txt9=new JTextField("I am");
		txt9.setPreferredSize(new Dimension(100,20));
		btn1=new JRadioButton("Male");
		btn2=new JRadioButton("Female");
		pn6=new JPanel();
		pn6.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn6.add(lb6);
		pn6a=new JPanel();
		pn6a.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn6a.add(txt9);
		bt=new ButtonGroup();
		bt.add(btn1);
		bt.add(btn2);
		pn6b=new JPanel();
		pn6b.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn6b.add(btn1);
		pn6b.add(btn2);
		
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
		txt13=new JTextField();
		txt13.setPreferredSize(new Dimension(100,20));
		pn10=new JPanel();
		pn10.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn10.add(lb11);
		pn10a=new JPanel();
		pn10a.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn10a.add(txt13);
		
		btn4=new JCheckBox();
		lb12=new JLabel("I agree to Google terms of service and policies");
		pn11=new JPanel();
		pn11.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn11.add(btn4);
		pn11.add(lb12);
			
		btn5=new JButton("Sign Up");
		btn6=new JButton("Cancel");
		pn12=new JPanel();
		pn12.setLayout(new FlowLayout(FlowLayout.LEADING));
		pn12.add(btn5);
		pn12.add(btn6);
		
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
		mpnl.add(pn10a);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn11);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn12);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		
		
		frm=new JFrame();
		frm.add(mpnl);
		frm.setTitle("Create your google Account");
		frm.setSize(300,300);
		frm.setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new pr75();
		
	}

}
