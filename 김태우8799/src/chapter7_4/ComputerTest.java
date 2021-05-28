package chapter7_4;

public class ComputerTest {

	public static void main(String[] args) {
	//	Computer c1 = new Computer();//c1,c3 처럼추상클래스는 생성할수가 없다! 얼마나 값이 들어갈지 모르기떄문에 
		Computer c2 = new NoteBook();
	//	Computer c3 = new DeskTop();   
		Computer c4 = new DeskTop2();

	}

}
