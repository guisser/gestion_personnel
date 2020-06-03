import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;

public class congés_modifier extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public congés_modifier() {
		setLayout(null);
		setSize(800,550);
		setLocation(500,150);
		
		JLabel lblNewLabel = new JLabel("Id_cong\u00E9");
		lblNewLabel.setBounds(130, 209, 56, 16);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(220, 206, 116, 22);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Libel\u00E9_cong\u00E9");
		lblNewLabel_1.setBounds(102, 289, 106, 16);
		add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(220, 286, 116, 22);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Id_Agent");
		lblNewLabel_2.setBounds(130, 366, 56, 16);
		add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(220, 363, 116, 22);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Date_D\u00E9but_Cong\u00E9");
		lblNewLabel_3.setBounds(80, 434, 128, 16);
		add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(220, 431, 116, 22);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Date_Fin_Cong\u00E9");
		lblNewLabel_4.setBounds(429, 209, 93, 16);
		add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(561, 206, 116, 22);
		add(textField_4);
		textField_4.setColumns(10);
		
		JButton btn_save = new JButton("");
		btn_save.setBounds(518, 400, 97, 50);
		Image img0 = new ImageIcon(this.getClass().getResource("/save.png")).getImage();
		btn_save .setIcon(new ImageIcon(img0));
		btn_save.setBorderPainted(false);
		btn_save.setContentAreaFilled(false);
		add(btn_save);
		
		JLabel lblNewLabel_5 = new JLabel("Enregistrer");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(603, 407, 93, 31);
		add(lblNewLabel_5);
	}

}
