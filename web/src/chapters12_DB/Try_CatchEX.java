package chapters12_DB;

import java.util.Scanner;

public class Try_CatchEX {
	
	public void arrTest() throws ArrayIndexOutOfBoundsException{
		int[] arr = new int[5];
		
		for(int i = 0; i <= 5; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		Try_CatchEX tc = new Try_CatchEX();
		
		Scanner sc = new Scanner(System.in);
		
		
		
		/*
		for(int i = 0; i <= 5; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
		*/
		System.out.print("숫자를 입력해 주세요: ");
		
		try {
			tc.arrTest();
			
			int i_num = Integer.parseInt(sc.nextLine());
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("해당 배열은 " + 5 +"의 크기입니다.");
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}

}
