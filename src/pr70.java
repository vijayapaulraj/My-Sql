import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class pr70 extends JApplet implements ActionListener{
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
	JScrollPane sc=null;
	
	public pr70()
	{
		lbl1=new JLabel("UserName");
	   txt1=new JTextField();
		txt1.setPreferredSize(new Dimension(100,20));
		//sc=new JScrollPane(txt1);
			//sc.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

				//JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		pnl1=new JPanel();
		pnl1.setLayout( new FlowLayout(FlowLayout.CENTER));
		//pnl1.add(sc);
		pnl1.add(lbl1);
		pnl1.add(txt1);
		
		lbl2=new JLabel("Password");
		txt2=new JTextField();
		txt2.setPreferredSize(new Dimension(100,20));
	//	sc=new JScrollPane(txt2);
		//sc.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		//JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		pnl2=new JPanel();
		pnl2.setLayout( new FlowLayout(FlowLayout.CENTER));
		//pnl2.add(sc);
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
     	mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pnl2);
		mpnl.add(pnl3);
		//JScrollPane sc=new JScrollPane(mpnl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		
		
		//frm.add(mpnl);
		this.getContentPane().add(mpnl,"East");
		this.setSize(250,250);
		this.setVisible(true);
		//frm.add(sc);
		
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
