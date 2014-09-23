import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;


public class f2 implements ActionListener {
	JButton bt1=null;
	JButton bt2=null;
	JFileChooser fc=null;
	JTextField tx1=null;
	JPanel pn1=null;
	JFrame frm=null;
	FileNameExtensionFilter fn=null;
	
	public f2(){
		tx1=new JTextField();
		tx1.setPreferredSize(new Dimension(100,20));
		bt1=new JButton("Open");
		bt1.addActionListener(this);
		bt2=new JButton("Save");
		bt2.addActionListener(this); 
		pn1=new JPanel();
		pn1.add(tx1);
		pn1.add(bt1);
		pn1.add(bt2);
		
		fc=new JFileChooser();
		fn=new FileNameExtensionFilter("Text Documents","txt");
		fc.setFileFilter(fn);
		
		
		frm=new JFrame();
		frm.add(pn1);
		frm.setSize(100,100);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	void ru(String a){
		String e="";
		try{
			FileInputStream t=new FileInputStream("D:/Flim/abc.txt");
			int r;
			while ((r=t.read())!=-1){
				e=e+(char)r;
				System.out.println((char)r);
				
			}
		}
		catch(Exception g){
			g.printStackTrace();
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new f2();

	}




	@Override
	public void actionPerformed(ActionEvent t) {
		// TODO Auto-generated method stub
		
		if(t.getSource()==bt1){
			int r=fc.showOpenDialog(frm);
			if(r==JFileChooser.APPROVE_OPTION){
				File f=fc.getSelectedFile();
				// tx1.setText("open the file"+f.getName());
			}
			else{
				tx1.setText("Open file is cancelled by user");
			}
		}
		
	
	if(t.getSource()==bt2){
		int r=fc.showSaveDialog(frm);
		if(r==JFileChooser.APPROVE_OPTION){
			File f=fc.getSelectedFile();
			tx1.setText("Save the file"+f.getName());
		}
		else{
			tx1.setText("Cancelled the file");
		}
	}
}

}
