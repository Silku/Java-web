package chapter7;

public class CustomerTest {

	public static void main(String[] args) {
		Customer kim = new Customer("김태우");
		kim.setCustomerId(10010);
		kim.setBonusPoint(1000);
		System.out.println(kim.showCustomerInfo());
		kim.calcPrice(10000);
		System.out.println(kim.showCustomerInfo());
		
		VIPCustomer lee = new VIPCustomer("이은수");
		lee.setCustomerId(10020);
		lee.setBonusPoint(1000);
		System.out.println(lee.showCustomerInfo());
		lee.calcPrice(10000);
		System.out.println(lee.showCustomerInfo());
	}
}
