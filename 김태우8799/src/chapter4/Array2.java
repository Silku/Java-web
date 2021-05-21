package chapter4;

public class Array2 {
	// [] = 인덱스
	// 배열의 인덱스(index)는 배열의 크기 -1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i_Num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] i_Num2 = new int[10];
//		System.out.println(i_Num[0]);
//		System.out.println(i_Num[9]);

		for (int i : i_Num) {
			System.out.println(i);
		}
		//length = 해당 자료형의 개수
		//뒤 for 문이랑 아래 for문이랑 두가지 사용법이 있는데 , 중간에 어느 위치부터 시작하고 싶을떄 이렇게 쓴다.
		for(int i = 0; i < i_Num.length; i++) {
			System.out.println(i_Num[i]);
		}

	}

}
