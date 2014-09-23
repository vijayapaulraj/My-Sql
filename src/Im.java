import java.awt.FlowLayout;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Im {
	JFrame frm=null;
	JLabel lb1=null;
	JLabel lb2=null;
	JPanel pn1=null;
	JPanel pn2=null;
	
	JPanel mpnl=null;
			
	public Im() throws IOException{
		
		lb1=new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\USER\\Downloads\\KBC1.jpg"))));
		lb2=new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\USER\\Downloads\\Boss.jpg"))));
		pn1=new JPanel();
		pn1.setLayout(new FlowLayout(FlowLayout.LEFT));
		pn1.add(lb1);
		
		pn2=new JPanel();
		pn2.setLayout(new FlowLayout(FlowLayout.LEFT));
		pn2.add(lb2);
		
		mpnl=new JPanel();
		mpnl.add(pn1);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn2);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		
		
		
		
		frm=new JFrame();
		//frm.add(pn1);
		//frm.add(pn2);
		frm.add(mpnl);
	/*	try{
			frm.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\USER\\Downloads\\Boss.jpg")))));
			frm.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\USER\\Downloads\\KBC1.jpg")))));
		}
		catch(Exception o){
			o.printStackTrace();
		}*/
		frm.setVisible(true);
		frm.setSize(100,100);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new Im();

	}

}
