package empty;

import java.util.Date;

public class Reply {
	private int replyid;
	private String replycontent;
	private int articleid;
	private int userid;
	private Date replydate;

	public Reply() {
	}

	public int getReplyid() {
		return replyid;
	}

	public void setReplyid(int replyid) {
		this.replyid = replyid;
	}

	public String getReplycontent() {
		return replycontent;
	}

	public void setReplycontent(String replycontent) {
		this.replycontent = replycontent;
	}

	public int getArticleid() {
		return articleid;
	}

	public void setArticleid(int articleid) {
		this.articleid = articleid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public Date getReplydate() {
		return replydate;
	}

	public void setReplydate(Date replydate) {
		this.replydate = replydate;
	}

	public String toString() {
		return "ReplyDao [replyid=" + replyid + ", replycontent=" + replycontent + ", articleid=" + articleid
				+ ", userid=" + userid + ", replydate=" + replydate + "]";
	}

}
