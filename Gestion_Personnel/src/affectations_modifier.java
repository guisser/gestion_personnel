import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;

public class affectations_modifier extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public affectations_modifier() {
		setSize(800,550);
		setLocation(500,150);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id_Affectation");
		lblNewLabel.setBounds(77, 201, 107, 16);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(215, 198, 116, 22);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Fonction");
		lblNewLabel_1.setBounds(77, 256, 97, 16);
		add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(215, 253, 116, 22);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Id_Agent");
		lblNewLabel_2.setBounds(77, 333, 56, 16);
		add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(215, 330, 116, 22);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Date_Affectation");
		lblNewLabel_3.setBounds(420, 201, 116, 16);
		add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(560, 198, 116, 22);
		add(textField_3);
		textField_3.setColumns(10);
		
		JButton btn_enregistrer = new JButton("");
		btn_enregistrer.setBounds(481, 360, 97, 62);
		add(btn_enregistrer);
		Image img0 = new ImageIcon(this.getClass().getResource("/save.png")).getImage();
		btn_enregistrer.setIcon(new ImageIcon(img0));
		btn_enregistrer.setBorderPainted(false);
		btn_enregistrer.setContentAreaFilled(false);
		add(btn_enregistrer);
		
		JLabel lblNewLabel_4 = new JLabel("Enregistrer");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(560, 386, 85, 16);
		add(lblNewLabel_4);
		
	}
}
