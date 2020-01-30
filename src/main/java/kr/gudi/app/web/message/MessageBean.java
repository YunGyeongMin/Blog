package kr.gudi.app.web.message;

public class MessageBean {
	
	int num;
	int regUser;
	int targetUser;
	String comment;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getRegUser() {
		return regUser;
	}
	public void setRegUser(int regUser) {
		this.regUser = regUser;
	}
	public int getTargetUser() {
		return targetUser;
	}
	public void setTargetUser(int targetUser) {
		this.targetUser = targetUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "MessageBean [num=" + num + ", regUser=" + regUser + ", targetUser=" + targetUser + ", comment="
				+ comment + "]";
	}

}
