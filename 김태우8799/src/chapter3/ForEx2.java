package chapter3;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		//Ű������ �Է��� �޴´�..
		//�Է¹��� ���� �������� ����Ѵ�.
		//int num;
		//�ݺ� 9��
		
		//��������

		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���. : ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("������ " +num+ "��");

		for(int num2 = 1; num2 < 10; num2++ ) {  
			//for�� �ȿ� �ִ� int num2�� ���������̴�. �ݺ��� ������ �� ������ �����.
				System.out.println(num + " X " +num2+" = " +(num*num2));
			}
		
		
		

	
		
		
		
//		for(num = 1; num <10; num++) {
//			for(int num2 = 1; num2 < 10; num2++) {
//				System.out.println(num + " X " +num2+" = " +(num*num2));
//			}
//			
//		}
//		
//		
	}

}
