package chapter4;

public class ArrayEx3 {
//�迭 ����غ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭 ����
		// String�� �迭
		// bookName
		// �ڹ� �Թ�, C��� ���� , ���α׷��� ����, ��ǰ �ڹ� ���α׷���, �ڹ��� ����
		// �ʱ�ȭ
		// for ������ 5���� å�� ���
		// �츮 ��������� å�� �� 5���̸� å�� ����Ʈ�� �Ʒ��� �����ϴ�.
		// 1.�ڹ��Թ� ...... 5.�ڹ��� ����
		String bookName[] = { "�ڹ� �Թ�", "C��� ����", "���α׷��� ����", "��ǰ �ڹ� ���α׷���", "�ڹ��� ����" ,"Do it �ڹ�" };

		System.out.println("�츮 ��������� å�� �� " + bookName.length +"���̸� å�� ����Ʈ�� �Ʒ��� �����ϴ�.");
		for (int i = 0; i < bookName.length; i++) {
			System.out.println((i + 1) + ". " + bookName[i]);
		}
	}

}
