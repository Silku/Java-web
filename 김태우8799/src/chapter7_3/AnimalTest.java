package chapter7_3;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {

		System.out.println("사람 두발로 걷습");
	}
}

class Tiger extends Animal {
	public void move() {

		System.out.println("호랑이 네발로 뜁");
	}
}

class Eagle extends Animal {
	public void move() {

		System.out.println("독수리 하늘을 남");
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