package chapter2;

public class OperationEx1 {

	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 70;
		int koreaScore = 85;
		
		int totalScore = mathScore + engScore + koreaScore; //ÃÑÁ¡
		double avgScore = totalScore / 3;
		double d_Score = totalScore % 3.0;
		System.out.println("ÃÑÁ¡: " + totalScore);
		System.out.println("Æò±Õ: " + avgScore);
		System.out.println("Æò±Õ: " + totalScore / 3.0);
		System.out.println("Æò±ÕÀÇ ³ª¸ÓÁö: " + d_Score);

	}

}
