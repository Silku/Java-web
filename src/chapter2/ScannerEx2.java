package chapter2;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str1, str2, str3, str4, str5, str6;
		
		System.out.print("ù��° �� �Է�: ");
		str1 = input.nextLine();
		System.out.print("�ι�° �� �Է�: ");
		str2 = input.nextLine();
		System.out.print("����° �� �Է�: ");
		str3 = input.nextLine();
		System.out.print("�׹�° �� �Է�: ");
		str4 = input.nextLine();
		System.out.print("�ټ���° �� �Է�: ");
		str5 = input.nextLine();
		System.out.print("������° �� �Է�: ");
		str6 = input.nextLine();
		
		System.out.println("ù��° ���� �ι�° ���� ���� " + (Integer.parseInt(str1) + Integer.parseInt(str2)) + "�Դϴ�.");
		System.out.println("����° ���� �׹�° ���� ���� " + (Integer.parseInt(str3) * Integer.parseInt(str4)) + "�Դϴ�.");
		System.out.println("�ټ���° ������ ������° ���� ���� �������� " + (Integer.parseInt(str5) % Integer.parseInt(str6)) +"�Դϴ�.");
	}

}
