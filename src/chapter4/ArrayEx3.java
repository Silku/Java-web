package chapter4;

public class ArrayEx3 {

	public static void main(String[] args) {
		// �迭 ����
		// String�� �迭
		// bookName
		String[] bookName = {
			"�ڹ� �Թ�", 
			"C��� ����", 
			"���α׷��� ����",
			"��ǰ �ڹ� ���α׷���", 
			"�ڹ��� ����",
			"Do it �ڹ�"
		};
		System.out.println("�츮 ��������� å�� �� " + bookName.length + "���̸� å�� ����Ʈ�� �Ʒ��� �����ϴ�.");
		for(int i = 0; i < bookName.length; i++) {
			System.out.println((i+1) + ". " + bookName[i]);
		}
		// �ڹ� �Թ�, C��� ����, ���α׷��� ����, 
		// ��ǰ �ڹ� ���α׷���,�ڹ��� ����
		// �ʱ�ȭ
		// for������ 5���� å�� ���
		// �츮 ��������� å�� �� 5���̸� å�� ����Ʈ�� �Ʒ��� �����ϴ�.
		// 1. �ڹ� �Թ�
		// 2. C��� ����
		// .....
		// 5. �ڹ��� ����
		

	}

}
