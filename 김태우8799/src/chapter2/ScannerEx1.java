package chapter2;
//ǥ���Է�
import java.util.Scanner; //ctrl + shift + o �ϸ� �̰� ������ �ű�ű� �Ƹ� Scanner �ڷ����� �������� �����ѱ���ε�..?

public class ScannerEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		//��Ʈ�� ������ Scanner �ڷ��� ��Ŭ���غ��� ���̺귯�� �����ִ� ���� ��ġ�� �̵��� �̳� �ű��ѱ��
		String str = null; 
		
		str = sc.nextLine();
		//nextLine�� ������� �Է��� ��ٸ�.
		System.out.println("�Է��Ͻ� ������ " + str + "�Դϴ�.");
		
	}

}
