package firstOfAll;
import java.awt.Component;
import java.awt.EventQueue;
import javax.swing.JFrame;


public class startUp extends JFrame{
	public startUp(){
		initUI();
	}
	private void initUI(){
		add(new Board());
		setSize(250,200);
		setTitle("Application");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
		

}
