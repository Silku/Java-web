package chapter8_2;

/**
 * 
 * Stack(����)
 * LIFO
 * ���� �������� ���°��� ���� ���� ������ ��.
 * ���� �߰� push
 * ���� ���� pop
 *
 */

public interface Stack {
	void push(String title);
	String pop();
	int getStackSize();
}
