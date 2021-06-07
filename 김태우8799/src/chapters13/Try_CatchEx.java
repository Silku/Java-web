package chapters13;
/**
 *예외처리 :  오류난것은 미뤄두고 일단 실행하게끔 처리해주는것. 
 * 예외처리는 3가지가 있다.
 * 1.소스코드 잘못 입력했거나,
 * 2. runtime 오류 : 메모리부족,데이터 연결 등의 오류
 * 3. compile 중 문법적 오류 등.
 *	ArrayIndexOutOfBoundsException
 * Exception
 */

public class Try_CatchEx {
	public static void main(String[] args) {
		int [] arr = new int[5];
		
//		for(int i = 0; i < 5; i++) {
//			arr[i] = i;
//			System.out.println(arr[i]);
//			}
		
		try {
			for(int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
			//Exception  :  최상위 예외처리 객체
		}	catch(Exception e) {
			System.out.println("아래는 예외처리했습니다.");
			System.out.println(e);
			e.printStackTrace();
		}
			System.out.println("프로그램 종료");
	}
}
