package chapter8_2;

public class QueueTest {

	public static void main(String[] args) {
		Queue shelfQ = new BookShelf();
		Stack shelfS = new BookShelf();
		shelfQ.enQueue("�ڹ� ���α׷���");
		shelfQ.enQueue("��ǰ �ڹ�");
		shelfQ.enQueue("�ڹ��� ����");
		shelfQ.enQueue("Do it �ڹ� �Թ�");
		shelfQ.enQueue("JAVA");
		
		System.out.println(shelfQ.getQueueSize());
		System.out.println(shelfQ.deQueue());
		System.out.println(shelfQ.getQueueSize());
		System.out.println(shelfQ.deQueue());
		System.out.println(shelfQ.getQueueSize());
		System.out.println(shelfQ.deQueue());
		System.out.println(shelfQ.getQueueSize());
		System.out.println(shelfQ.deQueue());
		System.out.println(shelfQ.getQueueSize());
		System.out.println(shelfQ.deQueue());
		System.out.println(shelfQ.getQueueSize());
		
		shelfS.push("�ڹ� ���α׷���");
		shelfS.push("��ǰ �ڹ�");
		shelfS.push("�ڹ��� ����");
		shelfS.push("Do it �ڹ� �Թ�");
		shelfS.push("JAVA");
		
		System.out.println(shelfS.pop());
		System.out.println(shelfS.pop());
		System.out.println(shelfS.pop());
		System.out.println(shelfS.pop());
		System.out.println(shelfS.pop());
	}

}
