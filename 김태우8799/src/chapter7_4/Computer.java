package chapter7_4;

//�߻�Ŭ����
//�߻������� Ŭ������ ���踸 ��.
//abstract(�߻�)
// public abstract void display() ; , �� ���� �߻�޼ҵ尡 �ȴ�.
public abstract class Computer {
		public abstract void display() ;
		public abstract void typing() ;
		public void turnOn() {
			System.out.println("������ �մϴ�.");
		}
		public void turnOff() {
			System.out.println("������ ���ϴ�.");
		}
	
}
