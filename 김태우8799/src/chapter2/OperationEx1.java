package chapter2;

public class OperationEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mathScore = 90;
		int engScore = 70;
		int koreanScore = 85;
		
		int totalScore = mathScore + engScore + koreanScore; //����
		double avgScore = totalScore / 3 ;
		double d_Score = totalScore % 3;
		System.out.println("���� : " + totalScore); //
		System.out.println("��� : " + avgScore); //double���� 3 ���� int������ �����༭ 81.0�̶�� ���� ����
		System.out.println("��� : " + totalScore / 3.0); //��Ʈ���� 3.0�Ǽ����� ������ �ڵ� ��ĳ������ �̷������ 81.66666���� ���� , 
		System.out.println("����� ������ : " + d_Score);
		
	}

}
