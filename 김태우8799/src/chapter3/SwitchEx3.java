package chapter3;

import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		//키보드의 입력을 받습니다.
		//int rank = nextLine();
		//int = 1,2,3 값 까지 받을수있음 , 해당값이 아니면 <입력오류!> 출력
		
		//Switch ~ case를 쓴다.
		//스위칭 기준값은 rank
		//1등은 금메달
		//2등은 은메달
		//3등은 동메달
		//char medalcolor = '금', '은', '동'
		//rank 등은 medalcolor 메달입니다.
		//1등은 금메달 입니다.
		
		//어디서 꼬인걸까..
		Scanner sc = new Scanner(System.in);
		
		int rank = Integer.parseInt(sc.nextLine());
		char medalColor = 0;
		
		System.out.print("등수를 입력하세요 : ");
		sc.nextLine();
		
						
		if(rank < 0 || rank > 3){
			System.out.println("<입력오류!>");
		}
		else { 
			switch(rank){
			case 1 :
		//		rank = 1; // 이 변수선언 필요없음 ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ 어차피 위에 case 1이 곧 rank값을 의미하는거기 때문에 ㅋㅋㅋ앜ㅋㅋ 
				medalColor = '금';
		//		System.out.println(rank + "등은 " + medalColor +"메달입니다."); //이것도 각각 해줄 필요가 없음 엌ㅋㅋㅋ 
				break;
			case 2 :
		//		rank = 2; // 이 변수선언 필요없음 ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
				medalColor = '은';
		//		System.out.println(rank + "등은 " + medalColor +"메달입니다.");
				break;
			case 3 : 
		//		rank = 3; 이 변수선언 필요없음 ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
				medalColor = '동';
		//		System.out.println(rank + "등은 " + medalColor +"메달입니다.");
				break;
				}	
			
			}
		 System.out.println(rank + "등은 " + medalColor +"메달입니다.");
}
	
}