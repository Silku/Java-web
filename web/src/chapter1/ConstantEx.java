package chapter1;

public class ConstantEx {

	public static void main(String[] args) {
		final int MAX_NUM = 100; 	//최대값
		final int MIN_NUM;			//최소값
		MIN_NUM = 0;
		
		int i_Num = MIN_NUM + 10;	//최소값을 10추가
		
		System.out.println("최대값: " + (MAX_NUM+100));
		System.out.println("최소값: " + (MIN_NUM+10));
		System.out.println(i_Num);

	}

}
