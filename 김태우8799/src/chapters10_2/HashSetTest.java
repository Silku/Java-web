package chapters10_2;
//Hash Ư¡ ���� �ε����� ����. Value�� ����
//hashset�� �ߺ��� ��������ʴ´�.

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add(new String("������"));
		hs.add(new String("������"));
		hs.add(new String("���ػ�"));
		hs.add(new String("���ػ�"));
		hs.add(new String("���ؿ�"));
		hs.add(new String("������"));
		hs.add(new String("����ĥ"));
		hs.add(new String("������"));
		hs.add(new String("������"));

		System.out.println(hs);
	}
}
