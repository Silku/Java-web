package chapter1;

public class ImplicitConversion {
	//업캐스팅
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b_Num = 10;
		int i_Num = b_Num;
		
		System.out.println(b_Num);
		System.out.println(i_Num);
		
		double d_Num;
		d_Num = i_Num + b_Num;
		System.out.println(d_Num);
		

	}

}
