package chapter6_2;

//�Ű� : �߰����� ���� - ������ �����ִ� ���� �Ű�ä �׷��� ������ڳ��� ���� �߰����� ���� �Ѱ��ֱ� ���ؼ� �Ѱ��ְ� �Ѱܹޱ����ؼ� �ִ°ſ��� �Ű�������°�
//�׷����� �ϴ� �𽺽�Ʃ��Ʈ���� �� ��Ʃ��ũ �̷��� �Ǵ°��� �̷��ԵǴ°̴ϴ�.�̰��� �� �õ� �Ѱ��ֳĸ��.
//�� Ŭ�������θ���Կ� �� Ŭ���� ���� 

public class Student {
	private String studentName;
	
	private int money;
	
	public Student(String name, int money) {
			this.studentName = name;
		
			this.money = money;
			
	}
	public void takeBus(Bus bus) {
		bus.take(1300);
		this.money -= 1300;
		
	}
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;	
	}
	public void getoffBus(Bus bus) {
		bus.getoff();
	}
	public void getoffSubway(Subway subway) {
		subway.getoff();
	}
	
	public void showInfo() {
		System.out.println(studentName + "�� ���� ���� " + money + "���Դϴ�.");
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money += money;
	}


	
}
