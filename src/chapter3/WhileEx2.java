package chapter3;

public class WhileEx2 {

	public static void main(String[] args) {
		int i = 2; //��
		 // 1 ~ 9�� ��
		while(i < 10) {
			System.out.println(i + "��");
			//������ �ݺ� �۾�
			int j = 1;
			while(j < 10) {
				System.out.println(i + " X " + j + " = " + (i*j));
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
