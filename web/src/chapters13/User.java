package chapters13;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.CardLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class User extends JFrame {

	private JPanel mainCard;
	private JTextField idTextField;
	private JPasswordField loginPasswordField;
	private JLabel welcomMassage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User frame = new User();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public User() {
		CardLayout card = new CardLayout();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1041, 505);
		mainCard = new JPanel();
		mainCard.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainCard);
		mainCard.setLayout(card);
		
		JPanel loginPanel = new JPanel();
		mainCard.add(loginPanel, "name_9143435401800");
		loginPanel.setLayout(null);
		
		idTextField = new JTextField();
		idTextField.setBounds(266, 128, 479, 38);
		loginPanel.add(idTextField);
		idTextField.setColumns(10);
		
		JLabel idLabel = new JLabel("\uC544\uC774\uB514");
		idLabel.setBounds(266, 103, 57, 15);
		loginPanel.add(idLabel);
		
		JLabel pwdLabel = new JLabel("\uBE44\uBC00\uBC88\uD638");
		pwdLabel.setBounds(266, 199, 57, 15);
		loginPanel.add(pwdLabel);
		
		loginPasswordField = new JPasswordField();
		loginPasswordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					String id = idTextField.getText();
					String pwd = loginPasswordField.getText();
					UserMgr mgr = new UserMgr();
					int flag = mgr.loginCheck(id, pwd);
					if(flag == 0) {
						JOptionPane.showMessageDialog(null, "아이디가 존재하지 않습니다.", "경고", JOptionPane.PLAIN_MESSAGE);
					} else if(flag == 1) {
						JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.", "경고", JOptionPane.PLAIN_MESSAGE);
					} else if(flag == 2) {
						welcomMassage.setText(mgr.welcomName(id, pwd) + "님 환영합니다.");
						card.show(mainCard, "name_9251066783000");
					}
					
				}
			}
		});
		loginPasswordField.setBounds(266, 224, 479, 38);
		loginPanel.add(loginPasswordField);
		
		JButton loginButton = new JButton("\uB85C\uADF8\uC778");
		loginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				card.show(mainCard, "name_9251066783000");
			}
		});
		loginButton.setBounds(648, 295, 97, 23);
		loginPanel.add(loginButton);
		
		JPanel homePanel = new JPanel();
		mainCard.add(homePanel, "name_9251066783000");
		homePanel.setLayout(null);
		
		JButton logoutButton = new JButton("\uB85C\uADF8\uC544\uC6C3");
		logoutButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				card.show(mainCard, "name_9143435401800");
			}
		});
		logoutButton.setBounds(906, 423, 97, 23);
		homePanel.add(logoutButton);
		
		welcomMassage = new JLabel("\uB2D8 \uD658\uC601\uD569\uB2C8\uB2E4.");
		welcomMassage.setBounds(12, 10, 254, 15);
		homePanel.add(welcomMassage);
		
	}
}
