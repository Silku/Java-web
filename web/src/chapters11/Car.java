package chapters11;

public class Car {
	private int carNumber;
	
	public Car(int carNumber) {
		this.carNumber = carNumber;
	}
	
	public void carInfo() {
		System.out.println(carNumber + "차량입니다.");
	}
}
