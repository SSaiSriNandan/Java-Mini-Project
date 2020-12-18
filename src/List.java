import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class List {

	private JFrame frame;
	private JTextField FileNameTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args, String st) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					List window = new List(st);
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
	public List(String s) {
		initialize(s);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String s) {
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
		
		JLabel lblLabel = new JLabel("Select the File");
		lblLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblLabel.setBounds(0, 0, 300, 32);
		frame.getContentPane().add(lblLabel);
		
		FileNameTextField = new JTextField();
		FileNameTextField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		FileNameTextField.setBounds(10, 80, 350, 32);
		frame.getContentPane().add(FileNameTextField);
		FileNameTextField.setColumns(10);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				JFileChooser fs = new JFileChooser(new File("f:\\"));
				fs.setDialogTitle("Creat new file");
				fs.setFileFilter(new FileTypeFilter(".dir", "Folder"));
				fs.setFileFilter(new FileTypeFilter(".txt", "Text"));
				fs.setFileFilter(new FileTypeFilter(".xlsx", "Excel"));
				int result = fs.showSaveDialog(null);
				if(result == JFileChooser.APPROVE_OPTION) {
					//String content = FileNameTextField.getText();
					File fi = fs.getSelectedFile();
					try {
						FileWriter fw = new FileWriter(fi.getPath());
						//fw.write(content);
						fw.flush();
						fw.close();
						String Loc = fi.getPath();
						FileNameTextField.setText(Loc);
					}catch(Exception e3) {
						JOptionPane.showMessageDialog(null, e3.getMessage());
					}
				}	
			}
		});
		btnBrowse.setBounds(264, 115, 97, 25);
		frame.getContentPane().add(btnBrowse);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, s);
				frame.dispose();
				if(s=="Att")
					AttendenceFrame.main(null);
				else if(s=="Marks")
					MarksFrame.main(null);
				else if(s=="Exam")
					ExamFrame.main(null);
				else if(s=="E-mail")
					EmailFrame.main(null);
				
			}
		});
		btnBack.setBounds(234, 228, 97, 25);
		frame.getContentPane().add(btnBack);
		
		JButton btnSelect = new JButton("Select");
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.dispose();
				if(s=="Att")
					AttendenceFrame2.main(null);
				else if(s=="Marks")
					MarksFrame2.main(null);
				else if(s=="Exam")
					ExamFrame2.main(null);
				else if(s=="E-mail")
					EmailFrame2.main(null);
				
				
			}
		});
		btnSelect.setBounds(90, 115, 97, 25);
		frame.getContentPane().add(btnSelect);
		
	}
}
