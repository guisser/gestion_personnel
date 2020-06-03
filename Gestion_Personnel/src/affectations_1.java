import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class affectations_1 extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public affectations_1() {
		setSize(851,574);
		setLocation(500,150);
		setLayout(null);
		
		JButton bt_retour = new JButton("");
		bt_retour.setBounds(45, 96, 79, 50);
		bt_retour.setBorderPainted(false);
		bt_retour.setContentAreaFilled(false);
		Image img0 = new ImageIcon(this.getClass().getResource("/undo.png")).getImage();
		bt_retour.setIcon(new ImageIcon(img0));
		add(bt_retour);
		
		textField = new JTextField();
		textField.setBounds(136, 96, 531, 39);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(347, 188, 217, 229);
		Image img5 = new ImageIcon(this.getClass().getResource("/affectation.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img5));
		add(lblNewLabel_4);
		
		JButton bt_ajouter = new JButton("");
		bt_ajouter.setBounds(22, 464, 97, 93);
		Image img = new ImageIcon(this.getClass().getResource("/add_image.png")).getImage();
		bt_ajouter.setIcon(new ImageIcon(img));
		bt_ajouter .setBorderPainted(false);
		bt_ajouter .setContentAreaFilled(false);
		add(bt_ajouter);
		
		JButton bt_modifier = new JButton("");
		bt_modifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		bt_modifier.setBounds(262, 464, 97, 83);
		Image img1 = new ImageIcon(this.getClass().getResource("/modifier.png")).getImage();
		bt_modifier.setIcon(new ImageIcon(img1));
		bt_modifier.setBorderPainted(false);
		bt_modifier .setContentAreaFilled(false);
		add(bt_modifier);
		
		JButton bt_supprimer = new JButton("");
		bt_supprimer.setBounds(450, 464, 97, 93);
		Image img2 = new ImageIcon(this.getClass().getResource("/trash-can.png")).getImage();
		bt_supprimer.setIcon(new ImageIcon(img2));
		bt_supprimer.setBorderPainted(false);
		bt_supprimer.setContentAreaFilled(false);
		add(bt_supprimer);
		
		JButton bt_imprimer = new JButton("");
		bt_imprimer.setBounds(638, 464, 97, 93);
		Image img3= new ImageIcon(this.getClass().getResource("/printer.png")).getImage();
		bt_imprimer.setIcon(new ImageIcon(img3));
		bt_imprimer.setBorderPainted(false);
		bt_imprimer.setContentAreaFilled(false);
		add(bt_imprimer);
		
		JButton bt_rechercher = new JButton("");
		bt_rechercher.setBounds(663, 96, 97, 50);
		Image img4= new ImageIcon(this.getClass().getResource("/search.png")).getImage();
		 bt_rechercher.setIcon(new ImageIcon(img4));
		 bt_rechercher.setBorderPainted(false);
		 bt_rechercher.setContentAreaFilled(false);
		add(bt_rechercher);
		
		
		
	}
}
