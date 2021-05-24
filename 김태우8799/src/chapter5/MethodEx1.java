package chapter5;
//x,y처럼 
	// 함수안에 method가 있음
	// class 안에 선언되어 지는 함수를 method라 한다.
/**
 * Method(메소드 || 메서드) == 함수의 종류중 하나이다. 
 * 클래스 내부에 선언되어지는 모든 함수를 Method라고 한다.
 * 
 * Method의 구조
 * 반환형 + Metohd 명 + (매개변수){ return 값;}	
 * int sum(int x, int y){ 
 * 			return x + y;
 * }
 * void sum(int x, int y){  }
 * 만약에 반환형이 void()면 return을 갖지 않음.
 */
public class MethodEx1 {	
	int sum(int x, int y) {
		return x+y;
	}
	public static void main(String[] args) {
		MethodEx1 m = new MethodEx1();
		int sumNum = 0;
		sumNum = m.sum(10, 20);
		System.out.println("10+ 20 = " + sumNum);
	}

}
