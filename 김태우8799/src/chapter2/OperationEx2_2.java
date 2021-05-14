package chapter2;

public class OperationEx2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i_Num = 10;
		int i_Num2 = 20;
		
		//증감 연산자 복습
		//1. 선증가 연산자 ++i_Num  	-> 10에 1을 더하고 i_Num 사용. 11
		//2. 후증가 연산자 i_Num++		-> i_Num 을 사용한 후에 1을 더함. 10
		//3. 선감소 연산자 --i_Num 		-> 1을 빼고 i_Num 을 사용.  9
		//4. 후감소 연산자 i_Num-- 		-> i_Num을 사용한 후에 1을 뺌 10
		
		System.out.println(i_Num);
		System.out.println(++i_Num);
		System.out.println(i_Num);
		System.out.println(i_Num++);
		System.out.println(i_Num);
		
		System.out.println(i_Num2);
		System.out.println(--i_Num2);
		System.out.println(i_Num2);
		System.out.println(i_Num2--);
		System.out.println(i_Num2);
		
		
	}

}
