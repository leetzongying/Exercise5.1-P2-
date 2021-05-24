package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Exercise5 {

	private JFrame frame;
	private JTextField textnum1;
	private JTextField textnum2;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise5 window = new Exercise5();
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
	public Exercise5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 865, 498);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculator");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(333, 10, 159, 56);
		frame.getContentPane().add(lblNewLabel);
		
		textnum1 = new JTextField();
		textnum1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		textnum1.setBounds(157, 118, 137, 42);
		frame.getContentPane().add(textnum1);
		textnum1.setColumns(10);
		
		textnum2 = new JTextField();
		textnum2.setFont(new Font("Tahoma", Font.ITALIC, 15));
		textnum2.setColumns(10);
		textnum2.setBounds(541, 118, 137, 42);
		frame.getContentPane().add(textnum2);
		
		JLabel lblNewLabel_1 = new JLabel("Num 1");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(186, 90, 82, 18);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Num 2");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(568, 90, 82, 18);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JButton AddButton = new JButton("ADD");
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textnum1.getText());
					num2 = Integer.parseInt(textnum2.getText());
					
					ans= num1 + num2;
					textFieldAns.setText(Integer.toString(ans));
					}catch(Exception e) {
						JOptionPane.showMessageDialog(null, "Please enter a valit number.");
					}
			}
		});
		AddButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		AddButton.setBounds(157, 211, 137, 42);
		frame.getContentPane().add(AddButton);
		
		JButton MinusButton = new JButton("Subtract");
		MinusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textnum1.getText());
					num2 = Integer.parseInt(textnum2.getText());
					
					ans= num1 - num2;
					textFieldAns.setText(Integer.toString(ans));
					}catch(Exception e) {
						JOptionPane.showMessageDialog(null, "Please enter a valit number.");
					}
			}
		});
		MinusButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		MinusButton.setBounds(541, 211, 137, 42);
		frame.getContentPane().add(MinusButton);
		
		textFieldAns = new JTextField();
		textFieldAns.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textFieldAns.setBounds(333, 341, 159, 42);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Answer");
		lblNewLabel_2.setFont(new Font("Perpetua", Font.BOLD, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(357, 296, 121, 35);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
