package chapter2;

public class OperationEx5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char select = '1';
		//char select = 'n';
		
		//select가 y이거나 n이면 select의 값을 출력하고 만약 y 또는 n이 아니면 <입력오류!>라고 출력;
		System.out.println((select == 'y' || select == 'n') ? select : "<입력오류!>");

	}

}
