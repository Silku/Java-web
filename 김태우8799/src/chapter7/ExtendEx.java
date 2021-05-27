package chapter7;
/*
 * 상속(extends)
 * class 클래스명 extends 상속을 받을 클래스명
 * 부모클래스를 지칭하는 예약어는 super이다.
 *부모가 갖고 있는 상속변수를 부모메소드에서 받아갖구..
 * 오버라이딩 : 자녀 클래스가 상속받은 메소드를 재구성해서 만들어낼수 있다? 좋은부분만(?)
 */ 
public class ExtendEx {
		public static void main(String[] args) {
			VIPCustomer vip = new VIPCustomer("김태우");
			
			System.out.println(vip.showCustomerInfo());
		}
}
