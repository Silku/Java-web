package chapter5;

/**
 * Method(�޼ҵ� || �޼���) == �Լ��� ������ �ϳ��̴�.
 * Ŭ���� ���ο� ��������� ��� �Լ��� Method��� �Ѵ�.
 * 
 * Method�� ����
 * ��ȯ�� + Method�� + (�Ű�����){
 * 		return ��;
 * }
 * 
 * int sum(int x, int y){
 * 		return	x + y;
 * }
 * 
 * void sum(int x, int y){
 *
 * }
 * ���࿡ ��ȯ���� void(������, �ƹ��͵� �������� �ʴ�)
 */

public class MethodEx1 {
	
	int sum(int x, int y) {
		return x+y;
	}

	public static void main(String[] args) {
		MethodEx1 m = new MethodEx1();
		int sumNum = 0;
		sumNum = m.sum(10, 20);
		System.out.println("10 + 20 = " + sumNum);
	}

}
