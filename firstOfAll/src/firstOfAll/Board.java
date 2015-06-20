package firstOfAll;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;


public class Board extends JFrame{
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		drawDonut(g);
	}
	private void drawDonut(Graphics g){
		
	}
	public board(){
	}

}
