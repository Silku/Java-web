package chapter2;

public class OperationEx4_2 {
	// <��������>
	// AND������		&&		�� ���� ��
	// OR������		||		�� ���� ��
	// NOT������		!		�ϳ��� ���� ����

	public static void main(String[] args) {
		boolean trueFalse = true;
		boolean trueFalse2 = true;
		boolean trueFalse3 = true;
		boolean trueFalse4 = false;
		
		//AND���� ��� ���� true(1)�̾�� true(1)�� ��ȯ, �ϳ��� 0�̸� ����� false(0).
		System.out.println(trueFalse && trueFalse2 && trueFalse3 && trueFalse4);
		//OR���� ��� ���� false(0)�̾�� false(0)�� ��ȯ, �ϳ��� 1�̸� ����� true(1).
		System.out.println(trueFalse || trueFalse2 || trueFalse3 || trueFalse4);
		//NOT���� ����(����) 1 -> 0, 0 -> 1
		System.out.println(!trueFalse && trueFalse2 && trueFalse3);

	}

}
