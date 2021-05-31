package chapter8_2;
/**
 * Stack 
 * LIFO (Last In First Out)
 * 가장 마지막에 들어온것이 가장 먼저 나가는것.
 * 값의 추가 : push
 * 값의 삭제 : pop
 */
public interface Stack {
	void pushStack(String title);
	String popStack();
	int getStackSize();
}
