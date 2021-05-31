package chapter7_5;

/**
 * 
 * 템플릿 메서드(추상클래스) Template
 *	: 자녀 클래스가 상속받은것을 재정의 할수 없도록 하는것, final쓰는 예시
 */

public abstract class Car {
	public abstract void drive();

	public abstract void stop();

	public void startCar() {
		System.out.println("차량의 시동을 켭니다.");
	}

	public void turnOff() {
		System.out.println("차량의 시동을 끕니다.");
	}
//final 쓸때는 상수쓸 때, 오버라이드에 할때 필요한거다. 상속받을떄 이러한 것을 재정의할수 없도록
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}

}
