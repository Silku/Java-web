package chapter1;

public class ConstantEx {

	public static void main(String[] args) {
		final int MAX_NUM = 100; 	//�ִ밪
		final int MIN_NUM;			//�ּҰ�
		MIN_NUM = 0;
		
		int i_Num = MIN_NUM + 10;	//�ּҰ��� 10�߰�
		
		System.out.println("�ִ밪: " + (MAX_NUM+100));
		System.out.println("�ּҰ�: " + (MIN_NUM+10));
		System.out.println(i_Num);

	}

}
