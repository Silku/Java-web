package chapter5;

public class MethodEX4 {
//(�ڷ���,�ܾ� ��Ծ���)
	String test(String str, String str2) {
		//��ȣ�ȿ� ���� ~Stirng~ �Ű� ������.
//		System.out.println("test �޼ҵ��Դϴ�.");
		String strSum;
		strSum=  str + str2;
		return strSum;
	}

	String test2(String str, String str2) {
//		System.out.println("test2 �޼ҵ��Դϴ�.");
		return str + " "+ str2;
	}
	String won( int num) {
		
		return num + "��";
	}
	
	public static void main(String[] args) {

		MethodEX4 m = new MethodEX4();
		String a, b;
		int num1,num2;
		a = "�ڹ�";
		b = "���α׷���";
		num1 = 15000;
		num2 = 50000;
		System.out.println(m.test(a, b));
		System.out.println(m.test2(a, b));
		System.out.println(m.won(num1));
		System.out.println(m.won(num2));
		
		
	}

}
