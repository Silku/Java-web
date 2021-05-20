package chapter3;

public class WhileEx1 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		int sum2 = 0;
		while(i<10) {
			sum += i;
			i++;
		}
		
		for(;true; ) {     //for문 시작과 끝을 비워둘 수도 있다.
			i++;
			sum2 += i;
			break;
		}
//		
		do{
			System.out.println("do while");
		}while(sum2 != 0);
		
	}
		
	}


