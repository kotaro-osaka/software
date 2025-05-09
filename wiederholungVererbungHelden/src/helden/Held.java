package helden;

public abstract class Held {
	protected int kraft;
	
	public Held(int kraft) {
		this.kraft = kraft;
	}
	
	public int getKraft() {
		return this.kraft;
	}
	
	public void setKraft(int kraft) {
		this.kraft = kraft;
	}
}
