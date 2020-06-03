import java.sql.*;

public class Méthodes {
	Connection conn=Utilitaire.getConnection();
	//Méthode qui permet d'ajouter un congé à la table congé
	public void ajouter_congé(String id_congé,String libele,String id_agent,String date_debut_congé,String date_fin_congé) {
		try {
			PreparedStatement ps=conn.prepareStatement("INSERT INTO congé(ID_CONGE ,LIBELE_CONGE ,ID_AGENT ,DATE_DEBUT_CONGE,DATE_FIN_CONGE) VALUES (?,?,?,?,?)");
			ps.setString(1, id_congé);
			ps.setString(2, libele);
			ps.setString(3, id_agent);
			ps.setString(4, date_debut_congé);
			ps.setString(5, date_fin_congé);
			ps.executeUpdate();
			
		}
		catch(Exception exp) {}
	}
	//Méthode qui permet d'afficher un congé 
	public void afficher_congé(String id_agent) {
		try {
			PreparedStatement ps=conn.prepareStatement("SELECT * FROM congé WHERE ID_CONGE LIKE ?");
			ps.setString(1, id_agent);
			ResultSet rs=ps.executeQuery();	
			while(rs.next()){
				System.out.println("les informations de ce congé sont");
				System.out.println("ID_CONGE    LIBELE CONGE   ID AGENT  DATE_DEBUT CONGE  DATE_FIN_CONGE");
				System.out.println(rs.getString(1)+"   "+rs.getString(2)+"   "+rs.getString(3)+"      "+rs.getString(4)+"      "+rs.getString(5));
			}
			}
		catch(Exception exp) {}
	}
	//Méthode qui permet de supprimer un congé 
	public void supprimer_congé(String id_congé) {
		try {
			PreparedStatement ps=conn.prepareStatement("DELETE FROM congé WHERE ID_CONGE LIKE ?");
			ps.setString(1,id_congé);
			ps.executeUpdate();
		}
		catch(Exception exp) {}
	}

}
