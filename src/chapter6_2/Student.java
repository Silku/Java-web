package chapter6_2;

	// �Ű� �߰����� ���� �Ǵ� ������ �����ִ� ����
public class Student {
	private String studentName;
	private int money;
	
	public void setMoney(int money) {
		this.money += money;
	}

	public Student(String name, int money) {
		this.studentName = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1300);
		this.money -= 1300;
	}
	
	public void getOffBus(Bus bus) {
		bus.getOff();
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}
	
	public void getOffSubway(Subway subway) {
		subway.getOff();
	}
	
	public void showInfo() {
		System.out.println(studentName + "�� ���� ���� " + money +"�� �Դϴ�.");
	}
	
	

}
