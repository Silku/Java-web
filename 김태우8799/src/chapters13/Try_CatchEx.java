package chapters13;
/**
 *����ó�� :  ���������� �̷�ΰ� �ϴ� �����ϰԲ� ó�����ִ°�. 
 * ����ó���� 3������ �ִ�.
 * 1.�ҽ��ڵ� �߸� �Է��߰ų�,
 * 2. runtime ���� : �޸𸮺���,������ ���� ���� ����
 * 3. compile �� ������ ���� ��.
 *	ArrayIndexOutOfBoundsException
 * Exception
 */

public class Try_CatchEx {
	public static void main(String[] args) {
		int [] arr = new int[5];
		
//		for(int i = 0; i < 5; i++) {
//			arr[i] = i;
//			System.out.println(arr[i]);
//			}
		
		try {
			for(int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
			//Exception  :  �ֻ��� ����ó�� ��ü
		}	catch(Exception e) {
			System.out.println("�Ʒ��� ����ó���߽��ϴ�.");
			System.out.println(e);
			e.printStackTrace();
		}
			System.out.println("���α׷� ����");
	}
}
