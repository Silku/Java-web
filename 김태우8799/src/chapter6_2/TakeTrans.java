package chapter6_2;

public class TakeTrans {
// ��Ʃ��Ʈ ���� �䰪�䰪�䰪���� ������Ⱚ�� ���´ٱ��� ������ �Ʊ� 2���� �� ���� ������ �׷� �����̶� �׷��̵�� �ӴϿ� ������� �̰��� Ŭ������ ������
	//���� �־��ְڴٴ� �ź�� . �̰� �������� ���� �Ű����� ���ظ��ϸ��� Ŭ���� ��������ϴ�. �޼��� �޼��尡 ���ذ� �Ǿߵǿ�. ��ü���� ������ ���ذ� �˴ϴ�.
	//Ŵ�̶�� �ϴ� �л��� �л����� �䷯�� ���� �־��ֱ� ���ؼ�, �� �׷� ��Ʃ����
	public static void main(String[] args) {
		Student kim = new Student("������", 20000);  
		Student lee = new Student("������", 40000);  
		Student kim2 = new Student("���¿�", 60000);
		Bus b = new Bus("43�� 1317");
		Bus b2 = new Bus("11ī 7777");
		Subway s = new Subway("1ȣ��"); 
		Subway s2 = new Subway("2ȣ��"); 

		kim.showInfo();
		
		kim.takeBus(b);
		b.showInfo();
		kim.showInfo();
		kim.getoffBus(b);
		b.showInfo();
		System.out.println();
		kim.takeSubway(s2);
		s2.showInfo();
		kim.getoffSubway(s2);
		kim.showInfo();
		kim.setMoney(20000);
		kim.showInfo();
	}
}
