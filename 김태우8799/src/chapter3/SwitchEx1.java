package chapter3;

public class SwitchEx1 {
//Switch case : 해당조건에 맞는 case를 찾는 문법
//break (제어문 탈출) : 제어문 흐름 중 break 이후의 명령을 실행하지 않고 빠져나옴.
	public static void main(String[] args) {
		int score = 0;
		
		String grade = "B";
		
		switch(grade) {
			case "A" : 
				System.out.println("90~100점");
				break;
			case "B" :
				System.out.println("80~89점");
				break;
			case "C" :
				System.out.println("70~79점");
				break;
			case "D" :
				System.out.println("60~69점");
				break;
			case "F" :
				System.out.println("0~59점");
				break;
			default : 
				System.out.println("해당 등급은 사용할 수 없는 등급입니다.");
		}

		//if() {} , if ()안에는 조건이 들어갔지만 switch()안에는 값이 들어간다.
	}

}
