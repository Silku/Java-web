package chapter7_4;

//추상클래스
//추상적으로 클래스를 설계만 함.
//abstract(추상)
// public abstract void display() ; , 와 같이 추상메소드가 된다.
public abstract class Computer {
		public abstract void display() ;
		public abstract void typing() ;
		public void turnOn() {
			System.out.println("전원을 켭니다.");
		}
		public void turnOff() {
			System.out.println("전원을 끕니다.");
		}
	
}
