package chapter4;

public class ArrayEx {
	// �迭 ���� ���������� ���� �����͸� ������ �� �ְ� �����ִ� �ڷ���
	// �ڷ����� ����.
	// int, char, double, String
	// int = 10;
	// int[] num = { 10, 20 };
	// int[] num = new int[2];
	// int[] num;
	// num = new int[2];
	
	String select1;
	String select2;
	String[] select = new String[2];
	
	// 1 ~ 10;
	int num1 = 1;
	int num2 = 2;
	int num3 = 3;
	int num4 = 4;
	int num5 = 5;
	int num6 = 6;
	int num7 = 7;
	int num8 = 8;
	int num9 = 9;
	int num10 = 10;
	
	public static void main(String[] args) {
		int[] num = new int[10];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = i+1;
		}
	}
	

}
