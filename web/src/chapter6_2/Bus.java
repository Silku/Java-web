package chapter6_2;

public class Bus {
	private String busNumber; //43다 1317
	private int passengerCount;
	private int money;
	
	public Bus(String busNumber) {
		this.busNumber = busNumber;
		passengerCount = 0; //승객수
		money = 0; //수입
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void getOff() {
		passengerCount--;
	}
	
	public void showInfo() {
		System.out.println("버스 " + busNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money +"원입니다.");
	}
}
