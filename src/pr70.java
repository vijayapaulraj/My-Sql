import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class pr70 implements ActionListener{
	JLabel lbl1=null;
	JTextField txt1=null;
	JPanel pnl1=null;
	
	JLabel lbl2=null;
	JTextField txt2=null;
	JPanel pnl2=null;
	JLabel lbl3=null;
	
	JButton btn1=null;
	JButton btn2=null;
	JPanel pnl3=null;
	
	JPanel mpnl=null;
	JFrame frm=null;
	
	public pr70()
	{
		lbl1=new JLabel("UserName");
	   txt1=new JTextField();
		txt1.setPreferredSize(new Dimension(100,20));
		pnl1=new JPanel();
		pnl1.add(lbl1);
		pnl1.add(txt1);
		
		lbl2=new JLabel("Password");
		txt2=new JTextField();
		txt2.setPreferredSize(new Dimension(100,20));
		pnl2=new JPanel();
		pnl2.add(lbl2);
		pnl2.add(txt2);
		
		btn1=new JButton("Submit");
		btn1.addActionListener(this);
		btn2=new JButton("Cancel");
		btn2.addActionListener(this);
		pnl3=new JPanel();
		pnl3.add(btn1);
		pnl3.add(btn2);
		
		mpnl=new JPanel();
		mpnl.add(pnl1);
		mpnl.add(pnl2);
		mpnl.add(pnl3);
		
		frm=new JFrame();
		frm.add(mpnl);
		frm.setTitle("Login");
		frm.setSize(250,250);
		frm.setVisible(true);
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		new pr70();

	}

		@Override
		public void actionPerformed(ActionEvent a) {
			// TODO Auto-generated method stub
			if(a.getSource()==btn1)
			{
				System.out.println("hello submit button is clicked");
			}
			
			else if(a.getSource()==btn2)
			{
				System.out.println("btn2 cancel is clicked");
			}
			
		}

}
