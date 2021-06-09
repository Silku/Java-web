package chapter1;
// 단일 주석처리
/* */ //영역 주석처리

/**
 * 
 * @author ITPS
 * 
 * 클래스의 정의
 *
 */
public class ExplicitConversion {
	//다운캐스팅
	public static void main(String[] args) {
		double d_Num = 1.2;
		
		int i_Num = (int)d_Num + (int)d_Num;
		
		System.out.println(i_Num);

	}

}
