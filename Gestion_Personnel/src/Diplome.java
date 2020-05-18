import java.util.Date;
public class Diplome {
	
	private int ID_Diplome;
	private String Libelé_Diplome ;
	private Agent ag;
	private Date date_obtention_diplome;
	public int getID_Diplome() {
		return ID_Diplome;
	}
	public void setID_Diplome(int iD_Diplome) {
		ID_Diplome = iD_Diplome;
	}
	public String getLibelé_Diplome() {
		return Libelé_Diplome;
	}
	public void setLibelé_Diplome(String libelé_Diplome) {
		Libelé_Diplome = libelé_Diplome;
	}
	public Agent getAg() {
		return ag;
	}
	public void setAg(Agent ag) {
		this.ag = ag;
	}
	public Date getDate_obtention_diplome() {
		return date_obtention_diplome;
	}
	public void setDate_obtention_diplome(Date date_obtention_diplome) {
		this.date_obtention_diplome = date_obtention_diplome;
	}
	public Diplome(int iD_Diplome, String libelé_Diplome, Agent ag, Date date_obtention_diplome) {
		super();
		ID_Diplome = iD_Diplome;
		Libelé_Diplome = libelé_Diplome;
		this.ag = ag;
		this.date_obtention_diplome = date_obtention_diplome;
	}
	
	
	
	

}
