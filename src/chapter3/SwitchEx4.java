package chapter3;

import java.util.Scanner;

public class SwitchEx4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String rain = null;
		
		System.out.println("1. 비가 온다.");
		System.out.println("2. 비가 오지 않는다.");
		System.out.print("오늘의 날씨를 선택해 주세요: ");
		rain = input.nextLine();
		
		switch(rain) {
			case "1": 
				System.out.println("오늘은 비가 오기 때문에 지하철을 타겠습니다.");
				break;
			case "2":
				System.out.println("오늘은 비가 오지 않기 때문에 버스를 타겠습니다.");
				break;
			default :
				System.out.println("날씨 선택을 잘 못 하셨습니다.");
		}

	}

}
