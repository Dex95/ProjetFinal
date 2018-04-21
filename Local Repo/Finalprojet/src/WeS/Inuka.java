package WeS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.DefaultComboBoxModel;

public class Inuka {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_2;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inuka window = new Inuka();
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
	public Inuka() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Davids\\Downloads\\inukaa.png"));
		frame.setTitle("INUKA");
		frame.setBounds(0, 0, 1100, 780);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.LIGHT_GRAY);
		menuBar.setBounds(0, 0, 1084, 31);
		frame.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("inscription");
		mnNewMenu.setForeground(Color.BLUE);
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("lister");
		mnNewMenu_1.setForeground(Color.BLUE);
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("lister etudiant");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Er f = new Er();
				f.setVisible(true);
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenu mnRechercher = new JMenu("rechercher");
		mnRechercher.setForeground(Color.BLUE);
		menuBar.add(mnRechercher);
		
		JMenu mnNewMenu_2 = new JMenu("modifier");
		mnNewMenu_2.setForeground(Color.BLUE);
		menuBar.add(mnNewMenu_2);
		
		JMenu mnSupprimer = new JMenu("supprimer");
		mnSupprimer.setForeground(Color.BLUE);
		menuBar.add(mnSupprimer);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBorder(new MatteBorder(3, 3, 1, 3, (Color) Color.BLUE));
		panel.setBounds(0, 33, 1084, 221);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nom");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 21, 60, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(121, 19, 133, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPrenom = new JLabel("Prenom");
		lblPrenom.setForeground(Color.BLUE);
		lblPrenom.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrenom.setBounds(336, 22, 60, 14);
		panel.add(lblPrenom);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(406, 19, 133, 20);
		panel.add(textField_1);
		
		JLabel lblDateDeNaissance = new JLabel("Date de naissance");
		lblDateDeNaissance.setForeground(Color.BLUE);
		lblDateDeNaissance.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDateDeNaissance.setBounds(635, 22, 125, 14);
		panel.add(lblDateDeNaissance);
		
		JLabel lblLieuNaissance = new JLabel("Lieu naissance");
		lblLieuNaissance.setForeground(Color.BLUE);
		lblLieuNaissance.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLieuNaissance.setBounds(10, 66, 101, 14);
		panel.add(lblLieuNaissance);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(121, 64, 133, 20);
		panel.add(textField_3);
		
		JLabel lblNifcin = new JLabel("NIF/CIN");
		lblNifcin.setForeground(Color.BLUE);
		lblNifcin.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNifcin.setBounds(336, 66, 60, 14);
		panel.add(lblNifcin);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(406, 64, 133, 20);
		panel.add(textField_4);
		
		JLabel lblDateDinscription = new JLabel("Date d'inscription");
		lblDateDinscription.setForeground(Color.BLUE);
		lblDateDinscription.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDateDinscription.setBounds(635, 66, 125, 14);
		panel.add(lblDateDinscription);
		
		JLabel lblNoordreBacc = new JLabel("No 'ordre bacc");
		lblNoordreBacc.setForeground(Color.BLUE);
		lblNoordreBacc.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNoordreBacc.setBounds(10, 103, 101, 14);
		panel.add(lblNoordreBacc);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(121, 95, 133, 20);
		panel.add(textField_6);
		
		JLabel lblStatuMatrimonial = new JLabel("Statut matrimonial");
		lblStatuMatrimonial.setForeground(Color.BLUE);
		lblStatuMatrimonial.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStatuMatrimonial.setBounds(276, 103, 120, 14);
		panel.add(lblStatuMatrimonial);
		
		JLabel lblReferenceEtrangre = new JLabel("Reference etrang\u00E8re");
		lblReferenceEtrangre.setForeground(Color.BLUE);
		lblReferenceEtrangre.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblReferenceEtrangre.setBounds(635, 104, 133, 14);
		panel.add(lblReferenceEtrangre);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setForeground(Color.BLUE);
		lblAdresse.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAdresse.setBounds(10, 137, 60, 14);
		panel.add(lblAdresse);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(121, 135, 133, 20);
		panel.add(textField_9);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setForeground(Color.BLUE);
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTelefone.setBounds(336, 137, 60, 14);
		panel.add(lblTelefone);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(406, 132, 133, 20);
		panel.add(textField_10);
		
		JLabel lblPays = new JLabel("Pays");
		lblPays.setForeground(Color.BLUE);
		lblPays.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPays.setBounds(635, 138, 60, 14);
		panel.add(lblPays);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(782, 135, 133, 20);
		panel.add(textField_11);
		
		JLabel lblDicipline = new JLabel("Discipline");
		lblDicipline.setForeground(Color.BLUE);
		lblDicipline.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDicipline.setBounds(10, 172, 60, 14);
		panel.add(lblDicipline);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(121, 170, 133, 20);
		panel.add(textField_12);
		
		JLabel lblGroupe = new JLabel("Groupe");
		lblGroupe.setForeground(Color.BLUE);
		lblGroupe.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGroupe.setBounds(336, 172, 60, 14);
		panel.add(lblGroupe);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(406, 170, 133, 20);
		panel.add(textField_13);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox.setBounds(771, 19, 37, 20);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"janvier", "frevrier", "mars", "avril", "mai", "juin", "juilllet", "aout", "septembre", "octobre", "novembre", "decembre"}));
		comboBox_1.setBounds(818, 19, 70, 20);
		panel.add(comboBox_1);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(782, 101, 133, 20);
		panel.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(406, 95, 133, 20);
		panel.add(comboBox_4);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(898, 19, 45, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_2.setBounds(771, 64, 37, 20);
		panel.add(comboBox_2);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"janvier", "frevrier", "mars", "avril", "mai", "juin", "juilllet", "aout", "septembre", "octobre", "novembre", "decembre"}));
		comboBox_5.setBounds(818, 64, 70, 20);
		panel.add(comboBox_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(898, 64, 45, 20);
		panel.add(textField_5);
	}
}
