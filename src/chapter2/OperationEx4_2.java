package chapter2;

public class OperationEx4_2 {
	// <논리연산자>
	// AND연산자		&&		두 항의 곱
	// OR연산자		||		두 항의 합
	// NOT연산자		!		하나의 항의 부정

	public static void main(String[] args) {
		boolean trueFalse = true;
		boolean trueFalse2 = true;
		boolean trueFalse3 = true;
		boolean trueFalse4 = false;
		
		//AND연산 모든 항이 true(1)이어야 true(1)를 반환, 하나라도 0이면 결과는 false(0).
		System.out.println(trueFalse && trueFalse2 && trueFalse3 && trueFalse4);
		//OR연산 모든 항이 false(0)이어야 false(0)를 반환, 하나라도 1이면 결과는 true(1).
		System.out.println(trueFalse || trueFalse2 || trueFalse3 || trueFalse4);
		//NOT연산 역상(부정) 1 -> 0, 0 -> 1
		System.out.println(!trueFalse && trueFalse2 && trueFalse3);

	}

}
