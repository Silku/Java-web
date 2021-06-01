package chapter9;

class Book2 {
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}

public class HashCodeEx {
	public static void main(String[] args) {
		Book2 b1 = new Book2();
		Book2 b2 = new Book2();
		Integer i = new Integer(100);
		Integer i2 = new Integer(200);
		Integer i3 = new Integer(100);

		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(i.hashCode() == i3.hashCode());
		System.out.println(i == i3);
		System.out.println(i2.hashCode());
		System.out.println(i3.hashCode());

	}
}
