package chapters10_2;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add(new String("������"));
		hs.add(new String("������"));
		hs.add(new String("������"));
		hs.add(new String("������"));
		hs.add(new String("�ڿ��"));
		hs.add(new String("������"));
		hs.add(new String("���¿�"));
		hs.add(new String("�ȴ��"));
		hs.add(new String("������"));
		
		System.out.println(hs);
	}

}
