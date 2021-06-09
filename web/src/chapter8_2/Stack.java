package chapter8_2;

/**
 * 
 * Stack(스택)
 * LIFO
 * 가장 마지막에 들어온것이 가장 먼저 나가는 것.
 * 값의 추가 push
 * 값의 삭제 pop
 *
 */

public interface Stack {
	void push(String title);
	String pop();
	int getStackSize();
}
