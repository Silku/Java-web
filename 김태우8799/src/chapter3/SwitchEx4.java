package chapter3;

import java.util.Scanner;

public class SwitchEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String rain = null; //���� �Է¹����� �������� ���� �߿��ѰŰ���.
		System.out.println("1.�� �´�.");
		System.out.println("2.�� ���� �ʴ´�.");
		System.out.println("������ ������ ������ �ּ���.");
		rain = sc.nextLine();
		
		switch(rain) {
		case "1" :
			System.out.println("������ �� ���� ������ ����ö�� Ÿ�ڽ��ϴ�.");
			break;
		case "2" :
			System.out.println("������ �� ���� �ʱ� ������ ������ Ÿ�ڽ��ϴ�. ");
			break;
		default :
			System.out.println("���� ������ �� �� �ϼ̽��ϴ�. ");
}

		
		
//  �Ʒ��� ���� �غ��� �Է°� ��Ƽ�� ����ȯ ���ѹ��ȴ��� �ٸ� ���� ������ �ٷ� ������������. 
		// ����ó�� ���̽� ��ü�� ���ڷ� �޴°� ������
//		switch(Integer.parseInt(rain)) {
//				case 1 :
//					System.out.println("������ �� ���� ������ ����ö�� Ÿ�ڽ��ϴ�.");
//					break;
//				case 2 :
//					System.out.println("������ �� ���� �ʱ� ������ ������ Ÿ�ڽ��ϴ�. ");
//					break;
//				default :
//					System.out.println("���� ������ �� �� �ϼ̽��ϴ�. ");
//		}
//		
		
	}

}
