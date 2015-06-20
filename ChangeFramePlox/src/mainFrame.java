import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class mainFrame extends JFrame{	
	public static JButton myFirstButton;
	public static JButton mySecondButton;
    
    public mainFrame(){
    	super("work");
    	
    	myFirstButton = new JButton("First Frame");
    	myFirstButton.setFont(new Font(" Arial", Font.BOLD, 18));
    	myFirstButton.setBackground(Color.green);
    	
    	mySecondButton = new JButton("Second Frame");
    	mySecondButton.setFont(new Font("Arial", Font.BOLD, 17));
    	mySecondButton.setBackground(Color.red);
    	
    	Container c = getContentPane();
    	FlowLayout f = new FlowLayout(FlowLayout.LEFT);
    	c.setLayout(f);
    	c.add(myFirstButton);
    	c.add(mySecondButton);
    	ButtonHandler handler = new ButtonHandler();
    	myFirstButton.addActionListener(handler);
    	mySecondButton.addActionListener(handler);
    	
    	setSize(400,300);
    	show();
    	
    	
    }

}
