package chapters14;

import java.util.function.Consumer;
import java.util.function.Function;


	/**
	 * 
	 * ���ٽ�(�Լ��� ���α׷���) -> �ַο� �ϳ��� �������̽��� �ϳ��� �Լ��Ĺۿ� ���ִ´�(?)
	 */

	public class RamdaEx {

		public static void main(String[] args) {
			RamdaTest o2 = (a) -> {
				a += 10;
				System.out.println(a);
			};
			o2.test(100);

			Consumer<Integer> c = (a) -> System.out.println(a);
			c.accept(10);

			Consumer<String> s = (str) -> System.out.println(str);
			s.accept("�ȳ��ϼ���");

			Function<Integer, String> f = num -> Integer.toString(num);
			String str2 = f.apply(10);
			System.out.println(str2);

				
		}
	}
