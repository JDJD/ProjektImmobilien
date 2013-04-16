package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import java.awt.CardLayout;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import org.eclipse.wb.swing.FocusTraversalOnArray;

public class Start {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
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
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_Start = new JPanel();
		panel_Start.setForeground(SystemColor.menu);
		panel_Start.setBounds(146, 0, 638, 573);
		panel_Start.setBorder(new LineBorder(new Color(0, 0, 0)));
		frame.getContentPane().add(panel_Start);
		panel_Start.setLayout(null);
		
		JLabel lblGrossesLogo = new JLabel("GROSSES LOGO");
		lblGrossesLogo.setFont(new Font("Arial Black", Font.BOLD, 38));
		lblGrossesLogo.setBounds(76, 239, 529, 121);
		panel_Start.add(lblGrossesLogo);
		
		//START PANEL - Nicht automatisch erzeugter Code
			panel_Start.setVisible(false);
		
		//Nicht automatisch erzeugter Code
		//OBJEKTE ANZEIGEN wird hierdurch immer angezeigt, Kunden_anzeigen_panel ist false
		Objekte_anzeigen oa = new Objekte_anzeigen();
		oa.setBounds(146, 0, 638, 573);
		frame.getContentPane().add(oa);
		oa.setVisible(false);
		//ObjektPanel	
		
		//Nicht automatisch erzeugter Code
		//KUNDEN ANZEIGEN wird hierdurch immer angezeigt, Kunden_anzeigen_panel ist false
		Kunden_anzeigen ka = new Kunden_anzeigen();
		ka.setBounds(146, 0, 638, 573);
		frame.getContentPane().add(ka);
		ka.setVisible(false);
		//KundenPanel
		
		
		//Nicht automatisch erzeugter Code
		//OBJEKTE ANLEGEN UND BEARBEITEN wird hierdurch immer angezeigt, Kunden_anzeigen_panel ist false und Objekt panel auch
		//Objekte_anlegen_bearbeiten oab = new Objekte_anlegen_bearbeiten();
		//oab.setBounds(146, 0, 638, 573);
		//frame.getContentPane().add(oab);
		//oab.setVisible(true);
		//Objekt anlegen/bearbeiten
		
		//TEST
		Objekte_anlegen_neu oab_neu = new Objekte_anlegen_neu();
		oab_neu.setBounds(146, 0, 638, 573);
		frame.getContentPane().add(oab_neu);
		oab_neu.setVisible(true);
		
		//Nicht automatisch erzeugter Code
		//KUNDEN ANLEGEN UND BEARBEITEN wird hierdurch immer angezeigt, Kunden_anzeigen_panel ist false und Objekt panel auch
		Kunden_anlegen_bearbeiten kab = new Kunden_anlegen_bearbeiten();
		kab.setBounds(146, 0, 638, 573);
		frame.getContentPane().add(kab);
		kab.setVisible(false);
		//Kunden anlegen/bearbeiten
	
		JLabel lblLogo = new JLabel("Logo");
		lblLogo.setBounds(45, 45, 46, 14);
		frame.getContentPane().add(lblLogo);
		
		JMenuItem mntmKundenAnlegen = new JMenuItem("Kunden anlegen");
		mntmKundenAnlegen.setBounds(10, 125, 123, 22);
		frame.getContentPane().add(mntmKundenAnlegen);
		
		JMenuItem mntmObjekteAnlegen = new JMenuItem("Objekte anlegen");
		mntmObjekteAnlegen.setBounds(10, 169, 121, 22);
		mntmObjekteAnlegen.setBorder((Border) Color.black);
		frame.getContentPane().add(mntmObjekteAnlegen);
		
		JMenuItem mntmKundenAnzeigen = new JMenuItem("Kunden anzeigen");
		mntmKundenAnzeigen.setBounds(10, 103, 123, 22);
		frame.getContentPane().add(mntmKundenAnzeigen);
		
		JMenuItem mntmObjekteAnzeigen = new JMenuItem("Objekte anzeigen");
		mntmObjekteAnzeigen.setBounds(10, 147, 121, 22);
		frame.getContentPane().add(mntmObjekteAnzeigen);
	}
}
