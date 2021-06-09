package chapter3;

import java.util.Scanner;

// Ctrl + a = 전체 선택
// Ctrl + Shift + f = 소스코드 자동 정렬

public class LoopEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String select = null;
		boolean mLoop = true;
		boolean sLoop = true;

		while (mLoop) {
			System.out.println("i. if");
			System.out.println("s. switch");
			System.out.println("q. 프로그램 종료");
			System.out.print("조건문을 하세요: ");
			select = sc.nextLine();

			if (select.equals("i") || select.equals("s") || select.equals("q")) {
				if (select.equals("q")) {
					mLoop = false;
				} else if (select.equals("i") || select.equals("s")) {
					sLoop = true;
					while (sLoop) {
						System.out.println("1. 성적입력");
						System.out.println("b. 뒤로가기");
						System.out.println("q. 프로그램 종료");
						System.out.print("명령을 선택하세요: ");
						String select2 = sc.nextLine();

						if (select2.equals("1")) {
							// 성적(grade)를 입력받는다.
							// 해당 grade에 맞게 score의 범위를 나타낸다.
							System.out.print("성적을 입력해주세요: ");
							String grade = sc.nextLine();
							int score = 0;
							if(grade.equals("A") || grade.equals("B") || grade.equals("C") || grade.equals("D") || grade.equals("F")) {
								if(select.equals("i")) {
									System.out.println("if문으로 연산");
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
									System.out.println("switch문으로 연산");
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
									System.out.println(grade + "등급은 "+ score + " ~ " + (score+10) + "점입니다.");
								} else if(grade.equals("F")) {
									System.out.println(grade + "등급은 "+ score + " ~ " + (score+59) + "점입니다.");
								} else {
									System.out.println(grade + "등급은 "+ score + " ~ " + (score+9) + "점입니다.");
								}
								
							}else {
								System.out.println("<입력오류!>");
							}
							
						} else if (select2.equals("b")) {
							sLoop = false;
						} else if (select2.equals("q")) {
							sLoop = false;
							mLoop = false;
						} else {
							System.out.println("<입력오류!>");
						}
					}
				}
			} else {
				System.out.println("<입력오류!>");
				System.out.println("조건문을 다시 선택.");
			}
		}
		System.out.println("프로그램이 종료되었습니다.");

	}

}
