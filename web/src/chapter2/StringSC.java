package chapter2;

import java.util.Scanner;

// Ű������ �Է��� ���� Ŭ����
// Scanner Ŭ����
// ���̺귯��(API)�� Ŭ������ ����ϱ� ���ؼ���
// import�� �Ͽ����Ѵ�.
// import java.util.Scanner;
// �ڵ����� ���̺귯�� �߰��ϴ� ���?
// Ctrl + Shift + o (����Ű)

// Scanner consolâ�� �Է��� �ޱ� ���� Ŭ����
// System.in / out �ü�� System�� �Է°� ����� �ǹ��Ѵ�.

// Scanner Ŭ���� ���ο� ���ڿ��� �Է¹޴� �޼ҵ��?
// next() ���ڿ������� ������ �������� �ʴ´�.
// nextLine() ���ڿ� ���� ��� ������ ǥ���� �� �ִ�.

public class StringSC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine(); 	// "10000"
		String str2 = sc.nextLine();	// "555"
		String str3 = sc.nextLine();	// "3.14"
		
		
		System.out.println("str1 + str2 = " + (Integer.parseInt(str1) + Integer.parseInt(str2)) );
		
		System.out.println("(str1 + str2) * str3 = " + ((Integer.parseInt(str1)+Integer.parseInt(str2))*Double.parseDouble(str3)));
		
		// str1 + str2 = 10555
		// (str1 + str2) * str3 = 33142.700000000004

	}

}
