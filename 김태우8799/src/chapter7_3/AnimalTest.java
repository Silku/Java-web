package chapter7_3;

class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal {
	public void move() {

		System.out.println("��� �ι߷� �Ƚ�");
	}
}

class Tiger extends Animal {
	public void move() {

		System.out.println("ȣ���� �׹߷� ��");
	}
}

class Eagle extends Animal {
	public void move() {

		System.out.println("������ �ϴ��� ��");
	}
}

public class AnimalTest {
	public void moveAnimal(Animal animal) {
		animal.move();
	}

	public static void main(String[] args) {
		AnimalTest at = new AnimalTest();
		Human h = new Human();
		Tiger t = new Tiger();
		Eagle e = new Eagle();

		at.moveAnimal(h);
		at.moveAnimal(t);
		at.moveAnimal(e);
	}
}