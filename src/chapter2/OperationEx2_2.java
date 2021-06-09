package chapter2;

public class OperationEx2_2 {
	
	//Ctrl + F11; 프로그램 실행

	public static void main(String[] args) {
		int i_Num = 10;
		int i_Num2 = 20;
		
		//증감 연산자
		//1. 선증가 연산자	++i_Num		->		10에 1을 더하고 i_Num을 사용한다.
		//2. 후증가 연산자	i_Num++		->		10을 사용한 후에 1을 더한다.
		//3. 선감소 연산자	--i_Num2	->		20에 1을 빼고 i_Num을 사용한다.
		//4. 후감소 연산자	i_Num2--	->		20을 사용한 후에 1을 뺀다.
		
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
