package chapter2;

public class OperationEx5_3 {
//���׿����� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char select = 'y';
		//char select = 'n';
	
		//select�� y�ų� n�̸� select���� ����ϰ� ���� y�Ǵ� n�� �ƴϸ� <�Է¿���!>��� ���;
		
//		System.out.println("�� : " +select);
		System.out.println((select == 'y' || select =='n') ? select : "<�Է¿���!>");
	}

}
