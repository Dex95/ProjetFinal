package WeS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.ScrollPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import java.awt.Label;
import java.awt.Toolkit;

public class Transac {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transac window = new Transac();
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
	public Transac() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("SOGEBANK");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Davids\\Downloads\\sss.jpg"));
		frame.setBounds(100, 100, 950, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(302, 11, 287, 89);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SOGEBANK");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(103, 25, 100, 36);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLUE);
		panel_1.setBounds(22, 168, 475, 382);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("No Transaction");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setLabelFor(frame);
		lblNewLabel_1.setBounds(25, 21, 112, 29);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setForeground(Color.RED);
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDate.setBounds(25, 47, 60, 29);
		panel_1.add(lblDate);
		
		JLabel lblSurccusale = new JLabel("Surccusale");
		lblSurccusale.setForeground(Color.RED);
		lblSurccusale.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSurccusale.setBounds(25, 78, 87, 29);
		panel_1.add(lblSurccusale);
		
		JLabel lblNomDuCompte = new JLabel("Nom du Compte");
		lblNomDuCompte.setForeground(Color.RED);
		lblNomDuCompte.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNomDuCompte.setBounds(25, 116, 112, 29);
		panel_1.add(lblNomDuCompte);
		
		JLabel lblNoDeTrabsaction = new JLabel("No de Trabsaction");
		lblNoDeTrabsaction.setForeground(Color.RED);
		lblNoDeTrabsaction.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNoDeTrabsaction.setBounds(25, 156, 129, 29);
		panel_1.add(lblNoDeTrabsaction);
		
		JLabel lblTypeCompte = new JLabel("Type compte");
		lblTypeCompte.setForeground(Color.RED);
		lblTypeCompte.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTypeCompte.setBounds(25, 193, 112, 29);
		panel_1.add(lblTypeCompte);
		
		JLabel lblDevise = new JLabel("Devise");
		lblDevise.setForeground(Color.RED);
		lblDevise.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDevise.setBounds(25, 220, 112, 29);
		panel_1.add(lblDevise);
		
		JLabel lblTypeDeTransaction = new JLabel("Type de Transaction");
		lblTypeDeTransaction.setForeground(Color.RED);
		lblTypeDeTransaction.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTypeDeTransaction.setBounds(23, 250, 144, 29);
		panel_1.add(lblTypeDeTransaction);
		
		JLabel lblMontant = new JLabel("Montant");
		lblMontant.setForeground(Color.RED);
		lblMontant.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMontant.setBounds(25, 290, 69, 29);
		panel_1.add(lblMontant);
		
		textField = new JTextField();
		textField.setBounds(153, 26, 175, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(153, 83, 175, 20);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(153, 121, 175, 20);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(153, 161, 175, 20);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(153, 290, 175, 20);
		panel_1.add(textField_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox.setBounds(153, 52, 39, 20);
		panel_1.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"janvier", "frevrier", "mars", "avril", "mai", "juin", "juillet", "aout", "septembre", "octobre", "novembre", "decembre"}));
		comboBox_1.setBounds(202, 52, 77, 20);
		panel_1.add(comboBox_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(292, 52, 46, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Compte Epargne", "Compte Courant", "Compte individuel", "Compte Joint"}));
		comboBox_2.setBounds(153, 198, 175, 20);
		panel_1.add(comboBox_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("HTG");
		rdbtnNewRadioButton.setBounds(151, 224, 53, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnUsd = new JRadioButton("USD");
		rdbtnUsd.setBounds(217, 224, 53, 23);
		panel_1.add(rdbtnUsd);
		
		JRadioButton rdbtnEu = new JRadioButton("EU");
		rdbtnEu.setBounds(275, 224, 53, 23);
		panel_1.add(rdbtnEu);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Depot", "Retrait"}));
		comboBox_3.setBounds(171, 255, 157, 20);
		panel_1.add(comboBox_3);
		
		JButton btnNewButton = new JButton("valider");
		btnNewButton.setBounds(153, 340, 89, 23);
		panel_1.add(btnNewButton);
		
		JButton btnQuitter = new JButton("quitter");
		btnQuitter.setBounds(265, 340, 89, 23);
		panel_1.add(btnQuitter);
		
		JLabel lblNewLabel_2 = new JLabel("Depot");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(217, 1, 46, 14);
		panel_1.add(lblNewLabel_2);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Date", "No Transaction", "Surccusale", "No  compte", "Type tansaction", "Montant"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(103);
		table.getColumnModel().getColumn(4).setPreferredWidth(91);
		table.setBounds(507, 213, 417, 136);
		frame.getContentPane().add(table);
		
		JLabel lblNewLabel_3 = new JLabel("Transaction");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(507, 174, 102, 20);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Davids\\Downloads\\sogebank.png"));
		lblNewLabel_5.setBounds(618, 65, 306, 107);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
