package chapter3;
//조건문에서 굉장히 중요한 챕터/ 클래스였다.
import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		//키보드의 입력을 받습니다.
		// i. if
		// s. switch
		// 실행할 조건문을 선택하세요(i/s) :
		// String selected = nextLine();
		// 만약 i를 입력 받으면 if 문을 사용하여 성적을 처리
		// 만약에 s를 입력 받으면 switch문을 사용하여 성적을 처리
		// i와 s가 아닌 다른 값이 들어오면 <입력오류!>를 출력
		
		//성적을 입력해주세요 : 
		// String grade = nextLine();
		// grade != a,b,c,d,f
		// 0 <= score <= 100
		// 이 범위를 벗어나면 입력오류 출력
		
		/* score == 90~100이면 grade == A
		 	score == 80~89이면 grade == B
		 	score == 70~79이면 grade == C
		 	score == 60~69이면 grade == D
		 	score == 0 ~ 59이면 grade == F
		*/
		//char grade 등급은 [int score의 범위] 점 입니다.
		//A등급은 90~100점입니다.
		
		Scanner sc = new Scanner(System.in);
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
	}
}




//System.out.println("입력한 성적은" + grade);
//score = Integer.parseInt(grade);
//
//System.out.println(grade + "등급은" + score +"점 입니다");
//
////
//char grade = 'A' ,'B' ,'C' ,'D' ,'F';
//
//
//System.out.print("실행할 조건문을 선택하세요(i/s) : ");
//String selected = sc.nextLine();
//
//
//if(selected = i) {
//System.out.print("<입력오류!>");
//}
//else if (selected = s) {
//	System.out.println("성적을 입력하세요 : ");
//	String grade = sc.nextLine();
//	 {
//		
//	}
//	else if(selected = s){
//		switch()
//	}
//	else 
//	
