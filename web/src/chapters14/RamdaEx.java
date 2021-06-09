package chapters14;

import java.util.function.Function;

public class RamdaEx {
/**
 * 
 * 람다식(함수형 프로그래밍)
 * -> 애로우
 * 하나의 인터페이스에 하나의 함수식밖에 못넣는다(?)
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
		s.aceept("안녕하세요");
		
		Function<String, String> f = (str) -> {return str;};
		String str = f.apply("안녕하세요. 반갑습니다.");
		System.out.println(str);
	}

}
 