package chapter7_5;

/**
 * 
 * final �����
 * ����: ����� �ǹ��Ѵ�.
 * �޼���: ����(�ڽ�) Ŭ�������� ������(override)�� �� ����.
 * Ŭ����: ����� �� �� ����.
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
