import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Runner only runs the main-method containing the WelcomeScreen constructor.
 *
 */
public class Runner
{
	static int count = 0;
	
	public static void main(String[] args)
	{       
        new WelcomeScreen();
		
	}
}
