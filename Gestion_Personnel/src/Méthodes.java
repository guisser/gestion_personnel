import java.sql.*;

public class M�thodes {
	Connection conn=Utilitaire.getConnection();
	//M�thode qui permet d'ajouter un cong� � la table cong�
	public void ajouter_cong�(String id_cong�,String libele,String id_agent,String date_debut_cong�,String date_fin_cong�) {
		try {
			PreparedStatement ps=conn.prepareStatement("INSERT INTO cong�(ID_CONGE ,LIBELE_CONGE ,ID_AGENT ,DATE_DEBUT_CONGE,DATE_FIN_CONGE) VALUES (?,?,?,?,?)");
			ps.setString(1, id_cong�);
			ps.setString(2, libele);
			ps.setString(3, id_agent);
			ps.setString(4, date_debut_cong�);
			ps.setString(5, date_fin_cong�);
			ps.executeUpdate();
			
		}
		catch(Exception exp) {}
	}
	//M�thode qui permet d'afficher un cong� 
	public void afficher_cong�(String id_agent) {
		try {
			PreparedStatement ps=conn.prepareStatement("SELECT * FROM cong� WHERE ID_CONGE LIKE ?");
			ps.setString(1, id_agent);
			ResultSet rs=ps.executeQuery();	
			while(rs.next()){
				System.out.println("les informations de ce cong� sont");
				System.out.println("ID_CONGE    LIBELE CONGE   ID AGENT  DATE_DEBUT CONGE  DATE_FIN_CONGE");
				System.out.println(rs.getString(1)+"   "+rs.getString(2)+"   "+rs.getString(3)+"      "+rs.getString(4)+"      "+rs.getString(5));
			}
			}
		catch(Exception exp) {}
	}
	//M�thode qui permet de supprimer un cong� 
	public void supprimer_cong�(String id_cong�) {
		try {
			PreparedStatement ps=conn.prepareStatement("DELETE FROM cong� WHERE ID_CONGE LIKE ?");
			ps.setString(1,id_cong�);
			ps.executeUpdate();
		}
		catch(Exception exp) {}
	}

}
