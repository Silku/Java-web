package chapter7_2;

public class Test {
	public static int i_num = 10;
	
	public void test() {
		System.out.println("부모 메소드");
	}
	
	public void test(int a) {
		System.out.println(a);
	}
	
	public Test() {
		
	}
	
	public Test(String name) {
		System.out.println("Test 클래스를 생성하였습니다." + name);
	}
}
