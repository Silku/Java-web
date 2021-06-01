package chapter9;

public class StringTest1 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		//위와 아래의 차이 아래는 abc 자체가 값이자 주소임. 따라서 실행하면 같다라는 결과가 나옴
		//위는 새로운 주소를 만들어내고 주소안에 값이 들어가는거고 따라서 주소값이 다르기때문에 첫 실행문장에서 false값 나옴
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3 == str4);
		System.out.println(str4.equals(str4));
		
	}

}
