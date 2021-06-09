package chapter8_2;

public class BookShelf extends Shelf implements Queue, Stack{
	
	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}
	
	@Override
	public String deQueue() {
		return shelf.remove(0);
	}
	
	@Override
	public int getQueueSize() {
		return getCount();
	}
	
	@Override
	public void push(String title) {
		shelf.add(title);
	}
	
	@Override
	public String pop() {
		return shelf.remove(getStackSize() - 1);
	}
	
	@Override
	public int getStackSize() {
		return getCount();
	}
}
