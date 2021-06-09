package chapter5;

/**
 * 
 * 메소드 오버로딩
 * 메소드의 이름은 같지만 매개변수가 다른경우 선언을 허용한다.
 *
 */

public class MethodEx3 {
	
	int sum(int x, int y) {
		System.out.println("정수");
		int sum = 0;
		sum = x + y;
		return sum;
	}
	
	String sum(String a, String b) {
		System.out.println("문자열");
		return a + b;
	}
	
	double sum(double a, double b) {
		System.out.println("실수");
		return a + b;
	}
	
	int sub(int a, int b) {
		int sub = 0;
		sub = a - b;
		return sub;
	}
	
	int times(int x, int y) {
		return x*y;
	}
	
	int div(int x, int y) {
		if(y == 0) {
			return 0;
		}else {
			return x/y;
		}
	}

	public static void main(String[] args) {
		MethodEx3 m = new MethodEx3();
		System.out.println("20, 30의 합: " + m.sum(20, 30));
		System.out.println("20, 30의 합: " + m.sum(20.5, 30.5));
		System.out.println("20, 30의 합: " + m.sum("20", "30"));
	}

}
