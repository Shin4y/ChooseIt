package firstOfAll;

import java.awt.EventQueue;

public class mainThread {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			@Override
			public void run(){
				startUp ex = new startUp();
				ex.setVisible(true);
			}
		});
			
	}

}
