package chapter3;

import java.util.Scanner;

//��ü �ڵ����� = Ctrl + A 
//�ҽ��ڵ� �ڵ����� = Ctrl + shift + F 

public class LoopEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String select = null;
		
		boolean mLoop = true;
		boolean sLoop = true;

		// continue : �ݺ��� �ȿ��� continue�� ������ ������ �۾��� ��������� continue������ ����� �����ϰ� �����ݺ��� ����.
		while (mLoop) {
			System.out.println("i. if");
			System.out.println("s. switch");
			System.out.println("q. ���α׷� ����");

			select = sc.nextLine();
			System.out.println("�Է��� ������ : " + select);
			if (select.equals("i") || select.equals("s") || select.equals("q")) {
				if (select.equals("q")) {
					mLoop = false;
				} else if (select.equals("i") || select.equals("s")) {
					sLoop = true;
					while (sLoop) {
						System.out.println("1. �����Է�");
						System.out.println("b. �ڷΰ���");
						System.out.println("q. ���α׷� ����");
						System.out.println("����� �����ϼ��� : ");
						String select2 = sc.nextLine();
						if (select2.equals("1")) {
							//����(grade)�� �Է¹޴´�.
							//�ش� grade�� �°� score�� ������ ��Ÿ����.
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
							sLoop = false;
						} else if (select2.equals("b")) {
							sLoop = false; // ���⼭ �극��ũ�ɸ��� while���� ������.
						} else if (select2.equals("q")) {
							sLoop = false;
							mLoop = false;
						} else {
							System.out.println("<�Է¿���!>");
						}
					}
				}
			} else {
				System.out.println("<�Է¿���!>");
				System.out.println("���ǹ��� �ٽ� �����ϼ���.");
				break;
			}

		}System.out.println("���α׷��� �����մϴ�.");}

}
