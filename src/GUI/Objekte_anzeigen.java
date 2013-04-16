package GUI;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Objekte_anzeigen extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Create the panel.
	 */
	public Objekte_anzeigen() {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setLayout(null);
		
		JButton button = new JButton("Filtern");
		button.setBounds(327, 184, 79, 23);
		add(button);
		
		JButton button_1 = new JButton("Bearbeiten");
		button_1.setBounds(427, 184, 97, 23);
		add(button_1);
		
		textField = new JTextField();
		textField.setBounds(517, 120, 86, 20);
		textField.setColumns(10);
		add(textField);
		
		JLabel label = new JLabel("Ort");
		label.setFont(new Font("Arial", Font.PLAIN, 11));
		label.setBounds(212, 129, 79, 14);
		add(label);
		
		JLabel lblObjekteAnzeigen = new JLabel("Objekte anzeigen");
		lblObjekteAnzeigen.setBounds(10, 11, 374, 41);
		lblObjekteAnzeigen.setFont(new Font("Arial Black", Font.BOLD, 29));
		add(lblObjekteAnzeigen);
		
		JLabel label_2 = new JLabel("Name");
		label_2.setFont(new Font("Arial", Font.PLAIN, 11));
		label_2.setBounds(431, 92, 57, 14);
		add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(517, 89, 86, 20);
		textField_1.setColumns(10);
		add(textField_1);
		
		JLabel label_3 = new JLabel("Vorname");
		label_3.setBounds(656, 92, 42, 14);
		add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(703, 89, 86, 20);
		textField_2.setColumns(10);
		add(textField_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 215, 618, 366);
		
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblObjektspezifischeDaten = new JLabel("objektspezifische Daten");
		lblObjektspezifischeDaten.setFont(new Font("Arial", Font.BOLD, 11));
		lblObjektspezifischeDaten.setBounds(10, 63, 151, 14);
		add(lblObjektspezifischeDaten);
		
		JLabel lblTitel = new JLabel("Objektnummer");
		lblTitel.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTitel.setBounds(10, 92, 118, 14);
		add(lblTitel);
		
		JLabel lblTitel_1 = new JLabel("Titel");
		lblTitel_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTitel_1.setBounds(10, 126, 46, 14);
		add(lblTitel_1);
		
		JLabel lblArt = new JLabel("Art");
		lblArt.setFont(new Font("Arial", Font.PLAIN, 11));
		lblArt.setBounds(10, 151, 46, 25);
		add(lblArt);
		
		JLabel lblBaujahr = new JLabel("Baujahr");
		lblBaujahr.setFont(new Font("Arial", Font.PLAIN, 11));
		lblBaujahr.setBounds(10, 187, 46, 14);
		add(lblBaujahr);
		
		JLabel lblStrae = new JLabel("Stra\u00DFe");
		lblStrae.setFont(new Font("Arial", Font.PLAIN, 11));
		lblStrae.setBounds(212, 92, 46, 14);
		add(lblStrae);
		
		textField_3 = new JTextField();
		textField_3.setBounds(99, 89, 86, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(99, 123, 86, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(99, 153, 86, 20);
		add(comboBox);
		
		textField_5 = new JTextField();
		textField_5.setBounds(99, 184, 86, 20);
		add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(317, 89, 86, 20);
		add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(317, 120, 86, 20);
		add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblKundenspezifischeDaten = new JLabel("kundenspezifische Daten");
		lblKundenspezifischeDaten.setFont(new Font("Arial", Font.BOLD, 11));
		lblKundenspezifischeDaten.setBounds(431, 63, 167, 14);
		add(lblKundenspezifischeDaten);
		
		JLabel lblVorname = new JLabel("Vorname");
		lblVorname.setFont(new Font("Arial", Font.PLAIN, 11));
		lblVorname.setBounds(431, 126, 76, 14);
		add(lblVorname);
		
		JLabel lblMitarbeiterkrzel = new JLabel("Mitarbeiterk\u00FCrzel");
		lblMitarbeiterkrzel.setFont(new Font("Arial", Font.PLAIN, 11));
		lblMitarbeiterkrzel.setBounds(212, 151, 97, 25);
		add(lblMitarbeiterkrzel);
		
		textField_8 = new JTextField();
		textField_8.setBounds(317, 153, 86, 20);
		add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnLschen = new JButton("L\u00F6schen");
		btnLschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLschen.setBounds(542, 184, 86, 23);
		add(btnLschen);
		
		
		
	}
}
