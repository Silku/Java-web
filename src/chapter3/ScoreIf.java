package chapter3;

import java.util.Scanner;

public class ScoreIf {
	// Ű���� �Է��� �޴´�
	// String name = ������ �̸�;
	// 0 ~ 100�� �Է��� ���� �� ����. �ش� ������ �ƴ� ��� <�Է¿���!>�� ����ϰ� ���α׷� ����
	// int scoreKR = ��������
	// int scoreEng = ��������
	// int scoreMath = ��������
	// 
	// int totalScore = ����(��� ������ ��)
	// int avgScore = ���(totalScore / ���� ��)
	// char grade = ���{90 ~ 100(A), 80 ~ 89(B), 70 ~ 79(C), 60 ~ 69(D), 0 ~ 59(F)}
	// 
	//  ���� �̸�(������)�� ����
	//	����: 00��
	//  ����: 00��
	//  ����: 00��
	//  ����: 00��
	//  ���: 00.00��
	//  ���: A���)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��� �ּ���.");
		System.out.print("�̸�: ");
		String name = sc.nextLine();
		System.out.print("����: ");
		int scoreKR = Integer.parseInt(sc.nextLine());
		System.out.print("����: ");
		int scoreEng = Integer.parseInt(sc.nextLine());
		System.out.print("����: ");
		int scoreMath = Integer.parseInt(sc.nextLine());
		
		int totalScore = 0; //����
		double avgScore = 0; //���
		char grade = ' '; //���
		
		if(scoreKR < 0 || scoreKR > 100 || scoreEng < 0 || scoreEng > 100 || scoreMath < 0 || scoreMath > 100) {
			System.out.println("<�Է¿���!>");
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
			
			System.out.println(name + "�� ����"); 				//  ���� �̸�(������)�� ����
			System.out.println("����: " + scoreKR + "��"); 		//	����: 00��
			System.out.println("����: " + scoreEng + "��"); 		//  ����: 00��
			System.out.println("����: " + scoreMath + "��");		//  ����: 00��
			System.out.println("����: " + totalScore + "��");		//  ����: 00��
			System.out.println("���: " + avgScore + "��");		//  ���: 00.00��
			System.out.println("���: " + grade + "���");		//  ���: A���)
		}
	}
}
