package chapter6;

//Getter	값을 가져올때
//Setter	값을 지정할때

public class PrivateEx {
	private int iNum;
	private int iNum2;
	private String str;
	private String str2;
	
	public int getiNum() {
		return iNum;
	}

	public void setiNum(int iNum) {
		this.iNum = iNum;
	}

	public int getiNum2() {
		return iNum2;
	}

	public void setiNum2(int iNum2) {
		this.iNum2 = iNum2;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String getStr2() {
		return str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}

	public PrivateEx(int a, int b, String c, String d) {
		this.iNum = a;
		this.iNum2 = b;
		this.str = c;
		this.str2 = d;
	}
}
