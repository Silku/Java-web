package chapter2;

public class OperationEx2_2 {
	
	//Ctrl + F11; ���α׷� ����

	public static void main(String[] args) {
		int i_Num = 10;
		int i_Num2 = 20;
		
		//���� ������
		//1. ������ ������	++i_Num		->		10�� 1�� ���ϰ� i_Num�� ����Ѵ�.
		//2. ������ ������	i_Num++		->		10�� ����� �Ŀ� 1�� ���Ѵ�.
		//3. ������ ������	--i_Num2	->		20�� 1�� ���� i_Num�� ����Ѵ�.
		//4. �İ��� ������	i_Num2--	->		20�� ����� �Ŀ� 1�� ����.
		
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
