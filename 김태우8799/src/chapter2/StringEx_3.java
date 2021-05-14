package chapter2;

public class StringEx_3 {
//문자열의 형변환 , 
//ㅡㅡㅡㅡㅡJSP에서 많이쓴다.ㅡㅡㅡㅡㅡ , 인터넷 홈페이지 로그인창이 예시임.
	

/*[[형변환 정수와 실수로의 변환]] 
 *클래스는 클래스로 변환시켜야된다.
 * 
 * 정수와 실수로의 변환
	<DataType.parseDataType(변수);>
	int i_Num = Interger.parseInt(s_String);
	double d_Num = Double.parseDouble(s_String);
	
 * 	문자열로의 변환
	<DataType.toString(변수);>
	String s_String = Integer.toString(i_Num)
	String s_String = Double.toString(d_Num)
	
	이것이 기존 자료형을 형변환하는것은 아니다. 
*/	
	
	public static void main(String[] args) {
		// TODO Auto-'generated method stub
		String s_Num = "10.21";
		String s_Num2 = "20.31";
		int i = 10;
		int j = 20;
		
		double d_Num, d_Num2;


		
//		int i_Num = s_Num; 
		System.out.println(i + j);
//		System.out.println((int)s_Num + (int)s_Num2); 문자열을 숫자로 바꿔서 하고싶은데 변환이 안되고 덧셈이 안되는 예. 이걸어케 할거냐.
		//아래와 같이 형변환 한다.
		System.out.println(Integer.toString(i) + Integer.toString(j));
//		System.out.println(Integer.parseInt(s_Num) + Integer.parseInt(s_Num2)); 
		// 위와같이 쓰면 자료형을 형변환하는게 아니고 문자열을 형변환하는 것임.
		// 따라서 자료형을 형변환하기 위해서는 아래와 같이 쓸 수 있음.
		System.out.println((int)Double.parseDouble(s_Num) + (int)Double.parseDouble(s_Num2)); //
		d_Num = Double.parseDouble(s_Num); //10.21
		d_Num2 = Double.parseDouble(s_Num2); //20.31

//  ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
		Boolean.parseBoolean(s_Num2);
		System.out.println(Integer.toString(i) + Integer.toString(j));
		System.out.println((int)Double.parseDouble(s_Num) + (int)Double.parseDouble(s_Num2));
		System.out.println("d_Num + d_Num2: " + (d_Num+d_Num2));
		System.out.println("d_Num, d_Num2의 문자열 합 : " + Double.toString(d_Num) + Double.toString(d_Num2));
		
		
		
		
		
	}

}
