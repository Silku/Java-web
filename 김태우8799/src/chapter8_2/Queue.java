package chapter8_2;
/**
 * 
 * Queue(큐)
 * FIFO(first in first out)
 * 데이터가 처음 들어간 것이 가장 먼저 나온다.
 * 데이터의 삽입 : enQueue
 * 데이터의 삭제 : deQueue
 * 
 */
public interface Queue {
	void enQueue(String title);
	String deQueue();
}
