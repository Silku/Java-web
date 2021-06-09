package chapter8;

public class CustomerTest {

	public static void main(String[] args) {
		Customer c = new Customer();
		
		Buy buyer = c;
		buyer.buy();
		
		Sell seller = c;
		seller.sell();
		
		if(seller instanceof Customer) {
			Customer c2 = (Customer)seller;
			c2.buy();
			c2.sell();
		}
	}

}
