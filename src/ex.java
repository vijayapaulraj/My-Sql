import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ex {
	
    	JLabel lb1=null;
		JTextField tx1=null;
		JPanel pn1=null;
		
		JLabel lb2=null;
		JTextField tx2=null;
		JPanel pn2=null;
		
		JTextField tx3=null;
		
		JLabel lb3=null;
		JLabel lb4=null;
		JLabel lb5=null;
		JLabel lb6=null;
		JLabel lb7=null;
		JLabel lb8=null;
		JLabel lb9=null;
		JLabel lb10=null;
		
		JPanel pn3=null;
		JPanel pn4=null;
		JPanel pn5=null;
		JPanel pn6=null;
		JPanel pn7=null;
		JPanel pn8=null;
		JPanel pn9=null;
		JPanel pn10=null;
		JPanel pn11=null;
		
		
		
		JPanel mpnl=null;
		JFrame frm=null;
		
		Container a=null;
		
		public ex(){


			lb1=new JLabel("Username");
			tx1=new JTextField();
			tx1.setPreferredSize(new Dimension(100,20));
			pn1=new JPanel();
			pn1.setLayout(new FlowLayout(FlowLayout.LEFT));
			pn1.add(lb1);
			pn1.add(tx1);
		//	lb1.setAlignmentX(Component.LEFT_ALIGNMENT);
			//tx1.setAlignmentX(Component.LEFT_ALIGNMENT);
			
			
			lb2=new JLabel("Password");
			tx2=new JTextField();
			tx2.setPreferredSize(new Dimension(100,20));
			pn2=new JPanel();
			pn2.setLayout(new FlowLayout(FlowLayout.LEFT));
			pn2.add(lb2);
			pn2.add(tx2);
			//lb2.setAlignmentX(Component.RIGHT_ALIGNMENT);
			//tx2.setAlignmentX(Component.RIGHT_ALIGNMENT);
			
			lb3=new JLabel("10000");
			pn3=new JPanel();
			pn3.setLayout(new FlowLayout(FlowLayout.RIGHT));
			pn3.add(lb3);
			
	        tx3=new JTextField("The text is here to rule the world");
	        tx3.setPreferredSize(new Dimension(1000,20));
	        pn10=new JPanel();
	        pn10.setLayout(new FlowLayout(FlowLayout.LEFT));
	        pn10.add(tx3);
			
			
			lb4=new JLabel("5000");
			pn4=new JPanel();
			pn4.setLayout(new FlowLayout(FlowLayout.RIGHT));
			pn4.add(lb4);
			
			lb5=new JLabel("4000");
			pn5=new JPanel();
			pn5.setLayout(new FlowLayout(FlowLayout.RIGHT));
			pn5.add(lb5);
			
			lb6=new JLabel("3000");
			pn6=new JPanel();
			pn6.setLayout(new FlowLayout(FlowLayout.RIGHT));
			pn6.add(lb6);
			
			lb7=new JLabel("2000");
			pn7=new JPanel();
			pn7.setLayout(new FlowLayout(FlowLayout.RIGHT));
			pn7.add(lb7);
			
			lb8=new JLabel("1000");
			pn8=new JPanel();
			pn8.setLayout(new FlowLayout(FlowLayout.RIGHT));
			pn8.add(lb8);
			
			
			
			lb9=new JLabel("500");
			pn9=new JPanel();
			pn9.setLayout(new FlowLayout(FlowLayout.RIGHT));
			pn9.add(lb9);
			
			mpnl=new JPanel();
		
            mpnl.add(pn1);
        	mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.X_AXIS));
            
            mpnl.add(pn2);
            mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.X_AXIS));
            
            mpnl.add(pn3);
            mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.Y_AXIS));
            
            mpnl.add(pn10);
            mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.Y_AXIS));
            
            
            mpnl.add(pn4);
            mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.Y_AXIS));
            
            mpnl.add(pn5);
            mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.Y_AXIS));
            
            mpnl.add(pn6);
            mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.Y_AXIS));
            
            mpnl.add(pn7);
            mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.Y_AXIS));
            
            mpnl.add(pn8);
            mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.Y_AXIS));
            
            mpnl.add(pn9);
            mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.Y_AXIS));
            
            Color c=new Color(255,255,0);
            frm=new JFrame();
          //  frm.setForeground(Color.BLUE);
            //Container a=frm.getContentPane();
          // a.setBackground(Color.BLUE);
           
           // frm.getContentPane().setBackground(Color.BLUE);
            frm.getContentPane().add(mpnl);
            frm.setBackground(Color.blue);
            frm.setSize(300,300);
           // frm.setContentPane(new JLabel(new ImageIcon("E://FFOutput//KBC1.png")));
            frm.setVisible(true);
            frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
                     
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          new ex();
	}

}
