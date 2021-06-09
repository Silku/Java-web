package chapter2;

public class OperationEx3 {

	public static void main(String[] args) {

		int i_Num = 10;
		int i_Num2 = 30;
		int i_Num3 = 10;
		int i_Num4 = 30;
		int i_Num5 = 10;

		//i_Num = i_Num + 30;
		//i_Num2 = i_Num2 - 20;
		
		i_Num += 30;
		i_Num2 -= 20;
		i_Num3 *= 30;
		i_Num4 /= 20;
		i_Num5 %= 20;
		
		System.out.println(i_Num);
		System.out.println(i_Num2);
		System.out.println(i_Num3);
		System.out.println(i_Num4);
		System.out.println(i_Num5);

	}

}
