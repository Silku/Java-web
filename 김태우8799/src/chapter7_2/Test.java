package chapter7_2;

public class Test {
	public int i_num = 10;
	public void test () {
		System.out.println("Test 클래스의 test 메소드입니다.");
	}
	
	public Test() {
		
	}
	//이게 오버로드, 메소드(?) 둘다 존재 : public Test() {} ㅡ public Test(String name) {}
	public Test(String name) {
		System.out.println("Test 클래스를 생성하였습니다." + name);
	}
	
}
