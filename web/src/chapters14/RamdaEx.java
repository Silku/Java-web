package chapters14;

import java.util.function.Consumer;
import java.util.function.Function;


	/**
	 * 
	 * 람다식(함수형 프로그래밍) -> 애로우 하나의 인터페이스에 하나의 함수식밖에 못넣는다(?)
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
			s.accept("안녕하세요");

			Function<Integer, String> f = num -> Integer.toString(num);
			String str2 = f.apply(10);
			System.out.println(str2);

				
		}
	}
