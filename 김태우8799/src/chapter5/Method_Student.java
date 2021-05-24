package chapter5;

import java.util.Scanner;

public class Method_Student {
	final int STUDENT_MAX = 20;
	
	Scanner sc = new Scanner(System.in);
	boolean mloop = true;
	
	String[] schoolName = new String[STUDENT_MAX];
	int[] schoolYear = new int[STUDENT_MAX]; //�г�
	String[] studentName = new String[STUDENT_MAX];
	int stCount;
	
	void dataSet() {
		stCount = 0;
		
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
	}
	
	void studentOutput(int flag, String name) {
		if(flag == 1) {
			for(int i = 0; i < STUDENT_MAX; i++) {
				if(studentName[i] != null ? true : false) {
					System.out.println("�б���: " + schoolName[i]);
					System.out.println("�г�: " + schoolYear[i]);
					System.out.println("�̸�: " + studentName[i]);
					System.out.println();
				}
			}
		} else if(flag == 2) {
			for(int i = 0; i < STUDENT_MAX; i++) {
				if(studentName[i] != null ? studentName[i].equals(name) : false) {
					System.out.println("�б���: " + schoolName[i]);
					System.out.println("�г�: " + schoolYear[i]);
					System.out.println("�̸�: " + studentName[i]);
					System.out.println();
				}
			}
		} else if(flag == 3) {
			for(int i = 0; i < STUDENT_MAX; i++) {
				if(schoolName[i] != null ? schoolName[i].equals(name) : false) {
					System.out.println("�б���: " + schoolName[i]);
					System.out.println("�г�: " + schoolYear[i]);
					System.out.println("�̸�: " + studentName[i]);
					System.out.println();
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		Method_Student ms = new Method_Student();
		ms.dataSet(); //�迭 �ʱ�ȭ
		
		while(ms.mloop) {
			for(int i = 0; i < ms.STUDENT_MAX; i++) {
				if(ms.studentName[i] == null && ms.schoolYear[i] == 0 && ms.schoolName[i] == null) {
					ms.stCount = i;
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
			String select = ms.sc.nextLine();
			System.out.println();
			
			if(select.equals("1")) {
				System.out.println("�л� ���� �Է� �޴�");
				System.out.print("�б���: ");
				ms.schoolName[ms.stCount] = ms.sc.nextLine();
				System.out.print("�г�: ");
				ms.schoolYear[ms.stCount] = Integer.parseInt(ms.sc.nextLine());
				System.out.print("�̸�: ");
				ms.studentName[ms.stCount] = ms.sc.nextLine();
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
					select = ms.sc.nextLine();
					System.out.println();
					if(select.equals("1")) {
						System.out.println("�л� ��ü ��ȸ");
						System.out.println("--------------");
						ms.studentOutput(1, "");
					} else if(select.equals("2")) {
						System.out.println("�̸����� �˻�");
						System.out.println("--------------");
						System.out.print("�˻��� �̸�: ");
						String name = ms.sc.nextLine();
						ms.studentOutput(2, name);
					} else if(select.equals("3")) {
						System.out.println("�б������� �˻�");
						System.out.println("--------------");
						System.out.print("�˻��� �б���: ");
						String name = ms.sc.nextLine();
						ms.studentOutput(3, name);
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