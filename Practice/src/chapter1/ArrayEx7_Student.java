package chapter1;

public class ArrayEx7_Student{
	public static void main(String[] args) {
		String [] schoolType = {"���б�", "����б�", "���б�"}; //1. ���б�, 2. ����б�, 3. ���б�
		int[] schoolYear = {1,2,3,4,5}; //�г�
		String[][] schoolName = new String[3][2];
		String[][][] studentName = new String[3][2][5];
		int schoolTypeIndex = 0;
		int schoolNameIndex = 0;
		
		schoolName[0][0] = "�뼺 ���б�";
		schoolName[0][1] = "�λ� ���б�";
		schoolName[1][0] = "�뼺 ����б�";
		schoolName[1][1] = "�λ� ����б�";
		schoolName[2][0] = "�ΰ� ���б�";
		schoolName[2][1] = "�λ� ���б�";
		studentName[2][1][1] = "������";
		studentName[2][1][3] = "�ȴ��";
		
		System.out.println("�λ� ���б� �л��� ��� ����� �ּ���.");
		
		for(int i = 0; i < schoolName.length; i++) {
			for(int j = 0; j < schoolName[0].length; j++) {
				if(schoolName[i][j].equals("�λ� ���б�")) {
					schoolTypeIndex = i;
					schoolNameIndex = j;
				}
			}
		}
		for(int i = 0; i < studentName[0][0].length; i++) {
			if(studentName[schoolTypeIndex][schoolNameIndex][i] == null) {
				continue;
			}
			System.out.println("�б� ����: " + schoolType[schoolTypeIndex]);
			System.out.println("���б� �̸�: " + schoolName[schoolTypeIndex][schoolNameIndex]);
			System.out.println(studentName[schoolTypeIndex][schoolNameIndex][i]);
		}
		
	}
	
	// 1. �л� �̸����� ã��
	// 2. �б� �̸����� ã��
	// �� �ߺ��� �������.

}