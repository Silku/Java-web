package chapter4;

public class ArrayEx2 {
	// �迭�� �ε���(index)�� �迭�� ũ�� -1
	
	public static void main(String[] args) {
		int[] i_Num = {1,2,3,4,5,6,7,8,9,10};
		int[] i_Num2 = new int[10];
		
		for(int i : i_Num) {
			System.out.println(i);
		}
		//length = �ش� �迭 �ڷ����� ����
		for(int i = 0; i < i_Num.length; i++) {
			System.out.println(i_Num[i]);
		}
		
		
		
	}

}
