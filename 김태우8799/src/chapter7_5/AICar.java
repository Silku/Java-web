package chapter7_5;

public class AICar extends Car {
	@Override
	public void drive() {
		System.out.println("���� ������ �����մϴ�.");
		System.out.println("�ڵ����� �ڳʸ� ���� ���� �ý����� ����Ͽ� �ڳʸ� �մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("���������� �����մϴ�.");
	}

}
