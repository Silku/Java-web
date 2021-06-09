package chapter3;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		// 키보드의 입력을 받는다.
		// 입력받은 수의 구구단을 출력한다.
		// int num;
		
		// num의 구구단
		// num X 1 = num*1
		// num X 2 = num*2
		// num X 3 = num*3
		
		// 반복은 9번
		
		// 지역변수?
		
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		System.out.println(num + "의 구구단");
	
		for(int i = 1; i < 10; i++) {
			System.out.println(num + " X " + i + " = " + (num*i));
		}

	}

}
