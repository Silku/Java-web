package chapter6_2;

public class TakeTrans {

	public static void main(String[] args) {
		Student kim = new Student("������", 20000);
		Student lee;
		lee = kim;
		Bus b = new Bus("43�� 1317");
		Bus b2 = new Bus("14�� 7777");
		Subway s = new Subway("1ȣ��");
		Subway s2 = new Subway("2ȣ��");
		
		kim.showInfo();
		
		kim.takeBus(b);
		b.showInfo();
		kim.showInfo();
		kim.getOffBus(b);
		b.showInfo();
		kim.takeSubway(s2);
		s2.showInfo();
		kim.showInfo();
		
		kim.setMoney(20000);
		kim.showInfo();
		
	}

}
