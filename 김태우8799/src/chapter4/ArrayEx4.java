package chapter4;

import java.util.Scanner;

public class ArrayEx4 {
// �迭�� ���� �Է� �޾� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String bookName [] = new String[3];
		
		//�ڹ� ���� ���α׷���
		//Do it �ڹ� ���α׷���
		//��ǰ�ڹ�
		
		
		for(int i = 0; i < bookName.length; i++) {
			System.out.print((i+1)+"�� å �Է� : ");
			bookName [i] = sc.nextLine();
		}
		System.out.println("�Էµ� å�� �� "+ bookName.length +"���̸� ����� �Ʒ��� �����ϴ�");
		for(int i = 0; i < bookName.length; i++) {
			System.out.println((i+1) + ". " + bookName[i]);
		}
		
		
		
		
//		System.out.println("å�� �Է��ϼ���.");
//		bookName[0] = sc.nextLine();
//		bookName[1] = sc.nextLine();
//		bookName[2] = sc.nextLine();
//		System.out.println("�Էµ� å�� �� "+ bookName.length +"���̸� ����� �Ʒ��� �����ϴ�");
//		System.out.println(bookName[0]);
//		System.out.println(bookName[1]);
//		System.out.println(bookName[2]);
	}

}
