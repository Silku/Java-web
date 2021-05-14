package chapter2;

public class OperationEx5_3 {
//삼항연산자 복습
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char select = 'y';
		//char select = 'n';
	
		//select가 y거나 n이면 select값을 출력하고 만약 y또는 n이 아니면 <입력오류!>라고 출력;
		
//		System.out.println("값 : " +select);
		System.out.println((select == 'y' || select =='n') ? select : "<입력오류!>");
	}

}
