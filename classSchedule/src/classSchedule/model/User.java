package classSchedule.model;

public class User {
	private int id;
	private String username;
	private String password;
	private String major;
	
	// Constructor
	public User() {
		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}

	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;		
	}
}
