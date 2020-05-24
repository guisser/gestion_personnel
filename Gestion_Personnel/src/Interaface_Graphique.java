import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Interaface_Graphique {
	Connection conn=Utilitaire.getConnection();

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	JButton btnNewButton = new JButton("LANCER");
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
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
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interaface_Graphique window = new Interaface_Graphique();
					window.frame.setVisible(true);
					window.frame.setTitle("Gestion_Personnel");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interaface_Graphique() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setType(Type.NORMAL);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(700, 800);
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Ajouter");
		mnNewMenu.setForeground(Color.RED);
		mnNewMenu.setBackground(Color.RED);
		menuBar.add(mnNewMenu);
		
		JMenu mnAgent = new JMenu("Agent");
		mnAgent.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenu.add(mnAgent);
		
		JLabel lblIdagent = new JLabel("ID_AGENT");
		mnAgent.add(lblIdagent);
		
		JTextArea textArea = new JTextArea();
		mnAgent.add(textArea);
		
		JLabel lblNewLabel = new JLabel("NOM");
		mnAgent.add(lblNewLabel);
		
		textField = new JTextField();
		mnAgent.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("PRENOM");
		mnAgent.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		mnAgent.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("ADRESSE");
		mnAgent.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		mnAgent.add(textField_2);
		textField_2.setColumns(10);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton) {
					metodebd m=new metodebd();
					m.ajouter_agent(textArea.getText(), textField.getText(), textField_1.getText(), textField_2.getText());
				}
			}
		});
		btnNewButton.setBackground(new Color(255, 140, 0));
		btnNewButton.setForeground(new Color(128, 0, 0));
		mnAgent.add(btnNewButton);
		
		JLabel label = new JLabel("");
		mnAgent.add(label);
		
		JMenu mnAffectation = new JMenu("agent_affectation");
		mnAffectation.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenu.add(mnAffectation);
		
		JLabel lblNewLabel_5 = new JLabel("ID_Agent_Affectation");
		mnAffectation.add(lblNewLabel_5);
		
		textField_16 = new JTextField();
		mnAffectation.add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("ID_Agent");
		mnAffectation.add(lblNewLabel_6);
		
		textField_17 = new JTextField();
		mnAffectation.add(textField_17);
		textField_17.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("ID_Affectation");
		mnAffectation.add(lblNewLabel_7);
		
		textField_18 = new JTextField();
		mnAffectation.add(textField_18);
		textField_18.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Fonction");
		mnAffectation.add(lblNewLabel_8);
		
		textField_19 = new JTextField();
		mnAffectation.add(textField_19);
		textField_19.setColumns(10);
		
		JButton btnNewButton_6 = new JButton("LANCER");
		btnNewButton_6.setForeground(new Color(128, 0, 0));
		btnNewButton_6.setBackground(new Color(255, 140, 0));
		mnAffectation.add(btnNewButton_6);
		
		JMenu mnDcision = new JMenu("d\u00E9cision");
		mnDcision.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenu.add(mnDcision);
		
		JLabel lblNewLabel_9 = new JLabel("ID_Decision");
		mnDcision.add(lblNewLabel_9);
		
		textField_20 = new JTextField();
		mnDcision.add(textField_20);
		textField_20.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("ID_Agent");
		mnDcision.add(lblNewLabel_10);
		
		textField_21 = new JTextField();
		mnDcision.add(textField_21);
		textField_21.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("ID_Poste");
		mnDcision.add(lblNewLabel_11);
		
		textField_22 = new JTextField();
		mnDcision.add(textField_22);
		textField_22.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Visa");
		mnDcision.add(lblNewLabel_12);
		
		textField_23 = new JTextField();
		mnDcision.add(textField_23);
		textField_23.setColumns(10);
		
		JButton btnLancer = new JButton("LANCER");
		btnLancer.setBackground(new Color(255, 140, 0));
		btnLancer.setForeground(new Color(128, 0, 0));
		mnDcision.add(btnLancer);
		
		JMenu mnNewMenu_2 = new JMenu("grade_agent");
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenu.add(mnNewMenu_2);
		
		JLabel lblNewLabel_13 = new JLabel("ID_Agent_grade");
		mnNewMenu_2.add(lblNewLabel_13);
		
		textField_24 = new JTextField();
		mnNewMenu_2.add(textField_24);
		textField_24.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("ID_Agent");
		mnNewMenu_2.add(lblNewLabel_14);
		
		textField_25 = new JTextField();
		mnNewMenu_2.add(textField_25);
		textField_25.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("ID_Grade");
		mnNewMenu_2.add(lblNewLabel_15);
		
		textField_26 = new JTextField();
		mnNewMenu_2.add(textField_26);
		textField_26.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("Date_Obtention_Grade");
		mnNewMenu_2.add(lblNewLabel_17);
		
		textField_27 = new JTextField();
		mnNewMenu_2.add(textField_27);
		textField_27.setColumns(10);
		
		JButton btnNewButton_7 = new JButton("LANCER");
		btnNewButton_7.setForeground(new Color(128, 0, 0));
		btnNewButton_7.setBackground(new Color(255, 140, 0));
		mnNewMenu_2.add(btnNewButton_7);
		
		JMenu mnNewMenu_3 = new JMenu("qualification_agent");
		mnNewMenu_3.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenu.add(mnNewMenu_3);
		
		JLabel lblNewLabel_18 = new JLabel("ID_Agent_Qualification");
		mnNewMenu_3.add(lblNewLabel_18);
		
		textField_28 = new JTextField();
		mnNewMenu_3.add(textField_28);
		textField_28.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ID_Agent");
		mnNewMenu_3.add(lblNewLabel_2);
		
		textField_29 = new JTextField();
		mnNewMenu_3.add(textField_29);
		textField_29.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("ID_Qualification");
		mnNewMenu_3.add(lblNewLabel_19);
		
		textField_30 = new JTextField();
		mnNewMenu_3.add(textField_30);
		textField_30.setColumns(10);
		
		JLabel lblNewLabel_20 = new JLabel("Date_Qualification");
		mnNewMenu_3.add(lblNewLabel_20);
		
		textField_31 = new JTextField();
		mnNewMenu_3.add(textField_31);
		textField_31.setColumns(10);
		
		JButton btnNewButton_8 = new JButton("LANCER");
		btnNewButton_8.setForeground(new Color(128, 0, 0));
		btnNewButton_8.setBackground(new Color(255, 140, 0));
		mnNewMenu_3.add(btnNewButton_8);
		
		JMenu mnPoste = new JMenu("poste");
		mnPoste.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenu.add(mnPoste);
		
		JMenu mnDiplome = new JMenu("diplome");
		mnDiplome.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenu.add(mnDiplome);
		
		JLabel lblNewLabel_21 = new JLabel("ID_Diplome");
		mnDiplome.add(lblNewLabel_21);
		
		textField_32 = new JTextField();
		mnDiplome.add(textField_32);
		textField_32.setColumns(10);
		
		JLabel lblNewLabel_22 = new JLabel("Libele_Diplome");
		mnDiplome.add(lblNewLabel_22);
		
		textField_33 = new JTextField();
		mnDiplome.add(textField_33);
		textField_33.setColumns(10);
		
		JLabel lblNewLabel_23 = new JLabel("ID_Agent");
		mnDiplome.add(lblNewLabel_23);
		
		textField_34 = new JTextField();
		mnDiplome.add(textField_34);
		textField_34.setColumns(10);
		
		JLabel lblNewLabel_24 = new JLabel("Date_Obtention_Diplome");
		mnDiplome.add(lblNewLabel_24);
		
		textField_35 = new JTextField();
		mnDiplome.add(textField_35);
		textField_35.setColumns(10);
		
		JButton btnNewButton_9 = new JButton("LANCER");
		btnNewButton_9.setForeground(new Color(128, 0, 0));
		btnNewButton_9.setBackground(new Color(255, 140, 0));
		mnDiplome.add(btnNewButton_9);
		
		JMenu mnCong = new JMenu("cong\u00E9");
		mnCong.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenu.add(mnCong);
		
		JLabel lblNewLabel_25 = new JLabel("ID_Cong\u00E9");
		mnCong.add(lblNewLabel_25);
		
		textField_36 = new JTextField();
		mnCong.add(textField_36);
		textField_36.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Libele_Cong\u00E9");
		mnCong.add(lblNewLabel_16);
		
		textField_37 = new JTextField();
		mnCong.add(textField_37);
		textField_37.setColumns(10);
		
		JLabel lblNewLabel_26 = new JLabel("ID_Agent");
		mnCong.add(lblNewLabel_26);
		
		textField_38 = new JTextField();
		mnCong.add(textField_38);
		textField_38.setColumns(10);
		
		JLabel lblNewLabel_27 = new JLabel("Date_D\u00E9but_Cong\u00E9");
		mnCong.add(lblNewLabel_27);
		
		textField_39 = new JTextField();
		mnCong.add(textField_39);
		textField_39.setColumns(10);
		
		JLabel lblNewLabel_28 = new JLabel("Date_Fin_Cong\u00E9");
		mnCong.add(lblNewLabel_28);
		
		textField_40 = new JTextField();
		mnCong.add(textField_40);
		textField_40.setColumns(10);
		
		JButton btnLancer_1 = new JButton("LANCER");
		btnLancer_1.setForeground(new Color(128, 0, 0));
		btnLancer_1.setBackground(new Color(255, 140, 0));
		mnCong.add(btnLancer_1);
		
		JMenu mnNewMenu_1 = new JMenu("Afficher");
		mnNewMenu_1.setForeground(Color.RED);
		menuBar.add(mnNewMenu_1);
		
		JLabel lblAgentN = new JLabel("Agent n\u00B0");
		lblAgentN.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		mnNewMenu_1.add(lblAgentN);
		
		textField_3 = new JTextField();
		mnNewMenu_1.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnAfficheragent = new JButton("afficher_agent");
		btnAfficheragent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if(event.getSource()==btnAfficheragent) {
					metodebd m=new metodebd();
					m.afficher_agent(textField_3 .getText());
					
				}
			}
		});
		btnAfficheragent.setForeground(new Color(128, 0, 0));
		btnAfficheragent.setBackground(new Color(255, 140, 0));
		btnAfficheragent.setFont(new Font("SansSerif", Font.PLAIN, 13));
		mnNewMenu_1.add(btnAfficheragent);
		
		JLabel lblGradeagentN = new JLabel("grade_agent n\u00B0");
		lblGradeagentN.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		mnNewMenu_1.add(lblGradeagentN);
		
		textField_5 = new JTextField();
		mnNewMenu_1.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnAffichergrade = new JButton("afficher_grade");
		btnAffichergrade.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnAffichergrade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnAffichergrade) {
					metodebd m=new metodebd();
					m.afficher_les_grade_agent(textField_5.getText());
				}
			}
		});
		btnAffichergrade.setBackground(new Color(255, 140, 0));
		btnAffichergrade.setForeground(new Color(128, 0, 0));
		mnNewMenu_1.add(btnAffichergrade);
		
		JLabel lblDiplomeagentN = new JLabel("diplome_agent n\u00B0");
		lblDiplomeagentN.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		mnNewMenu_1.add(lblDiplomeagentN);
		
		textField_4 = new JTextField();
		mnNewMenu_1.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnAfficherdiplome = new JButton("afficher_diplome");
		btnAfficherdiplome.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnAfficherdiplome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnAfficherdiplome) {
					metodebd m=new metodebd();
					m.afficher_les_diplome_agent(textField_4.getText());
				}
			}
		});
		btnAfficherdiplome.setForeground(new Color(128, 0, 0));
		btnAfficherdiplome.setBackground(new Color(255, 140, 0));
		mnNewMenu_1.add(btnAfficherdiplome);
		
		JLabel lblPosteagent = new JLabel("poste_agent");
		lblPosteagent.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		mnNewMenu_1.add(lblPosteagent);
		
		textField_6 = new JTextField();
		mnNewMenu_1.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnAfficherposte = new JButton("afficher_poste");
		btnAfficherposte.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnAfficherposte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnAfficherposte) {
					metodebd m=new metodebd();
					m.afficher_les_poste_agent("1");
				}
			}
		});
		btnAfficherposte.setBackground(new Color(255, 140, 0));
		btnAfficherposte.setForeground(new Color(128, 0, 0));
		mnNewMenu_1.add(btnAfficherposte);
		
		JLabel lblCongagentN = new JLabel("cong\u00E9_agent n\u00B0");
		lblCongagentN.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		mnNewMenu_1.add(lblCongagentN);
		
		textField_7 = new JTextField();
		mnNewMenu_1.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("afficher_cong\u00E9");
		btnNewButton_1.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_1) {
					metodebd m=new metodebd();
					m.afficher_les_congé_agent("1");
				}
			}
		});
		btnNewButton_1.setBackground(new Color(255, 140, 0));
		btnNewButton_1.setForeground(new Color(128, 0, 0));
		mnNewMenu_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("d\u00E9cision_agent n\u00B0");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		mnNewMenu_1.add(lblNewLabel_4);
		
		textField_8 = new JTextField();
		mnNewMenu_1.add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("afficher_d\u00E9cision");
		btnNewButton_2.setBackground(new Color(255, 140, 0));
		btnNewButton_2.setForeground(new Color(128, 0, 0));
		btnNewButton_2.setFont(new Font("SansSerif", Font.PLAIN, 13));
		mnNewMenu_1.add(btnNewButton_2);
		
		JLabel lblQualificationagentN = new JLabel("qualification_agent n\u00B0");
		lblQualificationagentN.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		mnNewMenu_1.add(lblQualificationagentN);
		
		textField_9 = new JTextField();
		mnNewMenu_1.add(textField_9);
		textField_9.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("afficher_qualification");
		btnNewButton_3.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_3 ) {
					metodebd m= new metodebd();
					m.afficher_les_qualification_agent(textField_9.getText());
				}
			}
		});
		btnNewButton_3.setForeground(new Color(128, 0, 0));
		btnNewButton_3.setBackground(new Color(255, 140, 0));
		mnNewMenu_1.add(btnNewButton_3);
		
		JLabel lblAffectationagentN = new JLabel("affectation_agent n\u00B0");
		lblAffectationagentN.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		mnNewMenu_1.add(lblAffectationagentN);
		
		textField_10 = new JTextField();
		mnNewMenu_1.add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("afficher_affectation");
		btnNewButton_4.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_4) {
					metodebd m =new metodebd();
					m.afficher_les_unités_affectation_agent(textField_10.getText());
				}
			}
		});
		btnNewButton_4.setForeground(new Color(128, 0, 0));
		btnNewButton_4.setBackground(new Color(255, 165, 0));
		mnNewMenu_1.add(btnNewButton_4);
		
		JMenu mnNewMenu_4 = new JMenu("Modifier");
		mnNewMenu_4.setForeground(new Color(255, 0, 0));
		menuBar.add(mnNewMenu_4);
		
		JMenu mnAgent_1 = new JMenu("Agent");
		mnAgent_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenu_4.add(mnAgent_1);
		
		JLabel lblNouveauid = new JLabel("      NouveauID");
		mnAgent_1.add(lblNouveauid);
		
		textField_12 = new JTextField();
		mnAgent_1.add(textField_12);
		textField_12.setColumns(10);
		
		JMenu mnNouveaunom = new JMenu("NouveauNom");
		mnNouveaunom.setFont(new Font("Tahoma", Font.PLAIN, 13));
		mnAgent_1.add(mnNouveaunom);
		
		textField_13 = new JTextField();
		mnAgent_1.add(textField_13);
		textField_13.setColumns(10);
		
		JMenu mnNouveauprenom = new JMenu("NouveauPrenom");
		mnNouveauprenom.setFont(new Font("Tahoma", Font.PLAIN, 13));
		mnAgent_1.add(mnNouveauprenom);
		
		textField_14 = new JTextField();
		mnAgent_1.add(textField_14);
		textField_14.setColumns(10);
		
		JMenu mnNouvelleadresse = new JMenu("NouvelleAdresse");
		mnNouvelleadresse.setFont(new Font("Tahoma", Font.PLAIN, 13));
		mnAgent_1.add(mnNouvelleadresse);
		
		textField_15 = new JTextField();
		mnAgent_1.add(textField_15);
		textField_15.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("Valider");
		btnNewButton_5.setBackground(new Color(255, 140, 0));
		btnNewButton_5.setForeground(new Color(128, 0, 0));
		mnAgent_1.add(btnNewButton_5);
		
		JMenu mnNewMenu_5 = new JMenu("decision");
		mnNewMenu_5.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));
		mnNewMenu_4.add(mnNewMenu_5);
		
		JLabel lblNewLabel_29 = new JLabel("n\u00B0_d\u00E9cision \u00E0 changer");
		mnNewMenu_5.add(lblNewLabel_29);
		
		textField_41 = new JTextField();
		mnNewMenu_5.add(textField_41);
		textField_41.setColumns(10);
		
		JLabel lblNewLabel_30 = new JLabel("ID_d\u00E9cision");
		mnNewMenu_5.add(lblNewLabel_30);
		
		textField_42 = new JTextField();
		mnNewMenu_5.add(textField_42);
		textField_42.setColumns(10);
		
		JLabel lblNewLabel_31 = new JLabel("ID_Agent");
		mnNewMenu_5.add(lblNewLabel_31);
		
		textField_43 = new JTextField();
		mnNewMenu_5.add(textField_43);
		textField_43.setColumns(10);
		
		JLabel lblNewLabel_32 = new JLabel("ID_Poste");
		mnNewMenu_5.add(lblNewLabel_32);
		
		textField_44 = new JTextField();
		mnNewMenu_5.add(textField_44);
		textField_44.setColumns(10);
		
		JLabel lblNewLabel_33 = new JLabel("Visa");
		mnNewMenu_5.add(lblNewLabel_33);
		
		textField_45 = new JTextField();
		mnNewMenu_5.add(textField_45);
		textField_45.setColumns(10);
		
		JButton btnNewButton_10 = new JButton("LANCER");
		btnNewButton_10.setForeground(new Color(128, 0, 0));
		btnNewButton_10.setBackground(new Color(255, 140, 0));
		mnNewMenu_5.add(btnNewButton_10);
		
		JMenu mnNewMenu_6 = new JMenu("New menu");
		mnNewMenu_4.add(mnNewMenu_6);
		
		JMenu mnSupprimer = new JMenu("supprimer");
		mnSupprimer.setForeground(new Color(255, 0, 0));
		menuBar.add(mnSupprimer);
		
		JLabel lblAgentN_1 = new JLabel("agent n\u00B0");
		lblAgentN_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblAgentN_1.setForeground(new Color(0, 0, 0));
		mnSupprimer.add(lblAgentN_1);
		
		textField_11 = new JTextField();
		mnSupprimer.add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnSupprimeragent = new JButton("supprimer_agent");
		btnSupprimeragent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnSupprimeragent) {
					metodebd m=new metodebd();
					m.supprimer_agent("3");
				}
			}
		});
		btnSupprimeragent.setForeground(new Color(128, 0, 0));
		btnSupprimeragent.setBackground(new Color(255, 140, 0));
		mnSupprimer.add(btnSupprimeragent);
		
		JLabel lblBienvenueDansVotre = new JLabel("               Bienvenue Dans Votre Application !");
		lblBienvenueDansVotre.setForeground(new Color(139, 0, 139));
		lblBienvenueDansVotre.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		frame.getContentPane().add(lblBienvenueDansVotre, BorderLayout.CENTER);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
