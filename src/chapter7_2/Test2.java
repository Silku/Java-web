package chapter7_2;

public class Test2 extends Test{
	public int i_num = 20;
	
	public Test2(int i_num) {
		super("������");
		System.out.println(this.i_num + i_num);
		System.out.println(super.i_num + i_num);
		System.out.println(i_num);
		System.out.println("Test2 Ŭ������ �����Ͽ����ϴ�.");
	}
	
	@Override
	public void test() {
		super.test();
		System.out.println("�ڽ� �޼���");
	}

}
