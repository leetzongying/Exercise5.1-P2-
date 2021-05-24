package sTIA1123;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;

public class Demo {

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
					Demo window = new Demo();
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
	public Demo() { //constructor with no argument for class Demo.java
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 663, 519);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel LabelOne = new JLabel("My New GUI");
		LabelOne.setBounds(0, 0, 628, 44);
		LabelOne.setFont(new Font("Times New Roman", Font.BOLD, 12));
		LabelOne.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(LabelOne);
		
		JButton LoginButton = new JButton("Login");		
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(textField.getText().equals("Azman") && textField_1.getText().equals("abc123")) 
						JOptionPane.showMessageDialog(null, "Login Successful!");
					else
						JOptionPane.showMessageDialog(null, "Login not Successful");
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		LoginButton.setForeground(Color.BLUE);
		LoginButton.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		LoginButton.setBounds(255, 313, 122, 44);
		frame.getContentPane().add(LoginButton);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial Black", Font.PLAIN, 12));
		textField.setBounds(210, 117, 218, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Wingdings", Font.PLAIN, 10));
		textField_1.setBounds(210, 213, 218, 31);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel Username = new JLabel("USERNAME");
		Username.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		Username.setHorizontalAlignment(SwingConstants.CENTER);
		Username.setBounds(255, 73, 134, 31);
		frame.getContentPane().add(Username);
		
		JLabel Password = new JLabel("PASSWORD");
		Password.setHorizontalAlignment(SwingConstants.CENTER);
		Password.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		Password.setBounds(255, 172, 134, 31);
		frame.getContentPane().add(Password);
	}
}
