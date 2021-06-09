package chapter6_2;

public class Subway {
	private String lineNumber; //��ȣ�� ����ö
	private int passengerCount;
	private int money;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
		passengerCount = 0;
		money = 0;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void getOff() {
		passengerCount--;
	}
	
	public void showInfo() {
		System.out.println("����ö " + lineNumber + "�� �°��� " + passengerCount + "���̰�, ������ " + money +"���Դϴ�.");
	}
}
