package chapter5;
//x,yó�� 
	// �Լ��ȿ� method�� ����
	// class �ȿ� ����Ǿ� ���� �Լ��� method�� �Ѵ�.
/**
 * Method(�޼ҵ� || �޼���) == �Լ��� ������ �ϳ��̴�. 
 * Ŭ���� ���ο� ����Ǿ����� ��� �Լ��� Method��� �Ѵ�.
 * 
 * Method�� ����
 * ��ȯ�� + Metohd �� + (�Ű�����){ return ��;}	
 * int sum(int x, int y){ 
 * 			return x + y;
 * }
 * void sum(int x, int y){  }
 * ���࿡ ��ȯ���� void()�� return�� ���� ����.
 */
public class MethodEx1 {	
	int sum(int x, int y) {
		return x+y;
	}
	public static void main(String[] args) {
		MethodEx1 m = new MethodEx1();
		int sumNum = 0;
		sumNum = m.sum(10, 20);
		System.out.println("10+ 20 = " + sumNum);
	}

}
