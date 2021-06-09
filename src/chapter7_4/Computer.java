package chapter7_4;

// 추상 클래스
// 추상적으로 클래스를 설계
// abstract(추상)


public abstract class Computer {
	public abstract void display();
	public abstract void typing();
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
