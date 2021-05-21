package chapter4;

import java.util.Scanner;

public class ArrayEx4 {
// 배열에 값을 입력 받아 보기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String bookName [] = new String[3];
		
		//자바 기초 프로그래밍
		//Do it 자바 프로그래밍
		//명품자바
		
		
		for(int i = 0; i < bookName.length; i++) {
			System.out.print((i+1)+"번 책 입력 : ");
			bookName [i] = sc.nextLine();
		}
		System.out.println("입력된 책은 총 "+ bookName.length +"권이며 목록은 아래와 같습니다");
		for(int i = 0; i < bookName.length; i++) {
			System.out.println((i+1) + ". " + bookName[i]);
		}
		
		
		
		
//		System.out.println("책을 입력하세요.");
//		bookName[0] = sc.nextLine();
//		bookName[1] = sc.nextLine();
//		bookName[2] = sc.nextLine();
//		System.out.println("입력된 책은 총 "+ bookName.length +"권이며 목록은 아래와 같습니다");
//		System.out.println(bookName[0]);
//		System.out.println(bookName[1]);
//		System.out.println(bookName[2]);
	}

}
