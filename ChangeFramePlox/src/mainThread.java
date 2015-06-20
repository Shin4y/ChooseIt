import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class mainThread {

	public static void main(String[] args) {
		mainFrame m = new mainFrame();
		
		m.addWindowListener(
				new WindowAdapter(){
					public void windowClosing(WindowEvent e){
						System.exit(0);
					}
				});
	}
}

