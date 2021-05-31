package chapter8_2;

public class QueueTest {

	public static void main(String[] args) {
		Queue shelfQ = new BookShelf();
		Stack StackS = new BookShelf();
		shelfQ.enQueue("자바 프로그래밍");
		shelfQ.enQueue("명품 자바");
		shelfQ.enQueue("자바의 정석");
		shelfQ.enQueue("Do it 자바 입문");
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
		System.out.println("==== 아래는 Stack 절취선=====");
		StackS.pushStack("자바 프로그래밍");
		StackS.pushStack("명품 자바");
		StackS.pushStack("자바의 정석");
		StackS.pushStack("Do it 자바 입문");
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
