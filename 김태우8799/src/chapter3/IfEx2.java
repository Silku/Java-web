package chapter3;
// if , else 사용법과 else if의 원리 
// else 밑에 {}를 지우고 밑에있는  if  else if 하나의 변수(맞나? 명령어?)로 선언하는거임
/* 프로그램은 순차적으로 실행되기 때문에 만약 역순으로 거꾸로 if 조건을 줘버리면 위에서부터 실행이되서 프로그램적 오류는 발생하지 않지만,
 *  사람이 원하는 결과가 안나올수 있음.
	예를들어 아래와같은 A,b,c ,90,80,70을 준게 아닌 
	c b a70 80 90이런식으로 줘버린경우
*/

public class IfEx2 {

	public static void main(String[] args) {

		int score = 99;
		if(score >=90) {
			System.out.println("A등급");
		}
		else{
			if(score >=80) {
				System.out.println("B등급");
			}
			// else 밑에 {}를 지우고 밑에있는  if  else if 하나의 변수(맞나? 명령어?)로 선언하는거임
			else if(score >=70) {
					System.out.println("C등급");
				}
				else {
					System.out.println("F등급");
				}
			
	}
	}

}
