package kr.gudi.app.web.myedit;

public class InterestsBean {
	
	int num;
	String name;
	boolean state;
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
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "InterestsBean [num=" + num + ", name=" + name + ", state=" + state + "]";
	}

}
