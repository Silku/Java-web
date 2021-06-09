package chapter7_5;

/**
 * 
 * final 예약어
 * 변수: 상수를 의미한다.
 * 메서드: 하위(자식) 클래스에서 재정의(override)할 수 없다.
 * 클래스: 상속을 할 수 없다.
 *
 */

public class MainBoard {

	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}

}
