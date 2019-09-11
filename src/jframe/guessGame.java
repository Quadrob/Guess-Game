package jframe;

//Simple guessing game between 0 - 5
//	Robert Zeelie	Created 10/09/19

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Toolkit;

public class guessGame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("Guess The Number Game");
	private final JLabel lblNewLabel_1 = new JLabel("Guess a number from 0 - 5 inclusive ");
	private JTextField guessedInt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guessGame frame = new guessGame();
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
	public guessGame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\rober\\eclipse-workspace\\JFrameTest\\images.png"));
		setTitle("  Guess Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 32));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 13, 400, 40);
		contentPane.add(lblNewLabel);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(65, 90, 300, 40);
		contentPane.add(lblNewLabel_1);
		
		guessedInt = new JTextField();
		guessedInt.setFont(new Font("Times New Roman", Font.BOLD, 14));
		guessedInt.setHorizontalAlignment(SwingConstants.CENTER);
		guessedInt.setBounds(116, 140, 200, 30);
		contentPane.add(guessedInt);
		guessedInt.setColumns(10);
		
		JButton btnGuess = new JButton("Guess");
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//collect the input and generate random number from 0 - 5
				int userInput = Integer.parseInt(guessedInt.getText());
				int randomNum = (int)(Math.random()*((5-0)+1))+0;//5 = max, 0 = min for finding random num
				//if else statments to check if the input number is the same as the random on and display a message accordingly and reset input
				if (userInput == randomNum) {
					JOptionPane.showMessageDialog(null, "          ** Well Done **\n\n      You guessed right!", "Guess Game", JOptionPane.INFORMATION_MESSAGE);
					guessedInt.setText(null);
				}else {
					JOptionPane.showMessageDialog(null, "          ** Incorrect **\n\n      You guessed wrong", "Guess Game", JOptionPane.INFORMATION_MESSAGE);
					guessedInt.setText(null);
				}
			}
		});
		btnGuess.setBounds(165, 210, 100, 25);
		contentPane.add(btnGuess);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(50, 185, 350, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(50, 77, 350, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_2 = new JLabel("Robert Zeelie V 1.0");
		lblNewLabel_2.setBackground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(7, 240, 90, 16);
		contentPane.add(lblNewLabel_2);
	}
}














