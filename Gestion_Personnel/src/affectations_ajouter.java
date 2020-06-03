import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;

public class affectations_ajouter extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public affectations_ajouter() {
		setSize(851,574);
		setLocation(500,150);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id_Affectation");
		lblNewLabel.setBounds(126, 202, 84, 16);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Fonction");
		lblNewLabel_1.setBounds(126, 259, 56, 16);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(222, 199, 116, 22);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(222, 256, 116, 22);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Id_Agent");
		lblNewLabel_2.setBounds(126, 329, 56, 16);
		add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(222, 326, 116, 22);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Date_Affectation");
		lblNewLabel_3.setBounds(105, 411, 105, 16);
		add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(222, 408, 116, 22);
		add(textField_3);
		textField_3.setColumns(10);
		
		JButton btn_enregistrer = new JButton("");
		btn_enregistrer.setBounds(482, 401, 97, 77);
		Image img0 = new ImageIcon(this.getClass().getResource("/save.png")).getImage();
		btn_enregistrer .setIcon(new ImageIcon(img0));
		btn_enregistrer.setBorderPainted(false);
		btn_enregistrer.setContentAreaFilled(false);
		add(btn_enregistrer);
		
		JLabel lblNewLabel_4 = new JLabel("Enregistrer");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(562, 433, 97, 16);
		add(lblNewLabel_4);
		

	}
}
