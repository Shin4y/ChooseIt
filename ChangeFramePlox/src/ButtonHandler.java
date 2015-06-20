
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ButtonHandler implements ActionListener{
	public void actionPerformed(ActionEvent e){
		if (e.getSource() == mainFrame.myFirstButton) {
				new newFrame1();
			}
		if(e.getSource() == mainFrame.mySecondButton){
			new newFrame2();
		}
			
	}
}


