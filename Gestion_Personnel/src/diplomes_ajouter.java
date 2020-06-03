import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;

public class diplomes_ajouter extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public diplomes_ajouter() {
		setSize(800,550);
		setLocation(500,150);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id_Diplome");
		lblNewLabel.setBounds(64, 197, 84, 16);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(160, 194, 116, 22);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Libel\u00E9_Diplome");
		lblNewLabel_1.setBounds(37, 263, 111, 16);
		add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(160, 260, 116, 22);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Date_Obtention");
		lblNewLabel_2.setBounds(37, 343, 111, 16);
		add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(160, 340, 116, 22);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Id_Agent");
		lblNewLabel_3.setBounds(408, 197, 56, 16);
		add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(505, 194, 116, 22);
		add(textField_3);
		textField_3.setColumns(10);
		
		JButton btn_enregistrer = new JButton("");
		btn_enregistrer.setBounds(426, 370, 97, 57);
		add(btn_enregistrer);
		Image img0 = new ImageIcon(this.getClass().getResource("/save.png")).getImage();
		btn_enregistrer .setIcon(new ImageIcon(img0));
		btn_enregistrer.setBorderPainted(false);
		btn_enregistrer.setContentAreaFilled(false);
		add(btn_enregistrer);
		
		JLabel lblNewLabel_4 = new JLabel("Enregistrer");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(505, 392, 97, 16);
		add(lblNewLabel_4);
		
	}

}
