package chapter1;

import java.util.Scanner;

public class Stdentwork {
// �۾���ǥ �˻��ϴ´�� �� �л� �ҼӰ� �̸� �� Ȯ���Ҽ��ִ� �˻��ý���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���б��� �л��̸� �ΰ��� �Է¹޾Ƽ� �� �л��� ã�Ƴ��� ���α׷� ������ ��������!
		//���߰� ����, ���б��̸�, �л��̸�
		
		Scanner sc = new Scanner(System.in);
		
		String [] studentName = { "������", "����", "�̴�ȭ", "��ȣ��", "���缮", "����ȯ","�����", "��õ��", "�����", "������"};
		String [][]schoolName = {{}};
		String [][][]schoolType = {{{"�ʵ�", "��","���", "��"}}};
		
		System.out.println("�л������ý��ۿ� ���Ű��� ȯ���մϴ�.");
		System.out.println("�˻��ϰ��� �ϴ� �б��� ������ �����Դϱ�?.");
//		for(int i = 0; i < schoolType[0][0][0].length; i ++) {
//			System.out.println( (i+1)+". "+ schoolType[0][0][0] +"�б�");
//		}
//		System.out.println("1.�ʵ��б�");
//		System.out.println("2.���б�");
//		System.out.println("3.����б�");
//		System.out.println("4.���б�");
//		
//		System.out.println("�˻��ϰ��� �ϴ� �б��� �̸��� �����Դϱ�?.");
//		System.out.println("1.�λ��ʵ��б�");
//		System.out.println("2.�����ʵ��б�");
//		System.out.println("3.�����ʵ��б�");
//		
//		System.out.println("1.�λ����б�");
//		System.out.println("2.�������б�");
//		System.out.println("3.�������б�");
//		
//		System.out.println("1.�λ����б�");
//		System.out.println("2.��������б�");
//		System.out.println("3.��������б�");
//		
//		System.out.println("1.�λ���б�");
//		System.out.println("2.�������б�");
//		System.out.println("3.�������б�");
		
		System.out.println("�˻��ϰ��� �ϴ� �л��� �̸��� �����Դϱ�?.");
		for(int i = 0; i < studentName.length; i ++) {
			System.out.println( (i+1)+". "+studentName[i] +" �л�");
		}
	
		System.out.println("ã���ô� �л��� ������ ������ �����ϴ�.");
		System.out.println("�л�");
		
	}

}
