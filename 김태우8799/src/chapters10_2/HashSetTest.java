package chapters10_2;
//Hash Æ¯Â¡ °ªÀÇ ÀÎµ¦½º°¡ ¾ø´Ù. Value·Î µ¿ÀÛ
//hashsetÀº Áßº¹À» Çã¿ëÇÏÁö¾Ê´Â´Ù.

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add(new String("±èÁØÀÏ"));
		hs.add(new String("±èÁØÀÌ"));
		hs.add(new String("±èÁØ»ï"));
		hs.add(new String("±èÁØ»ç"));
		hs.add(new String("±èÁØ¿À"));
		hs.add(new String("±èÁØÀ°"));
		hs.add(new String("±èÁØÄ¥"));
		hs.add(new String("±èÁØÆÈ"));
		hs.add(new String("±èÁØÆÈ"));

		System.out.println(hs);
	}
}
