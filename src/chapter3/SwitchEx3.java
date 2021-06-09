package chapter3;

import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 키보드의 입력을 받습니다.
		char medalColor = ' ';
		int rank = Integer.parseInt(sc.nextLine()); // int rank = nextLine()
		// 해당 값만 받을 수 있음.(1, 2, 3)
		// 해당 값이 아닐경우 <입력오류!> 출력
		if(rank < 1 || rank > 3) {
			System.out.println("<입력오류!>");
		}
		else {
			// switch ~ case
			switch(rank) {
				case 1:
					medalColor = '금';
					break;
				case 2:
					medalColor = '은';
					break;
				case 3:
					medalColor = '동';
					break;
			}
			// 스위칭 기준 값은 rank이다.
			// 1등은 금메달
			// 2등은 은메달
			// 3등은 동메달
			// char medalColor = '금', '은', '동';
			
			System.out.println(rank + "등은 " + medalColor + "메달입니다.");
			// rank등은 medalColor 메달입니다.
			// 1등은 금메달입니다.
		}

	}

}
