package chapter6;

// Ŭ���� �ڽ��� ����Ű�� ���(������) this�����

public class ClassThis {
	public int iNum;
	public int iNum2;
	public String str;
	public String str2;
	
	public ClassThis() {
		this(0, 0, "�̸�", "�̸�2");
		System.out.println("����Ʈ ������");
	}

	public ClassThis(int iNum, int iNum2, String str, String str2) {
		this.iNum = iNum;
		this.iNum2 = iNum2;
		this.str = str;
		this.str2 = str2;
		this.test();
	}
	
	public void test() {
		System.out.println("test");
	}
}
