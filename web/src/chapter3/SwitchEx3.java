package chapter3;

import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Ű������ �Է��� �޽��ϴ�.
		char medalColor = ' ';
		int rank = Integer.parseInt(sc.nextLine()); // int rank = nextLine()
		// �ش� ���� ���� �� ����.(1, 2, 3)
		// �ش� ���� �ƴҰ�� <�Է¿���!> ���
		if(rank < 1 || rank > 3) {
			System.out.println("<�Է¿���!>");
		}
		else {
			// switch ~ case
			switch(rank) {
				case 1:
					medalColor = '��';
					break;
				case 2:
					medalColor = '��';
					break;
				case 3:
					medalColor = '��';
					break;
			}
			// ����Ī ���� ���� rank�̴�.
			// 1���� �ݸ޴�
			// 2���� ���޴�
			// 3���� ���޴�
			// char medalColor = '��', '��', '��';
			
			System.out.println(rank + "���� " + medalColor + "�޴��Դϴ�.");
			// rank���� medalColor �޴��Դϴ�.
			// 1���� �ݸ޴��Դϴ�.
		}

	}

}
