package chapters10_2;

import java.util.Scanner;

public class MemberArrayListTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberArrayList aList = new MemberArrayList();
		for (int i = 0; i < 2; i++) {
			System.out.print("ȸ�� ���̵� : ");
			int id = Integer.parseInt(sc.nextLine());
			System.out.print("ȸ�� �̸� : ");
			String name = sc.nextLine();
			
			
			aList.addMember(new Member(id, name));
		}
		aList.showAllMember();
		
		System.out.println("�����ϰ����ϴ� ȸ���� ���̵� �Է��ϼ��� : ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("���� ������ ȸ���̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		aList.modifyMember(id, name);
		aList.showAllMember();
		
		System.out.println("������ ȸ���� ���̵� �Է��ϼ��� :");
		id = Integer.parseInt(sc.nextLine());
		if(aList.removeMember(id) == true){
				System.out.println("ȸ�������� ���������� �̷�������ϴ�.");
		}else {
				System.out.println("ȸ�� ���� ����!");
		}
		aList.showAllMember();
	}
	
}
