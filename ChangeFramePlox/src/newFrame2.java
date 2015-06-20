import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class newFrame2 extends JFrame implements ActionListener{
	public newFrame2(){
		
	 JButton open = new JButton("New Window");
     open.addActionListener(this);
     add(open);
     setVisible(true);
	}
	public void actionPerformed(ActionEvent event){
		JFrame frame = new JFrame("Simple GUI 2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel textLabel = new JLabel("I want this to work", SwingConstants.CENTER);
		textLabel.setPreferredSize(new Dimension(300,100));
		frame.getContentPane().add(textLabel, BorderLayout.CENTER);
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
		
	}

}
