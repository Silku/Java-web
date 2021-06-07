package chapters12_DB;

import java.util.Scanner;

/**
 *예외처리 :  오류난것은 미뤄두고 일단 실행하게끔 처리해주는것. 
 * 예외처리는 3가지가 있다.
 * 1.소스코드 잘못 입력했거나,
 * 2. runtime 오류 : 메모리부족,데이터 연결 등의 오류
 * 3. compile 중 문법적 오류 등.
 *	ArrayIndexOutOfBoundsException
 * Exception
 */
	public void arrTest() throws ArrayIndexOutOfBoundsException{
		int [] arr = new int[5];
		
		for(int i = 0; i < 5; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		
	}
}
	
public class Try_CatchEx {
	public static void main(String[] args) {
		Try_CatchEx tc = new Try_CatchEx();
		tc.arrTest();
	
		Scanner sc = new Scanner(System.in);
		
		
//		for(int i = 0; i < 5; i++) {
//			arr[i] = i;
//			System.out.println(arr[i]);
//			}
		
		System.out.print("숫자를 입력해 주세오 :");
		
		try {
			tc.arrTest();
			
			int i_num = Integer.parseInt(sc.nextLine());
			//Exception  :  최상위 예외처리 객체
		}	catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println("해당배열은" + arr.length + " 의 크기입니다.");
//			System.out.println(e);
//			e.printStackTrace();
		}	
			catch(Exception e) {
			e.printStackTrace();
		}
			System.out.println("프로그램 종료");
	}
}
