import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JComponent;


public class pain extends JComponent {
public void paint(Graphics g){
		
		Image im=Toolkit.getDefaultToolkit().getImage("C:\\Users\\USER\\Downloads\\KBClogo.png"); 
		int width=im.getWidth(this);
		int height=im.getHeight(this);
		int Scale=2;
		int w=Scale*width;
		int h=Scale*height;
		g.drawImage(im,10,10,(int)w,(int)h,this);
		//g.setColor(Color.blue);
		
		
	}
}
