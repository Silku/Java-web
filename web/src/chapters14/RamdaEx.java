package chapters14;

import java.util.function.Function;

public class RamdaEx {
/**
 * 
 * ���ٽ�(�Լ��� ���α׷���)
 * -> �ַο�
 * �ϳ��� �������̽��� �ϳ��� �Լ��Ĺۿ� ���ִ´�(?)
 */

	public static void main(String[] args) {
		RamdaTest o2 = (a) -> {
			a += 10;
			System.out.println(a);	
		};
		o2.test(100);
		
		RamdaTest2 o = new RamdaTest2() {
			@Override
			void test() {
				System.out.println("test");
			}
		};
		o.test();
		
		Consumer<Integer> c = (a) -> System.out.println(a);
		c.aceept(10);
		
		Consumer<String> s = (str) -> System.out.println(str);
		s.aceept("�ȳ��ϼ���");
		
		Function<String, String> f = (str) -> {return str;};
		String str = f.apply("�ȳ��ϼ���. �ݰ����ϴ�.");
		System.out.println(str);
	}

}
 