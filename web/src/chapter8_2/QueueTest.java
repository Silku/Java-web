package chapter8_2;

public class QueueTest {

	public static void main(String[] args) {
		Queue shelfQ = new BookShelf();
		Stack shelfS = new BookShelf();
		shelfQ.enQueue("자바 프로그래밍");
		shelfQ.enQueue("명품 자바");
		shelfQ.enQueue("자바의 정석");
		shelfQ.enQueue("Do it 자바 입문");
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
		
		shelfS.push("자바 프로그래밍");
		shelfS.push("명품 자바");
		shelfS.push("자바의 정석");
		shelfS.push("Do it 자바 입문");
		shelfS.push("JAVA");
		
		System.out.println(shelfS.pop());
		System.out.println(shelfS.pop());
		System.out.println(shelfS.pop());
		System.out.println(shelfS.pop());
		System.out.println(shelfS.pop());
	}

}
