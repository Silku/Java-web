package chapter7_4;

// �߻� Ŭ����
// �߻������� Ŭ������ ����
// abstract(�߻�)


public abstract class Computer {
	public abstract void display();
	public abstract void typing();
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
