package chapter4;

import java.util.Scanner;

public class ArrayEx8_Student {

	public static void main(String[] args) {
		final int STUDENT_MAX = 20;
		
		Scanner sc = new Scanner(System.in);
		boolean mloop = true;
		
		String[] schoolName = new String[STUDENT_MAX];
		int[] schoolYear = new int[STUDENT_MAX]; //�г�
		String[] studentName = new String[STUDENT_MAX];
		
		int stCount = 0;
		
		schoolName[0] = "�뼺���б�";
		schoolName[1] = "�λ����б�";
		schoolName[2] = "�뼺����б�";
		schoolName[3] = "�λ����б�";
		schoolName[4] = "�ΰ���б�";
		schoolName[5] = "�λ���б�";
		schoolName[6] = "�뼺���б�";
		schoolName[7] = "�λ����б�";
		schoolName[8] = "�뼺����б�";
		schoolName[9] = "�λ����б�";
		schoolName[10] = "�ΰ���б�";
		schoolName[11] = "�λ���б�";
		
		schoolYear[0] = 1;
		schoolYear[1] = 3;
		schoolYear[2] = 2;
		schoolYear[3] = 2;
		schoolYear[4] = 3;
		schoolYear[5] = 3;
		schoolYear[6] = 3;
		schoolYear[7] = 3;
		schoolYear[8] = 2;
		schoolYear[9] = 1;
		schoolYear[10] = 4;
		schoolYear[11] = 4;
		
		studentName[0] = "������";
		studentName[1] = "������";
		studentName[2] = "����";
		studentName[3] = "���¿�";
		studentName[4] = "�ڿ��";
		studentName[5] = "����ȣ";
		studentName[6] = "������";
		studentName[7] = "��ȿ��";
		studentName[8] = "�ȴ��";
		studentName[9] = "������";
		studentName[10] = "������";
		studentName[11] = "������";
		
		while(mloop) {
			for(int i = 0; i < STUDENT_MAX; i++) {
				if(studentName[i] == null && schoolYear[i] == 0 && schoolName[i] == null) {
					stCount = i;
					break;
				}
			}
			System.out.println("�б� ���� �ý���");
			System.out.println("------------------");
			System.out.println("1. �л� ���� �Է�");
			System.out.println("2. �л� ���� ��ȸ");
			System.out.println("q. ���α׷� ����");
			System.out.println("------------------");
			System.out.print("����� ������ �ּ���: ");
			String select = sc.nextLine();
			System.out.println();
			
			if(select.equals("1")) {
				System.out.println("�л� ���� �Է� �޴�");
				System.out.print("�б���: ");
				schoolName[stCount] = sc.nextLine();
				System.out.print("�г�: ");
				schoolYear[stCount] = Integer.parseInt(sc.nextLine());
				System.out.print("�̸�: ");
				studentName[stCount] = sc.nextLine();
				System.out.println("�л� ���� �Է��� ���������� �̷�������ϴ�.\n");
			}else if(select.equals("2")) {
				boolean sLoop = true;
				while(sLoop) {
					System.out.println("�л� ���� ��� �޴�");
					System.out.println("-------------------");
					System.out.println("1. ��ü ���");
					System.out.println("2. �̸����� �˻�");
					System.out.println("3. �б��� �˻�");
					System.out.println("b. �ڷΰ���");
					System.out.println("-------------------");
					System.out.println("����� ������ �ּ���: ");
					select = sc.nextLine();
					System.out.println();
					if(select.equals("1")) {
						System.out.println("�л� ��ü ��ȸ");
						System.out.println("--------------");
						for(int i = 0; i < STUDENT_MAX; i++) {
							if(studentName[i] != null ? true : false) {
								System.out.println("�б���: " + schoolName[i]);
								System.out.println("�г�: " + schoolYear[i]);
								System.out.println("�̸�: " + studentName[i]);
								System.out.println();
							}
						}
					} else if(select.equals("2")) {
						System.out.println("�̸����� �˻�");
						System.out.println("--------------");
						System.out.print("�˻��� �̸�: ");
						String name = sc.nextLine();
						
						for(int i = 0; i < STUDENT_MAX; i++) {
							if(studentName[i] != null ? studentName[i].equals(name) : false) {
								System.out.println("�б���: " + schoolName[i]);
								System.out.println("�г�: " + schoolYear[i]);
								System.out.println("�̸�: " + studentName[i]);
								System.out.println();
							}
						}
					} else if(select.equals("3")) {
						System.out.println("�б������� �˻�");
						System.out.println("--------------");
						System.out.print("�˻��� �б���: ");
						String name = sc.nextLine();
						
						for(int i = 0; i < STUDENT_MAX; i++) {
							if(schoolName[i] != null ? schoolName[i].equals(name) : false) {
								System.out.println("�б���: " + schoolName[i]);
								System.out.println("�г�: " + schoolYear[i]);
								System.out.println("�̸�: " + studentName[i]);
								System.out.println();
							}
						}
					} else if(select.equals("b")) {
						sLoop = false;
					} else {
						System.out.println("<�Է¿���!>\n");
					}
				}
				
			}else {
				System.out.println("<�Է¿���!> ��ɾ�� 1, 2, q�� �Է��� �����մϴ�.\n");
			}
		}

	}

}
