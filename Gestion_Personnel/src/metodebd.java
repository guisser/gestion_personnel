import java.sql.Connection;
import javax.swing.*;
import java.sql.Date;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

public class metodebd {
	
	Connection conn=Utilitaire.getConnection();
	
	// Méthode qui permet d'ajouter à la table Agent un candidat admis
	
	public void ajouter_agent(String  id_agent ,String nom, String prenom, String adresse) {
		try {
			PreparedStatement ps=conn.prepareStatement("INSERT INTO agents (ID_AGENT, NOM, PRENOM,ADRESSE) VALUES (?, ?, ?,?)");
				ps.setString(1,id_agent);
				ps.setString(2,nom);
				ps.setString(3,prenom);
				ps.setString(4,adresse);
				ps.executeUpdate();
				ps.close();
				conn.close();
				}
			catch(Exception e) {}
			}
	
	//Méthode qui permet de supprimer un agent
	public void supprimer_agent(String ID_AGENT) {
		try {
			PreparedStatement ps =conn.prepareStatement("DELETE FROM agents WHERE ID_AGENT LIKE ?");
			ps.setString(1, ID_AGENT);
			ps.executeUpdate();
			ps.close();
			conn.close();
		}
		catch(Exception e) {}
	}
	//Methode qui permet d'afficher les informations d'un agent
	
		public void afficher_agent(String mot) {
			try {
				PreparedStatement ps=conn.prepareStatement("SELECT * FROM agents WHERE ID_AGENT LIKE ?");
				ps.setString(1,mot);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					System.out.println("Les informations de cet agent sont :");
				    System.out.println("ID_AGENT NOM  PRENOM ADRESSE ");
					System.out.println(rs.getInt(1)+"         "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
				}
			}
			catch(Exception e) { 
			}
		}
	////Methode qui permet d'afficher tous les qualifications d'un agent durant sa carrière
		public void afficher_les_qualification_agent(String id_agent) {
			try {
				PreparedStatement ps=conn.prepareStatement("SELECT * FROM agents,qualification ,agent_qualification WHERE agents.ID_AGENT =agent_qualification.ID_AGENT AND agent_qualification.ID_QUALIFICATION=qualification.ID_QUALIFICATION AND agents.ID_AGENT LIKE ?"); 
				ps.setString(1,id_agent);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					System.out.println("les informations de l'agent qui pocede ces qualifications");
					System.out.println(rs.getInt(1)+"  " +rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
					System.out.println("ce(s) qualification(s) sont :");
					System.out.println(rs.getInt(5)+"   "+rs.getString(6));
					
				}
			}
			catch(Exception exp) {}
		}
	////Methode qui permet d'afficher tous les grades  d'un agent durant sa carrière
		public void afficher_les_grade_agent(String ID_AGENT) {
			try {
				PreparedStatement ps=conn.prepareStatement("SELECT * FROM agents,grade,agent_grade WHERE agents.ID_AGENT=agent_grade.ID_AGENT AND grade.ID_GRADE=agent_grade.ID_GRADE AND agents.ID_AGENT LIKE ?");
				ps.setString(1,ID_AGENT);
				ResultSet rs=ps.executeQuery();
			
				while(rs.next()) {
					System.out.println("les informations de l'agent qui pocede ces grades");
					System.out.println(rs.getInt(1)+"  " +rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
					System.out.println(" ces grades sont ID_GRADE LIBELE_GRADE DATE_OBTENTION_GRADE");
					System.out.println(rs.getInt(5)+"    "+rs.getString(6)+"   "+rs.getDate(10));
				}
			}
			
			catch(Exception e) { 
			}
		}
	////Methode qui permet d'afficher tous les postes d'un agent durant sa carrière
		public void afficher_les_poste_agent(String ID_AGENT) {
			try {
				PreparedStatement ps=conn.prepareStatement("SELECT * FROM  agents,poste,decision WHERE agents.ID_AGENT = decision.ID_AGENT AND poste.ID_POSTE=decision.ID_POSTE AND decision.VISA=? AND agents.ID_AGENT LIKE ?");
				ps.setString(1,"accepte");
				ps.setString(2, ID_AGENT);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
				System.out.println("les informations de cet agent sont ");
				System.out.println(rs.getString(1)+"   " +rs.getString(2)+"     "+rs.getString(3)+"   "+rs.getString(4));
				System.out.println("les informations de ce(s) poste(s) sont ");
				System.out.println(rs.getInt(5)+"    "+rs.getString(6));
				}
			}
			catch(Exception e) {}
		}
		//Metode qui permet d'afficher toutes les unités d'affectation d'un agent durant sa carrière
		public void afficher_les_unités_affectation_agent(String ID_AGENT) {
			try {
				PreparedStatement ps=conn.prepareStatement("SELECT * FROM affectation, agent_affectation WHERE affectation.ID_AFFECTATION=agent_affectation.ID_AFFECTATION AND agent_affectation.ID_AGENT LIKE ?");
				ps.setString(1,ID_AGENT);
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				System.out.println(rs.getString(2));
				}
			
			catch(Exception e) { 
			}
		}

		
		//Metode qui permet d'afficher tous les diplomes d'un agent
		public void afficher_les_diplome_agent(String ID_AGENT) {
			try {
				PreparedStatement ps=conn.prepareStatement("SELECT * FROM diplome WHERE ID_AGENT LIKE ?");
				ps.setString(1,ID_AGENT);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
				System.out.println("les diplomes qui sont obtenus par cet agent sont");
				System.out.println("ID_DIPLOME LIBELE_DIPLOME DATE_OBTENTION_DIPLOME ");
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDate(3));
				}
			}
			
			catch(Exception e) { 
			}
		}
		//Methode qui affiche tous les congés d'un agent
		public void afficher_les_congé_agent(String id_agent) {
			try {
				PreparedStatement ps=conn.prepareStatement("SELECT * FROM congé WHERE ID_AGENT LIKE ?");
				ps.setString(1, id_agent);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					System.out.println("les congés qui a pris cet agent sont :");
					System.out.println("ID_CONGE   LIBELE_CONGE  DATE_DEBUT_CONGE   DATE_FIN_CONGE");
					System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"    "+rs.getDate(4)+"    "+rs.getDate(5));
				}
			}
			catch(Exception exp) {}
		}
	//Methode qui permet d'ajouter un diplome pour un agent
	public void ajouter_diplome(int id_diplome,String libele_diplome,String simpleDateFormat ,int id_agent) {
		try {
			PreparedStatement ps=conn.prepareStatement("INSERT INTO diplome(ID_DIPLOME,LIBELE_DIPLOME,DATE_OBTENTION,ID_AGENT ) VALUES(?,?,?,?)");
			ps.setInt(1, id_diplome);
			ps.setString(2,libele_diplome);
			ps.setString(3,simpleDateFormat);
			ps.setInt(4,id_agent );
			ps.executeUpdate();
			ps.close();
			conn.close();
		}
		catch(Exception e) {}
	}
	// Méthode qui permet de saisir  à la table decision la décision de recrutement d'un agent
	
	public void ajouter_decision(int id_decision ,int id_agent ,int id_poste, String visa) {
		try {
			PreparedStatement ps=conn.prepareStatement("INSERT INTO decision (ID_DECISION, ID_AGENT, ID_POSTE ,VISA) VALUES (?, ?, ?,?)");
			ps.setInt(1,id_decision);
			ps.setInt(2,id_agent);
			ps.setInt(3,id_poste);
			ps.setString(4,visa);
			ps.executeUpdate();
			ps.close();
			conn.close();
			}
		catch(Exception e) {}
		
	}
		
	
	//Methode qui permet de saisir la fonction d'un agent dans une unité d'affectation
	
	public void ajouter_fonction(int id_agent_affectation ,int id_agent ,int id_affectation, String fonction) {
		try {
			PreparedStatement ps=conn.prepareStatement("INSERT INTO agent_affectation (ID_AGENT_AFFECTATION, ID_AGENT, ID_AFFECTATION ,FONCTION) VALUES (?, ?, ?,?)");
			ps.setInt(1,id_agent_affectation);
			ps.setInt(2,id_agent);
			ps.setInt(3,id_affectation);
			ps.setString(4,fonction);
			ps.executeUpdate();
			ps.close();
			conn.close();
			}
		catch(Exception e) {}
		
	}
	
	
	//Methode qui permet d'éditer à la demande d'un agent la décision de recrutement
	
	public void afficher_decision_recrutement(int ID_AGENT) {
		try {
			PreparedStatement ps=conn.prepareStatement("SELECT * FROM decision WHERE ID_AGENT LIKE ?");
			ps.setInt(1,ID_AGENT);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
			System.out.println("la décision de recrutement de cet agent est ");
			System.out.println(rs.getString(4));
			}
			}
		
		catch(Exception e) { 
		}
	}
////Methode qui permet de modifier les informations d'un agent
	public void modifier_agent(int NID_AGENT,String NNOM,String NPRENOM,String NADRESSE) {
		try {
		PreparedStatement ps=conn.prepareStatement("UPDATE agents SET ID_AGENT=NID_AGENT,NOM=NNOM ,PRENOM=NPRENOM,ADRESSE=NADRESSE  WHERE ID_AGENT LIKE ?");
		ps.setInt(1,NID_AGENT);
		ps.setString(2, NNOM);
		ps.setString(3,NPRENOM);
		ps.setString(4, NADRESSE);
		ps.executeUpdate();
			
	}
		catch(Exception exp) {}
	}
}
	



	
	
	
	
	
	

