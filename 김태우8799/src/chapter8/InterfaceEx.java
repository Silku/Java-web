package chapter8;
//Interface : 추상클래스의 기능을 보완하기 위해 만들어진것
/**
 * 인터페이스 : 약속에 대한 정의
 *상속이 아니라 구현이다.(implement)
 *다중 상속과 다중 구현을 지원한다. <<꽤나 중요한듯?
 *기본적으로 메소드의 형태는 abstract 메소드이다.
 *일반 메소드를 정의하고 싶을 때에는 default를 사용하여 정의한다.
 *기본적인 값의 형태는 상수이다.
 *static 예악어도 생략이 되어 있다. 
 *static 메소드도 구현이 가능하다.
 *자바 9버전 부터는 private 메소드도 사용이 가능하다.
 */

public interface InterfaceEx {
	public void test(); 
	public default void test2() {
		System.out.println("디폴트 메소드");
	}
}
