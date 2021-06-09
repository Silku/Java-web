package chapter7;

public class CustomerTest {

	public static void main(String[] args) {
		Customer kim = new Customer(10010, "������");
		Customer lee = new VIPCustomer(10020, "������", 12345); //��ĳ����
		
		kim.setBonusPoint(1000);
		lee.setBonusPoint(1000);
		
		System.out.println(kim.showCustomerInfo());
		System.out.println(lee.showCustomerInfo());
		
		System.out.println("========�������� ���ʽ� ���� ���========");
		
		int price = 10000;
		int kimPrice = kim.calcPrice(price);
		int leePrice = lee.calcPrice(price);
		
		System.out.println(kim.getCustomerName() + "����  " + kimPrice + "�� �����Ͽ����ϴ�.");
		System.out.println(kim.showCustomerInfo());
		System.out.println(lee.getCustomerName() + "����  " + leePrice + "�� �����Ͽ����ϴ�.");
		System.out.println(lee.showCustomerInfo());
		
	}

}
