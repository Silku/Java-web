package chapter3;

public class GuGuDan {

	public static void main(String[] args) {
		
		for(int i = 2; i < 10; i++) {
			System.out.println(i + "단");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + (i*j));
			}
			System.out.println();
		}
		
		// 첫번째 반복에서는 2단 ~ 9단
		// 두번째 반속에서는 1 ~ 9까지 곱한다.
		
		// 결과
		// 2 x 1 = 2	~	9 X 9 = 81
		
		// 2단
		// 2 x 1 = 2
		// . . .
		// 2 x 9 = 18
		//
		// 3단
		// 3 x 1 = 3
		
		

	}

}
