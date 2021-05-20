package chapter3;

public class GuGuDan {

	public static void main(String[] args) {
		// 첫번째 반복에서는 2단 ~ 9단
		// 2번째 반복에서서는 1 ~ 9 까지 곱한다.
		
		//결과는 2 x 1 = 2;
		//2단 띄우고 3단..
		for(int i = 2; i <10; i++) {
				System.out.println(i+"단");
			for(int j = 1; j <10; j++) {
				System.out.println(i + "X" + j +" = " +(i*j));
			} 
			
		}
		
		
	}

}
