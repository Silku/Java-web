package chapter2;

import java.util.Scanner;

public class StringEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = null;
		String str2 = "�ڸ���";
		
		str = sc.nextLine();
		if(str.equals(str2)) {
			System.out.println("���� �̸��� "+str+"�Դϴ�.");
		}else {
			System.out.println("�̸��� ��ġ���� �ʽ��ϴ�..");
		}
		
	}

}
