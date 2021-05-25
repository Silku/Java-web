package chapter5;

public class MethodEX4 {
//(자료형,단어 까먹었음)
	String test(String str, String str2) {
		//괄호안에 들어가는 ~Stirng~ 매개 변수다.
//		System.out.println("test 메소드입니다.");
		String strSum;
		strSum=  str + str2;
		return strSum;
	}

	String test2(String str, String str2) {
//		System.out.println("test2 메소드입니다.");
		return str + " "+ str2;
	}
	String won( int num) {
		
		return num + "원";
	}
	
	public static void main(String[] args) {

		MethodEX4 m = new MethodEX4();
		String a, b;
		int num1,num2;
		a = "자바";
		b = "프로그래밍";
		num1 = 15000;
		num2 = 50000;
		System.out.println(m.test(a, b));
		System.out.println(m.test2(a, b));
		System.out.println(m.won(num1));
		System.out.println(m.won(num2));
		
		
	}

}
