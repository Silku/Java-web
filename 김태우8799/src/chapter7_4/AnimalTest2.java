package chapter7_4;

import java.util.ArrayList;

abstract class Animal {
	public  abstract  void move();
}

class Human extends Animal {
	public void move() {
		System.out.println("사람 두발로 걷습다");
	}

	public void readBook() {
		System.out.println("닝겐은 책을 읽었어요.");
	}
}

class Tiger extends Animal {
	public void move() {

		System.out.println("호랑이 네발로 뜁다");
	}

	public void hunting() {
		System.out.println("호랑이가 떡하나 주고 잡아머거요");
	}
}

class Eagle extends Animal {
	public void move() {

		System.out.println("독수리 하늘을 남니다");
	}

	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 날아갑니다.");
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
//	 이거랑같이 돌아가고있는중,Animal ani = new Human();
			// instanceof : 객체가 서로 같은지 확인, 같으면 true, 다르면 false
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
				System.out.println("지원되지 않는 형입니다.");
			}
		}
	}
	// 배열에서는 length랑 size와 같은거다.

	public void moveAnimal(Animal animal) {
		animal.move();
	}

	public static void main(String[] args) {
		AnimalTest2 at = new AnimalTest2();
		at.addAnimal();
		System.out.println();
		System.out.println("원래의 형태로 다운캐스팅");
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