import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;


public class text implements ActionListener {
	static JLabel lb1=null;
	static JTextField tx1=null;
	JPanel pn1=null;
	JButton bt1=null;
	
	JFrame frm=null;
	
	public text(){
		lb1=new JLabel("You are good boy and also jeya is good girl");
		tx1=new JTextField("My name is Bhaskar god loves you");
		
		tx1.setPreferredSize(new Dimension(100,20));
		bt1=new JButton("Speak");
		bt1.addActionListener(this);
		pn1=new JPanel();
		pn1.setLayout(new FlowLayout(FlowLayout.CENTER));
		pn1.add(lb1);
		pn1.add(tx1);
		pn1.add(bt1);
		
		frm=new JFrame();
		frm.add(pn1);
		frm.setSize(200,200);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new text();
      System.setProperty("mbrola.base", "C://Users//USER//Downloads//Compressed//mbr301d_3");
	  Voice voice;
      VoiceManager vm=VoiceManager.getInstance();
     voice=vm.getVoice("mbrola_us1");
     voice.setStyle("casual");
     voice.allocate();
     voice.speak(lb1.getText());
     voice.speak(tx1.getText());
     voice.deallocate();
	}

	@Override
	public void actionPerformed(ActionEvent y) {
		// TODO Auto-generated method stub
		/*if(y.getSource()==bt1){
			
			  System.setProperty("mbrola.base", "C://Users//USER//Downloads//Compressed//mbr301d_3");
			  Voice voice;
		 VoiceManager vm=VoiceManager.getInstance();
		  voice=vm.getVoice("mbrola_us1");
		 voice.setStyle("casual");
		voice.allocate();
		voice.speak(tx1.getText());
		voice.deallocate();
		}*/
		
	}

}
