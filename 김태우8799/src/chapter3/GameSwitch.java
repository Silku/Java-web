package chapter3;

public class GameSwitch {

	public static void main(String[] args) {
		int round = 1; 					//���Ӷ��带 �ǹ�
		boolean dead = false;			//����ڰ� �׾����� ���� üũ
		
		switch(round) {
			case 1:
					System.out.println("���� ����");
					if(dead == true) {
						System.out.println(round + "�� Ŭ���� ���� ���Ͽ����ϴ�.");
						System.out.println("ó������ �ٽ� �����մϴ�.");
						break;
					}else {
						System.out.println(round + "���带 Ŭ���� �Ͽ����ϴ�.");
						round++;
					}
			case 2:
					System.out.println(round + "���� ����");
					dead = true;
					if(dead == true) {
					System.out.println(round + "�� Ŭ���� ���� ���Ͽ����ϴ�.");
					System.out.println("ó������ �ٽ� �����մϴ�.");
					break;
					}else {
					System.out.println(round + "���带 Ŭ���� �Ͽ����ϴ�.");
					round++;
					}
			case 3:
			case 4:
			case 5:
					System.out.println(round + "���� ����");
					if(dead == true) {
						System.out.println(round + "�� Ŭ���� ���� ���Ͽ����ϴ�.");
						System.out.println("ó������ �ٽ� �����մϴ�.");
						break;
					}else {
						System.out.println("���� Ŭ����");
					}
					break;
			default:
				System.out.println("ĳ������ ���尡 �߸� ����Ǿ����ϴ�.");
				round = 1;
		}
	}

}
