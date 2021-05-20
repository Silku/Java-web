package chapter3;

import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		/*키보드의 입력을 받는다.
			1.비가온다
			2.비가 온지않는다.
		*/
		//비가오면 지하철을 탄다.
		//비가 오지 않으면 버스를 탄다.
		
		//1번 선택시 오늘은 비가 오기 때문에 지하철을 타겠습니다.
		//2번 선택시 오늘은 비가 오지 않기 때문에 버스를 타겠습니다.
		
		Scanner sc = new Scanner(System.in);
		String rain = null;
		System.out.println("1.비가 온다.");
		System.out.println("2.비가 오지 않는다.");
		System.out.println("오늘의 날씨를 선택해 주세요.");
		rain = sc.nextLine();
		
		if(rain.equals("1")) {
			System.out.println("오늘은 비가 오기 때문에 지하철을 타겠습니다.");
		}else if (rain.equals("2")) {
			System.out.println("오늘은 비가 오지 않기 때문에 버스를 타겠습니다. ");
		}else {
			System.out.println("날씨 선택을 잘못하셨습니다. ");
		}
		
		
	}

}


//===========================================
/* 개인답 / 위에껀 강사님 풀이
Scanner sc = new Scanner(System.in);
int select = 0;
System.out.println("오늘의 날씨 알고리즘입니다.");
System.out.print("비가 온다는 1번, 비가 오지않는다는 2번을 입력하세요. (1,2) : ");
select = Integer.parseInt(sc.nextLine());

if(select > 2 ||  select < 0) {
	System.out.println("<입력오류!>");
}else {
	switch(select) {
		case 1 :
			System.out.println("오늘은 비가 오기 때문에 지하철을 타겠습니다.");
			break;
		case 2 :
			System.out.println("오늘은 비가 오지 않기 때문에 버스를 타겠습니다. ");
			break;
	}
	
	
}
*/