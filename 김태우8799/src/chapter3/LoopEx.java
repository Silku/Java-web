package chapter3;

public class LoopEx {

	public static void main(String[] args) {
		// 1~100까지 더해서 출력하세요.
		// for()
		// while() - 	해당 조건이 무조건 만족 되어야만 반복을 수행
		// do{}while   일단 1번 반복문 안의 명령을 실행한 후에 조건을 따짐	
		// for (초기문;조건식;반복;)
		for  (int 	i = 0; 
					i < 100;
					i ++) {
			System.out.println(i);
			System.out.println(i);
		}
		//for작동 원리 : 시작조건 확인, 조건식이 참이면 출력 -> 다시 조건식 확인 not이면 반복;쪽을 실행. 다시 조건확인 참이니까 출력; 계속 반복;
		
		
	}

}
