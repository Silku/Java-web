package chapter7_5;

public class ManualCar extends Car {
	@Override
	public void drive() {
		System.out.println("사람이 자동차를 운전합니다.");
		System.out.println("사람이 핸들을 돌려 코너링 합니다.");

	}

	@Override
	public void stop() {
		System.out.println("사람이 브레이크를 밟아 차량을 정지시킵니다.");
	}

}
