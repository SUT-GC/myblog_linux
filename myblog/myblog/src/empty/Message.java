package empty;

import java.util.Date;

public class Message {
	private int messbox_id;
	private int floor_id;
	private int user_id;
	private int touser_id;
	private String messbox_reply;
	private Date messbox_date;
	
	public int getMessbox_id() {
		return messbox_id;
	}
	public void setMessbox_id(int messbox_id) {
		this.messbox_id = messbox_id;
	}
	public int getFloor_id() {
		return floor_id;
	}
	public void setFloor_id(int floor_id) {
		this.floor_id = floor_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getTouser_id() {
		return touser_id;
	}
	public void setTouser_id(int touser_id) {
		this.touser_id = touser_id;
	}
	public String getMessbox_reply() {
		return messbox_reply;
	}
	public void setMessbox_reply(String messbox_reply) {
		this.messbox_reply = messbox_reply;
	}
	public Date getMessbox_date() {
		return messbox_date;
	}
	public void setMessbox_date(Date messbox_date) {
		this.messbox_date = messbox_date;
	}
	public Message() {
	}
	public String toString() {
		return "Message [messbox_id=" + messbox_id + ", floor_id=" + floor_id + ", user_id=" + user_id + ", touser_id="
				+ touser_id + ", messbox_reply=" + messbox_reply + ", messbox_date=" + messbox_date + "]";
	}

}
