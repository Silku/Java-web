package chapter3;

import java.util.Scanner;

public class ScoreIF {

	public static void main(String[] args) {
		//Ű���� �Է��� �޴´�.
		// String name = ������ �̸�;
		/*0 ~ 100�Է��� ���� �� ����. �ش������� �ƴ� ��� <�Է¿��� !>�� ����ϰ� ���α׷� ����.
		 * int scoreKR = ��������
		 * int scoreEng = ��������
		 * int socreMath = ��������
		 * 
		 * int totalScore = (���� �������� ��)
		 * int avgScore  = ��� totalScore/ �����
		 * char grade = ��� (90~100(A), 80~89(B), 70~79(C), 60~69(D), 0~59(F))
		 * 
		 */
// Ǯ�� : 
		
		Scanner input =  new Scanner(System.in);
		String name;
		int scoreKR, scoreEng, scoreMath;

		
		System.out.print("���� �̸��� �Է��ϼ��� : ");
		name = input.nextLine();	
		System.out.print("���������� �Է��ϼ��� : ");
		scoreKR = Integer.parseInt(input.nextLine());	
		System.out.print("���������� �Է��ϼ��� : ");
		scoreEng = Integer.parseInt(input.nextLine());	
		System.out.print("���������� �Է��ϼ��� : ");
		scoreMath = Integer.parseInt(input.nextLine());	
		
		int totalScore = 0;
		double avgScore = 0;
		char grade = ' ';
		
		if(scoreKR < 0 || scoreKR > 100 || scoreEng <0 || scoreEng > 100 || scoreMath < 0 || scoreMath >100) {
			System.out.println("<�Է¿���!>"); 
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
			System.out.println("" + name +"���� ����");
			System.out.println("���� : " + scoreKR + "��");
			System.out.println("���� : " + scoreEng + "��");
			System.out.println("���� : " + scoreMath + "��");
			System.out.println("���� : " + totalScore + "��");
			System.out.println("��� : " + avgScore + "��");
			System.out.println("��� : " + grade + "���");	
		}
			
	}
	
}

/*else{totalScore~~~~} ���� ������� ���� ���� �ø��ٸ�
 *  ����� ���忡���� ������ ���°�찡 ��������ִµ�
 *  ��ǻ�� ���忡���� ���� ������ ó���ϰ� ������� ����ؾߵǱ⶧���� 
 * ��ǻ������ �������� ������ ��ų���� �ִ�.
 *  
*/


