package chapter3;

import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		/*Ű������ �Է��� �޴´�.
			1.�񰡿´�
			2.�� �����ʴ´�.
		*/
		//�񰡿��� ����ö�� ź��.
		//�� ���� ������ ������ ź��.
		
		//1�� ���ý� ������ �� ���� ������ ����ö�� Ÿ�ڽ��ϴ�.
		//2�� ���ý� ������ �� ���� �ʱ� ������ ������ Ÿ�ڽ��ϴ�.
		
		Scanner sc = new Scanner(System.in);
		String rain = null;
		System.out.println("1.�� �´�.");
		System.out.println("2.�� ���� �ʴ´�.");
		System.out.println("������ ������ ������ �ּ���.");
		rain = sc.nextLine();
		
		if(rain.equals("1")) {
			System.out.println("������ �� ���� ������ ����ö�� Ÿ�ڽ��ϴ�.");
		}else if (rain.equals("2")) {
			System.out.println("������ �� ���� �ʱ� ������ ������ Ÿ�ڽ��ϴ�. ");
		}else {
			System.out.println("���� ������ �߸��ϼ̽��ϴ�. ");
		}
		
		
	}

}


//===========================================
/* ���δ� / ������ ����� Ǯ��
Scanner sc = new Scanner(System.in);
int select = 0;
System.out.println("������ ���� �˰����Դϴ�.");
System.out.print("�� �´ٴ� 1��, �� �����ʴ´ٴ� 2���� �Է��ϼ���. (1,2) : ");
select = Integer.parseInt(sc.nextLine());

if(select > 2 ||  select < 0) {
	System.out.println("<�Է¿���!>");
}else {
	switch(select) {
		case 1 :
			System.out.println("������ �� ���� ������ ����ö�� Ÿ�ڽ��ϴ�.");
			break;
		case 2 :
			System.out.println("������ �� ���� �ʱ� ������ ������ Ÿ�ڽ��ϴ�. ");
			break;
	}
	
	
}
*/