package chapter7_2;

public class Test {
	public int i_num = 10;
	public void test () {
		System.out.println("Test Ŭ������ test �޼ҵ��Դϴ�.");
	}
	
	public Test() {
		
	}
	//�̰� �����ε�, �޼ҵ�(?) �Ѵ� ���� : public Test() {} �� public Test(String name) {}
	public Test(String name) {
		System.out.println("Test Ŭ������ �����Ͽ����ϴ�." + name);
	}
	
}
