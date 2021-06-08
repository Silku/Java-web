package chapter1;

import java.util.Scanner;

public class Subjectscore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성명을 입력하세요 : ");
		String name = sc.nextLine();
		int scoreKR, scoreEng, scoreMath;
		System.out.print("국어 점수를 입력하세요. : "); 
		scoreKR = Integer.parseInt(sc.nextLine());
		System.out.print("영어 점수를 입력하세요. : "); 
		scoreEng = Integer.parseInt(sc.nextLine());
		System.out.print("수학 점수를 입력하세요. : "); 
		scoreMath = Integer.parseInt(sc.nextLine());
		
		int totalScore = 0;
		double avgScore = 0;
		char grade = ' ';
		
		totalScore = scoreKR + scoreEng + scoreMath;
		avgScore = (scoreKR + scoreEng + scoreMath) / 3;
		
		if(scoreKR < 0 || scoreKR > 100 || scoreEng < 0 || scoreEng > 100 || scoreMath < 0 || scoreMath > 100 ) {
			System.out.println("<입력오류!!>");
			}else if(avgScore >= 90){
				grade = 'A';
			}else if(avgScore >= 80){
				grade = 'B';
			}else if(avgScore >= 70){
				grade = 'C';
			}else if(avgScore >= 60){
				grade = 'D';
			}else {
				grade = 'F';
			}
			
				System.out.println( name + "님의 성적표는 다음과 같습니다.");
				System.out.println("국어 점수 : " + scoreKR );
				System.out.println("영어 점수 : " + scoreEng);
				System.out.println("수학 점수 : " + scoreMath);
				System.out.println("점수 합계: " + totalScore);
				System.out.println("성적 평균 : " + avgScore);
				System.out.println("당신의 등급은 : "+ grade +"입니다." );
			}
	}


