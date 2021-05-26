package chapter6;

//Getter 값을 가져오는거
//Setter 값을 정해주는거

public class PrivateEx {
	private String str;
	private String str2;
	private int iNum;
	private int iNum2;
	
	public void setiNum(int iNum) {
		this.iNum = iNum;  //매개변수로 같은이름을 쓴 놈이 있으니 this를 썼다아
	}
	
	public int getiNum() {
		return iNum;
	}
	
	public PrivateEx(int a, int b, String c, String d) {
		this.iNum = a;
		this.iNum2 = b;
		this.str = c;
		this.str2 = d;
	}
	public void output(){
		System.out.println(iNum);
		System.out.println(iNum2);
		System.out.println(str);
		System.out.println(str2);
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

	public int getiNum2() {
		return iNum2;
	}

	public void setiNum2(int iNum2) {
		this.iNum2 = iNum2;
	}
	
	
}
