package rhythm_game;

import javax.swing.JFrame;

public class Rhythm_game extends JFrame{
	
	public Rhythm_game() {
		setTitle("Rhythm game");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);//��ǻ�����߾ӿ� �߰���
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���α׷������ pc���ο����� ����
		setVisible(true);
	}
}
