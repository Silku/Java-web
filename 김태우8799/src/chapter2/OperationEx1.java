package chapter2;

public class OperationEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mathScore = 90;
		int engScore = 70;
		int koreanScore = 85;
		
		int totalScore = mathScore + engScore + koreanScore; //총점
		double avgScore = totalScore / 3 ;
		double d_Score = totalScore % 3;
		System.out.println("총점 : " + totalScore); //
		System.out.println("평균 : " + avgScore); //double형을 3 정수 int형으로 나눠줘서 81.0이라는 값이 나옴
		System.out.println("평균 : " + totalScore / 3.0); //인트형에 3.0실수형을 나눠서 자동 업캐스팅이 이루어져서 81.66666값이 나옴 , 
		System.out.println("평균의 나머지 : " + d_Score);
		
	}

}
