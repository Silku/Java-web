package chapter1;

import java.util.Scanner;

public class Subjectscore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		String name = sc.nextLine();
		int scoreKR, scoreEng, scoreMath;
		System.out.print("���� ������ �Է��ϼ���. : "); 
		scoreKR = Integer.parseInt(sc.nextLine());
		System.out.print("���� ������ �Է��ϼ���. : "); 
		scoreEng = Integer.parseInt(sc.nextLine());
		System.out.print("���� ������ �Է��ϼ���. : "); 
		scoreMath = Integer.parseInt(sc.nextLine());
		
		int totalScore = 0;
		double avgScore = 0;
		char grade = ' ';
		
		totalScore = scoreKR + scoreEng + scoreMath;
		avgScore = (scoreKR + scoreEng + scoreMath) / 3;
		
		if(scoreKR < 0 || scoreKR > 100 || scoreEng < 0 || scoreEng > 100 || scoreMath < 0 || scoreMath > 100 ) {
			System.out.println("<�Է¿���!!>");
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
			
				System.out.println( name + "���� ����ǥ�� ������ �����ϴ�.");
				System.out.println("���� ���� : " + scoreKR );
				System.out.println("���� ���� : " + scoreEng);
				System.out.println("���� ���� : " + scoreMath);
				System.out.println("���� �հ�: " + totalScore);
				System.out.println("���� ��� : " + avgScore);
				System.out.println("����� ����� : "+ grade +"�Դϴ�." );
			}
	}


