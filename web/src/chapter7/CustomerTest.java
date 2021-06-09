package chapter7;

public class CustomerTest {

	public static void main(String[] args) {
		Customer kim = new Customer(10010, "김준일");
		Customer lee = new VIPCustomer(10020, "이은수", 12345); //업캐스팅
		
		kim.setBonusPoint(1000);
		lee.setBonusPoint(1000);
		
		System.out.println(kim.showCustomerInfo());
		System.out.println(lee.showCustomerInfo());
		
		System.out.println("========할인율과 보너스 포인 계산========");
		
		int price = 10000;
		int kimPrice = kim.calcPrice(price);
		int leePrice = lee.calcPrice(price);
		
		System.out.println(kim.getCustomerName() + "님이  " + kimPrice + "원 지불하였습니다.");
		System.out.println(kim.showCustomerInfo());
		System.out.println(lee.getCustomerName() + "님이  " + leePrice + "원 지불하였습니다.");
		System.out.println(lee.showCustomerInfo());
		
	}

}
