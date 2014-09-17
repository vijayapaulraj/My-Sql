import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.midi.Synthesizer;
import javax.sound.sampled.AudioFileFormat.Type;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sun.speech.engine.synthesis.SynthesizerMonitor;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

import java.io.*;
import java.util.Locale;

import com.sun.speech.freetts.*;
import com.sun.speech.freetts.audio.SingleFileAudioPlayer;


public class text2speec implements ActionListener {

	JLabel lb1=null;
	JTextField tx1=null;
	JPanel pn1=null;
	JButton bt1=null;
	
	JFrame frm=null;
	
	public text2speec(){
		tx1=new JTextField("My name is Bhaskar");
		tx1.setPreferredSize(new Dimension(100,20));
		bt1=new JButton("Speak");
		bt1.addActionListener(this);
		pn1=new JPanel();
		pn1.setLayout(new FlowLayout(FlowLayout.CENTER));
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
     new text2speec();
  /*   try{
 		Synthesizer synth = central.createSynthesizer(new SynthesizerModeDesc(Locale.ENGLISH));

 				// Get it ready to speak

 				synth.allocate();

 				synth.resume();

 				// Speak the Hello world string

 				synth.speakPlainText(tx1.getText(), null);

 				// Wait till speaking is done

 				synth.waitEngineState(Synthesizer.QUEUE_EMPTY);

 				// Clean up

 				synth.deallocate();

 		}
 	 catch(Exception e){
 		 e.printStackTrace();
 	 }
 	}*/

	}


    private static final String VOICENAME="Kevin16";

	@Override
	public void actionPerformed(ActionEvent y) {
		// TODO Auto-generated method stub
		  // String fileLocation = "D://select";
		if(y.getSource()==bt1){
		try{
		Voice voice;
	 VoiceManager vm=VoiceManager.getInstance();
	  voice=vm.getVoice(VOICENAME);
	 voice.setStyle("casual");
	voice.allocate();
	// try{
		// voice.speak();
		// SingleFileAudioPlayer audioPlayer = new SingleFileAudioPlayer(
          //       fileLocation, Type.WAVE);     //To Create the wav file for the text
//voice.setAudioPlayer(audioPlayer);
voice.setVolume(100);
voice.speak(tx1.getText()); //Speaks the text
voice.deallocate();
//audioPlayer.close();
voice.deallocate();
	 }
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
}