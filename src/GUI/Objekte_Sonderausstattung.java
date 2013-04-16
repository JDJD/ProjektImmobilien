package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class Objekte_Sonderausstattung {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Objekte_Sonderausstattung window = new Objekte_Sonderausstattung();
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
	public Objekte_Sonderausstattung() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 592, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("Sonderausstattungen");
		label.setFont(new Font("Arial Black", Font.BOLD, 11));
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		frame.getContentPane().add(textField_9);
		
		JLabel label_11 = new JLabel("Kosten");
		label_11.setFont(new Font("Arial Black", Font.BOLD, 11));
		frame.getContentPane().add(label_11);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		frame.getContentPane().add(textField_10);
		
		JLabel label_12 = new JLabel("Kaufpreis");
		label_12.setFont(new Font("Arial", Font.PLAIN, 11));
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("Kaltmiete");
		label_13.setFont(new Font("Arial", Font.PLAIN, 11));
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("Nebenkosten");
		label_14.setFont(new Font("Arial", Font.PLAIN, 11));
		frame.getContentPane().add(label_14);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		frame.getContentPane().add(textField_15);
		
		JLabel label_16 = new JLabel("Adresse");
		label_16.setFont(new Font("Arial Black", Font.BOLD, 11));
		frame.getContentPane().add(label_16);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		frame.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		frame.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		frame.getContentPane().add(textField_18);
		
		JLabel label_17 = new JLabel("Land");
		label_17.setFont(new Font("Arial", Font.PLAIN, 11));
		frame.getContentPane().add(label_17);
	}

}
