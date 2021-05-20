package chapter3;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		int score = 0;
		
		String grade = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성적을 입력하세요 : ");
		score = Integer.parseInt(sc.nextLine());
		
		
		switch(score / 10) {
			case 10 : 
				
			case 9 :
					grade = "A";
					break;
				case 8 :
				  	grade = "B";
				  	break;
			case 7 :
				  	grade = "C";
				  	break;
			case 6 :
					grade = "D";
					break;
			default : 
					grade = "F";
					break;
		}
			System.out.println("나의 성적은" + grade + "입니다.");

	}

}
