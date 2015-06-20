import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Color;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.EventQueue;
public class Surface extends JPanel{
	public void drawMe(Graphics g){
		Graphics g2d = (Graphics2D) g;
		g2d.drawString("JAVA 2D", 180, 200 );
		
		
	}
	@Override
	public void paintComponent (Graphics g){
		super.paintComponent(g);
		drawMe(g);
	}

}

