import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Piece {
  public static void main(String[] args) {
    try {
  
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    } catch (Exception evt) {}
    JFrame j = new JFrame("Text Field Examples");
    j.getContentPane().setLayout(new FlowLayout());
    JTextField inputMe = new JTextField ("What is your name?");
    j.getContentPane().add(inputMe);
    String myInput = inputMe.getText();
    //j.getContentPane().add(new JTextField("Text Field 1"));
    //j.getContentPane().add(new JTextField("Text Field 2", 8));
    JTextField t = new JTextField("Text Field 3", 8);
    t.setHorizontalAlignment(JTextField.RIGHT);
    //j.getContentPane().add(t);
    //t = new JTextField("Text field 4", 8);
    //t.setHorizontalAlignment(JTextField.CENTER);
    //j.getContentPane().add(t);
    //j.getContentPane().add(new JTextField("Text Field 5", 3));
    j.pack();
    j.setVisible(true);
    
  	}
  }