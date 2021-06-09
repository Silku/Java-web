package chapter4;

public class ArrayEx2 {
	// 배열의 인덱스(index)는 배열의 크기 -1
	
	public static void main(String[] args) {
		int[] i_Num = {1,2,3,4,5,6,7,8,9,10};
		int[] i_Num2 = new int[10];
		
		for(int i : i_Num) {
			System.out.println(i);
		}
		//length = 해당 배열 자료형의 개수
		for(int i = 0; i < i_Num.length; i++) {
			System.out.println(i_Num[i]);
		}
		
		
		
	}

}
