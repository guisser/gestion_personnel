import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import javax.swing.table.DefaultTableModel;


public class métodes {
	static Connection conn=Utilitaire.getConnection();
	public void ajouter_congé(String id_congé,String libelé,String id_agent,String date_debut,String date_fin) {
		try {
PreparedStatement ps=conn.prepareStatement("INSERT INTO congé(ID_CONGE,LIBELE_CONGE,ID_AGENT,DATE_DEBUT_CONGE,DATE_FIN_CONGE) VALUES(?,?,?,?,?)");
ps.setString(1, id_congé);
ps.setString(2, libelé);
ps.setString(3, id_agent);
ps.setString(4, date_debut);
ps.setString(5,date_fin);
ps.executeUpdate();	
		}
		catch(Exception exp) {}
	}
		
	public void supprimer_congé(String id_congé) {
		try {
			PreparedStatement ps=conn.prepareStatement("DELETE FROM congé WHERE ID_CONGE LIKE ?");
			ps.setString(1, id_congé);
			ps.executeUpdate();
		
	}
		catch(Exception exp) {}
		
	}
	
	public void ajouter_diplome(String id_diplome,String libelé,String DATE_OBTENTION,String id_agent) {
		try {
			PreparedStatement ps=conn.prepareStatement("INSERT INTO diplome(ID_DIPLOME,LIBELE_DIPLOME,DATE_OBTENTION,ID_AGENT) VALUES(?,?,?,?)");
			ps.setString(1, id_diplome);
			ps.setString(2, libelé);
			ps.setString(3, DATE_OBTENTION);
			ps.setString(4, id_agent);
			ps.executeUpdate();	
		}
		catch(Exception exp) {}
	}
	
	
	public void supprimer_diplome(String id_diplome) {
		try {
			PreparedStatement ps=conn.prepareStatement("DELETE FROM diplome WHERE ID_DIPLOME LIKE ?");
			ps.setString(1, id_diplome);
			ps.executeUpdate();
		
	}
		catch(Exception exp) {}
		
	}
	
	
	public void ajouter_affectation(String id_affectation,String fonction,String id_agent,String date_affectation) {
try {
	PreparedStatement ps=conn.prepareStatement("INSERT INTO affectation(ID_AFFECTATION,FONCTION,ID_AGENT,DATE_AFFECTATION) VALUES(?,?,?,?)");
	ps.setString(1, id_affectation);
	ps.setString(2, fonction);
	ps.setString(3, id_agent);
	ps.setString(4, date_affectation);
	ps.executeUpdate();	
}
catch(Exception exp) {}
	}
	
	public void supprimer_affectation(String id_affectation) {
		try {
			PreparedStatement ps=conn.prepareStatement("DELETE FROM affectation WHERE ID_AFFECTATION LIKE ?");
			ps.setString(1,id_affectation);
			ps.executeUpdate();
		
	}
		catch(Exception exp) {}
		
	}
	
	public static void afficher_congé(String id_congé,DefaultTableModel tab) {
		try {
PreparedStatement ps=conn.prepareStatement("SELECT * FROM congé WHERE ID_CONGE LIKE ?");
ps.setString(1,id_congé);
ResultSet rs=ps.executeQuery();
while (rs.next()) {
tab.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)} );
	
					}
		}
		catch(Exception exp) {}
		
		
	}
		
	
	public static void afficher_diplome(String id_diplome,DefaultTableModel tab) {
		try {
PreparedStatement ps=conn.prepareStatement("SELECT * FROM diplome WHERE ID_DIPLOME LIKE ?");
ps.setString(1,id_diplome);
ResultSet rs=ps.executeQuery();
while (rs.next()) {
tab.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)} );
	
					}
		}
		catch(Exception exp) {}
		
		
	}
	
	public static void afficher_affectation(String id_affectation,DefaultTableModel tab) {
		try {
PreparedStatement ps=conn.prepareStatement("SELECT * FROM affectation WHERE ID_AFFECTATION LIKE ?");
ps.setString(1,id_affectation);
ResultSet rs=ps.executeQuery();
while (rs.next()) {
tab.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)} );
	
					}
		}
		catch(Exception exp) {}
		
		
	}
	
	
	
	public static void ajouter_admis(String id_admis,String nom,String prenom,String cin) {
		try {
			PreparedStatement ps=conn.prepareStatement("INSERT INTO admis(ID_ADMIS,NOM,PRENOM,CIN) VALUES(?,?,?,?)");
			ps.setString(1, id_admis);
			ps.setString(2, nom);
			ps.setString(3, prenom);
			ps.setString(4, cin);
			ps.executeUpdate();	
		}
		catch(Exception exp) {}
			}
	
	
	public static void actualiser_admis(DefaultTableModel table) {
		try {
			PreparedStatement ps=conn.prepareStatement("SELECT * FROM admis ");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				table.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)} );
			}
		
	}
		catch(Exception exp) {}
	}
		
		public static void ajouter_decision(String id_decision,String id_agent,String id_poste,String visa){
			
			
					
			
		
	}
	
	
	
	




	public static void afficher_congé_agent(String id_agent,DefaultTableModel ta) {
		try {
			PreparedStatement ps=conn.prepareStatement("SELECT * FROM congé WHERE ID_AGENT LIKE ?");
			ps.setString(1,id_agent);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
				ta.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)} );
		}
		catch(Exception exp) {}
	}
	
	
	
	public static void afficher_diplome_agent(String id_agent,DefaultTableModel tb) {
		try {
			PreparedStatement ps=conn.prepareStatement("SELECT * FROM diplome WHERE ID_AGENT LIKE ?");
			ps.setString(1,id_agent);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
				tb.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)} );
		}
		catch(Exception exp) {}
	}
	
	
	public static void afficher_affectation_agent(String id_agent,DefaultTableModel table) {
		
		try {
PreparedStatement ps=conn.prepareStatement("SELECT * FROM affectation WHERE ID_AGENT LIKE ?");
ps.setString(1,id_agent);
ResultSet rs=ps.executeQuery();
while(rs.next())
	table.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)} );
		}
		catch(Exception exp) {}
	}
	
	
	
public static void modifier_congé(String id_congé,String libele_congé,String id_agent,String date_debut,String date_fin ) {
		
		try {
PreparedStatement ps=conn.prepareStatement("UPDATE congé SET LIBELE_CONGE =? ,ID_AGENT=? ,DATE_DEBUT_CONGE =?,DATE_FIN_CONGE =? WHERE ID_CONGE LIKE ?");
ps.setString(1,libele_congé);
ps.setString(2, id_agent);
ps.setString(3, date_debut);
ps.setString(4, date_fin);
ps.setString(5, id_congé);
ps.executeUpdate();
		}
		
		catch(Exception exp) {}
		
	}
	
	

public static void modifier_diplome(String id_diplome,String libele,String date_obtention,String id_agent ) {
	
	try {
PreparedStatement ps=conn.prepareStatement("UPDATE diplome SET LIBELE_DIPLOME =? , DATE_OBTENTION =?,ID_AGENT=? WHERE ID_DIPLOME LIKE ?");
ps.setString(1,libele);
ps.setString(2, date_obtention);
ps.setString(3, id_agent);
ps.setString(4, id_diplome);
ps.executeUpdate();
	}
	
	catch(Exception exp) {}
	
}

public static void modifier_affectation(String id_affectation,String fonction,String id_agent,String date_affec ) {
	
	try {
PreparedStatement ps=conn.prepareStatement("UPDATE affectation SET FONCTION =? , ID_AGENT =?,DATE_AFFECTATION=? WHERE ID_AFFECTATION LIKE ?");
ps.setString(1,fonction);
ps.setString(2, id_agent);
ps.setString(3,  date_affec);
ps.setString(4, id_affectation);
ps.executeUpdate();
	}
	
	catch(Exception exp) {}
	
}


	
		
	}
	
	
	

