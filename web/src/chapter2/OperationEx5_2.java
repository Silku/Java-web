package chapter2;

public class OperationEx5_2 {

	public static void main(String[] args) {
		
		int schoolYear = 2; //�г�
		
		char schoolYearKr = ( (schoolYear == 1) ? '��' : ((schoolYear == 2) ? '��' : ( (schoolYear == 3) ? '��' : 'X') ) );
		
		System.out.println("���� �г��� " + schoolYearKr + "�г��Դϴ�.");
		
		int type = 3;
		
		int lowSize = 100;
		int calSize = 200;
		
		boolean trueFalse = (type == 1 ? (lowSize > calSize) : (type == 2) ? (lowSize < calSize) : false);
		
		System.out.println("type: " + type + " ���: " + trueFalse);
		
		int type2 = 4; //1 ~ 3 1: �౸, 2: ��, 3: ����
		//type2�� 1�̸� �౸�� ����ϰ� 2�� �󱸸� ����ϰ� 3�̸� ������ ����ض� �׸��� 1,2,3�� �ƴϸ� �ƹ��͵� ������� ����.
		
		System.out.println(type2 == 1 ? "�౸" : type2 == 2 ? "��" : type2 == 3 ? "����" : "");

	}

}
