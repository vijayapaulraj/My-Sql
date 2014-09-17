import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.PaintEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class pr82 extends JComponent implements ActionListener   {
	JButton bt1=null;
	JButton bt2=null;
	JButton bt3=null;
	JButton bt4=null;
	JPanel pn1=null;
	JPanel pn2=null;
	
	JPanel mpnl=null;
	JFrame frm1=null;
	
	public void add(){
		bt1=new JButton("Insert");
		bt2=new JButton("SELECT");
		pn1=new JPanel();
		pn1.setLayout(new FlowLayout(FlowLayout.TRAILING)); 
		pn1.add(bt1);
		pn1.add(bt2);
		
		bt3=new JButton("Update");
		bt4=new JButton("Delete");
		pn2=new JPanel();
		pn2.setLayout(new FlowLayout(FlowLayout.TRAILING));
		pn2.add(bt3);
		pn2.add(bt4);
		
		mpnl=new JPanel();
		mpnl.add(pn1);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.X_AXIS));
		mpnl.add(pn2);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.X_AXIS));
		
		frm1=new JFrame();
		//frm1.setLayout(new GridBagLayout());
		frm1.add(mpnl);
		frm1.setTitle("Database");
		frm1.getContentPane().setBackground(Color.blue);
		frm1.getContentPane().add(new pain());
		//frm1.setBackground(Color.blue);
		frm1.setSize(150,150);
		frm1.setVisible(true);
		frm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pr82 bhaskar=new pr82();
		bhaskar.add();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	//	if(e.getSource()=)
		
	}

}
