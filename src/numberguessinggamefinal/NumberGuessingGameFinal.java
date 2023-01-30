package numberguessinggamefinal;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class NumberGuessingGameFinal {

	private JFrame frame;
	private JScrollPane scrollpane;
	protected Color Color;
	static int randomNumber = (int)(Math.random()*100);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumberGuessingGameFinal window = new NumberGuessingGameFinal();
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
	public NumberGuessingGameFinal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(401, 0, 399, 400);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Dnyaneshwar Walde\\Downloads\\close (1).png"));
		btnNewButton.setBounds(379, 0, 20, 20);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Number Guessing Game");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(0, 42, 399, 28);
		panel.add(lblNewLabel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.BOLD, 22));
		textArea.setBounds(47, 119, 326, 91);
		panel.add(textArea);
		
		//scrollpane = new JScrollPane(textArea);
		//scrollpane.setBounds(47, 86, 326, 165);
		
		
		JLabel label = new JLabel();
		label.setForeground(Color.BLACK);
		label.setBackground(Color.RED);
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(24, 232, 375, 33);
		panel.add(label);
		
		JButton btnNewButton_1 = new JButton("Check");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = textArea.getText();
				int x = 0;
				try {
				
					x = Integer.parseInt(text);	
			}
			catch(NumberFormatException e)
			{
					JOptionPane.showMessageDialog(null,"ERROR!","error",JOptionPane.ERROR_MESSAGE);
			}
			if( x > randomNumber)
			{
				label.setText(x + " is too high.Please, try again!");
			}
			else if(x < randomNumber) 
			{
				label.setText(x + " is low.Please, try again!");
			}
			else if(x == randomNumber)
			{
				label.setText(x + " it is.You are right!! Congratulations!!!");
				textArea.setText("");
				randomNumber = (int)(Math.random()*100);
			}
				
		}
		});
		btnNewButton_1.setBounds(170, 276, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Pad Color");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color c = JColorChooser.showDialog(btnNewButton_1_1,"Choose Color",Color.BLACK);
				textArea.setBackground(c);
				
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1.setBounds(47, 357, 110, 23);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Text Color");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color c= JColorChooser.showDialog(btnNewButton_1_2,"Choose Color", Color.BLACK);
				textArea.setForeground(c);
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_2.setBounds(277, 357, 112, 23);
		panel.add(btnNewButton_1_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter number between 0 to 100:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(0, 90, 343, 28);
		panel.add(lblNewLabel_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(244,249,249));
		panel_1.setBounds(0, 0, 400, 400);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Dnyaneshwar Walde\\Downloads\\NumberGuess.jpg"));
		lblNewLabel.setBounds(0, 0, 400, 400);
		panel_1.add(lblNewLabel);
	}
}
