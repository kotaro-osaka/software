// Kotaro Osaka

package liste;

public class Ort {
	private String plz;
	private String ort;
	
	public Ort(String plz, String ort) {
		super();
		this.plz = plz;
		this.ort = ort;
	}
	
    public String getPLZ() {
        return plz;
    }
    
    public String getOrt() {
        return ort;
    }
}