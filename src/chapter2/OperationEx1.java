package chapter2;

public class OperationEx1 {

	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 70;
		int koreaScore = 85;
		
		int totalScore = mathScore + engScore + koreaScore; //����
		double avgScore = totalScore / 3;
		double d_Score = totalScore % 3.0;
		System.out.println("����: " + totalScore);
		System.out.println("���: " + avgScore);
		System.out.println("���: " + totalScore / 3.0);
		System.out.println("����� ������: " + d_Score);

	}

}
