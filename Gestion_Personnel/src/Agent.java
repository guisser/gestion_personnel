
public class Agent {
	
	private int ID_Agent;
	private String Nom;
	private String Pr�nom;
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
	public String getPr�nom() {
		return Pr�nom;
	}
	public void setPr�nom(String pr�nom) {
		Pr�nom = pr�nom;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public Agent(int iD_Agent, String nom, String pr�nom, String adresse) {
		super();
		ID_Agent = iD_Agent;
		Nom = nom;
		Pr�nom = pr�nom;
		Adresse = adresse;
	}
	
	

}
