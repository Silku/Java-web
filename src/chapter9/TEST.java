package chapter9;

public class TEST {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	public static void main(String[] args) {
		String test = "±Ë¡ÿ¿œ";

		System.out.println(test.toString());
		
		TEST t = new TEST();
		
		System.out.println(t);
	}
}
