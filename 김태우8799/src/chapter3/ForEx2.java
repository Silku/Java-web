package chapter3;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		//키보드의 입력을 받는다..
		//입력받은 수의 구구단을 출력한다.
		//int num;
		//반복 9번
		
		//지역변수

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요. : ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("구구단 " +num+ "단");

		for(int num2 = 1; num2 < 10; num2++ ) {  
			//for문 안에 있는 int num2는 지역변수이다. 반복이 끝나면 저 변수는 사라짐.
				System.out.println(num + " X " +num2+" = " +(num*num2));
			}
		
		
		

	
		
		
		
//		for(num = 1; num <10; num++) {
//			for(int num2 = 1; num2 < 10; num2++) {
//				System.out.println(num + " X " +num2+" = " +(num*num2));
//			}
//			
//		}
//		
//		
	}

}
