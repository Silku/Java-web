package chapter3;

import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		//Ű������ �Է��� �޽��ϴ�.
		//int rank = nextLine();
		//int = 1,2,3 �� ���� ���������� , �ش簪�� �ƴϸ� <�Է¿���!> ���
		
		//Switch ~ case�� ����.
		//����Ī ���ذ��� rank
		//1���� �ݸ޴�
		//2���� ���޴�
		//3���� ���޴�
		//char medalcolor = '��', '��', '��'
		//rank ���� medalcolor �޴��Դϴ�.
		//1���� �ݸ޴� �Դϴ�.
		
		//��� ���ΰɱ�..
		Scanner sc = new Scanner(System.in);
		
		int rank = Integer.parseInt(sc.nextLine());
		char medalColor = 0;
		
		System.out.print("����� �Է��ϼ��� : ");
		sc.nextLine();
		
						
		if(rank < 0 || rank > 3){
			System.out.println("<�Է¿���!>");
		}
		else { 
			switch(rank){
			case 1 :
		//		rank = 1; // �� �������� �ʿ���� ������������������������ ������ ���� case 1�� �� rank���� �ǹ��ϴ°ű� ������ �������ڤ��� 
				medalColor = '��';
		//		System.out.println(rank + "���� " + medalColor +"�޴��Դϴ�."); //�̰͵� ���� ���� �ʿ䰡 ���� �������� 
				break;
			case 2 :
		//		rank = 2; // �� �������� �ʿ���� ������������������������
				medalColor = '��';
		//		System.out.println(rank + "���� " + medalColor +"�޴��Դϴ�.");
				break;
			case 3 : 
		//		rank = 3; �� �������� �ʿ���� ������������������������
				medalColor = '��';
		//		System.out.println(rank + "���� " + medalColor +"�޴��Դϴ�.");
				break;
				}	
			
			}
		 System.out.println(rank + "���� " + medalColor +"�޴��Դϴ�.");
}
	
}