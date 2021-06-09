package chapter7_2;

public class Test2 extends Test{
	public int i_num = 20;
	
	public Test2(int i_num) {
		super("김준일");
		System.out.println(this.i_num + i_num);
		System.out.println(super.i_num + i_num);
		System.out.println(i_num);
		System.out.println("Test2 클래스를 생성하였습니다.");
	}
	
	@Override
	public void test() {
		super.test();
		System.out.println("자식 메서드");
	}

}
