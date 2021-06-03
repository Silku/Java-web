package chapters10_2;

import java.util.ArrayList;

class Stack{
	private ArrayList<String> stack = new ArrayList<String>();
	
	public void push(String data) {
		stack.add(data);
	}
	public String pop() {
		int len = stack.size();
		if(len == 0) {
			System.out.println("������ ��� �ֽ��ϴ�.");
			return null;
		}
		return stack.remove(len-1);
	}
}

public class StackTest {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
