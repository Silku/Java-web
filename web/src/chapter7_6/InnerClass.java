package chapter7_6;

class Test1{
	
}
public class InnerClass {
	class Test2{
		public Test2() {
			System.out.println("���� Ŭ������ �����մϴ�.");
		}
		public void Test2Method() {
				System.out.println("���� Ŭ������ �޼ҵ�");
		}
	}
	public void test() {
		Test2 t2 = new Test2();
	}
	public InnerClass() {
		class Test3{
			public Test3(){
				System.out.println("innerŬ������ ������ ������ Ŭ������ �����մϴ�.");
			}
			public void Test3Method() {
				System.out.println("������ ������ Ŭ���� �޼ҵ�");
			}
		}
		Test2 t2 = new Test2();
		t2.Test2Method();
		
		Test3 t3 = new Test3();
		t3.Test3Method();
	}
}	
