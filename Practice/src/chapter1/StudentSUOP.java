package chapter1;

import java.util.Scanner;

public class StudentSUOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// TODO Auto-generated method stub
			//1.���б�, 2. ����б�, 3.���б�
			//�г�
			//�̸�
			int [] schoolType = {1,2,3};
			int [] schoolYear = {1,2,3,4,5};
			String [][] schoolName = new String[3][2];
			String [][][] studentName = new String[3][2][5];
			Scanner sc = new Scanner(System.in);
			int schoolNameIndex = 0;
			int schoolTypeIndex = 0;
//			schoolName[schoolType[2][1]
			
			schoolName[0][0] ="�뼺 ���б�";
			schoolName[0][1] ="�λ� ���б�";
			schoolName[1][0] ="�뼺 ����б�";
			schoolName[1][1] ="�λ� ����б�";
			schoolName[2][0] ="�뼺 ���б�";
			schoolName[2][1] ="�λ� ���б�";
			studentName[0][0][0] = "������";
			studentName[2][1][3] = "�ȴ��";
			
			System.out.println("�λ� ���б� �л��� ��� ������ּ���");
			
			
			
			for(int i = 0; i < schoolName.length; i++) {
				for(int j = 0; j < schoolName[0].length; j++) {
					if(schoolName[i][j].equals("�λ���б�")) {
						schoolTypeIndex = i;
						schoolNameIndex = j;
					}
				}
			}
			for(int i = 0; i < studentName[0][0].length; i++) {
				if(studentName[schoolTypeIndex][schoolNameIndex][i] == null) {
					continue;
				}
				System.out.println("�б� ���� : " + schoolType[schoolTypeIndex] );
				System.out.println("���б� �̸�: " + schoolName[schoolTypeIndex][schoolNameIndex] );
				System.out.println(studentName[schoolTypeIndex][schoolNameIndex][i]);
			}
			
			
					
			
		}

	
	}

