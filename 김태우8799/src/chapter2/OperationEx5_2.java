 package chapter2;

public class OperationEx5_2 {
//���� ������ ��������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. ��� 1.
//		int schoolYear = 1; //1�г�
//		System.out.println((schoolYear ==1) ? "���� �г��� 1�г��Դϴ�." : (schoolYear == 2) ? "���� �г��� 2�г��Դϴ�." : "���� �г��� 3�г��Դϴ�." );
	
		//2. ���2.
		int schoolYear = 3;
		char schoolYearKr = (schoolYear ==1) ? '��' : (schoolYear == 2) ? '��' : (schoolYear == 3) ? '��' : 'X';
				
		System.out.println("���� �г��� " + schoolYearKr + "�г��Դϴ�.");
		
		
		
		
		//3. ���׿����� �ٸ����� , ���׿����� ��ø�ؼ� ���¹����.
		/*
		int type = 2;
		
		int lowSize = 100;
		int calSize = 200;
		boolean trueFalse = (type == 1 ? (lowSize > calSize) : (type ==2) ? (lowSize < calSize) : false);
		
		System.out.println("Ÿ�� : "+ type +" ��� : " + trueFalse);
		*/
		
		
		//4.int type2 = 1;   1~3    1:�౸ ,2:�� 3:����
		
//		int type2 = 3;
//		char subject = (type2 == 1) ? '��' : (type2 == 2) ? '��' : (type2 == 3) ? '��' : 'x';
//		char subject2 = (type2 == 1) ? '��' : (type2 == 2) ? '��' : (type2 == 3) ? '��' : ' ' ;
//		System.out.println("���� ��̴� " + subject + subject2 + "�Դϴ�."  );
//		
		
		//4.1 
		int type2 = 1;
		String subject = (type2 == 1) ? "�౸" : (type2 == 2) ? "��" : (type2 == 3) ? "����" : "";
		System.out.println("���� ��̴� " + subject + "�Դϴ�."  );
		
		
	}
	

}




//int trueFalse;
//trueFalse = (schoolYear == 1) ? 1 : 0;
//trueFalse = (schoolYear == 2) ? 2 : 0;
//trueFalse = (schoolYear == 3) ? 3 : 0;
//
//System.out.println("���� �г��� " + trueFalse+"�г��Դϴ�.");
//������ �õ��ߴ� ����