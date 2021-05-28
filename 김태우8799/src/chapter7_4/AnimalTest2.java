package chapter7_4;

import java.util.ArrayList;

abstract class Animal {
	public  abstract  void move();
}

class Human extends Animal {
	public void move() {
		System.out.println("��� �ι߷� �Ƚ���");
	}

	public void readBook() {
		System.out.println("�װ��� å�� �о����.");
	}
}

class Tiger extends Animal {
	public void move() {

		System.out.println("ȣ���� �׹߷� �ݴ�");
	}

	public void hunting() {
		System.out.println("ȣ���̰� ���ϳ� �ְ� ��ƸӰſ�");
	}
}

class Eagle extends Animal {
	public void move() {

		System.out.println("������ �ϴ��� ���ϴ�");
	}

	public void flying() {
		System.out.println("�������� ������ �� ��� ���ư��ϴ�.");
	}
}

public class AnimalTest2 {
	ArrayList<Animal> aniList = new ArrayList<Animal>();

	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		for (Animal ani : aniList) {
			ani.move();
		}
	}

	public void testCasting() {
		for (int i = 0; i < aniList.size(); i++) {
			Animal ani = aniList.get(i);
//	 �̰Ŷ����� ���ư����ִ���,Animal ani = new Human();
			// instanceof : ��ü�� ���� ������ Ȯ��, ������ true, �ٸ��� false
			if (ani instanceof Human) {
				Human h = (Human) ani;
				h.readBook();
			} else if (ani instanceof Tiger) {
				Tiger t = (Tiger) ani;
				t.hunting();
			} else if (ani instanceof Eagle) {
				Eagle e = (Eagle) ani;
				e.flying();
			} else {
				System.out.println("�������� �ʴ� ���Դϴ�.");
			}
		}
	}
	// �迭������ length�� size�� �����Ŵ�.

	public void moveAnimal(Animal animal) {
		animal.move();
	}

	public static void main(String[] args) {
		AnimalTest2 at = new AnimalTest2();
		at.addAnimal();
		System.out.println();
		System.out.println("������ ���·� �ٿ�ĳ����");
		System.out.println();
		at.testCasting();
		Human h = new Human();
		Tiger t = new Tiger();
		Eagle e = new Eagle();

//		at.moveAnimal(h);
//		at.moveAnimal(t);
//		at.moveAnimal(e);
	}
}