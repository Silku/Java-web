package chapters11;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory cf1 = CarFactory.getInstance();
		CarFactory cf2 = CarFactory.getInstance();
		CarFactory cf3 = CarFactory.getInstance();
		CarFactory cf4 = CarFactory.getInstance();
		
		Car c1 = cf1.creatCar();
		Car c2 = cf2.creatCar();
		Car c3 = cf3.creatCar();
		Car c4 = cf4.creatCar();
		
		c1.carInfo();
		c2.carInfo();
		c3.carInfo();
		c4.carInfo();
	}

}
