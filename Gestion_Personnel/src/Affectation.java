
public class Affectation {

	private int ID_Affectation;
	private String Libelé_Affectation;
	public int getID_Affectation() {
		return ID_Affectation;
	}
	public void setID_Affectation(int iD_Affectation) {
		ID_Affectation = iD_Affectation;
	}
	public String getLibelé_Affectation() {
		return Libelé_Affectation;
	}
	public void setLibelé_Affectation(String libelé_Affectation) {
		Libelé_Affectation = libelé_Affectation;
	}
	public Affectation(int iD_Affectation, String libelé_Affectation) {
		super();
		ID_Affectation = iD_Affectation;
		Libelé_Affectation = libelé_Affectation;
	}
	
	
}
