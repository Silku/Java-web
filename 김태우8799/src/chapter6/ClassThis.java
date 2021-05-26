package chapter6;
//this 예약어, 클래스 자신을 가리키는 명령(연산자)
public class ClassThis {
	public int iNum;
	public int iNum2;
	public String str;
	public String str2;
	
	public ClassThis(){
		this(0,0,"이름","이름2");
		System.out.println("디폴트 생성자");
	}
	
	public ClassThis(int iNum, int iNum2, String str, String str2) {
		this.iNum = iNum;
		this.iNum = iNum2;
		this.str = str;
		this.str2 = str2;
		this.test();
		//동일 변수명이 있으면 지역변수 내의 변수가 먼저 적용이되고 그렇지 않다면 클래스 내부에 있는 변수명이 적용됨. 알아두면됨 ? 그럴ㄷ긋 ㅇㅇ 
	}
	public void test() {
		System.out.println("test");
	}
	
}
