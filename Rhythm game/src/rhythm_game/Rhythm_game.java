package rhythm_game;

import javax.swing.JFrame;

public class Rhythm_game extends JFrame{
	
	public Rhythm_game() {
		setTitle("Rhythm game");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);//컴퓨터정중앙에 뜨게함
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프로그램종료시 pc내부에서도 종료
		setVisible(true);
	}
}
