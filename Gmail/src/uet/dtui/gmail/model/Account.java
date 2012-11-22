package uet.dtui.gmail.model;


public class Account {
	public String displayName;
	public String email;
	public String password;
	/*State activity is true when account available in database else otherwide*/
	public Boolean stateActivite;
	/*State online is true when account online else otherwide*/
	public Boolean stateOnline;
	
	public Account(String email, String name, String pass) {
		displayName = name;
		this.email = email;
		this.password = pass;
	}
	
	public Account(String email, String pass) {
		displayName = email;
		this.email = email;
		this.password = pass;
	}
}