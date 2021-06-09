package chapter7_3;

public class Test2 extends Test{
	public int i_num = 20;
	
	@Override
	public void test() {
		super.test();
		System.out.println("자식 메서드1");
	}
	
	public void show() {
		System.out.println("테스트2");
	}

}
