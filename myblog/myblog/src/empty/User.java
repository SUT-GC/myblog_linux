package empty;

public class User {
	private int user_id;
	private String user_email;
	private String user_pass;
	private String user_nick;
	private String user_imagepath;
	private int user_isadmin;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_pass() {
		return user_pass;
	}

	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}

	public String getUser_nick() {
		return user_nick;
	}

	public void setUser_nick(String user_nick) {
		this.user_nick = user_nick;
	}

	public String getUser_imagepath() {
		return user_imagepath;
	}

	public void setUser_imagepath(String user_imagepath) {
		this.user_imagepath = user_imagepath;
	}

	public int getUser_isadmin() {
		return user_isadmin;
	}

	public void setUser_isadmin(int user_isadmin) {
		this.user_isadmin = user_isadmin;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_email=" + user_email + ", user_pass=" + user_pass + ", user_nick="
				+ user_nick + ", user_imagepath=" + user_imagepath + ", user_isadmin=" + user_isadmin + "]";
	}

	public User() {
	}

}
