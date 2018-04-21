package WeS;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToolBar;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JCheckBox;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;

public class AS extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_7;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTable table;
	private JTextField textField_9;
	private JTable table_1;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AS frame = new AS();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AS() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 850);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 80, 997, 669);
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("INSCRIPTION", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nom");
		lblNewLabel_1.setBounds(176, 31, 63, 17);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(249, 30, 110, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblPrenom = new JLabel("Prenom");
		lblPrenom.setBounds(32, 70, 63, 17);
		lblPrenom.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(lblPrenom);
		
		textField_1 = new JTextField();
		textField_1.setBounds(125, 69, 110, 20);
		textField_1.setColumns(10);
		panel_1.add(textField_1);
		
		JLabel lblLieuDeNaissance = new JLabel("Date de naissance");
		lblLieuDeNaissance.setBounds(273, 70, 116, 17);
		lblLieuDeNaissance.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(lblLieuDeNaissance);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(390, 69, 37, 20);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		panel_1.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(437, 69, 64, 20);
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"janvier", "frevrier", "mars", "avril", "mai", "juin", "juilllet", "aout", "septembre", "octobre", "novembre", "decembre"}));
		panel_1.add(comboBox_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(511, 69, 46, 20);
		textField_3.setColumns(10);
		panel_1.add(textField_3);
		
		JLabel lblNifcin = new JLabel("NIF/CIN");
		lblNifcin.setBounds(592, 31, 63, 17);
		lblNifcin.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(lblNifcin);
		
		textField_4 = new JTextField();
		textField_4.setBounds(676, 30, 130, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblDateDinscription = new JLabel("Date d'inscription");
		lblDateDinscription.setBounds(592, 72, 130, 17);
		lblDateDinscription.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(lblDateDinscription);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(708, 69, 42, 20);
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		panel_1.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(760, 69, 68, 20);
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"janvier", "frevrier", "mars", "avril", "mai", "juin", "juilllet", "aout", "septembre", "octobre", "novembre", "decembre"}));
		panel_1.add(comboBox_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(839, 69, 46, 20);
		textField_5.setColumns(10);
		panel_1.add(textField_5);
		
		JLabel lblNoDordreBacc = new JLabel("No d'ordre bacc");
		lblNoDordreBacc.setBounds(10, 109, 110, 17);
		lblNoDordreBacc.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(lblNoDordreBacc);
		
		textField_6 = new JTextField();
		textField_6.setBounds(125, 108, 110, 20);
		textField_6.setColumns(10);
		panel_1.add(textField_6);
		
		JLabel lblStatutMatrimonia = new JLabel("Statut matrimonial");
		lblStatutMatrimonia.setBounds(273, 111, 130, 17);
		lblStatutMatrimonia.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(lblStatutMatrimonia);
		
		JLabel lblReferences = new JLabel("References Etrangers");
		lblReferences.setBounds(592, 109, 130, 17);
		lblReferences.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(lblReferences);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(742, 108, 107, 20);
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"PERE", "MERE", "ONCLE", "TANTE", "COUSIN", "COUSINE"}));
		panel_1.add(comboBox_6);
		
		JLabel lblSpecifier = new JLabel("Pays");
		lblSpecifier.setBounds(659, 146, 46, 17);
		lblSpecifier.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(lblSpecifier);
		
		textField_8 = new JTextField();
		textField_8.setBounds(719, 145, 130, 20);
		textField_8.setColumns(10);
		panel_1.add(textField_8);
		
		JLabel lblDiscipline = new JLabel("Discipline");
		lblDiscipline.setBounds(10, 148, 80, 17);
		lblDiscipline.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(lblDiscipline);
		
		textField_10 = new JTextField();
		textField_10.setBounds(426, 145, 110, 20);
		textField_10.setColumns(10);
		panel_1.add(textField_10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(10, 188, 80, 17);
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(lblTelefone);
		
		textField_11 = new JTextField();
		textField_11.setBounds(125, 187, 110, 20);
		textField_11.setColumns(10);
		panel_1.add(textField_11);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBounds(429, 108, 107, 20);
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"Celibataire", "Marier", "Divorcer", "Autre"}));
		panel_1.add(comboBox_7);
		
		JLabel label = new JLabel("Specifier");
		label.setBounds(324, 146, 63, 17);
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(label);
		
		JLabel lblNewLabel_2 = new JLabel("EDUCATION:");
		lblNewLabel_2.setBounds(10, 250, 120, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 231, 959, 17);
		panel_1.add(separator);
		
		JLabel lblNewLabel_3 = new JLabel("Enseignement Primaire Annee:");
		lblNewLabel_3.setBounds(21, 312, 192, 14);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("De");
		lblNewLabel_4.setBounds(273, 313, 27, 14);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(lblNewLabel_4);
		
		textField_7 = new JTextField();
		textField_7.setBounds(303, 310, 86, 20);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblA = new JLabel("A");
		lblA.setBounds(399, 313, 27, 14);
		lblA.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(lblA);
		
		textField_12 = new JTextField();
		textField_12.setBounds(427, 310, 86, 20);
		textField_12.setColumns(10);
		panel_1.add(textField_12);
		
		JLabel lblEtablisementsFrequentes = new JLabel("Etablisements Frequentes:");
		lblEtablisementsFrequentes.setBounds(20, 354, 215, 17);
		lblEtablisementsFrequentes.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_1.add(lblEtablisementsFrequentes);
		
		JLabel lblA_1 = new JLabel("A.");
		lblA_1.setBounds(273, 356, 27, 14);
		lblA_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(lblA_1);
		
		textField_13 = new JTextField();
		textField_13.setBounds(303, 354, 86, 20);
		textField_13.setColumns(10);
		panel_1.add(textField_13);
		
		JLabel lblB = new JLabel("B.");
		lblB.setBounds(400, 356, 27, 14);
		lblB.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(lblB);
		
		textField_14 = new JTextField();
		textField_14.setBounds(427, 354, 86, 20);
		textField_14.setColumns(10);
		panel_1.add(textField_14);
		
		JLabel lblPiecesRemises = new JLabel("PIECES REMISES:");
		lblPiecesRemises.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPiecesRemises.setBounds(10, 392, 160, 14);
		panel_1.add(lblPiecesRemises);
		
		JLabel lblNewLabel_5 = new JLabel("Photocopie De Certiicat Bacc 2 +Original");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(21, 433, 233, 14);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblReleve = new JLabel("Relev\u00E9 De notes Bacc 2 +Original");
		lblReleve.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblReleve.setBounds(324, 432, 189, 17);
		panel_1.add(lblReleve);
		
		JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.setBounds(260, 433, 21, 23);
		panel_1.add(checkBox_1);
		
		JLabel lblPhotocopieDeLacte = new JLabel("Photocopie de L'acte de Naisance ou Extrait D'archives");
		lblPhotocopieDeLacte.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPhotocopieDeLacte.setBounds(608, 433, 307, 14);
		panel_1.add(lblPhotocopieDeLacte);
		
		JLabel lblCertificatDeBonne = new JLabel("Certificat de Bonne Vie Et Moeurs");
		lblCertificatDeBonne.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCertificatDeBonne.setBounds(29, 491, 197, 14);
		panel_1.add(lblCertificatDeBonne);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(536, 433, 21, 23);
		panel_1.add(checkBox);
		
		JCheckBox checkBox_2 = new JCheckBox("");
		checkBox_2.setBounds(938, 433, 21, 23);
		panel_1.add(checkBox_2);
		
		JLabel lblTroisPhotosIdentit = new JLabel("Trois Photos Identit\u00E9");
		lblTroisPhotosIdentit.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTroisPhotosIdentit.setBounds(324, 491, 130, 14);
		panel_1.add(lblTroisPhotosIdentit);
		
		JCheckBox checkBox_3 = new JCheckBox("");
		checkBox_3.setBounds(260, 487, 21, 23);
		panel_1.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("");
		checkBox_4.setBounds(536, 487, 21, 23);
		panel_1.add(checkBox_4);
		
		JButton btnNewButton = new JButton("Enregistrer");
		btnNewButton.setBounds(365, 552, 101, 23);
		panel_1.add(btnNewButton);
		
		JLabel lblCode = new JLabel("Code");
		lblCode.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCode.setBounds(27, 31, 37, 17);
		panel_1.add(lblCode);
		
		textField_16 = new JTextField();
		textField_16.setBounds(89, 30, 53, 20);
		panel_1.add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblGroupe = new JLabel("Groupe");
		lblGroupe.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGroupe.setBounds(324, 190, 63, 17);
		panel_1.add(lblGroupe);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"Matin", "Median", "Soir"}));
		comboBox_8.setBounds(426, 189, 110, 20);
		panel_1.add(comboBox_8);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setBounds(125, 145, 110, 20);
		panel_1.add(comboBox_9);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("LISTER", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Entrer Code Etudiant:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_6.setBounds(136, 56, 206, 33);
		panel_2.add(lblNewLabel_6);
		
		textField_15 = new JTextField();
		textField_15.setBounds(345, 64, 153, 20);
		panel_2.add(textField_15);
		textField_15.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Lister");
		btnNewButton_1.setBounds(368, 149, 89, 23);
		panel_2.add(btnNewButton_1);
		
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
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Code", "Date", "Nom", "Prenom", "Discipline", "Groupe"
			}
		));
		table.setBounds(10, 208, 709, 166);
		panel_2.add(table);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("SUPPRIMER", null, panel, null);
		panel.setLayout(null);
		
		JLabel label_1 = new JLabel("Entrer Code Etudiant:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_1.setBounds(115, 83, 206, 33);
		panel.add(label_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(342, 91, 153, 20);
		panel.add(textField_9);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
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
				"Code", "Date", "Nom", "Prenom", "Discipline", "Groupe"
			}
		));
		table_1.setBounds(10, 236, 709, 166);
		panel.add(table_1);
		
		JButton btnNewButton_2 = new JButton("Supprimer");
		btnNewButton_2.setBounds(342, 163, 123, 23);
		panel.add(btnNewButton_2);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("MODIFIER", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel label_2 = new JLabel("Code");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setBounds(34, 37, 37, 17);
		panel_3.add(label_2);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(79, 36, 53, 20);
		panel_3.add(textField_17);
		
		JLabel label_3 = new JLabel("Nom");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setBounds(184, 37, 63, 17);
		panel_3.add(label_3);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(237, 36, 110, 20);
		panel_3.add(textField_18);
		
		JLabel lblDateDeNaissance = new JLabel("Date De Naissance");
		lblDateDeNaissance.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDateDeNaissance.setBounds(368, 39, 120, 17);
		panel_3.add(lblDateDeNaissance);
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_10.setBounds(498, 36, 37, 20);
		panel_3.add(comboBox_10);
		
		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"janvier", "frevrier", "mars", "avril", "mai", "juin", "juilllet", "aout", "septembre", "octobre", "novembre", "decembre"}));
		comboBox_11.setBounds(555, 36, 64, 20);
		panel_3.add(comboBox_11);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(629, 36, 46, 20);
		panel_3.add(textField_19);
		
		JLabel label_5 = new JLabel("NIF/CIN");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_5.setBounds(715, 37, 63, 17);
		panel_3.add(label_5);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(788, 36, 130, 20);
		panel_3.add(textField_20);
		
		JLabel label_6 = new JLabel("Prenom");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_6.setBounds(34, 96, 63, 17);
		panel_3.add(label_6);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(112, 95, 110, 20);
		panel_3.add(textField_21);
		
		JLabel label_8 = new JLabel("Date d'inscription");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_8.setBounds(336, 96, 130, 17);
		panel_3.add(label_8);
		
		JComboBox comboBox_14 = new JComboBox();
		comboBox_14.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_14.setBounds(458, 95, 37, 20);
		panel_3.add(comboBox_14);
		
		JComboBox comboBox_15 = new JComboBox();
		comboBox_15.setModel(new DefaultComboBoxModel(new String[] {"janvier", "frevrier", "mars", "avril", "mai", "juin", "juilllet", "aout", "septembre", "octobre", "novembre", "decembre"}));
		comboBox_15.setBounds(505, 95, 64, 20);
		panel_3.add(comboBox_15);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(579, 95, 46, 20);
		panel_3.add(textField_23);
		
		JLabel label_9 = new JLabel("No d'ordre bacc");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_9.setBounds(655, 96, 103, 17);
		panel_3.add(label_9);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(770, 95, 110, 20);
		panel_3.add(textField_24);
		
		JLabel label_10 = new JLabel("Statut matrimonial");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_10.setBounds(34, 144, 130, 17);
		panel_3.add(label_10);
		
		JComboBox comboBox_16 = new JComboBox();
		comboBox_16.setModel(new DefaultComboBoxModel(new String[] {"Celibataire", "Marier", "Divorcer", "Autre"}));
		comboBox_16.setBounds(174, 143, 116, 20);
		panel_3.add(comboBox_16);
		
		JLabel label_11 = new JLabel("References Etrangers");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_11.setBounds(336, 144, 130, 17);
		panel_3.add(label_11);
		
		JComboBox comboBox_17 = new JComboBox();
		comboBox_17.setModel(new DefaultComboBoxModel(new String[] {"PERE", "MERE", "ONCLE", "TANTE", "COUSIN", "COUSINE"}));
		comboBox_17.setBounds(498, 143, 110, 20);
		panel_3.add(comboBox_17);
		
		JLabel label_12 = new JLabel("Discipline");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_12.setBounds(664, 144, 80, 17);
		panel_3.add(label_12);
		
		JComboBox comboBox_18 = new JComboBox();
		comboBox_18.setBounds(764, 143, 116, 20);
		panel_3.add(comboBox_18);
		
		JLabel label_13 = new JLabel("Specifier");
		label_13.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_13.setBounds(34, 202, 63, 17);
		panel_3.add(label_13);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(174, 201, 110, 20);
		panel_3.add(textField_25);
		
		JLabel label_14 = new JLabel("Pays");
		label_14.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_14.setBounds(420, 202, 46, 17);
		panel_3.add(label_14);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(505, 201, 110, 20);
		panel_3.add(textField_26);
		
		JLabel label_15 = new JLabel("Telefone");
		label_15.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_15.setBounds(34, 251, 80, 17);
		panel_3.add(label_15);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(180, 250, 110, 20);
		panel_3.add(textField_27);
		
		JLabel label_16 = new JLabel("Groupe");
		label_16.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_16.setBounds(403, 251, 63, 17);
		panel_3.add(label_16);
		
		JComboBox comboBox_19 = new JComboBox();
		comboBox_19.setModel(new DefaultComboBoxModel(new String[] {"Matin", "Median", "Soir"}));
		comboBox_19.setBounds(503, 250, 116, 20);
		panel_3.add(comboBox_19);
		
		JButton btnNewButton_3 = new JButton("Ok");
		btnNewButton_3.setBounds(368, 358, 89, 23);
		panel_3.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("UNIVERSITE INUKA");
		lblNewLabel.setBounds(117, 11, 584, 72);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Davids\\Downloads\\inuka.png"));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 29));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
	}
}
