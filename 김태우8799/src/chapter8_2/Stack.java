package chapter8_2;
/**
 * Stack 
 * LIFO (Last In First Out)
 * ���� �������� ���°��� ���� ���� �����°�.
 * ���� �߰� : push
 * ���� ���� : pop
 */
public interface Stack {
	void pushStack(String title);
	String popStack();
	int getStackSize();
}
