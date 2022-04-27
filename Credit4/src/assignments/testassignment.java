package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class testassignment {

	private JFrame frame;
	private JTextField td;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testassignment window = new testassignment();
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
	public testassignment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 453, 379);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 546, 338);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter two digits");
		lblNewLabel.setBounds(27, 11, 76, 51);
		panel.add(lblNewLabel);
		
		td = new JTextField();
		td.setFont(new Font("Tahoma", Font.PLAIN, 16));
		td.setBounds(27, 61, 76, 41);
		panel.add(td);
		td.setColumns(10);
		
		JLabel dis = new JLabel("");
		dis.setBounds(27, 236, 381, 91);
		panel.add(dis);
		
		JButton btnNewButton = new JButton("ENTER");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String twoDigit = td.getText();//record the two digits
				
				int twoD = Integer.parseInt(twoDigit);//get the integer part
				
				int firstD = twoD / 10;//record first digit
				int secondD = twoD % 10;//record second digit
				
				int sum = firstD + secondD;//record the sum
						
				int prdc = firstD * secondD;//record the product
				
				int check = sum + prdc;
				
				if(check == twoD)
				
				{
					dis.setText(twoD + " is a special two digit number");
					
				}
		
					else
					{
					dis.setText(twoD + " is not special two digit number");
				}
					
				//dis.setText(""+sum);//display the special number
			}
		});
		btnNewButton.setBounds(226, 26, 98, 61);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CLEAR");
		btnNewButton_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			td.setText("");
			dis.setText("");
			}
		});
		btnNewButton_1.setBounds(226, 118, 98, 61);
		panel.add(btnNewButton_1);
	}
}
