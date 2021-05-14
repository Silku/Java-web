package chapter1;

public class ExplicitConversion {
	//다운 캐스팅
	public static void main(String[] args) {
		double d_Num = 1.2;
		
	//	int i_Num = d_Num + d_Num; 이렇게하면 값이 넘쳐서 오류남.
		int i_Num = (int)d_Num + (int)d_Num; //d_Num 앞에 (int)넣어줌으로써 프로그래머가 의도한것임을 '명시적' 형변환을 해주는것임.
		
		System.out.println(i_Num);
	}
/*
 * @author ITPS 
 * 클래스의 정의
 * 
 */
	
}
