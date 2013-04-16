package GUI;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JTabbedPane;
import javax.swing.JSplitPane;
import javax.swing.JToggleButton;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class Objekte_anlegen_neu extends JPanel {
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
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;

	/**
	 * Create the panel.
	 */
	public Objekte_anlegen_neu() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setLocation(7, -95);
		add(panel);
		
		JLabel label = new JLabel("Objekt anlegen");
		label.setBounds(10, 11, 374, 41);
		label.setFont(new Font("Arial Black", Font.BOLD, 29));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 70, 638, 436);
		
		JButton button = new JButton("Bild URL");
		button.setBounds(372, 1235, 89, 23);
		
		JButton button_1 = new JButton("Vorschau");
		button_1.setBounds(469, 1235, 89, 23);
		
		JButton button_2 = new JButton("Bild URL");
		button_2.setBounds(390, 1206, 71, 23);
		
		JButton button_3 = new JButton("Vorschau");
		button_3.setBounds(469, 1206, 77, 23);
		
		JButton button_4 = new JButton("Bild URL");
		button_4.setBounds(28, 990, 71, 23);
		
		JButton button_5 = new JButton("Vorschau");
		button_5.setBounds(107, 990, 77, 23);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Allgemein", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel label_1 = new JLabel("Objektnummer");
		label_1.setFont(new Font("Arial", Font.PLAIN, 11));
		label_1.setBounds(24, 41, 106, 14);
		panel_2.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(143, 38, 124, 20);
		panel_2.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(143, 99, 124, 20);
		panel_2.add(textField_1);
		
		JLabel label_2 = new JLabel("Art");
		label_2.setFont(new Font("Arial", Font.PLAIN, 11));
		label_2.setBounds(24, 102, 46, 14);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("Anzahl der B\u00E4der");
		label_3.setFont(new Font("Arial", Font.PLAIN, 11));
		label_3.setBounds(24, 226, 132, 14);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("Wohnfl\u00E4che");
		label_4.setFont(new Font("Arial", Font.PLAIN, 11));
		label_4.setBounds(24, 130, 132, 14);
		panel_2.add(label_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(143, 130, 124, 20);
		panel_2.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(143, 223, 124, 20);
		panel_2.add(textField_3);
		
		JLabel label_5 = new JLabel("Titel");
		label_5.setFont(new Font("Arial", Font.PLAIN, 11));
		label_5.setBounds(24, 70, 46, 14);
		panel_2.add(label_5);
		
		JLabel label_6 = new JLabel("Baujahr");
		label_6.setFont(new Font("Arial", Font.PLAIN, 11));
		label_6.setBounds(24, 164, 46, 14);
		panel_2.add(label_6);
		
		JLabel label_7 = new JLabel("Zimmeranzahl");
		label_7.setFont(new Font("Arial", Font.PLAIN, 11));
		label_7.setBounds(24, 195, 106, 14);
		panel_2.add(label_7);
		
		JLabel label_8 = new JLabel("Heizungsart");
		label_8.setFont(new Font("Arial", Font.PLAIN, 11));
		label_8.setBounds(25, 260, 86, 14);
		panel_2.add(label_8);
		
		JLabel label_9 = new JLabel("\u00DCbergabezeitraum");
		label_9.setFont(new Font("Arial", Font.PLAIN, 11));
		label_9.setBounds(24, 285, 132, 14);
		panel_2.add(label_9);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(143, 254, 124, 20);
		panel_2.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(143, 282, 124, 20);
		panel_2.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(143, 161, 124, 20);
		panel_2.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(143, 192, 124, 20);
		panel_2.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(143, 68, 124, 20);
		panel_2.add(textField_8);
		
		JLabel lblStraeHausnummer = new JLabel("Stra\u00DFe, Hausnummer");
		lblStraeHausnummer.setFont(new Font("Arial", Font.PLAIN, 11));
		lblStraeHausnummer.setBounds(337, 229, 132, 14);
		panel_2.add(lblStraeHausnummer);
		
		JLabel lblPlzOrt = new JLabel("PLZ, Ort");
		lblPlzOrt.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPlzOrt.setBounds(337, 254, 132, 14);
		panel_2.add(lblPlzOrt);
		
		JLabel lblLand = new JLabel("Land");
		lblLand.setFont(new Font("Arial", Font.PLAIN, 11));
		lblLand.setBounds(337, 279, 132, 14);
		panel_2.add(lblLand);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(453, 226, 124, 20);
		panel_2.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(453, 251, 61, 20);
		panel_2.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(453, 276, 167, 20);
		panel_2.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(587, 226, 33, 20);
		panel_2.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(524, 251, 96, 20);
		panel_2.add(textField_13);
		
		JLabel label_15 = new JLabel("Kaufpreis");
		label_15.setFont(new Font("Arial", Font.PLAIN, 11));
		label_15.setBounds(337, 44, 106, 14);
		panel_2.add(label_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(456, 41, 123, 20);
		panel_2.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(456, 70, 124, 20);
		panel_2.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(456, 102, 124, 20);
		panel_2.add(textField_18);
		
		JLabel label_16 = new JLabel("Nebenkosten");
		label_16.setFont(new Font("Arial", Font.PLAIN, 11));
		label_16.setBounds(337, 105, 106, 14);
		panel_2.add(label_16);
		
		JLabel label_17 = new JLabel("Kaltmiete");
		label_17.setFont(new Font("Arial", Font.PLAIN, 11));
		label_17.setBounds(337, 73, 106, 14);
		panel_2.add(label_17);
		
		JLabel lblProvision = new JLabel("Provision");
		lblProvision.setFont(new Font("Arial", Font.PLAIN, 11));
		lblProvision.setBounds(337, 133, 106, 14);
		panel_2.add(lblProvision);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(456, 130, 123, 20);
		panel_2.add(textField_19);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Sonstiges", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel label_10 = new JLabel("Objektbeschreibung");
		label_10.setFont(new Font("Arial", Font.PLAIN, 11));
		label_10.setBounds(44, 21, 132, 14);
		panel_1.add(label_10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(168, 21, 410, 117);
		panel_1.add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(168, 163, 410, 77);
		panel_1.add(scrollPane_1);
		
		JTextPane textPane_1 = new JTextPane();
		scrollPane_1.setViewportView(textPane_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(168, 265, 410, 77);
		panel_1.add(scrollPane_2);
		
		JTextPane textPane_2 = new JTextPane();
		scrollPane_2.setViewportView(textPane_2);
		
		JLabel label_11 = new JLabel("Aktivit\u00E4ten");
		label_11.setFont(new Font("Arial", Font.PLAIN, 11));
		label_11.setBounds(44, 264, 106, 14);
		panel_1.add(label_11);
		
		JLabel label_12 = new JLabel("Kommentarfeld");
		label_12.setFont(new Font("Arial", Font.PLAIN, 11));
		label_12.setBounds(44, 162, 106, 14);
		panel_1.add(label_12);
		
		JLabel label_13 = new JLabel("Anzahl Besichtigungen");
		label_13.setFont(new Font("Arial", Font.PLAIN, 11));
		label_13.setBounds(49, 380, 202, 14);
		panel_1.add(label_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(168, 377, 124, 20);
		panel_1.add(textField_14);
		
		JLabel label_14 = new JLabel("Letzter Kontakt");
		label_14.setFont(new Font("Arial", Font.PLAIN, 11));
		label_14.setBounds(338, 380, 132, 14);
		panel_1.add(label_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(454, 377, 124, 20);
		panel_1.add(textField_15);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Ausstattung", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel label_19 = new JLabel("Einbauk\u00FCche");
		label_19.setFont(new Font("Arial", Font.PLAIN, 11));
		label_19.setBounds(263, 263, 61, 14);
		panel_3.add(label_19);
		
		JLabel label_20 = new JLabel("G\u00E4ste WC");
		label_20.setFont(new Font("Arial", Font.PLAIN, 11));
		label_20.setBounds(263, 238, 49, 14);
		panel_3.add(label_20);
		
		JLabel label_21 = new JLabel("Garten");
		label_21.setFont(new Font("Arial", Font.PLAIN, 11));
		label_21.setBounds(10, 160, 33, 14);
		panel_3.add(label_21);
		
		JLabel label_22 = new JLabel("Stellplatz");
		label_22.setFont(new Font("Arial", Font.PLAIN, 11));
		label_22.setBounds(263, 110, 43, 14);
		panel_3.add(label_22);
		
		JLabel label_23 = new JLabel("Garage");
		label_23.setFont(new Font("Arial", Font.PLAIN, 11));
		label_23.setBounds(263, 135, 36, 14);
		panel_3.add(label_23);
		
		JLabel label_24 = new JLabel("Grundfl\u00E4che");
		label_24.setFont(new Font("Arial", Font.PLAIN, 11));
		label_24.setBounds(10, 27, 60, 14);
		panel_3.add(label_24);
		
		JLabel label_25 = new JLabel("Balkon");
		label_25.setFont(new Font("Arial", Font.PLAIN, 11));
		label_25.setBounds(10, 110, 32, 14);
		panel_3.add(label_25);
		
		JLabel label_26 = new JLabel("Terrasse");
		label_26.setFont(new Font("Arial", Font.PLAIN, 11));
		label_26.setBounds(10, 135, 44, 14);
		panel_3.add(label_26);
		
		JLabel label_27 = new JLabel("Solar");
		label_27.setFont(new Font("Arial", Font.PLAIN, 11));
		label_27.setBounds(263, 27, 25, 14);
		panel_3.add(label_27);
		
		JLabel label_28 = new JLabel("Keller");
		label_28.setFont(new Font("Arial", Font.PLAIN, 11));
		label_28.setBounds(10, 263, 27, 14);
		panel_3.add(label_28);
		
		JLabel label_29 = new JLabel("Dachspeicher");
		label_29.setBounds(10, 238, 99, 14);
		panel_3.add(label_29);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(108, 24, 86, 20);
		panel_3.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(108, 107, 86, 20);
		panel_3.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(108, 132, 86, 20);
		panel_3.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(108, 157, 86, 20);
		panel_3.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(108, 235, 86, 20);
		panel_3.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(108, 260, 86, 20);
		panel_3.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(349, 24, 86, 20);
		panel_3.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(349, 107, 86, 20);
		panel_3.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(349, 132, 86, 20);
		panel_3.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(349, 235, 86, 20);
		panel_3.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(349, 260, 86, 20);
		panel_3.add(textField_30);
		panel.setLayout(null);
		panel.add(button);
		panel.add(button_1);
		panel.add(button_2);
		panel.add(button_3);
		panel.add(button_4);
		panel.add(button_5);
		panel.add(label);
		panel.add(tabbedPane);
		
		JButton button_6 = new JButton("Bild URL");
		button_6.setBounds(299, 524, 89, 23);
		panel.add(button_6);
		
		JButton button_7 = new JButton("Vorschau");
		button_7.setBounds(396, 524, 89, 23);
		panel.add(button_7);
		
		JButton btnSpeichern = new JButton("Speichern");
		btnSpeichern.setBounds(495, 524, 103, 23);
		panel.add(btnSpeichern);

	}
}
