package chapter5;

/**
 * 
 * �޼ҵ� �����ε�
 * �޼ҵ��� �̸��� ������ �Ű������� �ٸ���� ������ ����Ѵ�.
 *
 */

public class MethodEx3 {
	
	int sum(int x, int y) {
		System.out.println("����");
		int sum = 0;
		sum = x + y;
		return sum;
	}
	
	String sum(String a, String b) {
		System.out.println("���ڿ�");
		return a + b;
	}
	
	double sum(double a, double b) {
		System.out.println("�Ǽ�");
		return a + b;
	}
	
	int sub(int a, int b) {
		int sub = 0;
		sub = a - b;
		return sub;
	}
	
	int times(int x, int y) {
		return x*y;
	}
	
	int div(int x, int y) {
		if(y == 0) {
			return 0;
		}else {
			return x/y;
		}
	}

	public static void main(String[] args) {
		MethodEx3 m = new MethodEx3();
		System.out.println("20, 30�� ��: " + m.sum(20, 30));
		System.out.println("20, 30�� ��: " + m.sum(20.5, 30.5));
		System.out.println("20, 30�� ��: " + m.sum("20", "30"));
	}

}
