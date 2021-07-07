package chapter7_6;

public class InnerClassExTest {

	public static void main(String[] args) {
		InnerClass inner = new InnerClass();
		InnerClass.Test2 t2 = inner.new Test2();
	}

}
