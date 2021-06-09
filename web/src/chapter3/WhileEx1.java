package chapter3;

public class WhileEx1 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		int sum2 = 0;
		
		while(i < 10) {
			i++;
			sum += i;
			
		}
		
		do {
			System.out.println("do while");
		}while(sum2 != 0);
	}

}
