import java.sql.Connection;
import java.sql.DriverManager;

public class Utilitaire {
	private static Connection conn;
	static {
	try { 
	   Class.forName("com.mysql.jdbc.Driver");
	   String url = "jdbc:mysql://localhost:3306/gestion_personnel";
	    conn = DriverManager.getConnection(url, "root","");
	    }
	catch(Exception e){ 
		System.out.println("Erreur lors du chargement de Driver:"+e);
		}
	 }
	 public static Connection getConnection(){
		 return conn;
		 }
	 

}

