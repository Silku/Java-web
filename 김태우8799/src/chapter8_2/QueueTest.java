package chapter8_2;

public class QueueTest {

	public static void main(String[] args) {
		Queue shelfQ = new BookShelf();
		Stack StackS = new BookShelf();
		shelfQ.enQueue("�ڹ� ���α׷���");
		shelfQ.enQueue("��ǰ �ڹ�");
		shelfQ.enQueue("�ڹ��� ����");
		shelfQ.enQueue("Do it �ڹ� �Թ�");
		shelfQ.enQueue("JAVA");

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
		System.out.println("==== �Ʒ��� Stack ���뼱=====");
		StackS.pushStack("�ڹ� ���α׷���");
		StackS.pushStack("��ǰ �ڹ�");
		StackS.pushStack("�ڹ��� ����");
		StackS.pushStack("Do it �ڹ� �Թ�");
		StackS.pushStack("JAVA");
		System.out.println(StackS.popStack());
		System.out.println(StackS.getStackSize());
		System.out.println(StackS.popStack());
		System.out.println(StackS.getStackSize());
		System.out.println(StackS.popStack());
		System.out.println(StackS.getStackSize());
		System.out.println(StackS.popStack());
		System.out.println(StackS.getStackSize());
		System.out.println(StackS.popStack());
		System.out.println(StackS.getStackSize());

	}

}
