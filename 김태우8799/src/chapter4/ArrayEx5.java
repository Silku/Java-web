package chapter4;

public class ArrayEx5 {
//2���� �迭
//3���� �̻��� �迭�� ������ �迭�̶�� �Ѵ�.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String [][] bookName = new String[2][3];
		// 1���� �迭�� ������ ��� �ִ� ������ 2���� �迭�̴�.
		
		String[][][] bookName = {
				{ { "�ڹ�1", "���α׹�2", "å3" }, { "Do it4", "�ڹ� ����5", "�Թ���6" } } , 
				{ { "�ڹ�a", "���α׹�b", "åc" }, { "Do itd", "�ڹ� ����e", "�Թ���f" } }
		};
		System.out.println(bookName.length);  		// 2���� �迭�� ���̸� �ǹ�
		System.out.println(bookName[0].length);  	//	1���� �迭�� ���̸� �ǹ� ���� {} �ڹ�~å1 �������ڿ��ִ°�
		System.out.println(bookName[0][0].length);
		for(int i = 0; i<bookName.length; i++) {
			for(int j = 0; j <bookName[0].length; j++) {
				for (int k = 0; k < bookName[0][0].length; k++) {
					System.out.println(bookName[i][j][k]);
				}
			}
		}
		
		
		}

}
