
public class Agent {
	
	private int ID_Agent;
	private String Nom;
	private String Prénom;
	private String Adresse;
	public int getID_Agent() {
		return ID_Agent;
	}
	public void setID_Agent(int iD_Agent) {
		ID_Agent = iD_Agent;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrénom() {
		return Prénom;
	}
	public void setPrénom(String prénom) {
		Prénom = prénom;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public Agent(int iD_Agent, String nom, String prénom, String adresse) {
		super();
		ID_Agent = iD_Agent;
		Nom = nom;
		Prénom = prénom;
		Adresse = adresse;
	}
	
	

}
