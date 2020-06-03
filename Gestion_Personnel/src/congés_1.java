import javax.swing.JPanel;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class congés_1 extends JPanel {
	private JTextField textField_5;
	private JButton buton_ajouter;
	private JButton btn_ajouter;
	
	private JButton btn_modifier;
	private JButton btn_retour;
	private JButton btn_supprimer;
	private JButton btn_rechercher;
	private JButton btn_imprimer;
	
	

	
	/**
	 * 
	 */

	

	/**
	 * Create the panel.
	 */
	public congés_1() {
		setLayout(null);
		setSize(833,550);
		setLocation(500,150);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(219, 219, 183, 144);
		Image img = new ImageIcon(this.getClass().getResource("/congé.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		add(lblNewLabel);
		
		textField_5 = new JTextField();
		textField_5.setBounds(130, 84, 595, 51);
		add(textField_5);
		textField_5.setColumns(10);
		congés_ajouter panel=new congés_ajouter();
		
		btn_ajouter = new JButton("");
		btn_ajouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				setVisible(false);
				add(panel);
				panel.setVisible(true);
			
				
			}
		});
		btn_ajouter.setBounds(23, 474, 116, 93);
		Image img2 = new ImageIcon(this.getClass().getResource("/add_image.png")).getImage();
		btn_ajouter.setIcon(new ImageIcon(img2));
		btn_ajouter.setBorderPainted(false);
		btn_ajouter.setContentAreaFilled(false);
		add(btn_ajouter);
		
		
		
		btn_modifier = new JButton("");
		btn_modifier.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				congés_modifier mod=new congés_modifier();
				mod.setVisible(true);
				setVisible(false);
				add(mod);

				
			}
		});
		btn_modifier.setBounds(219, 491, 97, 63);
		Image img3 = new ImageIcon(this.getClass().getResource("/modifier.png")).getImage();
		btn_modifier.setIcon(new ImageIcon(img3));
		btn_modifier.setBorderPainted(false);
		btn_modifier.setContentAreaFilled(false);
		
		add(btn_modifier);
		
		btn_retour = new JButton("");
		btn_retour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							}
		});
		btn_retour.setBounds(23, 77, 56, 58);
		Image img4 = new ImageIcon(this.getClass().getResource("/undo.png")).getImage();
		btn_retour.setIcon(new ImageIcon(img4));
		btn_retour.setBorderPainted(false);
		btn_retour.setContentAreaFilled(false);
		add(btn_retour);
		
		btn_supprimer = new JButton("");
		btn_supprimer.setBounds(386, 487, 97, 80);
		Image img5 = new ImageIcon(this.getClass().getResource("/trash-can.png")).getImage();
		btn_supprimer.setIcon(new ImageIcon(img5));
		btn_supprimer.setBorderPainted(false);
		btn_supprimer.setContentAreaFilled(false);
		
		add(btn_supprimer);
		
		btn_rechercher = new JButton("");
		btn_rechercher.setBounds(724, 66, 97, 80);
		Image img6 = new ImageIcon(this.getClass().getResource("/printer.png")).getImage();
		btn_rechercher.setIcon(new ImageIcon(img6));
		btn_rechercher.setBorderPainted(false);
		btn_rechercher.setContentAreaFilled(false);
		
		add(btn_rechercher);
		Image img7 = new ImageIcon(this.getClass().getResource("/search.png")).getImage();
		btn_rechercher.setIcon(new ImageIcon(img7));
		
		btn_imprimer = new JButton("");
		btn_imprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_imprimer.setBounds(593, 491, 97, 76);
		Image img8 = new ImageIcon(this.getClass().getResource("/printer.png")).getImage();
		btn_imprimer.setIcon(new ImageIcon(img8));
		btn_imprimer.setBorderPainted(false);
		btn_imprimer.setContentAreaFilled(false);
		
		
		add(btn_imprimer);
		
		
		
	}
	
}
