package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 383);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Calculate");
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Calculater");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(283, 22, 85, 13);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(27, 59, 240, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.setBounds(10, 91, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.setBounds(102, 91, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.setBounds(193, 91, 85, 21);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setBounds(10, 137, 85, 21);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.setBounds(102, 137, 85, 21);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.setBounds(193, 137, 85, 21);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.setBounds(10, 186, 85, 21);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.setBounds(102, 186, 85, 21);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.setBounds(193, 186, 85, 21);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("0");
		btnNewButton_10.setBounds(102, 241, 85, 21);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("+");
		btnNewButton_11.setBounds(370, 91, 85, 21);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("sqrt");
		btnNewButton_12.setBounds(492, 91, 85, 21);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("-");
		btnNewButton_13.setBounds(370, 137, 85, 21);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("mod");
		btnNewButton_14.setBounds(492, 137, 85, 21);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("/");
		btnNewButton_15.setBounds(370, 186, 85, 21);
		contentPane.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("clear");
		btnNewButton_16.setBounds(492, 186, 85, 21);
		contentPane.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("*");
		btnNewButton_17.setBounds(370, 241, 85, 21);
		contentPane.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("=");
		btnNewButton_18.setBounds(492, 241, 85, 21);
		contentPane.add(btnNewButton_18);

	}
}
