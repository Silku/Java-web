package chapter4;

import java.util.Scanner;

public class ArrayEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ���� ����� �Է��ϼ���.
		// 1�� å ���� : ��ǰ �ڹ�
		// 2�� å ���� : �ڹ��� ����
		// 3�� å ���� : ���� �ڹ����α׷���

		// �п��� ���� ����� �Է��ϼ���.
		// 1�� å ���� : ��ǰ �ڹ�2
		// 2�� å ���� : �ڹ��� ����2
		// 3�� å ���� : ���� �ڹ����α׷���2
		// 2���� �迭 bookName;

		// ���� �������
		// �п��� �������

		Scanner sc = new Scanner(System.in);

		String bookName[][] = new String[2][3];

		// 3��° Ǯ�� if�� ��ϱ� ���׿����ڷ� ����
		for (int i = 0; i < bookName.length; i++) {
			System.out.println((i == 0 ? "��" : "�п�") + "�� ��������� �Է��ϼ���.");
			for (int j = 0; j < bookName.length; j++) {
				System.out.print((j + 1) + "�� å ���� : ");
				bookName[i][j] = sc.nextLine();
			}
		}
		for (int i = 0; i < bookName.length; i++) {
			System.out.println((i == 0 ? "��" : "�п�") + "�� �������");
			for (int j = 0; j < bookName.length; j++) {
				System.out.println((j + 1) + ". " + bookName[i][j]);
			}
		}

//		2��° Ǯ�� �ҽ��ڵ��ϱ� if���
//		for(int i = 0; i<bookName.length; i++) {
//			if(i == 0) {
//				System.out.println("���� ���� ����� �Է��ϼ���. ");
//			}else {
//				System.out.println("�п��� ����� �Է��ϼ���. ");
//			}
//			for(int j = 0; j<bookName.length; j++){
//				
//			}
//		}

		// ù �ǽ� & Ǯ��
//		System.out.println("���� ���� ����� �Է��ϼ���. ");
//		for (int i = 0; i < bookName.length; i++) {
//			System.out.print((i + 1) + "�� å ���� : ");
//			bookName[0][i] = sc.nextLine();
//		}
//
//		System.out.println("�п��� ����� �Է��ϼ���. ");
//		for (int j = 0; j < bookName.length; j++) {
//			System.out.print((j + 1) + "�� å ���� : ");
//			bookName[1][j] = sc.nextLine();
//		}
//		System.out.println("���� �������");
//		for (int i = 0; i < bookName.length; i++) {
//			System.out.println((i + 1) + ". " + bookName[0][i]);
//		}
//		System.out.println("�п��� �������");
//		for (int j = 0; j < bookName.length; j++) {
//			System.out.println((j + 1) + ". " + bookName[1][j]);
//		}

	}

}
