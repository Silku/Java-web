package chapter2;

public class OperationEx4 {
//논리 연산자
//&&(AND) , 곱
//||(OR) 	, 합
//!(NOT)	 	, 부정
	
	public static void main(String[] args) {
		boolean trueFalse = true;
		boolean trueFalse2 = true;
		boolean trueFalse3 = false;
		
		boolean temp;
		boolean temp2;
		temp = trueFalse && trueFalse2 && trueFalse3; //AND
		temp2 = trueFalse || trueFalse2 || trueFalse3 ; //OR
		
		
		System.out.println(!temp);
		System.out.println(!temp2);
	}

}
