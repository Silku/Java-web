package chapter9;

public class ObjectEx {
	private String str;
	public ObjectEx(String str) {
		this.str = str;
	}
	
	@Override
	public String toString() {

		return str; 
		
	}
	public static void main(String[] args) {
		ObjectEx oe = new ObjectEx("test");
		String test = "test";
		System.out.println(test);
		System.out.println(oe);
	}
	
/**
 * �⺻Ŭ����
 * Object Class
 * ��� Ŭ������ �ֻ��� Ŭ����
 * 
 */
}
