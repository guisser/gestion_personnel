import java.util.Date;

public class d�cision {
	
	private int  ID_d�cision;
	private Poste pos;
	private Agent ag;
	private Date  date_effet;
	public int getID_d�cision() {
		return ID_d�cision;
	}
	public void setID_d�cision(int iD_d�cision) {
		ID_d�cision = iD_d�cision;
	}
	public Poste getPos() {
		return pos;
	}
	public void setPos(Poste pos) {
		this.pos = pos;
	}
	public Agent getAg() {
		return ag;
	}
	public void setAg(Agent ag) {
		this.ag = ag;
	}
	public Date getDate_effet() {
		return date_effet;
	}
	public void setDate_effet(Date date_effet) {
		this.date_effet = date_effet;
	}
	public d�cision(int iD_d�cision, Poste pos, Agent ag, Date date_effet) {
		super();
		ID_d�cision = iD_d�cision;
		this.pos = pos;
		this.ag = ag;
		this.date_effet = date_effet;
	}
	
	
	

}
