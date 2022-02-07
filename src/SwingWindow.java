import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Font;

public class SwingWindow {

	private JFrame frame;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	int N = 10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingWindow window = new SwingWindow();
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
	public SwingWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 956, 585);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(13, 105, 917, 430);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(13, 26, 250, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("while");
		rdbtnNewRadioButton.setSelected(true);
		
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(294, 31, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("do while");
		buttonGroup.add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_1.setBounds(294, 57, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton_1 = new JButton("Show pattern");
		btnNewButton_1.setBounds(62, 70, 148, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Enter pattern size");
		lblNewLabel_1.setBounds(13, 11, 250, 14);
		frame.getContentPane().add(lblNewLabel_1);
		


		btnNewButton_1.addActionListener(new ActionListener() 				
				{
					@Override
					public void actionPerformed(ActionEvent e) {
						if(textField.getText().length() > 0) {
							N = Integer.parseInt(textField.getText());
							textField.setText("");
						}
						String message = new String();
						message += "<html>";	
						int i = 0;		
				
						if(textField.getText().length() <= 0) {			
							if (rdbtnNewRadioButton.isSelected()) {
								 while (i < N) { //
									int x = 0;
									while (x < i * 2) {
										message += "&ensp;";
										x++;
									}
									
									int j = 1;
									while (j <= N - i) {
										message += j + "&ensp;";
										j++;
									}
									message += "<br>";
									i++;
								}
								
								int j = 1;
								while (j < N) {
									int x = 0;
									while (x < (N - 1) * 2) {
										message += "&ensp;";
										x++;
									}
									x = j + 1;
						
									while (x >= 1) {
										message += x + "&ensp;";
										x--;
									}
									
									message += "<br>";
									j++;
								} 
							} else if (rdbtnNewRadioButton_1.isSelected()) {
								 do {		
									int x = 0;
									do {
										if (x < i * 2) {
											message += "&ensp;";
											x++;
										}
									} while (x < i * 2);
									
									
									int j = 1;
									do {
										message += j + "&ensp;";
										j++;
									} while (j <= N - i);
									message += "<br>";
									i++;
								} while (i < N);
								
								
								int j = 1;
								do {
									int x = 0;		
									do {
										message += "&ensp;";
										x++;
									} while (x < (N - 1) * 2);
									
									
									x = j + 1;
									do {
										message += x + "&ensp;";
										x--;
									} while (x >= 1);						
									message += "<br>";
									j++;
								} while (j < N);
						}
						message += "</html>";					
						lblNewLabel.setText(message);
						}
					}	
				});
	}
}
