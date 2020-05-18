import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class metodebd {
	
	Connection conn=Utilitaire.getConnection();
	
	// Méthode qui permet d'ajouter à la table Agent un candidat admis
	
	public void ajouter_agent(int id_agent ,String nom, String prenom, String adresse) {
		try {
			PreparedStatement ps=conn.prepareStatement("INSERT INTO agents (ID_AGENT, NOM, PRENOM,ADRESSE) VALUES (?, ?, ?,?)");
				ps.setInt(1,id_agent);
				ps.setString(2,nom);
				ps.setString(3,prenom);
				ps.setString(4,adresse);
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
		
	//Methode qui permet d'afficher les informations d'un agent
	
	public void afficher_agent(String mot) {
		try {
			PreparedStatement ps=conn.prepareStatement("SELECT * FROM agents WHERE NOM LIKE ?");
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
	//Methode qui permet de suivre les postes d'un agent durant sa carrière
	
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
	////Methode qui permet d'afficher tous les postes d'un agent durant sa carrière
	public void afficher_poste_agent(int ID_AGENT) {
		try {
			PreparedStatement ps=conn.prepareStatement("SELECT * FROM agents ,decision WHERE agents.ID_AGENT = decision.ID_AGENT AND agents.ID_AGENT LIKE ?");
			ps.setInt(1,ID_AGENT);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			System.out.println(rs.getInt(3));
			}
		
		catch(Exception e) { 
		}
	}
////Methode qui permet d'afficher tous les grades  d'un agent durant sa carrière
	public void afficher_grade_agent(int ID_AGENT) {
		try {
			PreparedStatement ps=conn.prepareStatement("SELECT * FROM agents,agent_grade WHERE agents.ID_AGENT=agent_grade.ID_AGENT AND agents.ID_AGENT LIKE ?");
			ps.setInt(1,ID_AGENT);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			System.out.println(rs.getInt(7)+" "+rs.getDate(8));
			}
		
		catch(Exception e) { 
		}
	}
//Metode qui permet d'afficher tous les diplomes d'un agent
	public void afficher_diplome_agent(int ID_AGENT) {
		try {
			PreparedStatement ps=conn.prepareStatement("SELECT * FROM diplome WHERE ID_AGENT LIKE ?");
			ps.setInt(1,ID_AGENT);
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
	
	//Metode qui permet d'afficher toutes les unités d'affectation d'un agent durant sa carrière
	public void afficher_unité_affectation_agent(int ID_AGENT) {
		try {
			PreparedStatement ps=conn.prepareStatement("SELECT * FROM agents, agent_affectation WHERE agents.ID_AGENT=agent_affectation.ID_AGENT AND ID_AGENT LIKE ?");
			ps.setInt(1,ID_AGENT);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			System.out.println(rs.getInt(1));
			}
		
		catch(Exception e) { 
		}
	}
	}
	
	
	
	
	

