package chapter7_6;

class Test1{
	
}
public class InnerClass {
	class Test2{
		public Test2() {
			System.out.println("내부 클래스를 생성합니다.");
		}
		public void Test2Method() {
				System.out.println("내부 클래스의 메소드");
		}
	}
	public void test() {
		Test2 t2 = new Test2();
	}
	public InnerClass() {
		class Test3{
			public Test3(){
				System.out.println("inner클래스의 생성자 내부의 클래스를 생성합니다.");
			}
			public void Test3Method() {
				System.out.println("생성자 내부의 클래스 메소드");
			}
		}
		Test2 t2 = new Test2();
		t2.Test2Method();
		
		Test3 t3 = new Test3();
		t3.Test3Method();
	}
}	
