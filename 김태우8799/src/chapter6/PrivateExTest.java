package chapter6;
//�̷��� ����� �ȴ�... �ٸ� Ŭ���� ������ ���� ��� �����ϵ���.... (?)
//��ĳ �����ϰ� �ϳ� ... �̰� �ٷ� Ŭ���� ������ ���� ���м��� ���ؼ���.
public class PrivateExTest {

	public void output(PrivateEx p) {
		System.out.println(p.getiNum());
		System.out.println(p.getiNum2());
		System.out.println(p.getStr());
		System.out.println(p.getStr2());
	}

	public static void main(String[] args) {
		PrivateExTest t = new PrivateExTest();
		PrivateEx pe = new PrivateEx(100,200,"������","������");
		PrivateEx pe2 = new PrivateEx(300,400,"������","������");

		
		
//		pe.output();
//		pe2.output();
		
//		pe.iNum = 100;
//		pe.iNum2 = 100;
//		pe2.iNum = 300;
//		pe2.iNum2 = 400;
//		
//		pe.str = "������";
//		pe.str2 = "�ȴ��";
//		pe2.str = "��ȿ��";
//		pe2.str2 = "�ڿ��";
//		
		t.output(pe);
		t.output(pe2);
		
	}

}
