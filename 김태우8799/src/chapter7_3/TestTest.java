package chapter7_3;

public class TestTest {

	public static void main(String[] args) {
		Test t = new Test();
		Test2 t2 = (Test2)new Test();
		Test t3 = new Test();
		
//		Test t2;
//		t2 = (Test2)t;
		String name = "±èÅÂ¿ì";
		t.test();
		t2.test();
		t2.show();
		t3.test();
//		Test3 t3 = new Test3();
		
		
	}

}
