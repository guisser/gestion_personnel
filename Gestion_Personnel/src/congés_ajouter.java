import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class congés_ajouter extends JPanel {
	
	 JTextField textField;
	 JTextField textField_1;
	 JTextField textField_2;
	 JTextField textField_3;
	 JTextField textField_4;

	
	/**
	  
	 * Create the panel.
	 */
	public congés_ajouter() {
		
		setLayout(null);
		setSize(800,550);
		setLocation(500,150);
	
		
		textField = new JTextField();
		textField.setBounds(199, 200, 116, 22);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Id_Cong\u00E9");
		lblNewLabel.setBounds(91, 203, 56, 16);
		add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(199, 266, 116, 22);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(199, 339, 116, 22);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Libele_Cong\u00E9");
		lblNewLabel_1.setBounds(91, 269, 76, 16);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Id_Agent");
		lblNewLabel_2.setBounds(91, 342, 56, 16);
		add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(199, 399, 116, 22);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Date_D\u00E9but_Cong\u00E9");
		lblNewLabel_3.setBounds(65, 402, 126, 16);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Date_Fin_Cong\u00E9");
		lblNewLabel_4.setBounds(392, 203, 132, 16);
		add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(536, 200, 116, 22);
		add(textField_4);
		textField_4.setColumns(10);
		
		JButton btn_save = new JButton("");
		btn_save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_save.setBounds(498, 399, 97, 60);
		Image img0 = new ImageIcon(this.getClass().getResource("/save.png")).getImage();
		btn_save .setIcon(new ImageIcon(img0));
		btn_save.setBorderPainted(false);
		btn_save.setContentAreaFilled(false);
		add(btn_save);
		
		JLabel lblNewLabel_5 = new JLabel("Enregistrer");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(583, 410, 97, 38);
		add(lblNewLabel_5);

	}
}
