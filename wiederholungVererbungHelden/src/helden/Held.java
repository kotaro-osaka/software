package helden;

public abstract class Held {
	protected int kraft;
	
	public Held(int kraft) {
		this.kraft = kraft;
	}
	
	public abstract int getKraft();
	
	public void setKraft(int kraft) {
		this.kraft = kraft;
	}
}
