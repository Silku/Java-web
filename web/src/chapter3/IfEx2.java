package chapter3;

public class IfEx2 {

	public static void main(String[] args) {
		int score = 89;
		
		if(score >= 90) {
			System.out.println("A���");
		}
		else if(score >= 80) {
			System.out.println("B���");
		}
		else if(score >= 70) {
			System.out.println("C���");
		}
		else {
			System.out.println("F���");
		}
		
		if(score >= 70) {
			System.out.println("C���");
		}
		else if(score >= 80) {
			System.out.println("B���");
		}
		else if(score >= 90) {
			System.out.println("A���");
		}
		else {
			System.out.println("F���");
		}


	}

}
