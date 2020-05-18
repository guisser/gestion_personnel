
public class Poste {
	
	private int ID_Poste;
	private String Grade_poste;
	public int getID_Poste() {
		return ID_Poste;
	}
	public void setID_Poste(int iD_Poste) {
		ID_Poste = iD_Poste;
	}
	public String getGrade_poste() {
		return Grade_poste;
	}
	public void setGrade_poste(String grade_poste) {
		Grade_poste = grade_poste;
	}
	public Poste(int iD_Poste, String grade_poste) {
		super();
		ID_Poste = iD_Poste;
		Grade_poste = grade_poste;
	}
	
	
	
}
