package chapter7_2;

public class Test2 extends Test{
	public Test2() {
		super("김준일");
		System.out.println(i_num);
		System.out.println("Test2 클래스를 생성하였습니다."); 
		// super();가 기본적으로 생략되어있는 형태이다. 
		//Test 클래스가 먼저 생성되있는게 생략 
	}
}
