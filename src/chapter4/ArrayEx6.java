package chapter4;

import java.util.Scanner;

public class ArrayEx6 {

	public static void main(String[] args) {
		String[][] bookName = new String[2][3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < bookName.length; i++) {
			System.out.println((i == 0 ? "집" : "학원") + "의 도서 목록을 입력하세요.");
			for(int j = 0; j < bookName[0].length; j++) {
				System.out.print((j+1) + "번 책 제목: ");
				bookName[i][j] = sc.nextLine();
			}
		}
		
		for(int i = 0; i < bookName.length; i++) {
			System.out.println((i == 0 ? "집" : "학원") + "의 도서 목록");
			for(int j = 0; j < bookName[0].length; j++) {
				System.out.println((j+1) + ". " + bookName[i][j]);
			}
		}
		/*	
		//집
		System.out.println("집의 도서 목록을 입력하세요.");
		for(int i = 0; i < bookName[0].length; i++) {
			System.out.print((i+1) + "번 책 제목: ");
			bookName[0][i] = sc.nextLine();
		}
		System.out.println("학원의 도서 목록을 입력하세요.");
		for(int i = 0; i < bookName[0].length; i++) {
			System.out.print((i+1) + "번 책 제목: ");
			bookName[1][i] = sc.nextLine();
		}
		System.out.println("집의 도서 목록");
		for(int i = 0; i < bookName[0].length; i++) {
			System.out.println((i+1) + ". " + bookName[0][i]);
		}
		System.out.println("학원의 도서 목록");
		for(int i = 0; i < bookName[0].length; i++) {
			System.out.println((i+1) + ". " + bookName[1][i]);
		}
		// 집의 도서 목록을 입력하세요.
		// 1번 책 제목: 명품 자바
		// 2번 책 제목: 자바의 정석
		// 3번 책 제목: 기초 자바프로그래밍
		
		// 학원의 도서 목록을 입력하세요.
		// 1번 책 제목: 명품 자바2
		// 2번 책 제목: 자바의 정석2
		// 3번 책 제목: 기초 자바프로그래밍2
		// 2차원 배열 bookName;
		
		// 집의 도서목록
		// 학원의 도서목록
*/
	}

}
