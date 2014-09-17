import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class quiz implements ActionListener {
	JLabel lb1=null;
	JLabel lb2=null;
	JPanel pn1=null;
	JPanel pn2=null;
	JTextField tx1=null;
	JTextField tx2=null;
	
	JRadioButton bt1=null;
	JRadioButton bt2=null;
	JRadioButton bt3=null;
	JRadioButton bt4=null;
	
	ButtonGroup bt=null;
	JPanel pn3=null;
	JLabel lb3=null;
	JPanel pn4=null;
	
	int i=0;
	int q=1;
	String A,B,C,D;
	
	JPanel mpnl=null;
	JFrame frm=null;
	
	public quiz(){
		lb1=new JLabel("1"+".Who is the Prime Minister of India ?");
		//tx1.setPreferredSize(new Dimension(200,30));
		pn1=new JPanel();
		pn1.setLayout(new FlowLayout(FlowLayout.LEFT));
		pn1.add(lb1);
		
		bt1=new JRadioButton(A+"Amith Shah");
	    bt1.addActionListener(this);
		bt2=new JRadioButton(B+"Advani");
		bt2.addActionListener(this);
		bt3=new JRadioButton(C+"Narender Modi");
		bt3.addActionListener(this);
		bt4=new JRadioButton(D+"Amarnath");
		bt4.addActionListener(this);
		ButtonGroup bt=new ButtonGroup();
		bt.add(bt1);
		bt.add(bt2);
		bt.add(bt3);
		bt.add(bt4);
		pn2=new JPanel();
		pn2.setLayout(new FlowLayout(FlowLayout.LEFT));
		pn2.add(bt1);
		pn2.add(bt2);
		pn2.add(bt3);
		pn2.add(bt4);
		
		lb2=new JLabel("Question No."+q);
		pn3=new JPanel();
		pn3.setLayout(new FlowLayout(FlowLayout.LEFT));
		pn3.add(lb2);
		
		
		mpnl=new JPanel();
		mpnl.add(pn3);
		mpnl.add(pn1);
		//mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn2);
		//mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		
		frm=new JFrame();
		frm.add(mpnl);
		frm.setBackground(Color.BLUE);
		frm.setSize(200,200);
		frm.setVisible(true);
		frm.setTitle("Question Page");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new quiz();
		
		/*HashMap hm=new HashMap();
		hm.put(1,"C");
	
		System.out.println(hm.get(1));	
	
		JOptionPane.showMessageDialog(null,"Answer is correct","Correct",JOptionPane.OK_OPTION);
		}		
	}*/
	}
	@Override
	public void actionPerformed(ActionEvent t) {
		// TODO Auto-generated method stub
			
	/*	if(t.getSource()==bt1){
			HashMap hm=new HashMap();
			hm.put(1,"C");
			hm.put(2,"B");
			//String a[]=new String[3];
			
				if(hm.get(1)==q){
					JOptionPane.showMessageDialog(null,"Correct","Questions",JOptionPane.PLAIN_MESSAGE);
				
				}
			}

		
		else if(t.getSource()==bt2){
			HashMap hm=new HashMap();
			hm.put(1,"C");
			hm.put(2,"B");
					
				if(hm.get(1).toString().equalsIgnoreCase(q)){
					JOptionPane.showMessageDialog(null,"Correct","Questions",JOptionPane.PLAIN_MESSAGE);
		
			}
		}
		else if(t.getSource()==bt3){
			HashMap g=new HashMap();
			g.put(1,"C");
			g.put(2,"B");
			
				if(g.get(1).toString().equalsIgnoreCase(q)){
					JOptionPane.showMessageDialog(null,"Correct","Questions",JOptionPane.PLAIN_MESSAGE);
		
			}
		}
		else if(t.getSource()==bt4){
			HashMap s=new HashMap();
			s.put(1,"C");
			s.put(2,"B");
					
			if(s.get(1).toString().equalsIgnoreCase(Q)){
					JOptionPane.showMessageDialog(null,"Correct","Questions",JOptionPane.PLAIN_MESSAGE);
		
	
			
		}
	}
	}*/
}
}
			
