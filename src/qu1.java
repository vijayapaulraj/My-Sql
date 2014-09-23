import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.UIManager;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;


public class qu1 implements ActionListener{
	static JLabel lb1=null;
	static JLabel lb2=null;
	JPanel pn1=null;
	JPanel pn2=null;
	JPanel pn3=null;
	JPanel pn4=null;
	
	static JRadioButton bt1=null;
	static JRadioButton bt2=null;
	static JRadioButton bt3=null;
	static JRadioButton bt4=null;
	JButton bt5=null;
	JButton bt6=null; 
	ButtonGroup bt=null;
	
	int i=5000,q=1;
   
	JPanel mpnl=null;
	JFrame frm=null;
	public qu1(){
		lb1=new JLabel("QUESTION NO:"+q);
		lb1.setFont(new Font("Times New Roman",Font.BOLD,20));
		lb1.setForeground(Color.yellow);
		pn1=new JPanel();
	    pn1.setLayout(new FlowLayout(FlowLayout.CENTER));
		pn1.setBackground(Color.blue);
		pn1.add(lb1);
		
		lb2=new JLabel(q+"\t"+".WHO IS THE PRESIDENT OF INDIA?");
		lb2.setFont(new Font("Times New Roman",Font.BOLD,20));
		lb2.setForeground(Color.yellow);
		pn2=new JPanel();
		pn2.setLayout(new FlowLayout(FlowLayout.CENTER));
		pn2.setBackground(Color.blue);
		pn2.add(lb2);
		
		bt1=new JRadioButton("PRATHIBA PATIL");
		bt1.addActionListener(this);
	    bt1.setFont(new Font("Times New Roman",Font.BOLD,20));
		bt1.setBackground(Color.yellow);
		bt2=new JRadioButton("A.P.J. ABDUL KALAM");
	    bt2.addActionListener(this);
		bt2.setBackground(Color.yellow);
		bt2.setFont(new Font("Times New Roman",Font.BOLD,20));
		bt3=new JRadioButton("ADVANI");
		bt3.addActionListener(this);
		bt3.setBackground(Color.yellow);
		bt3.setFont(new Font("Times New Roman",Font.BOLD,20));
		bt4=new JRadioButton("PRANAB MUKURJEE");
		bt4.addActionListener(this);
		bt4.setBackground(Color.yellow);
		bt4.setFont(new Font("Times New Roman",Font.BOLD,20));
		ButtonGroup bt=new ButtonGroup();
		bt.add(bt1);
		bt.add(bt2);
		bt.add(bt3);
		bt.add(bt4);
		pn3=new JPanel();
		pn3.setLayout(new FlowLayout(FlowLayout.CENTER));
		pn3.setBackground(Color.blue);
		pn3.add(bt1);
		pn3.add(bt2);
		pn3.add(bt3);
		pn3.add(bt4);
		
		 bt5=new JButton("SUBMIT");
		bt5.addActionListener(this);
		bt5.setBackground(Color.yellow);
		bt5.setFont(new Font("Times New Roman",Font.BOLD,15));
		bt6=new JButton("NEXT");
		bt6.addActionListener(this);
		bt6.setBackground(Color.yellow);
		bt6.setFont(new Font("Times New Roman",Font.BOLD,15));
		pn4=new JPanel();
		pn4.setLayout(new FlowLayout(FlowLayout.CENTER));
		pn4.setBackground(Color.blue);
		pn4.add(bt5);
		pn4.add(bt6);
		
		mpnl=new JPanel();
		mpnl.add(pn1);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.setBackground(Color.blue);
		mpnl.add(pn2);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.setBackground(Color.blue);
		mpnl.add(pn3);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.setBackground(Color.blue);
		mpnl.add(pn4);
		mpnl.setLayout(new BoxLayout(mpnl,BoxLayout.PAGE_AXIS));
		mpnl.setBackground(Color.blue);
		
		Toolkit tk=Toolkit.getDefaultToolkit();
		Image ty=tk.getImage("C:\\Users\\USER\\Downloads\\KBClogo.png");
			
		
		frm=new JFrame();
		frm.getContentPane().add(mpnl,"West");
		frm.setSize(200,200);
		frm.setTitle("KBC");
		frm.setVisible(true);
		frm.setIconImage(ty);
		frm.setContentPane(new JLabel(new ImageIcon("C:\\Users\\USER\\Downloads\\KBClogo.png")));
		frm.getContentPane().setBackground(Color.blue);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*try{
			File sound = new File("E://FFOutput//KBCO.wav");
			AudioInputStream audio = AudioSystem.getAudioInputStream(sound);
			Clip clip = AudioSystem.getClip();
	         clip.open(audio);
	        clip.start();
	        clip.loop(2);
			}
			catch(Exception  e)
			{
				e.printStackTrace();
			}*/
				
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new qu1();
				
		System.setProperty("mbrola.base", "C://Users//USER//Downloads//Compressed//mbr301d_3");
		  Voice voice;
	      VoiceManager vm=VoiceManager.getInstance();
	     voice=vm.getVoice("mbrola_us1");
	     voice.setStyle("casual");
	     voice.allocate();
	     voice.speak(lb1.getText());
	     voice.speak(lb2.getText());
	     voice.speak(bt1.getText());
	     voice.speak(bt2.getText());
	     voice.speak(bt3.getText());
	     voice.speak(bt4.getText());
	      voice.deallocate();
	      
		
		}

	@Override
	public void actionPerformed(ActionEvent t) {
		// TODO Auto-generated method stub
		if(t.getSource()==bt5){
			if(bt4.isSelected()==true){
				Toolkit.getDefaultToolkit().beep(); 
				UIManager u=new UIManager();
				u.put("OptionPane.background",Color.blue);
				u.put("Panel.background",Color.yellow);
				JOptionPane.showMessageDialog(null,"CONGRADULATIONS! YOU WON Rs."+i,"KAUN BANEGA CROREPATHI",JOptionPane.INFORMATION_MESSAGE);
				System.out.println("The answer is correct");
				
	
			}
			else{
				UIManager u=new UIManager();
				u.put("OptionPane.background",Color.blue);
				u.put("Panel.background",Color.yellow);
				JOptionPane.showMessageDialog(null,"CONGRADULATIONS! WRONG ANSWER","KAUN BANEGA CROREPATHI",JOptionPane.ERROR_MESSAGE);
			}
		}
		if(t.getSource()==bt6){
			frm.dispose();
			frm.getContentPane().add(frm, new quiz());
		}
		
	}

}
