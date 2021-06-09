package chapter3;

import java.util.Scanner;

public class ScoreIf {
	// 키보드 입력을 받는다
	// String name = 본인의 이름;
	// 0 ~ 100만 입력을 받을 수 있음. 해당 조건이 아닐 경우 <입력오류!>를 출력하고 프로그램 종료
	// int scoreKR = 국어점수
	// int scoreEng = 영어점수
	// int scoreMath = 수학점수
	// 
	// int totalScore = 총점(모든 과목의 합)
	// int avgScore = 평균(totalScore / 과목 수)
	// char grade = 등급{90 ~ 100(A), 80 ~ 89(B), 70 ~ 79(C), 60 ~ 69(D), 0 ~ 59(F)}
	// 
	//  본인 이름(김준일)의 성적
	//	국어: 00점
	//  영어: 00점
	//  수학: 00점
	//  총점: 00점
	//  평균: 00.00점
	//  등급: A등급)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정보를 입력해 주세요.");
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("국어: ");
		int scoreKR = Integer.parseInt(sc.nextLine());
		System.out.print("영어: ");
		int scoreEng = Integer.parseInt(sc.nextLine());
		System.out.print("수학: ");
		int scoreMath = Integer.parseInt(sc.nextLine());
		
		int totalScore = 0; //총점
		double avgScore = 0; //평균
		char grade = ' '; //등급
		
		if(scoreKR < 0 || scoreKR > 100 || scoreEng < 0 || scoreEng > 100 || scoreMath < 0 || scoreMath > 100) {
			System.out.println("<입력오류!>");
		}
		else {
			totalScore = scoreKR + scoreEng + scoreMath;
			avgScore = totalScore / 3.0;
			
			if(avgScore >= 90) {
				grade = 'A';
			}else if(avgScore >= 80) {
				grade = 'B';
			}else if(avgScore >= 70) {
				grade = 'C';
			}else if(avgScore >= 60) {
				grade = 'D';
			}else {
				grade = 'F';
			}
			
			System.out.println(name + "의 성적"); 				//  본인 이름(김준일)의 성적
			System.out.println("국어: " + scoreKR + "점"); 		//	국어: 00점
			System.out.println("영어: " + scoreEng + "점"); 		//  영어: 00점
			System.out.println("수학: " + scoreMath + "점");		//  수학: 00점
			System.out.println("총점: " + totalScore + "점");		//  총점: 00점
			System.out.println("평균: " + avgScore + "점");		//  평균: 00.00점
			System.out.println("등급: " + grade + "등급");		//  등급: A등급)
		}
	}
}
