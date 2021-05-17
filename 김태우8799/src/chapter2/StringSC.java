package chapter2;

import java.util.Scanner;

// SC는 키보드의 입력을 위한 클래스
// SCanner 클래스
// 라이브러리(API)의 클래스를 사용하기 위해서는 
// import를 하여야한다.
// import java.util.Scanner;
// 자동으로 라이브러리 추가하는 방법? ->
// ctrl + Shift + O

//Scanner console 창에 입력을 받기 위한 클래스
//System.in / out 운영체제 System의 입력과 출력을 의미한다.
//Scanner 클래스 내부에 문자열을 입력 받는 문자열을 입력 받는 메소드는?
//next() 문자열이지만 공백을 포함하지 않는다.
//nextline()	문자열 내의 모든 공백을 표현할 수 있다.
public class StringSC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine(); //10000
		String str2 = sc.nextLine(); //555
		String str3 = sc.nextLine(); //3.14
//     ㅡㅡㅡㅡㅡㅡ아래 문제 풀기 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡSystem.out.println("str1+ str2 = " + 결과값);
//		System.out.println("str1+ str2 = " + 결과값);
//		System.out.println("str + str2 * str 3 =" +결과값);
		
		
		//1. 첫번째 개인실습. 아래꺼 계산할때 괄호 안쳐주니 10000+555의 8문자 결과값 나옴 ㅋㅋ 괄호쳐주니 정상 합산되서 10555됨		
//		System.out.println("str1+ str2 = " +(Integer.parseInt(str1)+Integer.parseInt(str2) ));
//		System.out.println("str + str2 * str 3 =" +(Integer.parseInt(str1)+Integer.parseInt(str2))*Double.parseDouble(str3) );
		
		//2. 두번째 개인실습. 테스트2
//		System.out.println("str1+ str2 = " +((int)Integer.parseInt(str1)+(int)Integer.parseInt(str2) ));
//		System.out.println("str + str2 * str 3 =" +((int)Integer.parseInt(str1)+(int)Integer.parseInt(str2))*(Double)Double.parseDouble(str3) );
		//3. 강사님 풀이실습.
		System.out.println("str1+ str2 = " +(Integer.parseInt(str1)+Integer.parseInt(str2) ));
		System.out.println("str + str2 * str 3 =" +(Integer.parseInt(str1)+Integer.parseInt(str2))*Double.parseDouble(str3) );
// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
//		String test = "12345";
//		char [5] c = {'1','2','3','4','5','\0'};
//		
// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ				
//		String str1 = sc.next();
//		String str2 = sc.nextLine();
//		String str3 = sc.nextLine();
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str3);
		
	}

}
