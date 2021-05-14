package chapter2;

public class OperationEx2 {

	public static void main(String[] args) {
		//증감연산자
		int gameScore = 150;
		
		int lastScore = ++gameScore;
		
		System.out.println("gameScore : " +gameScore);
		System.out.println("lastScore : " + lastScore); 
		System.out.println("lastScore : " + ++lastScore); //선증가해서 1증가한값이 출력(152)
		System.out.println("lastScore : " +lastScore++); //후증가해서 여기서는 원래값 출력 (152), 다음건 1증가한값
		System.out.println("lastScore : " +lastScore);
	
		System.out.println("gameScore : " + --gameScore);
		System.out.println("gameScore : " + gameScore--);
		System.out.println("gameScore : " + gameScore);
	}
		
	
	
//		System.out.println("lastScore : " +gameScore++);
//		System.out.println("lastScore : " +gameScore+++"무");
//		System.out.println("lastScore : " +gameScore+++"야");
//		System.out.println("lastScore : " +gameScore+++"호");
	
}
