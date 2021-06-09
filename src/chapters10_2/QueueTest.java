package chapters10_2;

import java.util.ArrayList;

class Queue{
	private ArrayList<String> queue = new ArrayList<String>();
	
	public ArrayList<String> showAll(){
		return queue;
	}
	
	public void enQueue(String data) {
		queue.add(data);
	}
	
	public String deQueue() {
		int len = queue.size();
		if(len == 0) {
			System.out.println("큐가 비어 있습니다.");
			return null;
		}
		
		return queue.remove(0);
	}
}

public class QueueTest {

	public static void main(String[] args) {
		Queue q = new Queue();
		
		q.enQueue("A");
		q.enQueue("B");
		q.enQueue("C");
		System.out.println(q.showAll());
		
		System.out.println(q.deQueue());
		System.out.println(q.showAll());
		System.out.println(q.deQueue());
		System.out.println(q.showAll());
		System.out.println(q.deQueue());
		System.out.println(q.showAll());
		System.out.println(q.deQueue());

	}

}
