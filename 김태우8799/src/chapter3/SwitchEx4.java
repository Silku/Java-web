package chapter3;

import java.util.Scanner;

public class SwitchEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String rain = null; //문자 입력받을때 이조건이 존나 중요한거같다.
		System.out.println("1.비가 온다.");
		System.out.println("2.비가 오지 않는다.");
		System.out.println("오늘의 날씨를 선택해 주세요.");
		rain = sc.nextLine();
		
		switch(rain) {
		case "1" :
			System.out.println("오늘은 비가 오기 때문에 지하철을 타겠습니다.");
			break;
		case "2" :
			System.out.println("오늘은 비가 오지 않기 때문에 버스를 타겠습니다. ");
			break;
		default :
			System.out.println("날씨 선택을 잘 못 하셨습니다. ");
}

		
		
//  아래는 내가 해본거 입력값 인티져 형변환 시켜버렸더니 다른 문자 들어오면 바로 에러떠버린다. 
		// 위에처럼 케이스 자체를 문자로 받는게 좋은듯
//		switch(Integer.parseInt(rain)) {
//				case 1 :
//					System.out.println("오늘은 비가 오기 때문에 지하철을 타겠습니다.");
//					break;
//				case 2 :
//					System.out.println("오늘은 비가 오지 않기 때문에 버스를 타겠습니다. ");
//					break;
//				default :
//					System.out.println("날씨 선택을 잘 못 하셨습니다. ");
//		}
//		
		
	}

}
