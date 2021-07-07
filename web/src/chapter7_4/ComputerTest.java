package chapter7_4;

import java.util.ArrayList;

public class ComputerTest {

	public static void main(String[] args) {
	//	Computer c1 = new Computer();
		Computer c2 = new NoteBook();
	//	Computer c3 = new DeskTop();
		Computer c4 = new DeskTop2();
	
		ArrayList<Computer> list = new ArrayList<Computer>();
		list.add(new DeskTop2());
//		list.add(new DeskTop());
		
	}
}
