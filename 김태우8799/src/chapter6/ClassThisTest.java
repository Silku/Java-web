package chapter6;

public class ClassThisTest {
	public void output(ClassThis c) {
		System.out.println(c.iNum);
		System.out.println(c.iNum2);
		System.out.println(c.str);
		System.out.println(c.str2);
		System.out.println();
	}
	
	public static void main(String[] args) {
		ClassThisTest t = new ClassThisTest();
		ClassThis ct = new ClassThis(); //ClassThis Ŭ���� ���� �޾� ����Ʈ�����ڻ����Ǵºκ��̰�
		ClassThis ct2 = new ClassThis(100,200,"������","������");
		ClassThis ct3 = new ClassThis();
		ClassThis ct4 = new ClassThis(500,600,"������","������");
		t.output(ct);
		t.output(ct2);
		t.output(ct3);
		t.output(ct4);
		System.out.println();
	}

}

