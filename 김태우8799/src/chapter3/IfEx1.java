package chapter3;

public class IfEx1 {

	public static void main(String[] args) {
		int num = 10;
		
//	1.	if 흐름 원리.1
//		if(num > 20) {num -=10;}
//		if(num <=20) {num+=10;}
//	2. if에서 else사용.2	
//		if(num > 20) {num -=10;}
//		else{num+=10;}
		if(num > 20) {
			num -=10; //들여쓰기
			}
		else num+=10;   // 코드가 1줄일때는 중괄호 생략도 가능하다. 여러줄일떄는 중괄호 열어서 영역지정해줘야된다.
			
		System.out.println(num);
		
	}

}
