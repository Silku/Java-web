package chapter3;

public class SwitchEx1 {
//Switch case : �ش����ǿ� �´� case�� ã�� ����
//break (��� Ż��) : ��� �帧 �� break ������ ����� �������� �ʰ� ��������.
	public static void main(String[] args) {
		int score = 0;
		
		String grade = "B";
		
		switch(grade) {
			case "A" : 
				System.out.println("90~100��");
				break;
			case "B" :
				System.out.println("80~89��");
				break;
			case "C" :
				System.out.println("70~79��");
				break;
			case "D" :
				System.out.println("60~69��");
				break;
			case "F" :
				System.out.println("0~59��");
				break;
			default : 
				System.out.println("�ش� ����� ����� �� ���� ����Դϴ�.");
		}

		//if() {} , if ()�ȿ��� ������ ������ switch()�ȿ��� ���� ����.
	}

}
