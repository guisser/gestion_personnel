import java.util.Date;

public class décision {
	
	private int  ID_décision;
	private Poste pos;
	private Agent ag;
	private Date  date_effet;
	public int getID_décision() {
		return ID_décision;
	}
	public void setID_décision(int iD_décision) {
		ID_décision = iD_décision;
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
	public décision(int iD_décision, Poste pos, Agent ag, Date date_effet) {
		super();
		ID_décision = iD_décision;
		this.pos = pos;
		this.ag = ag;
		this.date_effet = date_effet;
	}
	
	
	

}
