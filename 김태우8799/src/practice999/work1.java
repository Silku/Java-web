package practice999;

import java.util.Scanner;

//��ǥ : ���� ��ǥ ���߱�
public class work1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] schoolType = { "���б�", "����б�", "���б�" }; // 1. ���б�, 2. ����б�, 3. ���б�
		int[] schoolYear = { 1, 2, 3, 4, 5 }; // �г�
		String[][] schoolName = new String[3][2];
		String[][][] studentName = new String[3][2][5];
		int schoolTypeIndex = 0;
		int schoolNameIndex = 0;
		boolean mLoop = true;
		boolean sLoop = true;

		schoolName[0][0] = "�뼺 ���б�";
		schoolName[0][1] = "�λ� ���б�";
		schoolName[1][0] = "�뼺 ����б�";
		schoolName[1][1] = "�λ� ����б�";
		schoolName[2][0] = "�ΰ� ���б�";
		schoolName[2][1] = "�λ� ���б�";

		studentName[2][1][1] = "������";
		studentName[2][1][2] = "�̿�ǥ";
		studentName[2][0][3] = "�ȴ��";
		studentName[2][0][4] = "������";

		System.out.print("�˻��ϰ��� �ϴ� �л��̳� �б����� �Է��ϼ���.");
		sc.nextLine();
		while (mLoop) {
			if (sc.nextLine().equals("�λ� ���б�")) {
				System.out.println("�λ� ���б� �л��� ��� ����մϴ�.");

				for (int i = 0; i < schoolName.length; i++) {
					for (int j = 0; j < schoolName[0].length; j++) {
						if (schoolName[i][j].equals("�λ� ���б�")) {
							schoolTypeIndex = i;
							schoolNameIndex = j;
						}			
					}
				}
				for (int i = 0; i < studentName[0][0].length; i++) {
					if (studentName[schoolTypeIndex][schoolNameIndex][i] == null) {
						continue;
					}
					System.out.println("�б� ����: " + schoolType[schoolTypeIndex]);
					System.out.println("���б� �̸�: " + schoolName[schoolTypeIndex][schoolNameIndex]);
					System.out.println(studentName[schoolTypeIndex][schoolNameIndex][i]);
				}

			} else if (sc.nextLine().equals("�ΰ� ���б�") || sc.nextLine().equals("������") || sc.nextLine().equals("�ȴ��")) {
				System.out.println("�ΰ� ���б� �л��� ��� ����մϴ�.");
				for (int i = 0; i < schoolName.length; i++) {
					for (int j = 0; j < schoolName[0].length; j++) {
						if (schoolName[i][j].equals("�ΰ� ���б�")) {
							schoolTypeIndex = i;
							schoolNameIndex = j;
						}
					}
				}
				for (int i = 0; i < studentName[0][0].length; i++) {
					if (studentName[schoolTypeIndex][schoolNameIndex][i] == null) {
						continue;
					}
					System.out.println("�б� ����: " + schoolType[schoolTypeIndex]);
					System.out.println("���б� �̸�: " + schoolName[schoolTypeIndex][schoolNameIndex]);
					System.out.println(studentName[schoolTypeIndex][schoolNameIndex][i]);
				}

			} else {
				System.out.println("��ġ�ϴ� �ڷᰡ �������� �ʽ��ϴ�.");
			}
			mLoop = false;
		}
	}
	// 1. �л� �̸����� ã��
	// 2. �б� �̸����� ã��
	// �� �ߺ��� �������.

}