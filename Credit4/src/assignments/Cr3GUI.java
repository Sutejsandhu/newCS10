package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Cr3GUI {

	private JFrame frame;
	private JTextField fn;
	private JTextField lnn;
	private JTextField g2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cr3GUI window = new Cr3GUI();
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
	public Cr3GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 558, 364);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 542, 325);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel fnl = new JLabel("First Name");
		fnl.setBounds(22, 11, 93, 45);
		panel.add(fnl);
		
		fn = new JTextField();
		fn.setBounds(123, 18, 173, 31);
		panel.add(fn);
		fn.setColumns(10);
		
		JLabel ln = new JLabel("Last Name");
		ln.setBounds(22, 68, 93, 45);
		panel.add(ln);
		
		lnn = new JTextField();
		lnn.setColumns(10);
		lnn.setBounds(123, 75, 173, 31);
		panel.add(lnn);
		
		JLabel ag = new JLabel("Age");
		ag.setBounds(22, 124, 93, 45);
		panel.add(ag);
		
		g2 = new JTextField();
		g2.setColumns(10);
		g2.setBounds(123, 131, 173, 31);
		panel.add(g2);
		
		JLabel dis = new JLabel("");
		dis.setForeground(Color.BLUE);
		dis.setBounds(22, 215, 456, 99);
		panel.add(dis);
		
		JButton sbm = new JButton("Submit");
		sbm.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String FN = fn.getText();
				String LN = lnn.getText();
				String age = g2.getText();
				
				dis.setText("First name: " + FN + "last name: "+ LN + "and your age is: "+ age);
			}
		});
		sbm.setBounds(331, 11, 173, 80);
		panel.add(sbm);
		
		JButton rs = new JButton("Reset");
		rs.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				fn.setText(" ");
				lnn.setText(" ");
				g2.setText(" ");
				
			}
		});
		rs.setBounds(331, 101, 173, 80);
		panel.add(rs);
		
		
	}
}
