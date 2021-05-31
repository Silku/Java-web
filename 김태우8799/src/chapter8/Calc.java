package chapter8;

public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999;
	int add(int num1, int num2);				//덧셈
	int substract(int num1, int num2);		//뺄셈
	int times(int num1, int num2);			//곱셈
	int divide(int num1, int num2);			//나눗셈
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
	}
	static int total(int[] arr) {
		int total = 0;
		for(int i : arr) {
			total += i;
		}
		return total;
	}
//  private 메소드 사용...9버전에는 가능한 기능인데 8버전이라서 안된다고함. 
//	private void myMethod() {
//		System.out.println("private 메소드이빈다.");	
//	} 
}