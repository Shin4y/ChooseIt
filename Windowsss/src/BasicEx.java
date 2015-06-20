import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Color;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class BasicEx extends JFrame{
	public BasicEx(){
		initUI();
	}
	private void initUI() {
		add(new Surface());
		
		setTitle("Simple 2D Java Example" );
		setSize (400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
	
		
		