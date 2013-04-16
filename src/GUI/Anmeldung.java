package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JMenuBar;
import javax.swing.JEditorPane;

public class Anmeldung {

	private JFrame Anmeldung;
	private JTextField tf_Benutzername;
	private JPasswordField tf_Password_JPasswordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Anmeldung window = new Anmeldung();
					window.Anmeldung.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Anmeldung() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Anmeldung = new JFrame();
		Anmeldung.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Anmeldung.setTitle("Anmeldung");
		Anmeldung.setBounds(100, 100, 547, 408);
		Anmeldung.getContentPane().setLayout(null);
		
		JLabel lbl_Ueberschrift1_Anmeldung = new JLabel("Immobilien Vorndamme");
		lbl_Ueberschrift1_Anmeldung.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Ueberschrift1_Anmeldung.setFont(new Font("Arial Black", Font.BOLD, 29));
		lbl_Ueberschrift1_Anmeldung.setBounds(0, 28, 531, 41);
		Anmeldung.getContentPane().add(lbl_Ueberschrift1_Anmeldung);
		
		JLabel lbl_Ueberschrift2_Anmeldung = new JLabel("ImmoManager");
		lbl_Ueberschrift2_Anmeldung.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Ueberschrift2_Anmeldung.setFont(new Font("Arial Black", Font.BOLD, 29));
		lbl_Ueberschrift2_Anmeldung.setBounds(0, 64, 531, 59);
		Anmeldung.getContentPane().add(lbl_Ueberschrift2_Anmeldung);
		
		tf_Benutzername = new JTextField();
		tf_Benutzername.setBounds(275, 219, 158, 20);
		Anmeldung.getContentPane().add(tf_Benutzername);
		tf_Benutzername.setColumns(10);
		
		JLabel lbl_Benutzername = new JLabel("Benutzername");
		lbl_Benutzername.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_Benutzername.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_Benutzername.setBounds(111, 222, 100, 17);
		Anmeldung.getContentPane().add(lbl_Benutzername);
		
		JLabel lbl_Passwort = new JLabel("Passwort");
		lbl_Passwort.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_Passwort.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_Passwort.setBounds(111, 251, 100, 17);
		Anmeldung.getContentPane().add(lbl_Passwort);
		
		JButton btn_Anmelden = new JButton("Anmelden");
		btn_Anmelden.setBounds(326, 283, 107, 23);
		Anmeldung.getContentPane().add(btn_Anmelden);
		
		JCheckBox cbx_BenutzerdatenMerken = new JCheckBox("Benutzerdaten merken");
		cbx_BenutzerdatenMerken.setBounds(111, 283, 158, 23);
		Anmeldung.getContentPane().add(cbx_BenutzerdatenMerken);
		
		JLabel lbl_Version = new JLabel("v0.1");
		lbl_Version.setBounds(10, 356, 46, 14);
		Anmeldung.getContentPane().add(lbl_Version);
		
		tf_Password_JPasswordField = new JPasswordField();
		tf_Password_JPasswordField.setBounds(275, 250, 158, 20);
		Anmeldung.getContentPane().add(tf_Password_JPasswordField);
		
		JLabel lblLogo = new JLabel("Logo");
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setBounds(222, 161, 46, 14);
		Anmeldung.getContentPane().add(lblLogo);
	}
}
