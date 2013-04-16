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

public class Objekte_anlegen_bearbeiten extends JPanel {
	private JTextField textField;
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

	/**
	 * Create the panel.
	 */
	public Objekte_anlegen_bearbeiten() {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setLayout(null);
		
		JLabel lblObjekteAnlegen = new JLabel("Objekt anlegen");
		lblObjekteAnlegen.setFont(new Font("Arial Black", Font.BOLD, 29));
		lblObjekteAnlegen.setBounds(10, 0, 374, 41);
		add(lblObjekteAnlegen);
		
		JLabel lblObjekt = new JLabel("Objekt");
		lblObjekt.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblObjekt.setBounds(44, 52, 150, 14);
		add(lblObjekt);
		
		JLabel lblTitel = new JLabel("Titel");
		lblTitel.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTitel.setBounds(330, 74, 46, 14);
		add(lblTitel);
		
		JLabel lblArt = new JLabel("Art");
		lblArt.setFont(new Font("Arial", Font.PLAIN, 11));
		lblArt.setBounds(44, 105, 46, 14);
		add(lblArt);
		
		JLabel lblBaujahr = new JLabel("Baujahr");
		lblBaujahr.setFont(new Font("Arial", Font.PLAIN, 11));
		lblBaujahr.setBounds(330, 105, 46, 14);
		add(lblBaujahr);
		
		JLabel lblZimmeranzahl = new JLabel("Zimmeranzahl");
		lblZimmeranzahl.setFont(new Font("Arial", Font.PLAIN, 11));
		lblZimmeranzahl.setBounds(330, 136, 106, 14);
		add(lblZimmeranzahl);
		
		JLabel lblWohnflche = new JLabel("Wohnfl\u00E4che");
		lblWohnflche.setFont(new Font("Arial", Font.PLAIN, 11));
		lblWohnflche.setBounds(44, 136, 132, 14);
		add(lblWohnflche);
		
		JLabel lblObjektnummer = new JLabel("Objektnummer");
		lblObjektnummer.setFont(new Font("Arial", Font.PLAIN, 11));
		lblObjektnummer.setBounds(44, 74, 106, 14);
		add(lblObjektnummer);
		
		JLabel lblAnzahlDerBder = new JLabel("Anzahl der B\u00E4der");
		lblAnzahlDerBder.setFont(new Font("Arial", Font.PLAIN, 11));
		lblAnzahlDerBder.setBounds(44, 167, 132, 14);
		add(lblAnzahlDerBder);
		
		JLabel lblHeizungsart = new JLabel("Heizungsart");
		lblHeizungsart.setFont(new Font("Arial", Font.PLAIN, 11));
		lblHeizungsart.setBounds(330, 167, 86, 14);
		add(lblHeizungsart);
		
		JLabel lblbergabezeitraum = new JLabel("\u00DCbergabezeitraum");
		lblbergabezeitraum.setFont(new Font("Arial", Font.PLAIN, 11));
		lblbergabezeitraum.setBounds(330, 198, 132, 14);
		add(lblbergabezeitraum);
		
		JLabel lblObjektbeschreibung = new JLabel("Objektbeschreibung");
		lblObjektbeschreibung.setFont(new Font("Arial", Font.PLAIN, 11));
		lblObjektbeschreibung.setBounds(44, 223, 132, 14);
		add(lblObjektbeschreibung);
		
		JLabel lblKommentarfeld = new JLabel("Kommentarfeld");
		lblKommentarfeld.setFont(new Font("Arial", Font.PLAIN, 11));
		lblKommentarfeld.setBounds(44, 371, 106, 14);
		add(lblKommentarfeld);
		
		JLabel lblAktivitten = new JLabel("Aktivit\u00E4ten");
		lblAktivitten.setFont(new Font("Arial", Font.PLAIN, 11));
		lblAktivitten.setBounds(44, 425, 106, 14);
		add(lblAktivitten);
		
		JLabel lblNzahl = new JLabel("Anzahl Besichtigungen");
		lblNzahl.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNzahl.setBounds(44, 464, 202, 14);
		add(lblNzahl);
		
		JLabel lblLetzterKontakt = new JLabel("Letzter Kontakt");
		lblLetzterKontakt.setFont(new Font("Arial", Font.PLAIN, 11));
		lblLetzterKontakt.setBounds(330, 464, 132, 14);
		add(lblLetzterKontakt);
		
		textField = new JTextField();
		textField.setBounds(160, 461, 124, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(446, 192, 124, 20);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(446, 161, 124, 20);
		add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(160, 130, 124, 20);
		add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(160, 161, 124, 20);
		add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(446, 130, 124, 20);
		add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(446, 99, 124, 20);
		add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(160, 99, 124, 20);
		add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(446, 68, 124, 20);
		add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(160, 68, 124, 20);
		add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(446, 461, 124, 20);
		add(textField_13);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(160, 227, 410, 117);
		add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(160, 355, 410, 43);
		add(scrollPane_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(160, 409, 410, 41);
		add(scrollPane_2);
		
		JButton btnAnlegen = new JButton("Vorschau");
		btnAnlegen.setBounds(481, 524, 89, 23);
		add(btnAnlegen);
		
		JButton btnBildUrl = new JButton("Bild URL");
		btnBildUrl.setBounds(384, 524, 89, 23);
		add(btnBildUrl);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(170, 198, 408, 115);
		add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(207, 324, 408, 41);
		add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(189, 376, 408, 39);
		add(textPane_2);

	}
}
