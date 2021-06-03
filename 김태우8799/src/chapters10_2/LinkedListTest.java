package chapters10_2;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		System.out.print("[");
		for(int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i) + ((i <list.size()-1 ?", " : "")));
		}
		System.out.println("]");

		list.add(1,"D");
		System.out.println(list);
		
		list.addFirst("E");
		System.out.println(list);
		
		list.removeFirst();
		System.out.println(list);
		
		list.addLast("L");
		list.removeLast();
		list.remove(2);
		System.out.println(list);
		list.remove();
		System.out.println(list); //그냥 지우면 제일앞에것이 지워짐.
	}

}
