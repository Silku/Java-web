package chapter3;

import java.util.Scanner;

public class LoopEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String select = null;
		boolean mLoop = true;
		boolean sLoop = true;
		
		//continue  : 반복문 안에서 continue를 만나기 전까지 작업은 실행되지만  
		while(mLoop) {
			System.out.println("i. if");
			System.out.println("s. switch");
			System.out.println("q. 프로그램 종료");
			
			select = sc.nextLine();
			System.out.println("입력한 데이터 : " + select);
			if(select.equals("i") || select.equals("s") || select.equals("q") ) {
				if(select.equals("q")) {
					break;
				}else if(select.equals("i") || select.equals("s")) {
					sLoop = true;
					while(sLoop) {
						System.out.println("1. 성적입력");
						System.out.println("b. 뒤로가기");
						System.out.println("q. 프로그램 종료");
						System.out.println("명령을 선택하세요 : ");
						String select2 = sc.nextLine();
						if(select2.equals("1")) {
							
						}else if(select2.equals("b")) {
							sLoop = false; //여기서 브레이크걸리면 while문을 나간다.
						}
						else if(select2.equals("q")) {
							sLoop = false;
							mLoop = false;
						}else {
							System.out.println("<입력오류!>");
						}			
					}
				}
				
				continue;
			}else {
				System.out.println("<입력오류!>");
				System.out.println("조건문을 다시 선택하세요.");				
				break;	
			}
			
		}
		System.out.println("프로그램을 종료합니다.");		
	}

}
