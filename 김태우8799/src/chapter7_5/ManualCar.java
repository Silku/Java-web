package chapter7_5;

public class ManualCar extends Car {
	@Override
	public void drive() {
		System.out.println("����� �ڵ����� �����մϴ�.");
		System.out.println("����� �ڵ��� ���� �ڳʸ� �մϴ�.");

	}

	@Override
	public void stop() {
		System.out.println("����� �극��ũ�� ��� ������ ������ŵ�ϴ�.");
	}

}
