package chapters11;

public class Car {
		private int carNumber;
		
		public Car(int carNumber) {
				this.carNumber = carNumber;
		}
		public void carInfo() {
			System.out.println(carNumber + " 차량입니다.");
		}
			
		public int getCarNumber() {
			return carNumber;
		}

		public void setCarNumber(int carNumber) {
			this.carNumber = carNumber;
		}
		
}
