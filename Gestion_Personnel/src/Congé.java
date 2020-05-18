
public class Congé {
	private String Code;
	private String libelé;
	private Agent ag;
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getLibelé() {
		return libelé;
	}
	public void setLibelé(String libelé) {
		this.libelé = libelé;
	}
	public Agent getAg() {
		return ag;
	}
	public void setAg(Agent ag) {
		this.ag = ag;
	}
	public Congé(String code, String libelé, Agent ag) {
		super();
		Code = code;
		this.libelé = libelé;
		this.ag = ag;
	}
	
	
	
}
