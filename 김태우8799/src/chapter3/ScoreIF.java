package chapter3;

import java.util.Scanner;

public class ScoreIF {

	public static void main(String[] args) {
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
// 풀이 : 
		
		Scanner input =  new Scanner(System.in);
		String name;
		int scoreKR, scoreEng, scoreMath;

		
		System.out.print("본인 이름을 입력하세요 : ");
		name = input.nextLine();	
		System.out.print("국어점수를 입력하세요 : ");
		scoreKR = Integer.parseInt(input.nextLine());	
		System.out.print("영어점수를 입력하세요 : ");
		scoreEng = Integer.parseInt(input.nextLine());	
		System.out.print("수학점수를 입력하세요 : ");
		scoreMath = Integer.parseInt(input.nextLine());	
		
		int totalScore = 0;
		double avgScore = 0;
		char grade = ' ';
		
		if(scoreKR < 0 || scoreKR > 100 || scoreEng <0 || scoreEng > 100 || scoreMath < 0 || scoreMath >100) {
			System.out.println("<입력오류!>"); 
		}
		else {
			totalScore = scoreKR + scoreEng +scoreMath;
			avgScore = totalScore /3.0;
			if(avgScore >= 90) {
				grade ='A';
			}else if(avgScore >= 80) {
				grade ='B';
			}else if(avgScore >= 70) {
				grade ='C';
			}else if(avgScore >= 60) {
				grade ='D';
			}else{
				grade ='F';
			}
			System.out.println("" + name +"님의 성적");
			System.out.println("국어 : " + scoreKR + "점");
			System.out.println("영어 : " + scoreEng + "점");
			System.out.println("수학 : " + scoreMath + "점");
			System.out.println("총점 : " + totalScore + "점");
			System.out.println("평균 : " + avgScore + "점");
			System.out.println("등급 : " + grade + "등급");	
		}
			
	}
	
}

/*else{totalScore~~~~} 밑의 문장들을 만약 위로 올린다면
 *  사용자 입장에서는 별문제 없는경우가 생길수도있는데
 *  컴퓨터 입장에서는 먼저 연산을 처리하고 결과값을 출력해야되기때문에 
 * 컴퓨터한테 쓸데없이 연산을 시킬수도 있다.
 *  
*/


