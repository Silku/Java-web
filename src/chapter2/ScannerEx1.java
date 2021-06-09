package chapter2;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = null;
		
		str = sc.nextLine();
		
		System.out.println("입력하신 정보는 " + str + "입니다.");

	}

}
