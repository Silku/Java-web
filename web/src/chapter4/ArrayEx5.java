package chapter4;

// 2���� �迭
// 3���� �̻��� �迭�� ������ �迭�̶�� �Ѵ�.
public class ArrayEx5 {

	public static void main(String[] args) {
		//String[][] bookName = new String[2][3];
		// 1���� �迭�� ������ ��� �ִ� ������ 2���� �迭�̴�.
		String[][][] bookName = {
			{ {"�ڹ�", "���α׷���", "å1"}, {"Do it", "�ڹ� ����", "�Թ���"} },
			{ {"�ڹ�2", "���α׷���2", "å12"}, {"Do it2", "�ڹ� ����2", "�Թ���2"} }
		};
		
		System.out.println(bookName.length);
		System.out.println(bookName[0].length);
		System.out.println(bookName[0][0].length);
		
		for(int i = 0; i < bookName.length; i++) {
			for(int j = 0; j < bookName[0].length; j++) {
				for(int k = 0; k < bookName[0][0].length; k++) {
					System.out.println(bookName[i][j][k]);
				}
			}
		}

	}

}
