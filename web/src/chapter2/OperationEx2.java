package chapter2;

public class OperationEx2 {
	//증(가)/감(소) 증감연산자
	public static void main(String[] args) {
		int gameScore = 150;
		
		//gameScore = gameScore + 1;
		++gameScore;
		
		int lastScore = gameScore;
		System.out.println("gameScore: " + gameScore);
		System.out.println("lastScore: " + lastScore);
		System.out.println("lastScore: " + ++lastScore);
		System.out.println("lastScore: " + lastScore++);
		System.out.println("lastScore: " + lastScore);
		
		System.out.println("gameScore: " + --gameScore);
		System.out.println("gameScore: " + gameScore--);
		System.out.println("gameScore: " + gameScore);
	}

}
