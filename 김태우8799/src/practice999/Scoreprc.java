package practice999;

import java.util.Scanner;

public class Scoreprc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키보드 입력을 받는다.
				// String name = 본인의 이름;
				/*0 ~ 100입력을 받을 수 있음. 해당조건이 아닐 경우 <입력오류 !>를 출력하고 프로그램 종료.
				 * int scoreKR = 국어점수
				 * int scoreEng = 영어점수
				 * int socreMath = 수학점수
				 * 
				 * int totalScore = (총점 모든과목의 합)
				 * int avgScore  = 평균 totalScore/ 과목수
				 * char grade = 등급 (90~100(A), 80~89(B), 70~79(C), 60~69(D), 0~59(F))
				 * 
				 */
		String name;
		int scoreKR, scoreEng, scoreMath;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("본인 이름을 입력하세요 : ");
		name = sc.nextLine();	
		System.out.print("국어점수를 입력하세요 : ");
		scoreKR = Integer.parseInt(sc.nextLine());
		System.out.print("영어점수를 입력하세요 : ");
		scoreEng = Integer.parseInt(sc.nextLine());
		System.out.print("수학점수를 입력하세요 : ");
		scoreMath = Integer.parseInt(sc.nextLine());
		if(scoreKR < 0 || scoreKR >= 100 || scoreEng < 0 || scoreEng >= 100)
	
		
		
		
		System.out.println("" + name +"님의 성적");
		System.out.println("국어 : " + scoreKR + "점");
		System.out.println("영어 : " + scoreEng + "점");
		System.out.println("수학 : " + scoreMath + "점");
//		System.out.println("총점 : " + totalScore + "점");
//		System.out.println("평균 : " + avgScore + "점");
//		System.out.println("등급 : " + grade + "등급");	
	}

}
