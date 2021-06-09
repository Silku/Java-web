package chapter3;

public class IfEx2 {

	public static void main(String[] args) {
		int score = 89;
		
		if(score >= 90) {
			System.out.println("A등급");
		}
		else if(score >= 80) {
			System.out.println("B등급");
		}
		else if(score >= 70) {
			System.out.println("C등급");
		}
		else {
			System.out.println("F등급");
		}
		
		if(score >= 70) {
			System.out.println("C등급");
		}
		else if(score >= 80) {
			System.out.println("B등급");
		}
		else if(score >= 90) {
			System.out.println("A등급");
		}
		else {
			System.out.println("F등급");
		}


	}

}
