package chapter4;

import java.util.Scanner;

public class ArrayEx8_Student {

	public static void main(String[] args) {
		final int STUDENT_MAX = 30; // final int �빮�� , ���

		boolean mLoop = true;
		boolean sLoop = true;
		Scanner sc = new Scanner(System.in);
		String[] schoolName = new String[STUDENT_MAX];
		int[] schoolYear = new int[STUDENT_MAX];
		String[] studentName = new String[STUDENT_MAX];

		int stCount = 0;

		// TODO Auto-generated method stub
		schoolName[0] = "�뼺���б�";
		schoolName[1] = "�λ����б�";
		schoolName[2] = "�뼺����б�";
		schoolName[3] = "�λ����б�";
		schoolName[4] = "�뼺���б�";
		schoolName[5] = "�λ���б�";
		schoolName[6] = "�λ����б�";
		schoolName[7] = "�뼺����б�";
		schoolName[8] = "�λ����б�";
		schoolName[9] = "�뼺���б�";
		schoolName[10] = "�λ���б�";

		schoolYear[0] = 1;
		schoolYear[1] = 2;
		schoolYear[2] = 3;
		schoolYear[3] = 4;
		schoolYear[4] = 5;
		schoolYear[5] = 6;
		schoolYear[6] = 1;
		schoolYear[7] = 2;
		schoolYear[8] = 3;
		schoolYear[9] = 4;
		schoolYear[10] = 5;

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

		while (mLoop) {
			for (int i = 0; i < STUDENT_MAX; i++) {
				if (studentName[i] == null && schoolYear[i] == 0 && schoolName[i] == null) {
					stCount = i;
					break; // ���α׷��� ����Ǹ� �л��� ��� �ε������� �ִ��� Ȯ���ϴ� ���.
				}
			}
			System.out.println("�б� ���� �ý���");
			System.out.println("-------------------------------");
			System.out.println("1. �л� ���� �Է�");
			System.out.println("2. �л� ���� ��ȸ");
			System.out.println("q. ���α׷� ����");
			System.out.println("-------------------------------");
			System.out.println("����� ������ �ּ��� : ");
			String select = sc.nextLine();
			System.out.println();
			if (select.equals("1")) {
				System.out.println("�л� ���� �Է� �޴�");
				System.out.print("�б��� :");
				schoolName[stCount] = sc.nextLine();
				System.out.print("�г� :");
				schoolYear[stCount] = Integer.parseInt(sc.nextLine());
				System.out.println("�̸� :");
				studentName[stCount] = sc.nextLine();
				System.out.println("�л� ���� �Է��� ���������� �̷�� �����ϴ�.");
			} else if (select.equals("2")) {

				while (sLoop) {
					System.out.println("�л� ���� ��� �޴�");
					System.out.println("-------------------------------");
					System.out.println("1. ��ü ���");
					System.out.println("2. �̸����� �˻�");
					System.out.println("3. �б��� �˻�");
					System.out.println("b. �ڷΰ���");
					System.out.println("-------------------------------");
					System.out.println("����� ������ �ּ��� : ");
					select = sc.nextLine();
					System.out.println();
					if (select.equals("1")) {
						System.out.println("�л� ��ü ��ȸ");
						System.out.println("-------------------------------");
						for (int i = 0; i < STUDENT_MAX; i++) {
							if (studentName[i] != null ? true : false) {
								System.out.println("�б��� : " + schoolName[i]);
								System.out.println("�г� : " + schoolYear[i]);
								System.out.println("�̸� : " + studentName[i]);
								System.out.println();
							}
						}

					} else if (select.equals("2")) {
						System.out.println("�̸����� �˻�");
						System.out.println("-------------------------------");
						System.out.print("�˻��� �̸� : ");
						String name = sc.nextLine();
						for (int i = 0; i < STUDENT_MAX; i++) {
							if (studentName[i] != null ? studentName[i].equals(name) : false) {
								System.out.println("�б��� : " + schoolName[i]);
								System.out.println("�г� : " + schoolYear[i]);
								System.out.println("�̸� : " + studentName[i]);
								System.out.println();
							}
						}
					} else if (select.equals("3")) {
						System.out.println("�б��� �˻�");
						System.out.println("-------------------------------");
						System.out.print("�˻��� �б��� : ");
						String name = sc.nextLine();
						for (int i = 0; i < STUDENT_MAX; i++) {
							if (schoolName[i] != null ? schoolName[i].equals(name) : false) {
								System.out.println("�б��� : " + schoolName[i]);
								System.out.println("�г� : " + schoolYear[i]);
								System.out.println("�̸� : " + studentName[i]);
								System.out.println();
							}
						}

					} else if (select.equals("b")) {
						sLoop = false;
					} else {
						System.out.println("<�Է¿���!>\n");
					}

				}
				System.out.println(studentName[stCount - 1]); // for�� ������ stCount�� �ִ°��� ������ �ʱ� ������ ã�Ƴ����� -1�ؾߵȴ�?
			} else {
				System.out.println("<�Է� ����>�Դϴ�. 1,2,q�� �ϳ��� �Է��ϼ���.");
			}
			 
			mLoop = true;
		}

	}

}
