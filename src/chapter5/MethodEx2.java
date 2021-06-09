package chapter5;

public class MethodEx2 {
	
	int sum(int a, int b) {
		int sum = 0;
		sum = a + b;
		return sum;
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
		MethodEx2 m = new MethodEx2();
		System.out.println("20, 30ÀÇ ÇÕ: " + m.sum(20, 30));
		System.out.println("20, 30ÀÇ Â÷: " + m.sub(20, 30));
		System.out.println("20, 30ÀÇ °ö: " + m.times(20, 30));
		System.out.println("30, 5ÀÇ ¸ò: " + m.div(30, 5));
	}

}
