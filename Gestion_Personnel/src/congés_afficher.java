import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;

public class congés_afficher extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public congés_afficher() {
		setLayout(null);
		setSize(800,550);
		setLocation(500,150);
		
		JLabel lblNewLabel = new JLabel("Id_Cong\u00E9");
		lblNewLabel.setBounds(70, 189, 56, 16);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(156, 186, 116, 22);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Libel\u00E9_Cong\u00E9");
		lblNewLabel_1.setBounds(50, 258, 94, 16);
		add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(156, 255, 116, 22);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Id_Cong\u00E9");
		lblNewLabel_2.setBounds(70, 332, 56, 16);
		add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(156, 329, 116, 22);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Date_D\u00E9but_Cong\u00E9");
		lblNewLabel_3.setBounds(28, 395, 116, 16);
		add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(156, 392, 116, 22);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Date_Fin_Cong\u00E9");
		lblNewLabel_4.setBounds(373, 189, 97, 16);
		add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(482, 186, 116, 22);
		add(textField_4);
		textField_4.setColumns(10);
		
		JButton btn_save = new JButton("");
		btn_save.setBounds(481, 391, 97, 57);
		Image img0 = new ImageIcon(this.getClass().getResource("/save.png")).getImage();
		btn_save .setIcon(new ImageIcon(img0));
		btn_save.setBorderPainted(false);
		btn_save.setContentAreaFilled(false);
		add(btn_save);
		
		JLabel lblNewLabel_5 = new JLabel("Enregistrer");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(575, 416, 84, 16);
		add(lblNewLabel_5);
	}

}
