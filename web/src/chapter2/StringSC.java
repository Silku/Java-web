package chapter2;

import java.util.Scanner;

// 키보드의 입력을 위한 클래스
// Scanner 클래스
// 라이브러리(API)의 클래스를 사용하기 위해서는
// import를 하여야한다.
// import java.util.Scanner;
// 자동으로 라이브러리 추가하는 방법?
// Ctrl + Shift + o (단축키)

// Scanner consol창에 입력을 받기 위한 클래스
// System.in / out 운영체제 System의 입력과 출력을 의미한다.

// Scanner 클래스 내부에 문자열을 입력받는 메소드는?
// next() 문자열이지만 공백을 포함하지 않는다.
// nextLine() 문자열 내의 모든 공백을 표현할 수 있다.

public class StringSC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine(); 	// "10000"
		String str2 = sc.nextLine();	// "555"
		String str3 = sc.nextLine();	// "3.14"
		
		
		System.out.println("str1 + str2 = " + (Integer.parseInt(str1) + Integer.parseInt(str2)) );
		
		System.out.println("(str1 + str2) * str3 = " + ((Integer.parseInt(str1)+Integer.parseInt(str2))*Double.parseDouble(str3)));
		
		// str1 + str2 = 10555
		// (str1 + str2) * str3 = 33142.700000000004

	}

}
