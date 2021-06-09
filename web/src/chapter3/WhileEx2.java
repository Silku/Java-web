package chapter3;

public class WhileEx2 {

	public static void main(String[] args) {
		int i = 2; //단
		 // 1 ~ 9의 수
		while(i < 10) {
			System.out.println(i + "단");
			//구구단 반복 작업
			int j = 1;
			while(j < 10) {
				System.out.println(i + " X " + j + " = " + (i*j));
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
