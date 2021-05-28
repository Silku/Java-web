package chapter7_2;

public class Test2 extends Test{
	public Test2() {
		
//		public int i_num = 20;
		
		super("김준일");
		System.out.println(super.i_num);
		System.out.println(i_num);
		System.out.println("Test2 클래스를 생성하였습니다."); 
		// super();가 기본적으로 생략되어있는 형태이다. 
		//Test 클래스가 먼저 생성되있는게 생략 
		
		//public i_num = 20;
		//만약 이 클래스에 i_num 값을 =20; 선언하고 
		// 나중에 super.i_num 과 그냥 i_num있으면 밑에건 super생략된형으로 부모클래스의 값을 받음. 
		//매개변수 먼저 , 자식 , 부모
		
	}
}
