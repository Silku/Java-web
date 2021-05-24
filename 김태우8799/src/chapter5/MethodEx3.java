package chapter5;

/**
 * 
 * 메소드 오버로딩
 *
 *
 */
public class MethodEx3 {
	int sum(int x, int y) {
		System.out.println("정수형");
		int sum = 0;
		sum = x + y;
		return sum;
	}
	//안에 매개변수 같은 int같으면 변수 바꿔줘도 안되는데 '변수형'을 바꾸면 ? -> 가능하다 
	//아래와 같은게 메서드 오버로딩
	String sum(String a, String b) {
		System.out.println("문자형");
		return a + b;
	}
	double sum(double a, double b) {
		System.out.println("실수형");
		return  a + b;
	}

	int sub(int x, int y) {
		int sub = 0;
		sub = x - y;
		return sub;
	}

	int times(int x, int y) {
		return x * y;
	}

	int div(int x, int y) {
		if (y == 0) {
			return 0;
		} else {
			return x / y;
		}

	}

	public static void main(String[] args) {
		MethodEx3 m = new MethodEx3();
		System.out.println("20, 30의 합 " + m.sum(20, 30));
		System.out.println("20, 30의 합 " + m.sum(20.5, 30.5));
		System.out.println("20, 30의 합 " + m.sum("20", "30"));
		
//		System.out.println("20, 30의 차 " + m.sub(20, 30));
//		System.out.println("20, 30의 곱 " + m.times(20, 30));
//		System.out.println("20, 30의 몫 " + m.div(30, 5));

	}

}
