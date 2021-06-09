package chapter5;

public class MethodEx4 {
	
	String test(String str, String str2) {
		String strSum;
		strSum = str + str2;
		return strSum;
	}
	
	String test2(String str, String str2) {
		return str + " " + str2;
	}
	
	String won(int num) {
		return num + "원";
	}

	public static void main(String[] args) {
		MethodEx4 m = new MethodEx4();
		
		String a, b;
		int num1, num2;
		
		a = "자바";
		b = "프로그래밍";
		
		num1 = 15000;
		num2 = 50000;
		
		System.out.println( m.test(a, b) );
		System.out.println(m.test2(a, b));
		System.out.println(m.won(num1));
		System.out.println(m.won(num2));
	}

}
