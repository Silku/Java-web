package chapter3;

public class SwitchEx1 {

	public static void main(String[] args) {
		String grade = "B";
		
		switch(grade) {
			case "A" :
				System.out.println("90 ~ 100��");
				break;
			case "B" :
				System.out.println("80 ~ 89��");
			case "C" :
				System.out.println("70 ~ 79��");
				break;
			case "D" :
				System.out.println("60 ~ 69��");
			case "F" :
				System.out.println("0 ~ 59��");
			default :
				System.out.println("�ش� ����� ����� �� ���� ����Դϴ�.");
		
		}
		

	}

}
