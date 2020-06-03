import javax.swing.JPanel;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class diplomes_1 extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public diplomes_1() {
		setSize(800,550);
		setLocation(500,150);
		setLayout(null);
		
		JButton btn_retour = new JButton("");
		btn_retour.setBounds(25, 91, 75, 39);
		Image img0 = new ImageIcon(this.getClass().getResource("/undo.png")).getImage();
		btn_retour .setIcon(new ImageIcon(img0));
		btn_retour.setBorderPainted(false);
		btn_retour.setContentAreaFilled(false);
		add(btn_retour);
		
		textField = new JTextField();
		textField.setBounds(112, 85, 560, 45);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(320, 242, 231, 99);
		Image img = new ImageIcon(this.getClass().getResource("/diploma.png")).getImage();
		lblNewLabel .setIcon(new ImageIcon(img));
		add(lblNewLabel);
		
		JButton btn_ajouter = new JButton("");
		btn_ajouter.setBounds(56, 481, 107, 81);
		Image img1 = new ImageIcon(this.getClass().getResource("/add_image.png")).getImage();
		btn_ajouter.setIcon(new ImageIcon(img1));
		btn_ajouter.setBorderPainted(false);
		btn_ajouter.setContentAreaFilled(false);
		add(btn_ajouter);
		
		JButton btn_modifier = new JButton("");
		btn_modifier.setBounds(222, 489, 97, 73);
		Image img2 = new ImageIcon(this.getClass().getResource("/modifier.png")).getImage();
		btn_modifier.setIcon(new ImageIcon(img2));
		btn_modifier.setBorderPainted(false);
		btn_modifier.setContentAreaFilled(false);
		add(btn_modifier);
		
		JButton btn_supprimer = new JButton("");
		btn_supprimer.setBounds(390, 481, 97, 81);
		Image img3 = new ImageIcon(this.getClass().getResource("/trash-can.png")).getImage();
		btn_supprimer.setIcon(new ImageIcon(img3));
		btn_supprimer.setBorderPainted(false);
		btn_supprimer.setContentAreaFilled(false);
		add(btn_supprimer);
		
		JButton btn_imprimer = new JButton("");
		btn_imprimer.setBounds(568, 469, 97, 104);
		Image img4 = new ImageIcon(this.getClass().getResource("/printer.png")).getImage();
		btn_imprimer.setIcon(new ImageIcon(img4));
		btn_imprimer.setBorderPainted(false);
		btn_imprimer.setContentAreaFilled(false);
		add(btn_imprimer);
		
		JButton btn_rechercher = new JButton("");
		btn_rechercher.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_rechercher.setBounds(656, 69, 107, 81);
		Image img5 = new ImageIcon(this.getClass().getResource("/search.png")).getImage();
		btn_rechercher.setIcon(new ImageIcon(img5));
		btn_rechercher.setBorderPainted(false);
		btn_rechercher.setContentAreaFilled(false);
		add(btn_rechercher);

	}

}
