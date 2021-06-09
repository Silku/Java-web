package chapter6_2;

public class Subway {
	private String lineNumber; //몇호선 지하철
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
		System.out.println("지하철 " + lineNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money +"원입니다.");
	}
}
