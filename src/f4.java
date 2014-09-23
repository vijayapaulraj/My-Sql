import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;


public class f4 implements ActionListener{
	JLabel lb1=null;
	JTextField tx1=null;
	JTextField tx2=null;
	JButton bt1=null;
	JButton bt2=null;
	JButton bt3=null;
	JButton bt4=null;
	JPanel pn1=null;
	JPanel pn2=null;
	JPanel pn3=null;
	JPanel pn4=null;
	
	JFileChooser f=null;
	FileNameExtensionFilter fr=null;
	
	JPanel mpnl=null;
	JFrame frm=null;
	
	public f4(){
		lb1=new JLabel("Select file for reading");
		pn1=new JPanel();
		pn1.setLayout(new FlowLayout(FlowLayout.LEFT));
		pn1.add(lb1);
		
		tx1=new JTextField();
		tx1.setPreferredSize(new Dimension(100,20));
		bt1=new JButton("Browse");
		bt1.addActionListener(this);
		pn2=new JPanel();
		pn2.setLayout(new FlowLayout(FlowLayout.LEFT));
		pn2.add(tx1);
		pn2.add(bt1);
		
		tx2=new JTextField();
		tx2.setPreferredSize(new Dimension(100,20));
		bt2=new JButton("Browse");
		bt2.addActionListener(this);
		pn3=new JPanel();
		pn3.setLayout(new FlowLayout(FlowLayout.LEFT));
		pn3.add(tx2);
		pn3.add(bt2);
		
		bt3=new JButton("Submit");
		bt3.addActionListener(this);
		bt4=new JButton("Cancel");
		bt4.addActionListener(this);
		pn4=new JPanel();
		pn4.setLayout(new FlowLayout(FlowLayout.LEFT));
		pn4.add(bt3);
		pn4.add(bt4);
		
		mpnl=new JPanel();
		mpnl.add(pn1);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn2);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn3);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.add(pn4);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		
	  
	  
		
		frm=new JFrame();
		frm.add(mpnl);
		frm.setSize(100,100);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		}
	String fun(){
		String content="";
	
		try{
			FileInputStream a=new FileInputStream("F:\\bhas.txt");
			int b;
			
			while((b=a.read())!=-1){
				content=content+(char)b; 
				System.out.print((char)(b));
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return content;
	}
	void gun(String b){
		try{
		FileOutputStream y=new FileOutputStream("F:\\raj.txt");
		byte a[] = b.getBytes();
		y.write(a);
		y.flush();
		y.close();
		
	}
		catch(Exception e)
		{
			
		e.printStackTrace();
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new f4();
	}

	@Override
	public void actionPerformed(ActionEvent y) {
		// TODO Auto-generated method stub
		if(y.getSource()==bt1){
			
			 f=new  JFileChooser();
			   fr=new FileNameExtensionFilter("Text Documents","txt");
			    f.setFileFilter(fr);
				String fi=f.getName().toString();
				System.out.println("the file name is "+fi);
				String content ="";
				try{
					FileInputStream a=new FileInputStream(fi);
					int b;
					
					while((b=a.read())!=-1){
						content=content+(char)b; 
						System.out.print((char)(b));
					}
					System.out.println("the congtent s "+content);
				}
				catch(Exception e){
					e.printStackTrace();
				// tx1.setText("open the file"+f.getName());
			}
	 
}
	if(y.getSource()==bt3){
		
		
	}
	}
}	
		
	



