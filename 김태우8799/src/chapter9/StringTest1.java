package chapter9;

public class StringTest1 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		//���� �Ʒ��� ���� �Ʒ��� abc ��ü�� ������ �ּ���. ���� �����ϸ� ���ٶ�� ����� ����
		//���� ���ο� �ּҸ� ������ �ּҾȿ� ���� ���°Ű� ���� �ּҰ��� �ٸ��⶧���� ù ���๮�忡�� false�� ����
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3 == str4);
		System.out.println(str4.equals(str4));
		
	}

}
