package chapter4;

import java.util.Scanner;

public class ArrayEX7_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.���б�, 2. ����б�, 3.���б�
		// �г�
		// �̸�
		String[] schoolType = { "���б�", "����б�", "���б�" };
		int[] schoolYear = { 1, 2, 3, 4, 5 };
		String[][] schoolName = new String[3][2];
		String[][][] studentName = new String[3][2][5];
		Scanner sc = new Scanner(System.in);
		int typeIndex = 0; // �б�����
		int yearIndex = 0; // �г�
		int schoolIndex = 0; // �б�
		boolean mLoop = true;

//		schoolName[schoolType[2][1]

		schoolName[0][0] = "�뼺���б�";
		schoolName[0][1] = "�λ����б�";
		schoolName[1][0] = "�뼺����б�";
		schoolName[1][1] = "�λ����б�";
		schoolName[2][0] = "�뼺���б�";
		schoolName[2][1] = "�λ���б�";
		studentName[0][0][0] = "������";
		studentName[0][0][1] = "������";
		studentName[0][1][0] = "����";
		studentName[0][1][2] = "���¿�";
		studentName[1][0][0] = "�ڿ��";
		studentName[1][0][1] = "����ȣ";
		studentName[1][1][1] = "������";
		studentName[1][1][2] = "��ȿ��";
		studentName[2][0][0] = "�ȴ��";
		studentName[2][0][1] = "������";
		studentName[2][1][2] = "������";
		studentName[2][1][3] = "������";

		while (mLoop) {
			System.out.println("�б� ���� �ý���");
			System.out.println("-------------------------------");
			System.out.println("1. �б� �̸����� ���� �˻�");
			System.out.println("2. �л� �̸����� ���� �˻�");
			System.out.println("3. �б� ������ ���� �˻�");
			System.out.println("q. ���α׷� ����");
			System.out.println("-------------------------------");
			System.out.print("����� ������ �ּ��� :");
			String select = sc.nextLine();
			System.out.println();
			if (select.equals("1")) {
				System.out.println("�б� ���� �Է��� �ּ��� : ");
				String name = sc.nextLine();
				for (int i = 0; i < schoolName.length; i++) {
					for (int j = 0; j < schoolName[0].length; j++) {
						if (schoolName[i][j].equals(name)) {
							typeIndex = i;
							schoolIndex = j;
						}
					}
				}
				System.out.println(schoolName[typeIndex][schoolIndex] + "�� ��� �л� ����");
				for (int i = 0; i < studentName[typeIndex][schoolIndex].length; i++) {
					if (studentName[typeIndex][schoolIndex][i] == null) {
						continue;
					}
					System.out.println("�г� : " + schoolYear[i]);
					System.out.println("�̸� : " + studentName[typeIndex][schoolIndex][i]);
				}
				System.out.println();
			} else if (select.equals("2")) {
				System.out.println("�л� �̸��� �Է��� �ּ��� : ");
				String name = sc.nextLine();
				for (int i = 0; i < studentName.length; i++) {
					for (int j = 0; j < studentName[0].length; j++) {
						for (int k = 0; j < studentName[0][0].length; k++) {
							if (studentName[i][j][k] != null ? studentName[i][j][k].equals(name) : false) {
								System.out.println("�б����� : " + schoolType[i]);
								System.out.println("�б��� : " + schoolName[i][j]);
								System.out.println("�г� : " + schoolYear[k]);
								System.out.println("�̸� : " + studentName[i][j][k]);
								break;
							}
						}
					}
				}
				System.out.println();

			} else if (select.equals("3")) {
				System.out.println("�б� ������ �Է����ּ��� : ");
				String type = sc.nextLine();
				for (int i = 0; i < schoolType.length; i++) {
					if (schoolType[i].equals(type)) {
						typeIndex = i;
					}
				}
				System.out.println("�б� ����" + type);
				System.out.println();
				for (int i = 0; i < studentName[typeIndex].length; i++) {
					for (int j = 0; j < studentName[typeIndex][0].length; j++) {
						if (studentName[typeIndex][i][j] == null) {
							continue;
						}
						System.out.println("�б��� : " + schoolName[typeIndex][i]);
						System.out.println("�г� : " + schoolYear[j]);
						System.out.println("�̸� : " + studentName[typeIndex][i][j]);

					}
				}

			} else if (select.equals("q")) {

			} else {
				System.out.println("<�Է� ����>�Դϴ�. 1,2,3,q�� �ϳ��� �Է��ϼ���.");
			}
		}
		mLoop = false;
	}
}
//���б��� �л��̸� �ΰ��� �Է¹޾Ƽ� �� �л��� ã�Ƴ��� ���α׷� ������ ��������!
