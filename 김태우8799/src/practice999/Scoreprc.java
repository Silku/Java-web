package practice999;

import java.util.Scanner;

public class Scoreprc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		String name;
		int scoreKR, scoreEng, scoreMath;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �̸��� �Է��ϼ��� : ");
		name = sc.nextLine();	
		System.out.print("���������� �Է��ϼ��� : ");
		scoreKR = Integer.parseInt(sc.nextLine());
		System.out.print("���������� �Է��ϼ��� : ");
		scoreEng = Integer.parseInt(sc.nextLine());
		System.out.print("���������� �Է��ϼ��� : ");
		scoreMath = Integer.parseInt(sc.nextLine());
		if(scoreKR < 0 || scoreKR >= 100 || scoreEng < 0 || scoreEng >= 100)
	
		
		
		
		System.out.println("" + name +"���� ����");
		System.out.println("���� : " + scoreKR + "��");
		System.out.println("���� : " + scoreEng + "��");
		System.out.println("���� : " + scoreMath + "��");
//		System.out.println("���� : " + totalScore + "��");
//		System.out.println("��� : " + avgScore + "��");
//		System.out.println("��� : " + grade + "���");	
	}

}
