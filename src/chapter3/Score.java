package chapter3;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Ű������ �Է��� �޽��ϴ�.
		String selected = null;
		String grade = null;
		int score = 0;
		
		System.out.println("i. if");// i. if	
		System.out.println("s. switch");// s. switch
		System.out.print("������ ���ǹ��� �����ϼ���(i/s): ");// ������ ���ǹ��� �����ϼ���(i/s): 
		selected = sc.nextLine(); // String selected = nextLine();
		if(selected.equals("i") || selected.equals("s")) {
			System.out.print("������ �Է����ּ���: ");
			grade = sc.nextLine();
			if(grade.equals("A") || grade.equals("B") || grade.equals("C") || grade.equals("D") || grade.equals("F")) {
				if(selected.equals("i")) {
					System.out.println("if������ ����");
					if(grade.equals("A")) {
						score = 90;
					} else if(grade.equals("B")) {
						score = 80;
					} else if(grade.equals("C")) {
						score = 70;
					} else if(grade.equals("D")) {
						score = 60;
					} else {
						score = 0;
					}
				}else {
					System.out.println("switch������ ����");
					switch(grade) {
						case "A":
							score = 90;
							break;
						case "B":
							score = 80;
							break;
						case "C":
							score = 70;
							break;
						case "D":
							score = 60;
							break;
						default :
							score = 0;
					}
				}

				if(grade.equals("A")) {
					System.out.println(grade + "����� "+ score + " ~ " + (score+10) + "���Դϴ�.");
				} else if(grade.equals("F")) {
					System.out.println(grade + "����� "+ score + " ~ " + (score+59) + "���Դϴ�.");
				} else {
					System.out.println(grade + "����� "+ score + " ~ " + (score+9) + "���Դϴ�.");
				}
				
			}else {
				System.out.println("<�Է¿���!>");
			}
		} else {
			System.out.println("<�Է¿���!>");
		}
		// ���࿡ i�� �Է¹����� if���� ����Ͽ� ������ ó��
		// ���࿡ s�� �Է¹����� switch���� ����Ͽ� ������ ó��
		// i, s�� �ƴ� �ٸ� ���� ������ <�Է¿���!>�� ���
		
		
		// ������ �Է����ּ���: 
		// String grade = nextLine();
		// grade != A,B,C,D,F
		// �� ������ ����� <�Է¿���!>�� ���
		
		// grade == A�̸� score == 90 ~ 100
		// grade == B�̸� score == 80 ~ 89
		// grade == C�̸� score == 70 ~ 79
		// grade == D�̸� score == 60 ~ 69
		// grade == F�̸� score == 0 ~ 59
		
		// grade����� [score�� ����]���Դϴ�.
		// A����� 90 ~ 100���Դϴ�.
		
		
		

	}

}
