import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.PreparedStatement;

import java.awt.*;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.sql.Connection;
public class framegestion extends JFrame {

	private JPanel panel_par_defaut;
	private JPanel congé_panel1;
	private JPanel congé_panel2;
	private JPanel congé_panel3;
	private JPanel congé_panel4;
	private JPanel congé_panel5;
	private JPanel congé_panel6;
	private JTextField textField_congé;
	private JTextField textField;
	private JTextField textField1_cp2;
	private JTextField textField2_cp2;
	private JTextField textField3_cp2;
	private JTextField textField4_cp2;
	private JTextField textField5_cp2;
	private JTextField textField1_dp2;
	private JTextField textField2_dp2;
	private JTextField textField3_dp2;
	private JTextField textField4_dp2;
	private JTextField textField5_dp2;
	private JTextField textField1_dp3;
	private JTextField textField_dp;
	private JTextField textField1_af2;
	private JTextField textField2_af2;
	private JTextField textField3_af2;
	private JTextField textField4_af2;
	private JTextField textField1_af3;
	
	
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_5;
	
	private JTextField textField_11;
	
	
	private JPanel diplome_panel1;
	private JPanel diplome_panel2;
	private JPanel diplome_panel3;
	private JPanel diplome_panel4;
	private JPanel diplome_panel5;
	private JPanel diplome_panel6;
	
	
	
	private JPanel affectation_panel1;
	private JPanel affectation_panel2;
	private JPanel affectation_panel3;
	private JPanel affectation_panel4;
	private JPanel affectation_panel5;
	private JPanel affectation_panel6;
	
	
	
	private JPanel liste_admis;
	private JTextField textField_name;
	private JTextField textField_pren;
	private JTextField textField_cin;
	private JTextField textField_id;
	private JTable table;
	private JButton btn_actu;
	
	
	private JPanel Dcp;
	private JTextField txt_congé_agent;
	private JButton btn_afficher_diplome_agent;
	private JTextField txt_diplome_agent;
	private JTextField txt_affectation_agent;
	private JTextField textField3_cp3;
	private JTextField textField_1;
	private JTextField textField1_cp3;
	private JTextField textField2_cp3;
	private JTextField txt3_cp3;
	private JTextField txt4_cp3;
	private JTextField txt5_cp3;
	
	
	
	Connection conn=Utilitaire.getConnection();
	private JTextField textField1_cp6;
	private JTextField textField2_cp6;
	private JTextField textField3_cp6;
	private JTextField textField4_cp6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					framegestion frame = new framegestion();
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
	public framegestion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(800,550);
		setResizable(false);
		setVisible(false);
		setLocation(400,150);
		
		
		//création dupanel panel_par_defaut c'est le panel de la fenetre.
		
		panel_par_defaut=new JPanel();
		panel_par_defaut.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(panel_par_defaut);
		panel_par_defaut.setLayout(null);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Création du congé_panel1 qui est l'accueil du congé
		
		congé_panel1=new JPanel();
		congé_panel1.setBackground(UIManager.getColor("checkBox.background"));
		congé_panel1.setBounds(0,0,800,550);
		congé_panel1.setVisible(false);
		congé_panel1.setLayout(null);
		
		panel_par_defaut.add(congé_panel1);
		
		
		//création du panel qui contient Jtable ,lorsqu'on clique sur rechercher il sera afficher les congés recherche par id_congé
		congé_panel5=new JPanel();
		congé_panel5.setBounds(0,0,800,550);
		congé_panel5.setVisible(false);
		
		
		panel_par_defaut.add(congé_panel5);
		
		
		
		
		
		DefaultTableModel model =new DefaultTableModel();
		model.addColumn("id_congé");
		model.addColumn("Libelé_congé");
		model.addColumn("Id_Agent");
		model.addColumn("Date_début_congé");
		model.addColumn("Date_fin_congé");
		
		JTable table =new JTable(model);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		JScrollPane scrollPane =new JScrollPane(table);
		congé_panel5.add(scrollPane);
		
		//creation du congé_panel6 qui est le panel qui sera afficher lorsq'on clique sur le bouton afficher_congé_agent(recherche par id_agent)
		
		congé_panel6=new JPanel();
		congé_panel6.setBounds(0,0,800,550);
		congé_panel6.setVisible(false);
		
		
		panel_par_defaut.add(congé_panel6);
		
		
		
		
		
		DefaultTableModel model_cp6 =new DefaultTableModel();
		model_cp6.addColumn("id_congé");
		model_cp6.addColumn("Libelé_congé");
		model_cp6.addColumn("Id_Agent");
		model_cp6.addColumn("Date_début_congé");
		model_cp6.addColumn("Date_fin_congé");
		
		JTable table_cp6 =new JTable(model_cp6);
		table_cp6.getColumnModel().getColumn(1).setPreferredWidth(100);
		JScrollPane scrollPane_6 =new JScrollPane(table_cp6);
		congé_panel6.add(scrollPane_6);
		
		
		
		
		
		
		
		
		
		
		
		
		
		//remplir congé_panel1 (acceuil des congés)
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(316, 56, 126, 84);
		Image img = new ImageIcon(this.getClass().getResource("/congé.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		congé_panel1.add(lblNewLabel);
		
		JButton btnajouter_congé=new JButton("");
		btnajouter_congé.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				congé_panel1.setVisible(false);
				congé_panel2.setVisible(true);
			}
		});
		btnajouter_congé.setBorderPainted(false);
		btnajouter_congé.setContentAreaFilled(false);
		btnajouter_congé.setBounds(73,433,56,57);
		Image img1 = new ImageIcon(this.getClass().getResource("/add.jpeg")).getImage();
		btnajouter_congé.setIcon(new ImageIcon(img1));
		congé_panel1.add(btnajouter_congé);
		
		JButton btn_modifier = new JButton("");
		btn_modifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				congé_panel1.setVisible(false);
				congé_panel3.setVisible(true);
				
			}
		});
		btn_modifier.setBounds(216, 433, 97, 57);
		btn_modifier.setBorderPainted(false);
		btn_modifier.setContentAreaFilled(false);
		Image img2 = new ImageIcon(this.getClass().getResource("/modifier.png")).getImage();
		btn_modifier.setIcon(new ImageIcon(img2));
		congé_panel1.add(btn_modifier);
		
		JButton btn_supprimer = new JButton("");
		btn_supprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				congé_panel1.setVisible(false);
				congé_panel4.setVisible(true);
				
			}
		});
		btn_supprimer.setBounds(385, 433, 97, 57);
		btn_supprimer.setBorderPainted(false);
		btn_supprimer.setContentAreaFilled(false);
		Image img3= new ImageIcon(this.getClass().getResource("/trash-can.png")).getImage();
		btn_supprimer.setIcon(new ImageIcon(img3));
		congé_panel1.add(btn_supprimer);
		
		JButton btn_imprimmer = new JButton("");
		btn_imprimmer.setBounds(535, 433, 97, 57);
		btn_imprimmer.setBorderPainted(false);
		btn_imprimmer.setContentAreaFilled(false);
		Image img4= new ImageIcon(this.getClass().getResource("/printer.png")).getImage();
		btn_imprimmer.setIcon(new ImageIcon(img4));
		congé_panel1.add(btn_imprimmer);
		
		JLabel lblNewLabel_1 = new JLabel("Cong\u00E9");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_1.setBounds(273, 13, 178, 44);
		congé_panel1.add(lblNewLabel_1);
		
		textField_congé = new JTextField();
		textField_congé.setBounds(135, 185, 421, 36);
		congé_panel1.add(textField_congé);
		textField_congé.setColumns(10);
		
		JButton btn_rechercher = new JButton("");
		btn_rechercher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				congé_panel1.setVisible(false);
				congé_panel5.setVisible(true);
				métodes.afficher_congé(textField_congé.getText(), model);
					
			}
		});
		
		
		

		
		
		
		
		btn_rechercher.setBounds(560, 185, 107, 51);
		btn_rechercher.setBorderPainted(false);
		btn_rechercher.setContentAreaFilled(false);
		Image img5= new ImageIcon(this.getClass().getResource("/search.png")).getImage();
		btn_rechercher.setIcon(new ImageIcon(img5));
		congé_panel1.add(btn_rechercher);
		
		
		
		
		
		
		
		
		
		JButton btn_retour = new JButton("");
		btn_retour.setBounds(12, 177, 111, 44);
		btn_retour .setBorderPainted(false);
		btn_retour .setContentAreaFilled(false);
		Image img6= new ImageIcon(this.getClass().getResource("/undo.png")).getImage();
		btn_retour .setIcon(new ImageIcon(img6));
		congé_panel1.add(btn_retour);
		
		
		txt_congé_agent = new JTextField();
		txt_congé_agent.setBounds(316, 263, 116, 22);
		congé_panel1.add(txt_congé_agent);
		txt_congé_agent.setColumns(10);
		
		
		JButton btn_congé_agent = new JButton("afficher_cong\u00E9_agent");
		btn_congé_agent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				congé_panel1.setVisible(false);
				congé_panel6.setVisible(true);
				métodes.afficher_congé_agent(txt_congé_agent .getText(), model_cp6);
			}
		});
		btn_congé_agent.setBounds(522, 262, 191, 25);
		congé_panel1.add(btn_congé_agent);
		
	
		
		

		
		
		
		
		//création du congé_panel 2 qui est le panel qui sera afficher lorsq'on clique sur ajouter
		
		
		
		congé_panel2=new JPanel();
		congé_panel2.setBounds(0,0,800,550);
		congé_panel2.setVisible(false);
		congé_panel2.setLayout(null);
		
		panel_par_defaut.add(congé_panel2);	
		
		JLabel lblNewLabel_2 = new JLabel("Id_Cong\u00E9");
		lblNewLabel_2.setBounds(61, 138, 56, 16);
		congé_panel2.add(lblNewLabel_2);
		
		textField1_cp2 = new JTextField();
		textField1_cp2.setBounds(160, 135, 116, 22);
		congé_panel2.add(textField1_cp2);
		textField1_cp2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Libel\u00E9_Cong\u00E9");
		lblNewLabel_3.setBounds(61, 197, 87, 16);
		congé_panel2.add(lblNewLabel_3);
		
		textField2_cp2 = new JTextField();
		textField2_cp2.setBounds(160, 194, 116, 22);
		congé_panel2.add(textField2_cp2);
		textField2_cp2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Id_Agent");
		lblNewLabel_4.setBounds(61, 259, 56, 16);
		congé_panel2.add(lblNewLabel_4);
		
		textField3_cp2 = new JTextField();
		textField3_cp2.setBounds(160, 256, 116, 22);
		congé_panel2.add(textField3_cp2);
		textField3_cp2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Date_D\u00E9but_Cong\u00E9");
		lblNewLabel_5.setBounds(26, 323, 122, 16);
		congé_panel2.add(lblNewLabel_5);
		
		textField4_cp2 = new JTextField();
		textField4_cp2.setBounds(160, 320, 116, 22);
		congé_panel2.add(textField4_cp2);
		textField4_cp2.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Date_Fin_Cong\u00E9");
		lblNewLabel_6.setBounds(37, 379, 111, 16);
		congé_panel2.add(lblNewLabel_6);
		
		textField5_cp2 = new JTextField();
		textField5_cp2.setBounds(160, 376, 116, 22);
		congé_panel2.add(textField5_cp2);
		textField5_cp2.setColumns(10);
		
		JButton btn_enregistrer = new JButton("");
		btn_enregistrer.setBounds(398, 376, 97, 63);
		congé_panel2.add(btn_enregistrer);
		Image img0 = new ImageIcon(this.getClass().getResource("/save.png")).getImage();
		btn_enregistrer .setIcon(new ImageIcon(img0));
		btn_enregistrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			métodes m=new métodes();
			m.ajouter_congé(textField1_cp2.getText(), textField2_cp2 .getText(), textField3_cp2.getText(), textField4_cp2.getText(), textField5_cp2.getText());
		
			}
		});
		btn_enregistrer.setBorderPainted(false);
		btn_enregistrer.setContentAreaFilled(false);
		
		lblNewLabel_7 = new JLabel("Enregistrer");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setBounds(484, 399, 97, 16);
		congé_panel2.add(lblNewLabel_7);
		
		JButton btn_retour_cp2 = new JButton("");
		btn_retour_cp2 .setBorderPainted(false);
		btn_retour_cp2 .setContentAreaFilled(false);
		Image img6_cp= new ImageIcon(this.getClass().getResource("/undo.png")).getImage();
		btn_retour_cp2 .setIcon(new ImageIcon(img6_cp));
		btn_retour_cp2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				congé_panel1.setVisible(true);
				congé_panel2.setVisible(false);
		}
		});
		btn_retour_cp2.setBounds(28, 58, 132, 45);
		congé_panel2.add(btn_retour_cp2);
		
		//création du congé_panel3 qui est le panel qui sera afficherlorsq'on clique sur modifier
		
		
		congé_panel3=new JPanel();
		congé_panel3.setBounds(0,0,800,550);
		congé_panel3.setVisible(false);
		congé_panel3.setLayout(null);
		
		panel_par_defaut.add(congé_panel3);	
		
		JLabel lbl1_cp3 = new JLabel("Id_Cong\u00E9");
		lbl1_cp3.setBounds(66, 158, 56, 16);
		congé_panel3.add(lbl1_cp3);
		
		textField1_cp3 = new JTextField();
		textField1_cp3.setBounds(158, 155, 116, 22);
		congé_panel3.add(textField1_cp3);
		textField1_cp3.setColumns(10);
		
		JLabel lblNewLabel2_cp3 = new JLabel("Libel\u00E9_Cong\u00E9");
		lblNewLabel2_cp3.setBounds(47, 231, 93, 16);
		congé_panel3.add(lblNewLabel2_cp3);
		
		textField2_cp3 = new JTextField();
		textField2_cp3.setBounds(158, 228, 116, 22);
		congé_panel3.add(textField2_cp3);
		textField2_cp3.setColumns(10);
		
		JLabel lblNewLabel3_cp3 = new JLabel("Id_Agent");
		lblNewLabel3_cp3.setBounds(66, 309, 56, 16);
		congé_panel3.add(lblNewLabel3_cp3);
		
		txt3_cp3 = new JTextField();
		txt3_cp3.setBounds(158, 306, 116, 22);
		congé_panel3.add(txt3_cp3);
		txt3_cp3.setColumns(10);
		
		JLabel lblNewLabel4_cp3 = new JLabel("Date_D\u00E9but_Cong\u00E9");
		lblNewLabel4_cp3.setBounds(24, 365, 116, 16);
		congé_panel3.add(lblNewLabel4_cp3);
		
		txt4_cp3 = new JTextField();
		txt4_cp3.setBounds(158, 362, 116, 22);
		congé_panel3.add(txt4_cp3);
		txt4_cp3.setColumns(10);
		
		JLabel lblNewLabel5_cp3 = new JLabel("Date_Fin_Cong\u00E9");
		lblNewLabel5_cp3.setBounds(24, 412, 98, 16);
		congé_panel3.add(lblNewLabel5_cp3);
		
		txt5_cp3 = new JTextField();
		txt5_cp3.setBounds(158, 409, 116, 22);
		congé_panel3.add(txt5_cp3);
		txt5_cp3.setColumns(10);
		
		JButton btn_save_cp3 = new JButton("New button");
		btn_save_cp3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				métodes.modifier_congé(textField1_cp3.getText(), textField2_cp3.getText(), txt3_cp3.getText(), txt4_cp3.getText(), txt5_cp3.getText());
			}
		});
		btn_save_cp3.setBounds(380, 408, 97, 25);
		congé_panel3.add(btn_save_cp3);
		
		JButton btn_retour_dp33 = new JButton("");
		btn_retour_dp33 .setBorderPainted(false);
		btn_retour_dp33 .setContentAreaFilled(false);
		Image img6_dp33= new ImageIcon(this.getClass().getResource("/undo.png")).getImage();
		btn_retour_dp33 .setIcon(new ImageIcon(img6_dp33));
		btn_retour_dp33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				congé_panel3.setVisible(false);
				congé_panel1.setVisible(true);
				
			}
		});
		
		
		
		
		
		//creation du congé_panel4 le panel qui sera afficher lorsq'on clique sur supprimer
		
		congé_panel4=new JPanel();
		congé_panel4.setBounds(0,0,800,550);
		congé_panel4.setVisible(false);
		congé_panel4.setLayout(null);
		panel_par_defaut.add(congé_panel4);
		
		
		JLabel lblNewLabel21 = new JLabel("Saisir id_congé :");
		lblNewLabel21.setBounds(72, 186, 128, 16);
		congé_panel4.add(lblNewLabel21);
		
		textField_11 = new JTextField();
		textField_11.setBounds(212, 183, 225, 22);
		congé_panel4.add(textField_11);
		textField_11.setColumns(10);
		
		JButton supprimer = new JButton("supprimer");
		supprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if((textField_11.getText().length()==0))
					JOptionPane.showMessageDialog(null, "veuillez saisir un id_congé");
				else if(JOptionPane.showConfirmDialog(null, "vous voulez vraiment supprimer ce congé ","supprimer congé",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION);
				{
				métodes m=new métodes();
				m.supprimer_congé(textField_11.getText());
				JOptionPane.showMessageDialog(null, "supression avec succès");
				}
				
				
			}
		});
		supprimer.setBounds(482, 308, 97, 25);
		congé_panel4.add(supprimer);
		
		
		JButton btn_retour_cp4 = new JButton("");
		btn_retour_cp4 .setBorderPainted(false);
		btn_retour_cp4 .setContentAreaFilled(false);
		Image img6_cp4= new ImageIcon(this.getClass().getResource("/undo.png")).getImage();
		btn_retour_cp4 .setIcon(new ImageIcon(img6_cp4));
		btn_retour_cp4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				congé_panel4.setVisible(false);
				congé_panel1.setVisible(true);
				
			}
		});
		
		
		btn_retour_cp4.setBounds(31, 69, 97, 25);
		congé_panel4.add(btn_retour_cp4);
		
		
		
		
		
		//creation du diplome_panel4 le panel qui sera afficher lorsq'on clique sur rechercher (afficher diplome par id_diplome)
		
		
		diplome_panel4=new JPanel();
		diplome_panel4.setBounds(0,0,800,550);
		diplome_panel4.setVisible(false);
		
		
		panel_par_defaut.add(diplome_panel4);
		
		
		
		
		
		DefaultTableModel model_dp =new DefaultTableModel();
		model_dp.addColumn("Id_Diplome");
		model_dp.addColumn("Libelé_Diplome");
		model_dp.addColumn("Date_Obtention");
		model_dp.addColumn("Id_Agent");
		
		
		JTable table_dp =new JTable(model_dp);
		JScrollPane scrollPane_dp =new JScrollPane(table_dp);
		diplome_panel4.add(scrollPane_dp);
		
		
		
		
		//creation du congé_panel5 le panel qui sera afficher_lorsq'on clique sur afficher_diplome_agent(affichage des diplomes d'un agent)
		
		
		diplome_panel5=new JPanel();
		diplome_panel5.setBounds(0,0,800,550);
		diplome_panel5.setVisible(false);
		
		
		panel_par_defaut.add(diplome_panel5);
		
		
		
		
		
		DefaultTableModel model_dp6 =new DefaultTableModel();
		model_dp6 .addColumn("id_diplome");
		model_dp6.addColumn("Libelé_diplome");
		model_dp6.addColumn("Date_Obtention");
		model_dp6.addColumn("Id_Agent");
		
		
		JTable table_dp6 =new JTable(model_dp6);
		table_dp6.getColumnModel().getColumn(1).setPreferredWidth(200);
		JScrollPane scrollPane_dp6 =new JScrollPane(table_dp6);
		diplome_panel5.add(scrollPane_dp6);
		
		
		
		//creation du diplome_panel1 l'accueil des diplomes
		
		
		diplome_panel1=new JPanel();
		diplome_panel1.setBackground(UIManager.getColor("checkBox.background"));
		diplome_panel1.setBounds(0,0,800,550);
		diplome_panel1.setVisible(true);
		diplome_panel1.setLayout(null);
		
		panel_par_defaut.add(diplome_panel1);
		
		
		
		
		
	
		
		
		
		
		
		
		JLabel lblNewLabel_dp1 = new JLabel("");
		lblNewLabel_dp1.setBounds(316, 56, 126, 84);
		Image img0_dp1 = new ImageIcon(this.getClass().getResource("/diploma.png")).getImage();
		lblNewLabel_dp1.setIcon(new ImageIcon(img0_dp1));
		diplome_panel1.add(lblNewLabel_dp1);
		
		JButton btnajouter_dp=new JButton("");
		btnajouter_dp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				diplome_panel1.setVisible(false);
				diplome_panel2.setVisible(true);
				
				
			}
		});
		btnajouter_dp.setBorderPainted(false);
		btnajouter_dp.setContentAreaFilled(false);
		btnajouter_dp.setBounds(73,433,56,57);
		Image img2_dp1 = new ImageIcon(this.getClass().getResource("/add.jpeg")).getImage();
		btnajouter_dp.setIcon(new ImageIcon(img2_dp1));
		diplome_panel1.add(btnajouter_dp);
		
		JButton btn_modifier_dp = new JButton("");
		btn_modifier_dp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				diplome_panel1.setVisible(false);
				diplome_panel6.setVisible(true);
				
			}
		});
		btn_modifier_dp.setBounds(216, 433, 97, 57);
		btn_modifier_dp.setBorderPainted(false);
		btn_modifier_dp.setContentAreaFilled(false);
		Image img3_dp1 = new ImageIcon(this.getClass().getResource("/modifier.png")).getImage();
		btn_modifier_dp.setIcon(new ImageIcon(img3_dp1));
		diplome_panel1.add(btn_modifier_dp);
		
		JButton btn_supprimer_dp = new JButton("");
		btn_supprimer_dp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				diplome_panel1.setVisible(false);
				diplome_panel3.setVisible(true);
				
			}
		});
		btn_supprimer_dp.setBounds(385, 433, 97, 57);
		btn_supprimer_dp.setBorderPainted(false);
		btn_supprimer_dp.setContentAreaFilled(false);
		Image img4_dp1= new ImageIcon(this.getClass().getResource("/trash-can.png")).getImage();
		btn_supprimer_dp.setIcon(new ImageIcon(img4_dp1));
		diplome_panel1.add(btn_supprimer_dp);
		
		JButton btn_imprimmer_dp = new JButton("");
		 btn_imprimmer_dp.setBounds(535, 433, 97, 57);
		 btn_imprimmer_dp.setBorderPainted(false);
		 btn_imprimmer_dp.setContentAreaFilled(false);
		Image img5_dp1= new ImageIcon(this.getClass().getResource("/printer.png")).getImage();
		btn_imprimmer_dp.setIcon(new ImageIcon(img5_dp1));
		diplome_panel1.add(btn_imprimmer_dp);
		
		JLabel lblNewLabel2_dp1 = new JLabel("diplome");
		lblNewLabel2_dp1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel2_dp1.setBounds(273, 13, 178, 44);
		diplome_panel1.add(lblNewLabel2_dp1);
		
		textField_dp = new JTextField();
		textField_dp.setBounds(135, 185, 421, 36);
		diplome_panel1.add(textField_dp);
		textField_dp.setColumns(10);
		
		JButton btn_rechercher_dp1 = new JButton("");
		btn_rechercher_dp1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				diplome_panel1.setVisible(false);
				diplome_panel4.setVisible(true);
				métodes.afficher_diplome(textField_dp.getText(), model_dp);
			}
		});
		btn_rechercher_dp1.setBounds(568, 185, 107, 44);
		btn_rechercher_dp1.setBorderPainted(false);
		btn_rechercher_dp1.setContentAreaFilled(false);
		Image img6_dp1= new ImageIcon(this.getClass().getResource("/search.png")).getImage();
		btn_rechercher_dp1.setIcon(new ImageIcon(img6_dp1));
		diplome_panel1.add(btn_rechercher_dp1);
		
		JButton btn_retour_dp1 = new JButton("");
		btn_retour_dp1.setBounds(12, 177, 111, 44);
		btn_retour_dp1 .setBorderPainted(false);
		btn_retour_dp1 .setContentAreaFilled(false);
		Image img7_dp1= new ImageIcon(this.getClass().getResource("/undo.png")).getImage();
		btn_retour_dp1.setIcon(new ImageIcon(img7_dp1));
		diplome_panel1.add(btn_retour_dp1);
		
		
		
		txt_diplome_agent = new JTextField();
		txt_diplome_agent.setBounds(304, 268, 116, 22);
		diplome_panel1.add(txt_diplome_agent);
		txt_diplome_agent.setColumns(10);
		
		
		btn_afficher_diplome_agent = new JButton("afficher_diplome_agent");
		btn_afficher_diplome_agent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				diplome_panel1.setVisible(false);
				diplome_panel5.setVisible(true);
				métodes.afficher_diplome_agent(txt_diplome_agent.getText(), model_dp6);
				
			}
		});
		btn_afficher_diplome_agent.setBounds(490, 267, 185, 25);
		diplome_panel1.add(btn_afficher_diplome_agent);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//creation du diplome_panel2 le panel qui sera afficher lorsq'on clique sur ajouter
		
		
		
		diplome_panel2=new JPanel();
		diplome_panel2.setBounds(0,0,800,550);
		diplome_panel2.setVisible(false);
		diplome_panel2.setLayout(null);
		
		panel_par_defaut.add(diplome_panel2);	
		
		
		JLabel lblNewLabel_dp2 = new JLabel("Id_Diplome");
		lblNewLabel_dp2.setBounds(61, 138, 56, 16);
		diplome_panel2.add(lblNewLabel_dp2);
		
		textField1_dp2 = new JTextField();
		textField1_dp2.setBounds(160, 135, 116, 22);
		diplome_panel2.add(textField1_dp2);
		textField1_dp2.setColumns(10);
		
		JLabel lblNewLabel2_dp2 = new JLabel("Libel\u00E9_Diplome");
		lblNewLabel2_dp2.setBounds(61, 197, 87, 16);
		diplome_panel2.add(lblNewLabel2_dp2);
		
		textField2_dp2 = new JTextField();
		textField2_dp2.setBounds(160, 194, 116, 22);
		diplome_panel2.add(textField2_dp2);
		textField2_dp2.setColumns(10);
		
		JLabel lblNewLabel3_dp2 = new JLabel("Date_Obtention");
		lblNewLabel3_dp2.setBounds(61, 259, 56, 16);
		diplome_panel2.add(lblNewLabel3_dp2);
		
		textField3_dp2 = new JTextField();
		textField3_dp2.setBounds(160, 256, 116, 22);
		diplome_panel2.add(textField3_dp2);
		textField3_dp2.setColumns(10);
		
		JLabel lblNewLabel4_dp2 = new JLabel("Id_Agent");
		lblNewLabel4_dp2.setBounds(26, 323, 122, 16);
		diplome_panel2.add(lblNewLabel4_dp2);
		
		textField4_dp2 = new JTextField();
		textField4_dp2.setBounds(160, 320, 116, 22);
		diplome_panel2.add(textField4_dp2);
		textField4_dp2.setColumns(10);
		
		
		
		JButton btn_enregistrer_diplome = new JButton("");
		btn_enregistrer_diplome.setBounds(398, 376, 97, 63);
		diplome_panel2.add(btn_enregistrer_diplome);
		Image img13 = new ImageIcon(this.getClass().getResource("/save.png")).getImage();
		btn_enregistrer_diplome .setIcon(new ImageIcon(img13));
		btn_enregistrer_diplome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				métodes m=new métodes();
				m.ajouter_diplome(textField1_dp2.getText(), textField2_dp2.getText(), textField3_dp2.getText(),textField4_dp2.getText());
				
			}
		});
		btn_enregistrer_diplome.setBorderPainted(false);
		btn_enregistrer_diplome.setContentAreaFilled(false);
		
		lblNewLabel_7 = new JLabel("Enregistrer");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setBounds(484, 399, 97, 16);
		diplome_panel2.add(lblNewLabel_7);
		
		JButton btn_retour_dp2 = new JButton("");
		btn_retour_dp2 .setBorderPainted(false);
		btn_retour_dp2 .setContentAreaFilled(false);
		Image img6_dp= new ImageIcon(this.getClass().getResource("/undo.png")).getImage();
		btn_retour_dp2 .setIcon(new ImageIcon(img6_dp));
		btn_retour_dp2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				diplome_panel1.setVisible(true);
				diplome_panel2.setVisible(false);
			}
		});
		btn_retour_dp2.setBounds(26, 55, 128, 46);
		diplome_panel2.add(btn_retour_dp2);
		
		
		//creation du diplome_panel3 le panel qui sera afficher lorsq'on clique sur supprimer
		
		diplome_panel3=new JPanel();
		diplome_panel3.setBounds(0,0,800,550);
		diplome_panel3.setVisible(false);
		diplome_panel3.setLayout(null);
		panel_par_defaut.add(diplome_panel3);
		
		
		JLabel lblNewLabel_dp4 = new JLabel("Saisir id_diplome :");
		lblNewLabel_dp4 .setBounds(72, 186, 128, 16);
		diplome_panel3.add(lblNewLabel_dp4 );
		
		textField1_dp3 = new JTextField();
		textField1_dp3.setBounds(212, 183, 225, 22);
		diplome_panel3.add(textField1_dp3);
		textField1_dp3.setColumns(10);
		
		JButton supprimer_dp3 = new JButton("supprimer");
		supprimer_dp3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((textField1_dp3.getText().length()==0))
					JOptionPane.showMessageDialog(null, "veuillez saisir un id_diplome");
				else if(JOptionPane.showConfirmDialog(null, "vous voulez vraiment supprimer ce congé ","supprimer diplome",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION);
				{
					métodes m=new métodes();
					m.supprimer_diplome(textField1_dp3.getText());
				JOptionPane.showMessageDialog(null, "supression avec succès");
				}
				
				
				
				
			}
		});
		supprimer_dp3.setBounds(482, 308, 97, 25);
		diplome_panel3.add(supprimer_dp3);
		
		JButton btn_retour_dp3 = new JButton("");
		btn_retour_dp3 .setBorderPainted(false);
		btn_retour_dp3 .setContentAreaFilled(false);
		btn_retour_dp3 .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				diplome_panel1.setVisible(true);
				diplome_panel3.setVisible(false);
			}
		});
		Image img6_dp3= new ImageIcon(this.getClass().getResource("/undo.png")).getImage();
		btn_retour_dp3 .setIcon(new ImageIcon(img6_dp3));
		btn_retour_dp3.setBounds(38, 80, 97, 48);
		diplome_panel3.add(btn_retour_dp3);
		
		
		//creation du diplome_panel6 le panel qui sera afficher lorsq'on clique sur modifier

		diplome_panel6=new JPanel();
		diplome_panel6.setBounds(0,0,800,550);
		diplome_panel6.setVisible(false);
		diplome_panel6.setLayout(null);
		
		panel_par_defaut.add(diplome_panel6);
		
		JLabel lbl_dp6 = new JLabel("Id_Diplome");
		lbl_dp6.setBounds(46, 206, 99, 16);
		diplome_panel6.add(lbl_dp6);
		
		textField1_cp6 = new JTextField();
		textField1_cp6.setBounds(157, 203, 116, 22);
		diplome_panel6.add(textField1_cp6);
		textField1_cp6.setColumns(10);
		
		JLabel lblNewLabel1_dp6 = new JLabel("Libele_diplome");
		lblNewLabel1_dp6.setBounds(46, 262, 99, 16);
		diplome_panel6.add(lblNewLabel1_dp6);
		
		textField2_cp6 = new JTextField();
		textField2_cp6.setBounds(157, 259, 116, 22);
		diplome_panel6.add(textField2_cp6);
		textField2_cp6.setColumns(10);
		
		JLabel lblNewLabel2_dp6 = new JLabel("Date_Obtention");
		lblNewLabel2_dp6.setBounds(46, 315, 99, 16);
		diplome_panel6.add(lblNewLabel2_dp6);
		
		textField3_cp6 = new JTextField();
		textField3_cp6.setBounds(157, 312, 116, 22);
		diplome_panel6.add(textField3_cp6);
		textField3_cp6.setColumns(10);
		
		JLabel lblNewLabel3_dp6 = new JLabel("Id_Agent");
		lblNewLabel3_dp6.setBounds(57, 376, 56, 16);
		diplome_panel6.add(lblNewLabel3_dp6);
		
		textField4_cp6 = new JTextField();
		textField4_cp6.setBounds(157, 373, 116, 22);
		diplome_panel6.add(textField4_cp6);
		textField4_cp6.setColumns(10);
		
		JButton btn_enregistrer_dp6 = new JButton("");
		btn_enregistrer_dp6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				métodes.modifier_diplome(textField1_cp6.getText(), textField2_cp6.getText(), textField3_cp6.getText(), textField4_cp6.getText());
			}
		});
		btn_enregistrer_dp6.setBounds(340, 407, 97, 57);
		diplome_panel6.add(btn_enregistrer_dp6);
		btn_enregistrer_dp6 .setBorderPainted(false);
		btn_enregistrer_dp6 .setContentAreaFilled(false);
		Image img6_dp6= new ImageIcon(this.getClass().getResource("/save.png")).getImage();
		btn_enregistrer_dp6 .setIcon(new ImageIcon(img6_dp6));
		
		JButton btn_retour_dp6 = new JButton("");
		btn_retour_dp6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				diplome_panel6.setVisible(false);
				diplome_panel1.setVisible(true);
			}
		});
		btn_retour_dp6.setBounds(57, 86, 97, 43);
		diplome_panel6.add(btn_retour_dp6);
		btn_retour_dp6 .setBorderPainted(false);
		btn_retour_dp6 .setContentAreaFilled(false);
		Image img8_dp6= new ImageIcon(this.getClass().getResource("/undo.png")).getImage();
		btn_retour_dp6 .setIcon(new ImageIcon(img8_dp6));
		
		

		

		
		
		//creation du affectation_panel1 le panel d'accueil des affectations
		
		
		affectation_panel1=new JPanel();
		affectation_panel1.setBackground(UIManager.getColor("checkBox.background"));
		affectation_panel1.setBounds(0,0,800,550);
		affectation_panel1.setVisible(false);
		affectation_panel1.setLayout(null);
		
		panel_par_defaut.add(affectation_panel1);
		
		
		
		//creation de affectation_panel5 le panel qui sera afficher lorsq'on clique sur rechhercher(afichage des affectations par id_affectation)
		
		
		affectation_panel5=new JPanel();
		affectation_panel5.setBounds(0,0,800,550);
		affectation_panel5.setVisible(false);
		
		
		panel_par_defaut.add(affectation_panel5);
		
		
		
		
		
		DefaultTableModel model_afp5 =new DefaultTableModel();
		model_afp5.addColumn("Id_Affectation");
		model_afp5.addColumn("Fonction");
		model_afp5.addColumn("Id_Agent");
		model_afp5.addColumn("Date_Affectation");
		
		
		JTable table_afp5 =new JTable(model_afp5);
		JScrollPane scrollPane_afp5 =new JScrollPane(table_afp5);
		affectation_panel5.add(scrollPane_afp5);
		
		
		
		
		
		
		
		
		
		//creation de panel affectation_panel4 le panel qui sera afficher lorsq'on clique sur le bouton aficher_affectation_agent
		
		affectation_panel4=new JPanel();
		affectation_panel4.setBounds(0,0,800,550);
		affectation_panel4.setVisible(false);
		
		
		panel_par_defaut.add(affectation_panel4);
		
		
		
		
		
		DefaultTableModel model_afp =new DefaultTableModel();
		model_afp.addColumn("Id_Affectation");
		model_afp.addColumn("Fonction");
		model_afp.addColumn("Id_Agent");
		model_afp.addColumn("Date_Affectation");
		
		
		JTable table_afp =new JTable(model_afp);
		JScrollPane scrollPane_afp =new JScrollPane(table_afp);
		affectation_panel4.add(scrollPane_afp);
		
		
		

		
		
		
		
		
		
		
	
		
		
		
		JLabel lblNewLabel_af = new JLabel("");
		lblNewLabel_af.setBounds(334, 56, 126, 84);
		Image img0_af = new ImageIcon(this.getClass().getResource("/affectation.png")).getImage();
		lblNewLabel_af.setIcon(new ImageIcon(img0_af));
		affectation_panel1.add(lblNewLabel_af);
		
		JButton btnajouter_affectation=new JButton("");
		btnajouter_affectation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				affectation_panel1.setVisible(false);
				affectation_panel2.setVisible(true);
			}
		});
		btnajouter_affectation.setBorderPainted(false);
		btnajouter_affectation.setContentAreaFilled(false);
		btnajouter_affectation.setBounds(73,433,56,57);
		Image img1_af = new ImageIcon(this.getClass().getResource("/add.jpeg")).getImage();
		btnajouter_affectation.setIcon(new ImageIcon(img1_af));
		affectation_panel1.add(btnajouter_affectation);
		
		JButton btn_modifier_affectation = new JButton("");
		btn_modifier_affectation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				affectation_panel1.setVisible(false);
				affectation_panel6.setVisible(true);
				
			}
		});
		btn_modifier_affectation.setBounds(216, 433, 97, 57);
		btn_modifier_affectation.setBorderPainted(false);
		btn_modifier_affectation.setContentAreaFilled(false);
		Image img2_af = new ImageIcon(this.getClass().getResource("/modifier.png")).getImage();
		btn_modifier_affectation.setIcon(new ImageIcon(img2_af));
		affectation_panel1.add(btn_modifier_affectation);
		
		JButton btn_supprimer_affectation = new JButton("");
		btn_supprimer_affectation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				affectation_panel1.setVisible(false);
				affectation_panel3.setVisible(true);
			}
		});
		btn_supprimer_affectation.setBounds(385, 433, 97, 57);
		btn_supprimer_affectation.setBorderPainted(false);
		btn_supprimer_affectation.setContentAreaFilled(false);
		Image img3_af= new ImageIcon(this.getClass().getResource("/trash-can.png")).getImage();
		btn_supprimer_affectation.setIcon(new ImageIcon(img3_af));
		affectation_panel1.add(btn_supprimer_affectation);
		
		JButton btn_imprimmer_affectation = new JButton("");
		btn_imprimmer_affectation.setBounds(535, 433, 97, 57);
		btn_imprimmer_affectation.setBorderPainted(false);
		btn_imprimmer_affectation.setContentAreaFilled(false);
		Image img4_af= new ImageIcon(this.getClass().getResource("/printer.png")).getImage();
		btn_imprimmer_affectation.setIcon(new ImageIcon(img4_af));
		affectation_panel1.add(btn_imprimmer_affectation);
		
		JLabel lblNewLabel1_af = new JLabel("Affectations");
		lblNewLabel1_af.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel1_af.setBounds(273, 13, 256, 44);
		affectation_panel1.add(lblNewLabel1_af);
		
		JTextField textField_af= new JTextField();
		textField_af.setBounds(135, 185, 421, 36);
		affectation_panel1.add(textField_af);
		textField_af.setColumns(10);
		
		JButton btn_rechercher_affectation = new JButton("");
		btn_rechercher_affectation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				affectation_panel1.setVisible(false);
				affectation_panel4.setVisible(true);
				métodes.afficher_affectation(textField_af.getText(), model_afp);
			}
		});
		btn_rechercher_affectation.setBounds(568, 185, 107, 44);
		btn_rechercher_affectation.setBorderPainted(false);
		btn_rechercher_affectation.setContentAreaFilled(false);
		Image img5_af= new ImageIcon(this.getClass().getResource("/search.png")).getImage();
		btn_rechercher_affectation.setIcon(new ImageIcon(img5_af));
		affectation_panel1.add(btn_rechercher_affectation);
		
		JButton btn_retour_affectation = new JButton("");
		btn_retour_affectation.setBounds(12, 177, 111, 44);
		btn_retour_affectation .setBorderPainted(false);
		btn_retour_affectation .setContentAreaFilled(false);
		Image img6_af= new ImageIcon(this.getClass().getResource("/undo.png")).getImage();
		btn_retour_affectation .setIcon(new ImageIcon(img6_af));
		affectation_panel1.add(btn_retour_affectation);
		
		txt_affectation_agent = new JTextField();
		txt_affectation_agent.setBounds(355, 279, 116, 22);
		affectation_panel1.add(txt_affectation_agent);
		txt_affectation_agent.setColumns(10);
		
		JButton btn_affectation_agent = new JButton("afficher_affectation_agent");
		btn_affectation_agent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				affectation_panel1.setVisible(false);
				affectation_panel5.setVisible(true);
				métodes.afficher_affectation_agent(txt_affectation_agent.getText(),model_afp5 );
			}
		});
		btn_affectation_agent.setBounds(490, 278, 185, 25);
		affectation_panel1.add(btn_affectation_agent);
		
		
		
		//creation de panel affectation_panel2 le panel qui sera afficher lorsq'on clique sur ajouter
		
		affectation_panel2=new JPanel();
		affectation_panel2.setBounds(0,0,800,550);
		affectation_panel2.setVisible(false);
		affectation_panel2.setLayout(null);
		
		panel_par_defaut.add(affectation_panel2);	
		
		
		JLabel lblNewLabel1_af2 = new JLabel("Id_Affectation");
		lblNewLabel1_af2 .setBounds(61, 138, 56, 16);
		affectation_panel2.add(lblNewLabel1_af2 );
		
		textField1_af2 = new JTextField();
		textField1_af2.setBounds(160, 135, 116, 22);
		affectation_panel2.add(textField1_af2);
		textField1_af2.setColumns(10);
		
		JLabel lblNewLabel2_af2 = new JLabel("Fonction");
		lblNewLabel2_af2.setBounds(61, 197, 87, 16);
		affectation_panel2.add(lblNewLabel2_af2);
		
		textField2_af2 = new JTextField();
		textField2_af2.setBounds(160, 194, 116, 22);
		affectation_panel2.add(textField2_af2);
		textField2_af2.setColumns(10);
		
		JLabel lblNewLabel3_af2 = new JLabel("Id_Agent");
		lblNewLabel3_af2.setBounds(61, 259, 56, 16);
		affectation_panel2.add(lblNewLabel3_af2);
		
		textField3_af2 = new JTextField();
		textField3_af2.setBounds(160, 256, 116, 22);
		affectation_panel2.add(textField3_af2);
		textField3_af2.setColumns(10);
		
		JLabel lblNewLabel4_af2 = new JLabel("Date_Affectation");
		lblNewLabel4_af2.setBounds(26, 323, 122, 16);
		affectation_panel2.add(lblNewLabel4_af2);
		
		textField4_af2 = new JTextField();
		textField4_af2.setBounds(160, 320, 116, 22);
		affectation_panel2.add(textField4_af2);
		textField4_af2.setColumns(10);
		
		
		JButton btn_enregistrer_affectation = new JButton("");
		btn_enregistrer_affectation.setBounds(398, 376, 97, 63);
		affectation_panel2.add(btn_enregistrer_affectation);
		Image img13_af = new ImageIcon(this.getClass().getResource("/save.png")).getImage();
		 btn_enregistrer_affectation .setIcon(new ImageIcon(img13_af));
		 btn_enregistrer_affectation.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
métodes m=new métodes();
m.ajouter_affectation(textField1_af2.getText(), textField2_af2.getText(), textField3_af2.getText() ,textField4_af2.getText());
				}
			});
		 btn_enregistrer_affectation.setBorderPainted(false);
		 btn_enregistrer_affectation.setContentAreaFilled(false);
		
		lblNewLabel_7 = new JLabel("Enregistrer");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setBounds(484, 399, 97, 16);
		affectation_panel2.add(lblNewLabel_7);
		
		JButton btn_retour_af2 = new JButton("");
		btn_retour_af2 .setBorderPainted(false);
		btn_retour_af2 .setContentAreaFilled(false);
		Image img6_af2= new ImageIcon(this.getClass().getResource("/undo.png")).getImage();
		btn_retour_af2 .setIcon(new ImageIcon(img6_af2));
		btn_retour_af2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				affectation_panel1.setVisible(true);
				affectation_panel2.setVisible(false);
			}
		});
		btn_retour_af2.setBounds(26, 55, 128, 46);
		affectation_panel2.add(btn_retour_af2);
		
		
		//creation de panel affectation_panel3 le panel qui sera afficher lorsq'on clique sur supprimer 
		
		affectation_panel3=new JPanel();
		affectation_panel3.setBounds(0,0,800,550);
		affectation_panel3.setVisible(false);
		affectation_panel3.setLayout(null);
		panel_par_defaut.add(affectation_panel3);
		
		
		JLabel lblNewLabel1_af3 = new JLabel("Saisir id_affectation :");
		lblNewLabel1_af3 .setBounds(72, 186, 128, 16);
		affectation_panel3.add(lblNewLabel1_af3 );
		
		textField1_af3 = new JTextField();
		textField1_af3.setBounds(212, 183, 225, 22);
		affectation_panel3.add(textField1_af3);
		textField1_af3.setColumns(10);
		
		JButton supprimer_af3 = new JButton("supprimer");
		supprimer_af3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((textField1_af3.getText().length()==0))
					JOptionPane.showMessageDialog(null, "veuillez saisir un id_diplome");
				else if(JOptionPane.showConfirmDialog(null, "vous voulez vraiment supprimer cette affectation ","supprimer affectation",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION);
				{
					métodes m=new métodes();
					m.supprimer_affectation(textField1_af3.getText());
				JOptionPane.showMessageDialog(null, "supression avec succès");
				}
				
				
				
			}
		});
		supprimer_af3.setBounds(482, 308, 97, 25);
		affectation_panel3.add(supprimer_af3);
		
		JButton btn_retour_af3 = new JButton("");
		btn_retour_af3 .setBorderPainted(false);
		btn_retour_af3 .setContentAreaFilled(false);
		btn_retour_af3 .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				affectation_panel1.setVisible(true);
				affectation_panel3.setVisible(false);
			}
		});
		Image img6_af3= new ImageIcon(this.getClass().getResource("/undo.png")).getImage();
		btn_retour_af3 .setIcon(new ImageIcon(img6_af3));
		btn_retour_af3.setBounds(38, 80, 97, 48);
		affectation_panel3.add(btn_retour_af3);
		
		
		//création du panel affectation_panel6 le panel qui sera afficher lorsq'on clique sur modifier 
		
		
		
		affectation_panel6=new JPanel();
		affectation_panel6.setBounds(0,0,800,550);
		affectation_panel6.setVisible(false);
		affectation_panel6.setLayout(null);
		
		panel_par_defaut.add(affectation_panel6);
		
		JLabel lbl_afp6 = new JLabel("Id_Affectation");
		lbl_afp6.setBounds(46, 206, 99, 16);
		affectation_panel6.add(lbl_afp6);
		
		JTextField textField1_afp6 = new JTextField();
		textField1_afp6.setBounds(157, 203, 116, 22);
		affectation_panel6.add(textField1_afp6);
		textField1_afp6.setColumns(10);
		
		JLabel lblNewLabel1_afp6 = new JLabel("Fonction");
		lblNewLabel1_afp6.setBounds(46, 262, 99, 16);
		affectation_panel6.add(lblNewLabel1_afp6);
		
		JTextField textField2_afp6 = new JTextField();
		textField2_afp6.setBounds(157, 259, 116, 22);
		affectation_panel6.add(textField2_afp6);
		textField2_afp6.setColumns(10);
		
		JLabel lblNewLabel2_afp6 = new JLabel("Id_Agent");
		lblNewLabel2_afp6.setBounds(46, 315, 99, 16);
		affectation_panel6.add(lblNewLabel2_afp6);
		
		JTextField textField3_afp6 = new JTextField();
		textField3_afp6.setBounds(157, 312, 116, 22);
		affectation_panel6.add(textField3_afp6);
		textField3_afp6.setColumns(10);
		
		JLabel lblNewLabel3_afp6 = new JLabel("Date_Affectation");
		lblNewLabel3_afp6.setBounds(57, 376, 56, 16);
		affectation_panel6.add(lblNewLabel3_afp6);
		
		JTextField textField4_afp6 = new JTextField();
		textField4_afp6.setBounds(157, 373, 116, 22);
		affectation_panel6.add(textField4_afp6);
		textField4_afp6.setColumns(10);
		
		JButton btn_enregistrer_afp6 = new JButton("");
		btn_enregistrer_afp6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				métodes.modifier_affectation(textField1_afp6.getText(), textField2_afp6.getText(), textField3_afp6.getText(), textField4_afp6.getText());
			}
		});
		btn_enregistrer_afp6.setBounds(340, 386, 97, 57);
		affectation_panel6.add(btn_enregistrer_afp6);
		btn_enregistrer_afp6 .setBorderPainted(false);
		btn_enregistrer_afp6 .setContentAreaFilled(false);
		Image img9_afp6= new ImageIcon(this.getClass().getResource("/save.png")).getImage();
		btn_enregistrer_afp6 .setIcon(new ImageIcon(img9_afp6));
		
		JButton btn_retour_afp6 = new JButton("");
		btn_retour_afp6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				affectation_panel6.setVisible(false);
				affectation_panel1.setVisible(true);
				
				
			}
		});
		btn_retour_afp6.setBounds(57, 83, 97, 46);
		affectation_panel6.add(btn_retour_afp6);
		btn_retour_afp6 .setBorderPainted(false);
		btn_retour_afp6 .setContentAreaFilled(false);
		Image img8_afp6= new ImageIcon(this.getClass().getResource("/undo.png")).getImage();
		btn_retour_afp6 .setIcon(new ImageIcon(img8_afp6));
		



		



		
		
	
		
		
		//création du panel liste_admis le panel qui sera afficher lorsq'on clique sur le bouton gestion de recrutement
			

		liste_admis=new JPanel();
		liste_admis.setBackground(UIManager.getColor("checkBox.background"));
		liste_admis.setBounds(0,0,800,550);
		liste_admis.setVisible(false);
		liste_admis.setLayout(null);
		
		
		
		
		panel_par_defaut.add(liste_admis);
		
		JLabel lbl_insert = new JLabel("");
		lbl_insert.setBounds(12, 25, 759, 478);
		liste_admis.add(lbl_insert);
		
		Image img6_admis= new ImageIcon(this.getClass().getResource("/recru.jpg")).getImage();
		lbl_insert .setIcon(new ImageIcon(img6_admis));
		
		
		
		JLabel lbl_name = new JLabel("Name_Admis");
		lbl_name.setBounds(12, 225, 90, 16);
		lbl_insert.add(lbl_name);
		
		textField_name = new JTextField();
		textField_name.setBounds(114, 222, 138, 22);
		lbl_insert.add(textField_name);
		textField_name.setColumns(10);
		
		JLabel lbl_prenom = new JLabel("Prenom_Admis");
		lbl_prenom.setBounds(12, 287, 90, 16);
		lbl_insert.add(lbl_prenom);
		
		textField_pren = new JTextField();
		textField_pren.setBounds(114, 284, 143, 22);
		lbl_insert.add(textField_pren);
		textField_pren.setColumns(10);
		
		JLabel lbl_cin = new JLabel("Cin_Admis");
		lbl_cin.setBounds(12, 344, 79, 16);
		lbl_insert.add(lbl_cin);
		
		textField_cin = new JTextField();
		textField_cin.setBounds(116, 341, 136, 22);
		lbl_insert.add(textField_cin);
		textField_cin.setColumns(10);
		
		JButton btn_add = new JButton("AJOUTER");
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				métodes.ajouter_admis(textField_id.getText(), textField_name .getText(), textField_pren.getText(), textField_cin.getText());
				
			}
		});
		btn_add.setBounds(163, 435, 97, 25);
		lbl_insert.add(btn_add);
		
		JLabel lbl_id = new JLabel("Id_Admis");
		lbl_id.setBounds(12, 184, 79, 16);
		lbl_insert.add(lbl_id);
		
		textField_id = new JTextField();
		textField_id.setBounds(109, 181, 143, 22);
		lbl_insert.add(textField_id);
		textField_id.setColumns(10);
		
		JScrollPane scrollPane_la = new JScrollPane();
		scrollPane_la.setBounds(261, 96, 527, 383);
		lbl_insert.add(scrollPane_la);
		
		DefaultTableModel model_admis =new DefaultTableModel();
		model_admis.addColumn("id_admis");
		model_admis.addColumn("nom_admis");
		model_admis.addColumn("prenom_admis");
	
		table = new JTable(model_admis);
		scrollPane_la.setViewportView(table);
		
		btn_actu = new JButton("Actualiser");
		btn_actu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				métodes.actualiser_admis(model_admis);
			}
		});
		btn_actu.setBounds(417, 29, 97, 25);
		lbl_insert.add(btn_actu);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
