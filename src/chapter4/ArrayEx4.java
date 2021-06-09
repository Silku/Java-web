package chapter4;

import java.util.Scanner;

public class ArrayEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] bookName = new String[3];
		
		// 자바 기초 프로그래밍
		// Do it 자바 프로그래밍
		// 명품 자바
		for(int i = 0; i < bookName.length; i++) {
			System.out.print((i+1)+"번 책 입력: ");
			bookName[i] = sc.nextLine();
		}
		
		for(int i = 0; i < bookName.length; i++) {
			System.out.println((i+1) + ". " + bookName[i]);
		}
	}

}
