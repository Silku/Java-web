package chapter2;

public class OperationEx2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i_Num = 10;
		int i_Num2 = 20;
		
		//���� ������ ����
		//1. ������ ������ ++i_Num  	-> 10�� 1�� ���ϰ� i_Num ���. 11
		//2. ������ ������ i_Num++		-> i_Num �� ����� �Ŀ� 1�� ����. 10
		//3. ������ ������ --i_Num 		-> 1�� ���� i_Num �� ���.  9
		//4. �İ��� ������ i_Num-- 		-> i_Num�� ����� �Ŀ� 1�� �� 10
		
		System.out.println(i_Num);
		System.out.println(++i_Num);
		System.out.println(i_Num);
		System.out.println(i_Num++);
		System.out.println(i_Num);
		
		System.out.println(i_Num2);
		System.out.println(--i_Num2);
		System.out.println(i_Num2);
		System.out.println(i_Num2--);
		System.out.println(i_Num2);
		
		
	}

}
