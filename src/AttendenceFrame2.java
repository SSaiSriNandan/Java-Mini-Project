
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

public class AttendenceFrame2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AttendenceFrame2 window = new AttendenceFrame2();
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
	public AttendenceFrame2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(240, 240, 240));
		frame.setBounds(100, 100, 600, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				FrontFrame.main(null);
			}
		});
		btnHome.setBounds(485, 378, 97, 25);
		frame.getContentPane().add(btnHome);
		
		JLabel lblLabel = new JLabel("Attendance List");
		lblLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblLabel.setBounds(0, 0, 300, 32);
		frame.getContentPane().add(lblLabel);
		
		textField = new JTextField();
		textField.setBounds(12, 123, 345, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(12, 331, 207, 39);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(241, 338, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(62, 193, 54, 13);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(241, 193, 97, 25);
		frame.getContentPane().add(btnNewButton_2);
		
		
	}
}
