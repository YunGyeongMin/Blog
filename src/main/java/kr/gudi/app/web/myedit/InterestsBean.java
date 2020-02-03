package kr.gudi.app.web.myedit;

public class InterestsBean {
	
	int num;
	String name;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "InterestsBean [num=" + num + ", name=" + name + "]";
	}

}
