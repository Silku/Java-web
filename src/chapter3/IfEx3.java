package chapter3;

import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		// Ű������ �Է��� �޴´�.
		// 1. �� �´�.
		// 2. �� ���� �ʴ´�.
		
		// �� ������ ����ö�� ź��.
		// �� ���� ������ ������ ź��.
		
		// 1�� ���ý� ������ �� ���� ������ ����ö�� Ÿ�ڽ��ϴ�.
		// 2�� ���ý� ������ �� ���� �ʱ� ������ ������ Ÿ�ڽ��ϴ�.
		
		Scanner input = new Scanner(System.in);
		String rain = null;
		
		System.out.println("1. �� �´�.");
		System.out.println("2. �� ���� �ʴ´�.");
		System.out.print("������ ������ ������ �ּ���: ");
		rain = input.nextLine();
		
		if(rain.equals("1")) {
			System.out.println("������ �� ���� ������ ����ö�� Ÿ�ڽ��ϴ�.");
		}else if(rain.equals("2")) {
			System.out.println("������ �� ���� �ʱ� ������ ������ Ÿ�ڽ��ϴ�.");
		}else {
			System.out.println("���� ������ �� �� �ϼ̽��ϴ�.");
		}

	}

}
