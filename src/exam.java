import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class exam extends Object implements LineListener {
	
	JTextField tx1=null;
	JPanel pn1=null;
	JFrame frm=null;
	
	File soundFile;
	JDialog playingDialog;
	Clip clip;
	
	public exam() throws Exception{
		JFileChooser chooser = new JFileChooser();
	    chooser.showOpenDialog(null);
	    soundFile = chooser.getSelectedFile();

	    System.out.println("Playing " + soundFile.getName());

	    Line.Info linfo = new Line.Info(Clip.class);
	    Line line = AudioSystem.getLine(linfo);
	    clip = (Clip) line;
	    clip.addLineListener(this);
	    AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);
	    clip.open(ais);
	    clip.start();
		
		tx1=new JTextField("The text is here to enter the world");
		tx1.setPreferredSize(new Dimension(1000,20));
		pn1=new JPanel();
		pn1.setLayout(new FlowLayout(FlowLayout.LEFT));
		pn1.add(tx1);
		
		frm=new JFrame();
		frm.add(pn1);
		frm.setSize(200,200);
		frm.getContentPane().setBackground(Color.blue);
		frm.setVisible(true);
		frm.setTitle("login");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		new exam();

	}

	@Override
	public void update(LineEvent le) {
		// TODO Auto-generated method stub

	
		    LineEvent.Type type = le.getType();
		    if (type == LineEvent.Type.OPEN) {
		      System.out.println("OPEN");
		    } 
		    else if (type == LineEvent.Type.CLOSE) 
		    {
		      System.out.println("CLOSE");
		      System.exit(0);
		    } 
		    else if (type == LineEvent.Type.START) 
		    {
		      System.out.println("START");
		      playingDialog.setVisible(true);
		    } 
		    else if (type == LineEvent.Type.STOP) 
		    {
		      System.out.println("STOP");
		      playingDialog.setVisible(false);
		      clip.close();
		    }
	}
}