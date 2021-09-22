package rhythm_game2;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Rhythm_game extends JFrame{
	
	private Image screenImage;
	private Graphics screenGraphics;
	private Image introBackground;
	
	public Rhythm_game() {
		setTitle("Rhythm game");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);//컴퓨터정중앙에 뜨게함
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프로그램종료시 pc내부에서도 종료
		setVisible(true);
		
		introBackground = new ImageIcon(Main.class.getResource("../images/introBackground.png")).getImage();
	}
	
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphics = screenImage.getGraphics();
		screenDraw(screenGraphics);
		g.drawImage(screenImage, 0, 0, null);
		
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		this.repaint();
	}
}
