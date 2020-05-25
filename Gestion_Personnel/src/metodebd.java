import java.sql.Connection;
import javax.swing.*;
import java.sql.Date;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

public class metodebd {
	
	Connection conn=Utilitaire.getConnection();
	
// Toutes    les       Méthodes     d'ajout     possibles      //
	
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

	public void ajouter_congé(String id_conge,String libele,String id_agent,String date_debut,String date_fin) {
		try {
			PreparedStatement ps=conn.prepareStatement("INSERT INTO congé (ID_CONGE,LIBELE_CONGE,ID_AGENT,DATE_DEBUT_CONGE,DATE_FIN_CONGE) VALUES(?,?,?,?,?) ");
			ps.setString(1,id_conge);
			ps.setString(2, libele);
			ps.setString(3,id_agent);
			ps.setString(4, date_debut);
			ps.setString(5, date_fin);
			ps.executeUpdate();
		}
		catch(Exception e) {}
		}
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
	public void ajouter_grade(String id_grade,String libele) {
		try {
			PreparedStatement ps=conn.prepareStatement("INSERT INTO grade (ID_GRADE , LIBELE_GRADE) VALUES(? ,?)");
			ps.setString(1,id_grade);
			ps.setString(2, libele);
			ps.executeUpdate();
		}
		catch(Exception e) {}
	}
	public void ajouter_poste(String id_poste,String grade_poste) {
		try {
			PreparedStatement ps=conn.prepareStatement("INSERT INTO poste (ID_POSTE,GRADE_POSTE)VALUES(?,?) ");
			ps.setString(1,id_poste);
			ps.setString(2, grade_poste);
			ps.executeUpdate();
		}
		catch(Exception e) {}
		}

	public void ajouter_qualification(String id_qualification,String libele) {
		try {
			PreparedStatement ps=conn.prepareStatement("INSERT INTO qualification (ID_QUALIFICATION,LIBELE_QUALIFICATION)VALUES(?,?)");
			ps.setString(1,id_qualification);
			ps.setString(2, libele);
			ps.executeUpdate();
		}
		catch(Exception e) {}
		}
	
	public void ajouter_agent_grade(String id_agent_grade,String id_agent,String id_grade,String date_obtention) {
		try {
			PreparedStatement ps=conn.prepareStatement("INSERT INTO agent_grade (ID_AGENT_GRADE,ID_AGENT,ID_GRADE,DATE_OBTENTION_GRADE) VALUES(?,?,?,?) ");
			ps.setString(1,id_agent_grade);
			ps.setString(2, id_agent);
			ps.setString(3,id_grade);
			ps.setString(4, date_obtention);
			ps.executeUpdate();
		}
		catch(Exception e) {}
		}
	

	public void ajouter_agent_affectation(String id_agent_affectation ,String id_agent ,String id_affectation ,String fonction) {
		try {
			PreparedStatement ps=conn.prepareStatement("INSERT INTO agent_affectation (ID_AGENT_AFFECTATION,ID_AGENT,ID_AFFECTATION,FONCTION) VALUES(?,?,?,?) ");
			ps.setString(1,id_agent_affectation);
			ps.setString(2, id_agent);
			ps.setString(3,id_affectation);
			ps.setString(4, fonction);
			ps.executeUpdate();
		}
		catch(Exception e) {}
		}
	
	
	public void ajouter_agent_qualification(String id_agent_qualification ,String id_agent ,String id_qualification ,String date_obtention) {
		try {
			PreparedStatement ps=conn.prepareStatement("INSERT INTO agent_qualification (ID_AGENT_QUALIFICATION,ID_AGENT,ID_QUALIFICATION,DATE_QUALIFICATION) VALUES(?,?,?,?) ");
			ps.setString(1,id_agent_qualification);
			ps.setString(2, id_agent);
			ps.setString(3,id_qualification);
			ps.setString(4, date_obtention);
			ps.executeUpdate();
		}
		catch(Exception e) {}
		}
	
	
	//Toutes les Méthodes d'affichage possibles
	
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
	public void afficher_grade(String id_grade) {
		try {
			PreparedStatement ps=conn.prepareStatement("SELECT * FROM grade WHERE ID_GRADE LIKE ?");
			ps.setString(1, id_grade);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("les informations de ce grade sont");
				System.out.println("ID_GRADE    LIBELE_GRADE");
				System.out.println(rs.getString(1) +"  " +rs.getString(2));
			}
		}
		catch(Exception exp) {}
	}
	
	public void afficher_poste(String id_poste) {
		try {
			
			PreparedStatement ps=conn.prepareStatement("SELECT * FROM poste WHERE ID_POSTE LIKE ?");
			ps.setString(1, id_poste);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("les informations de ce poste sont");
				System.out.println("ID_GRADE    GRADE_POSTE");
				System.out.println(rs.getString(1) +"  " +rs.getString(2));
			}
		}
		
		catch(Exception exp) {}
		
	}
	
	public void afficher_affectation(String id_affectation) {
		
		try {
			
			PreparedStatement ps=conn.prepareStatement("SELECT * FROM affectation WHERE ID_AFFECTATION LIKE ?");
			ps.setString(1, id_affectation);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("les informations de cet affectation sont");
				System.out.println("ID_AFFECTATION    LIBELE_AFFECTATION");
				System.out.println(rs.getString(1) +"           " +rs.getString(2));
			}
		}
		
		catch(Exception exp) {}
	}
	
	public void afficher_qualification(String id_qualification) {
		try {
			
			PreparedStatement ps=conn.prepareStatement("SELECT * FROM qualification WHERE ID_QUALIFICATION LIKE ?");
			ps.setString(1, id_qualification);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("les informations de cette qualification sont");
				System.out.println("ID_AFFECTATION    LIBELE_QUALIFICATION");
				System.out.println(rs.getString(1) +"           " +rs.getString(2));
			}
		}
		
		catch(Exception exp) {}
	}
	
	
	
	
	
	
	
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

	public void afficher_fonction_agent(String id_agent) {
		try {
			PreparedStatement ps=conn.prepareStatement("SELECT * FROM agent_affectation WHERE  id_agent LIKE ?");
			ps.setString(1,id_agent);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("le(s) fonction(s) occupée(s) par cet agent sont ");
				System.out.println(rs.getString(4));
			}
		}
		catch(Exception exp) {}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Toutes les Méthodes de suppression possibles
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
	
		public void supprimer_grade(String id_grade) {
			try {
				PreparedStatement ps =conn.prepareStatement("DELETE FROM grade WHERE ID_GRADE LIKE ?");
				ps.setString(1, id_grade);
				ps.executeUpdate();
				ps.close();
				conn.close();
			}
			catch(Exception e) {}
		}
		
	public void supprimer_poste(String id_poste) {
		try {
			PreparedStatement ps =conn.prepareStatement("DELETE FROM poste WHERE ID_POSTE LIKE ?");
			ps.setString(1, id_poste);
			ps.executeUpdate();
			ps.close();
			conn.close();
		}
		catch(Exception e) {}
	}
	
	
	public void supprimer_affectation(String id_affectation) {
		try {
			PreparedStatement ps =conn.prepareStatement("DELETE FROM affectation WHERE ID_AFFECTATION LIKE ?");
			ps.setString(1, id_affectation);
			ps.executeUpdate();
			ps.close();
			conn.close();
		}
		catch(Exception e) {}
	}
	
	public void supprimer_qualification(String id_qualification) {
		try {
			PreparedStatement ps =conn.prepareStatement("DELETE FROM qualification WHERE ID_QUALIFICATION LIKE ?");
			ps.setString(1, id_qualification);
			ps.executeUpdate();
			ps.close();
			conn.close();
		}
		catch(Exception e) {}
	}
	
	public void supprimer_decision(String id_decision) {
		try {
			PreparedStatement ps =conn.prepareStatement("DELETE FROM decision WHERE ID_DECISION LIKE ?");
			ps.setString(1, id_decision);
			ps.executeUpdate();
			ps.close();
			conn.close();
		}
		catch(Exception e) {}
		
	}
	
	
	public void supprimer_diplome(String id_diplome) {
		try {
			PreparedStatement ps =conn.prepareStatement("DELETE FROM diplome WHERE ID_DIPLOME LIKE ?");
			ps.setString(1, id_diplome);
			ps.executeUpdate();
			ps.close();
			conn.close();
		}
		catch(Exception e) {}
		
	}
	
	public void supprimer_congé(String id_congé) {
		try {
			PreparedStatement ps =conn.prepareStatement("DELETE FROM congé WHERE ID_CONGE LIKE ?");
			ps.setString(1, id_congé);
			ps.executeUpdate();
			ps.close();
			conn.close();
		}
		catch(Exception e) {}
		
	}
	
	

	public void supprimer_agent_grade(String id_agent_grade) {
		try {
			PreparedStatement ps =conn.prepareStatement("DELETE FROM agent_grade WHERE ID_AGENT_GRADE LIKE ?");
			ps.setString(1, id_agent_grade);
			ps.executeUpdate();
			ps.close();
			conn.close();
		}
		catch(Exception e) {}
		
	}
	
	public void supprimer_agent_qualification(String id_agent_qualification) {
		try {
			PreparedStatement ps =conn.prepareStatement("DELETE FROM agent_qualification WHERE ID_AGENT_QUALIFICATION LIKE ?");
			ps.setString(1, id_agent_qualification);
			ps.executeUpdate();
			ps.close();
			conn.close();
		}
		catch(Exception e) {}
		
	}
	
	
	public void supprimer_agent_affectation(String id_agent_affectation) {
		try {
			PreparedStatement ps =conn.prepareStatement("DELETE FROM agent_affectation WHERE ID_AGENT_AFFECTATION LIKE ?");
			ps.setString(1, id_agent_affectation);
			ps.executeUpdate();
			ps.close();
			conn.close();
		}
		catch(Exception e) {}
		
	}
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	



	
	
	
	
	
	

