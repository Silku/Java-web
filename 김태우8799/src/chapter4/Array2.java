package chapter4;

public class Array2 {
	// [] = �ε���
	// �迭�� �ε���(index)�� �迭�� ũ�� -1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i_Num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] i_Num2 = new int[10];
//		System.out.println(i_Num[0]);
//		System.out.println(i_Num[9]);

		for (int i : i_Num) {
			System.out.println(i);
		}
		//length = �ش� �ڷ����� ����
		//�� for ���̶� �Ʒ� for���̶� �ΰ��� ������ �ִµ� , �߰��� ��� ��ġ���� �����ϰ� ������ �̷��� ����.
		for(int i = 0; i < i_Num.length; i++) {
			System.out.println(i_Num[i]);
		}

	}

}
