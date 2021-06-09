package chapter7_3;

public class TestTest {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("test");
		Test2 t2 = (Test2)new Test();
		System.out.println("test");
		Test t3 = new Test3();
		//t2 = (Test2)t;
		
		System.out.println("test");
		t.test();
		System.out.println("test");
		t2.test();
		System.out.println("test");
		t2.show();
		t3.test();
		
		
		
		//Test3 t3 = new Test3();
	}
}
