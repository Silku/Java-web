package chapter7_5;

public class CarTest {
	public void runTest(Car c) {
		c.run();
		System.out.println("차량에 대한 정보");
		c.drive();
		c.stop();
		System.out.println();
	}

	public static void main(String[] args) {
		CarTest ct = new CarTest();
		System.out.println("==자율주행 자동차==");
		Car ai = new AICar();
		ct.runTest(ai);
//		ai.run();
		System.out.println("==사람이 운전하는 자동차==");
		Car mc = new ManualCar();
		ct.runTest(mc);
//		mc.run();
		//업캐스팅이 이루어졌다..run()을 실행 시키기 위해서
	}

}
