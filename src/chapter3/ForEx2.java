package chapter3;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		// Ű������ �Է��� �޴´�.
		// �Է¹��� ���� �������� ����Ѵ�.
		// int num;
		
		// num�� ������
		// num X 1 = num*1
		// num X 2 = num*2
		// num X 3 = num*3
		
		// �ݺ��� 9��
		
		// ��������?
		
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		System.out.println(num + "�� ������");
	
		for(int i = 1; i < 10; i++) {
			System.out.println(num + " X " + i + " = " + (num*i));
		}

	}

}
