
public class Grade {
	
	private int ID_Grade;
	private String  Libele_Grade;
	public int getID_Grade() {
		return ID_Grade;
	}
	public void setID_Grade(int iD_Grade) {
		ID_Grade = iD_Grade;
	}
	public String getLibele_Grade() {
		return Libele_Grade;
	}
	public void setLibele_Grade(String libele_Grade) {
		Libele_Grade = libele_Grade;
	}
	public Grade(int iD_Grade, String libele_Grade) {
		super();
		ID_Grade = iD_Grade;
		Libele_Grade = libele_Grade;
	}
	
	
}
