package chapter2;

public class StringEx3 {
	//문자열의 형변환
	public static void main(String[] args) {
		String s_Num = "10.21";
		String s_Num2 = "20.31";
		
		int i = 10;
		int j = 20;
		double d_Num, d_Num2;
		//int i_Num = s_Num;
		
		d_Num = Double.parseDouble(s_Num); //10.21
		d_Num2 = Double.parseDouble(s_Num2); //20.31
		Boolean.parseBoolean(s_Num2);
		System.out.println(Integer.toString(i) + Integer.toString(j));
		System.out.println((int)Double.parseDouble(s_Num) + (int)Double.parseDouble(s_Num2));
		System.out.println("d_Num + d_Num2 " + (d_Num+d_Num2));
		System.out.println("d_Num, d_Num2의 문자열 합: " + Double.toString(d_Num) + Double.toString(d_Num2));
		
	}

}
