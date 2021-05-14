package chapter1;

public class ConstantEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_NUM = 100;
		final int MIN_NUM ;
		MIN_NUM = 0;
		
		//MAX_NUM = 200; <-상수인데 앞에 final 안붙여줘서 적용안됨..(?)
		
		int i_Num = MIN_NUM + 10;
		
		System.out.println("최대값 :" + (MAX_NUM+ i_Num*10));
//		실패작 : System.out.println("최대값 :" + MAX_NUM+ i_Num*10); 실행시 값 = 100100 나옴;
		System.out.println("최소값 :" + MIN_NUM);
		
		System.out.println(i_Num);
	}

}
