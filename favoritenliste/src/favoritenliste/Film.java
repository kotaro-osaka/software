package favoritenliste;

public class Film {
	private String title;
	private int year;
	
	public Film(String title, int year) {
		this.title = title;
		this.year = year;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getYear() {
		return year;
	}
}
