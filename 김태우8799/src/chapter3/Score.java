package chapter3;
//���ǹ����� ������ �߿��� é��/ Ŭ��������.
import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		//Ű������ �Է��� �޽��ϴ�.
		// i. if
		// s. switch
		// ������ ���ǹ��� �����ϼ���(i/s) :
		// String selected = nextLine();
		// ���� i�� �Է� ������ if ���� ����Ͽ� ������ ó��
		// ���࿡ s�� �Է� ������ switch���� ����Ͽ� ������ ó��
		// i�� s�� �ƴ� �ٸ� ���� ������ <�Է¿���!>�� ���
		
		//������ �Է����ּ��� : 
		// String grade = nextLine();
		// grade != a,b,c,d,f
		// 0 <= score <= 100
		// �� ������ ����� �Է¿��� ���
		
		/* score == 90~100�̸� grade == A
		 	score == 80~89�̸� grade == B
		 	score == 70~79�̸� grade == C
		 	score == 60~69�̸� grade == D
		 	score == 0 ~ 59�̸� grade == F
		*/
		//char grade ����� [int score�� ����] �� �Դϴ�.
		//A����� 90~100���Դϴ�.
		
		Scanner sc = new Scanner(System.in);
		String selected = null;
		String grade = null;
		int score = 0;
		
		System.out.println("i. if"); 
		System.out.println("s. switch"); 
		System.out.println("������ ���ǹ��� �����ϼ���(i/s) : "); 
		selected = sc.nextLine();
		if(selected.equals("i") || selected.equals("s")) {
			System.out.println("������ �Է����ּ���(�빮�� A~D,F) : ");
			grade = sc.nextLine();
			if(grade.equals("A") || grade.equals("B") || grade.equals("C") || grade.equals("D") || grade.equals("F")) {
					if(selected.equals("i")) {
						if(grade.equals("A")) {
						System.out.println("if������ ����ó���� �����մϴ�.");
								score =90;
						}else if(grade.equals("B")) {
								score =80;
						}else if(grade.equals("C")) {
								score =70;
						}else if(grade.equals("D")) {
								score =60;
						}else { 					//ABCDF�� ���ü� ������ F�� else�� ���;
							
						}				
					}else { 
						System.out.println("switch������ ����ó���� �����մϴ�.");
						switch(grade) {
							case "A" :
								score = 90;
								break;
							case "B" :
								score = 80;
								break;
							case "C" :
								score = 70;
								break; 
							case "D" :
								score = 60;
								break;
							default :
						}
					}
				if(grade.equals("A")) {
					
					System.out.println(grade + "�����" + score +" ~ " + (score+10) +"�� �Դϴ�");
				} else if(grade.equals("F")) {
					System.out.println(grade + "�����" + score +" ~ " + (score+59) +"�� �Դϴ�");
				} else {
					System.out.println(grade + "����� "+ score + " ~ " + (score+9) + "���Դϴ�.");
				}
			}else{
				System.out.println("<�Է¿���!>");	
			}
		}else {
		System.out.println("<�Է¿���!>");	
		}
	}
}




//System.out.println("�Է��� ������" + grade);
//score = Integer.parseInt(grade);
//
//System.out.println(grade + "�����" + score +"�� �Դϴ�");
//
////
//char grade = 'A' ,'B' ,'C' ,'D' ,'F';
//
//
//System.out.print("������ ���ǹ��� �����ϼ���(i/s) : ");
//String selected = sc.nextLine();
//
//
//if(selected = i) {
//System.out.print("<�Է¿���!>");
//}
//else if (selected = s) {
//	System.out.println("������ �Է��ϼ��� : ");
//	String grade = sc.nextLine();
//	 {
//		
//	}
//	else if(selected = s){
//		switch()
//	}
//	else 
//	
