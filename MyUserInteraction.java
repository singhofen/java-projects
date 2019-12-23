import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class MyUserInteraction {

	private JFrame frame;
	private JLabel myLabel;
	private JTextField textField;
	private JButton myButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyUserInteraction window = new MyUserInteraction();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyUserInteraction() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Kohinoor Telugu", Font.PLAIN, 13));
		frame.getContentPane().setBackground(Color.YELLOW);
		frame.setBackground(Color.GRAY);
		frame.setBounds(100, 100, 863, 377);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel MyLabel = new JLabel("Change Me");
		MyLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 27));
		MyLabel.setBackground(Color.YELLOW);
		MyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		MyLabel.setBounds(398, 59, 212, 37);
		frame.getContentPane().add(MyLabel);
		
		textField = new JTextField();
		textField.setBackground(Color.MAGENTA);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(425, 132, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton mybutton = new JButton("click me");
		mybutton.setBackground(Color.CYAN);
		mybutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText();
				myLabel.setText(text);
				textField.setText("");
			}
		
		});
		mybutton.setBounds(405, 180, 117, 29);
		frame.getContentPane().add(mybutton);
	}
}
