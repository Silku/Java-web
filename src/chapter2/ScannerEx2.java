package chapter2;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str1, str2, str3, str4, str5, str6;
		
		System.out.print("첫번째 수 입력: ");
		str1 = input.nextLine();
		System.out.print("두번째 수 입력: ");
		str2 = input.nextLine();
		System.out.print("세번째 수 입력: ");
		str3 = input.nextLine();
		System.out.print("네번째 수 입력: ");
		str4 = input.nextLine();
		System.out.print("다섯번째 수 입력: ");
		str5 = input.nextLine();
		System.out.print("여섯번째 수 입력: ");
		str6 = input.nextLine();
		
		System.out.println("첫번째 수와 두번째 수의 합은 " + (Integer.parseInt(str1) + Integer.parseInt(str2)) + "입니다.");
		System.out.println("세번째 수와 네번째 수의 곱은 " + (Integer.parseInt(str3) * Integer.parseInt(str4)) + "입니다.");
		System.out.println("다섯번째 수에서 여섯번째 수를 나눈 나머지는 " + (Integer.parseInt(str5) % Integer.parseInt(str6)) +"입니다.");
	}

}
