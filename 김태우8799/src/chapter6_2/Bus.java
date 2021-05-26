package chapter6_2;

public class Bus {
	private String busNumber; //43´Ù 1317
	private int passengerCount;
	private int money;
	
	public Bus(String busNumber) {
		this.busNumber  = busNumber;
		passengerCount = 0; //½Â°´¼ö
		money = 0;
	}
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println("¹ö½º" + busNumber + "ÀÇ ½Â°´Àº " + passengerCount + "¸íÀÌ°í, ¼öÀÔÀº " + money + "ÀÔ´Ï´Ù.");
	}
	public void getoff() {
		passengerCount--;
	}
	
}
