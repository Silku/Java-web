package chapter1;

public class ConstantEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_NUM = 100;
		final int MIN_NUM ;
		MIN_NUM = 0;
		
		//MAX_NUM = 200; <-����ε� �տ� final �Ⱥٿ��༭ ����ȵ�..(?)
		
		int i_Num = MIN_NUM + 10;
		
		System.out.println("�ִ밪 :" + (MAX_NUM+ i_Num*10));
//		������ : System.out.println("�ִ밪 :" + MAX_NUM+ i_Num*10); ����� �� = 100100 ����;
		System.out.println("�ּҰ� :" + MIN_NUM);
		
		System.out.println(i_Num);
	}

}
