package favoritenliste;

public class LoginData {
	private String userId;
	private String password;
	
	public LoginData(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public String getPassword() {
		return password;
	}
}
