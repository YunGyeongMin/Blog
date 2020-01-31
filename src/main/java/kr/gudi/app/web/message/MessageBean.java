package kr.gudi.app.web.message;

public class MessageBean {
	
	int num;
	int regUser;
	int targetUser;
	String comment;
	String name;
	String img;
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "MessageBean [num=" + num + ", regUser=" + regUser + ", targetUser=" + targetUser + ", comment="
				+ comment + ", name=" + name + ", img=" + img + "]";
	}

}
