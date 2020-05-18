
public class Qualification {
	private int ID_Qualification;
	private String Libele_Qualification;
	public int getID_Qualification() {
		return ID_Qualification;
	}
	public void setID_Qualification(int iD_Qualification) {
		ID_Qualification = iD_Qualification;
	}
	public String getLibele_Qualification() {
		return Libele_Qualification;
	}
	public void setLibele_Qualification(String libele_Qualification) {
		Libele_Qualification = libele_Qualification;
	}
	public Qualification(int iD_Qualification, String libele_Qualification) {
		super();
		ID_Qualification = iD_Qualification;
		Libele_Qualification = libele_Qualification;
	}
	
}
