import java.util.Date;
public class Diplome {
	
	private int ID_Diplome;
	private String Libel�_Diplome ;
	private Agent ag;
	private Date date_obtention_diplome;
	public int getID_Diplome() {
		return ID_Diplome;
	}
	public void setID_Diplome(int iD_Diplome) {
		ID_Diplome = iD_Diplome;
	}
	public String getLibel�_Diplome() {
		return Libel�_Diplome;
	}
	public void setLibel�_Diplome(String libel�_Diplome) {
		Libel�_Diplome = libel�_Diplome;
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
	public Diplome(int iD_Diplome, String libel�_Diplome, Agent ag, Date date_obtention_diplome) {
		super();
		ID_Diplome = iD_Diplome;
		Libel�_Diplome = libel�_Diplome;
		this.ag = ag;
		this.date_obtention_diplome = date_obtention_diplome;
	}
	
	
	
	

}
