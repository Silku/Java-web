package chapter1;

public class ExplicitConversion {
	//�ٿ� ĳ����
	public static void main(String[] args) {
		double d_Num = 1.2;
		
	//	int i_Num = d_Num + d_Num; �̷����ϸ� ���� ���ļ� ������.
		int i_Num = (int)d_Num + (int)d_Num; //d_Num �տ� (int)�־������ν� ���α׷��Ӱ� �ǵ��Ѱ����� '�����' ����ȯ�� ���ִ°���.
		
		System.out.println(i_Num);
	}
/*
 * @author ITPS 
 * Ŭ������ ����
 * 
 */
	
}
