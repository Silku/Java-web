package chapters10_2;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add(new String("김준일"));
		hs.add(new String("배현준"));
		hs.add(new String("이은수"));
		hs.add(new String("최종원"));
		hs.add(new String("박용수"));
		hs.add(new String("권혁인"));
		hs.add(new String("김태우"));
		hs.add(new String("안대양"));
		hs.add(new String("김준일"));
		
		System.out.println(hs);
	}

}
