package chapters12_DB;

import java.util.Scanner;

/**
 *����ó�� :  ���������� �̷�ΰ� �ϴ� �����ϰԲ� ó�����ִ°�. 
 * ����ó���� 3������ �ִ�.
 * 1.�ҽ��ڵ� �߸� �Է��߰ų�,
 * 2. runtime ���� : �޸𸮺���,������ ���� ���� ����
 * 3. compile �� ������ ���� ��.
 *	ArrayIndexOutOfBoundsException
 * Exception
 */
	public void arrTest() throws ArrayIndexOutOfBoundsException{
		int [] arr = new int[5];
		
		for(int i = 0; i < 5; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		
	}
}
	
public class Try_CatchEx {
	public static void main(String[] args) {
		Try_CatchEx tc = new Try_CatchEx();
		tc.arrTest();
	
		Scanner sc = new Scanner(System.in);
		
		
//		for(int i = 0; i < 5; i++) {
//			arr[i] = i;
//			System.out.println(arr[i]);
//			}
		
		System.out.print("���ڸ� �Է��� �ּ��� :");
		
		try {
			tc.arrTest();
			
			int i_num = Integer.parseInt(sc.nextLine());
			//Exception  :  �ֻ��� ����ó�� ��ü
		}	catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println("�ش�迭��" + arr.length + " �� ũ���Դϴ�.");
//			System.out.println(e);
//			e.printStackTrace();
		}	
			catch(Exception e) {
			e.printStackTrace();
		}
			System.out.println("���α׷� ����");
	}
}
