
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

import java.awt.Font;

public class AttendenceFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AttendenceFrame window = new AttendenceFrame();
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
	public AttendenceFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				FrontFrame.main(null);
			}
		});
		btnHome.setBounds(335, 228, 97, 25);
		frame.getContentPane().add(btnHome);
		
		JLabel lblLabel = new JLabel("Attendance List");
		lblLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblLabel.setBounds(0, 0, 300, 32);
		frame.getContentPane().add(lblLabel);
		
		JButton btnExistFile = new JButton("Existing File");
		btnExistFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				List.main(null, "Att");
			}
		});
		btnExistFile.setBounds(148, 141, 115, 25);
		frame.getContentPane().add(btnExistFile);
		
		JButton btnNewFile = new JButton("New File");
		btnNewFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				NewList.main(null, "Att");
			}
		});
		btnNewFile.setBounds(45, 141, 97, 25);
		frame.getContentPane().add(btnNewFile);
		
		JLabel lblNewLabel = new JLabel("Select file");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(12, 94, 150, 30);
		frame.getContentPane().add(lblNewLabel);
		
		
	}
}
