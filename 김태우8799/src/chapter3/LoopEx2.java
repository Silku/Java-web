package chapter3;

import java.util.Scanner;

//전체 자동선택 = Ctrl + A 
//소스코드 자동정렬 = Ctrl + shift + F 

public class LoopEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String select = null;
		
		boolean mLoop = true;
		boolean sLoop = true;

		// continue : 반복문 안에서 continue를 만나기 전까지 작업은 실행되지만 continue이후의 명령은 무시하고 다음반복을 진행.
		while (mLoop) {
			System.out.println("i. if");
			System.out.println("s. switch");
			System.out.println("q. 프로그램 종료");

			select = sc.nextLine();
			System.out.println("입력한 데이터 : " + select);
			if (select.equals("i") || select.equals("s") || select.equals("q")) {
				if (select.equals("q")) {
					mLoop = false;
				} else if (select.equals("i") || select.equals("s")) {
					sLoop = true;
					while (sLoop) {
						System.out.println("1. 성적입력");
						System.out.println("b. 뒤로가기");
						System.out.println("q. 프로그램 종료");
						System.out.println("명령을 선택하세요 : ");
						String select2 = sc.nextLine();
						if (select2.equals("1")) {
							//성적(grade)를 입력받는다.
							//해당 grade에 맞게 score의 범위를 나타낸다.
							String selected = null;
							String grade = null;
							int score = 0;
							
							System.out.println("i. if"); 
							System.out.println("s. switch"); 
							System.out.println("실행할 조건문을 선택하세요(i/s) : "); 
							selected = sc.nextLine();
							if(selected.equals("i") || selected.equals("s")) {
								System.out.println("성적을 입력해주세요(대문자 A~D,F) : ");
								grade = sc.nextLine();
								if(grade.equals("A") || grade.equals("B") || grade.equals("C") || grade.equals("D") || grade.equals("F")) {
										if(selected.equals("i")) {
											if(grade.equals("A")) {
											System.out.println("if문으로 조건처리를 진행합니다.");
													score =90;
											}else if(grade.equals("B")) {
													score =80;
											}else if(grade.equals("C")) {
													score =70;
											}else if(grade.equals("D")) {
													score =60;
											}else { 					//ABCDF만 들어올수 있으니 F는 else로 충분;
												
											}				
										}else { 
											System.out.println("switch문으로 조건처리를 진행합니다.");
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
										
										System.out.println(grade + "등급은" + score +" ~ " + (score+10) +"점 입니다");
									} else if(grade.equals("F")) {
										System.out.println(grade + "등급은" + score +" ~ " + (score+59) +"점 입니다");
									} else {
										System.out.println(grade + "등급은 "+ score + " ~ " + (score+9) + "점입니다.");
									}
								}else{
									System.out.println("<입력오류!>");	
								}
							}else {
							System.out.println("<입력오류!>");	
							}
							sLoop = false;
						} else if (select2.equals("b")) {
							sLoop = false; // 여기서 브레이크걸리면 while문을 나간다.
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
				System.out.println("조건문을 다시 선택하세요.");
				break;
			}

		}System.out.println("프로그램을 종료합니다.");}

}
