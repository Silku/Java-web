package chapter2;

public class OperationEx5 {
	//삼항연산자
	
	// 사용방법 : 
	//  조건식 ?  결과1 : 결과 2
	//  참이면 결과1, 거짓이면 결과2를 반환
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fatherAge = 55;
		int motherAge = 57;
		
		char trueFalse;
		int trueFalse2;
		
		trueFalse = (fatherAge > motherAge) ? 'T':'F' ;
		trueFalse2 = (fatherAge > motherAge) ? 1:0 ;
		
		System.out.println(trueFalse);
		System.out.println(trueFalse2);
		
		
	}

}
