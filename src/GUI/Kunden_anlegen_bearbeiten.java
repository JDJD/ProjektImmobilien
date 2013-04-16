package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class Kunden_anlegen_bearbeiten extends JPanel {
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
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_29;

	/**
	 * Create the panel.
	 */
	public Kunden_anlegen_bearbeiten() {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setLayout(null);
		
		JLabel lblObjekteAnlegen = new JLabel("Kunde anlegen");
		lblObjekteAnlegen.setFont(new Font("Arial Black", Font.BOLD, 29));
		lblObjekteAnlegen.setBounds(10, 0, 374, 41);
		add(lblObjekteAnlegen);
		
		JLabel lblObjekt = new JLabel("Kontaktdaten");
		lblObjekt.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblObjekt.setBounds(43, 83, 150, 14);
		add(lblObjekt);
		
		JLabel lblTitel = new JLabel("Vorname");
		lblTitel.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTitel.setBounds(43, 130, 46, 14);
		add(lblTitel);
		
		JLabel lblArt = new JLabel("Name");
		lblArt.setFont(new Font("Arial", Font.PLAIN, 11));
		lblArt.setBounds(43, 155, 46, 14);
		add(lblArt);
		
		JLabel lblBaujahr = new JLabel("Telefon Privat");
		lblBaujahr.setFont(new Font("Arial", Font.PLAIN, 11));
		lblBaujahr.setBounds(43, 237, 114, 14);
		add(lblBaujahr);
		
		JLabel lblZimmeranzahl = new JLabel("Telefon gesch\u00E4ftlich");
		lblZimmeranzahl.setFont(new Font("Arial", Font.PLAIN, 11));
		lblZimmeranzahl.setBounds(43, 262, 106, 14);
		add(lblZimmeranzahl);
		
		JLabel lblWohnflche = new JLabel("E-Mail Privat");
		lblWohnflche.setFont(new Font("Arial", Font.PLAIN, 11));
		lblWohnflche.setBounds(43, 312, 132, 14);
		add(lblWohnflche);
		
		JLabel lblObjektnummer = new JLabel("Anrede");
		lblObjektnummer.setFont(new Font("Arial", Font.PLAIN, 11));
		lblObjektnummer.setBounds(43, 105, 106, 14);
		add(lblObjektnummer);
		
		JLabel lblAnzahlDerBder = new JLabel("Mobil");
		lblAnzahlDerBder.setFont(new Font("Arial", Font.PLAIN, 11));
		lblAnzahlDerBder.setBounds(43, 287, 132, 14);
		add(lblAnzahlDerBder);
		
		JLabel lblHeizungsart = new JLabel("E-Mail gesch\u00E4ftlich");
		lblHeizungsart.setFont(new Font("Arial", Font.PLAIN, 11));
		lblHeizungsart.setBounds(43, 337, 114, 14);
		add(lblHeizungsart);
		
		JLabel lblbergabezeitraum = new JLabel("Geburtsdatum");
		lblbergabezeitraum.setFont(new Font("Arial", Font.PLAIN, 11));
		lblbergabezeitraum.setBounds(43, 179, 132, 14);
		add(lblbergabezeitraum);
		
		JLabel lblObjektbeschreibung = new JLabel("W\u00FCnsche des Kunden");
		lblObjektbeschreibung.setFont(new Font("Arial", Font.PLAIN, 11));
		lblObjektbeschreibung.setBounds(341, 99, 132, 14);
		add(lblObjektbeschreibung);
		
		JLabel lblKommentarfeld = new JLabel("Aktivit\u00E4t");
		lblKommentarfeld.setFont(new Font("Arial", Font.PLAIN, 11));
		lblKommentarfeld.setBounds(341, 224, 106, 14);
		add(lblKommentarfeld);
		
		JLabel lblAktivitten = new JLabel("Status");
		lblAktivitten.setFont(new Font("Arial", Font.PLAIN, 11));
		lblAktivitten.setBounds(341, 359, 106, 14);
		add(lblAktivitten);
		
		JLabel lblNzahl = new JLabel("Preisvorstellung");
		lblNzahl.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNzahl.setBounds(341, 199, 202, 14);
		add(lblNzahl);
		
		JLabel lblLetzterKontakt = new JLabel("Letzter Kontakt");
		lblLetzterKontakt.setFont(new Font("Arial", Font.PLAIN, 11));
		lblLetzterKontakt.setBounds(341, 303, 132, 14);
		add(lblLetzterKontakt);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(177, 173, 124, 20);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(177, 331, 124, 20);
		add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(177, 306, 124, 20);
		add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(177, 281, 124, 20);
		add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(177, 256, 124, 20);
		add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(177, 231, 124, 20);
		add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(177, 149, 124, 20);
		add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(177, 124, 124, 20);
		add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(177, 99, 124, 20);
		add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(473, 196, 124, 20);
		add(textField_13);
		
		JLabel lblStraeNr = new JLabel("Stra\u00DFe, Nr.");
		lblStraeNr.setFont(new Font("Arial", Font.PLAIN, 11));
		lblStraeNr.setBounds(43, 390, 86, 14);
		add(lblStraeNr);
		
		JLabel lblPlzOrt = new JLabel("PLZ, Ort");
		lblPlzOrt.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPlzOrt.setBounds(43, 418, 86, 14);
		add(lblPlzOrt);
		
		JLabel lblLand = new JLabel("Land");
		lblLand.setFont(new Font("Arial", Font.PLAIN, 11));
		lblLand.setBounds(43, 446, 86, 14);
		add(lblLand);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(207, 418, 94, 20);
		add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(159, 418, 46, 20);
		add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(255, 390, 46, 20);
		add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(159, 390, 94, 20);
		add(textField_24);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(197, 446, 104, 20);
		add(textField_29);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(473, 99, 125, 89);
		add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(473, 303, 124, 48);
		add(scrollPane_1);
		
		JTextPane textPane_1 = new JTextPane();
		scrollPane_1.setViewportView(textPane_1);
		
		JButton btnAnlegen = new JButton("Speichern");
		btnAnlegen.setBounds(491, 526, 106, 23);
		add(btnAnlegen);
		
		JLabel lblSontoges = new JLabel("Sonstiges");
		lblSontoges.setFont(new Font("Arial", Font.PLAIN, 11));
		lblSontoges.setBounds(341, 249, 106, 14);
		add(lblSontoges);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(473, 249, 124, 45);
		add(scrollPane_3);
		
		JTextPane textPane_3 = new JTextPane();
		scrollPane_3.setViewportView(textPane_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(473, 356, 124, 20);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(473, 221, 124, 20);
		add(comboBox_1);

	}
}
