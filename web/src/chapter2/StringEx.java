package chapter2;

public class StringEx {

	public static void main(String[] args) {
		String name = "김준일";
		String maleFemale = "남";
		String phoneNum = "010-9988-1916";
		String addr = "부산 동래구";
		
		System.out.print("[개인 정보 조회]\n"); //세미콜론
		System.out.print("이름: ");
		System.out.println(name);
		System.out.print("성별: ");
		System.out.println(maleFemale);
		System.out.print("연락처: ");
		System.out.println(phoneNum);
		System.out.print("주소: ");
		System.out.println(addr);
		System.out.println("<모든 데이터를 조회하였습니다.>");
		System.out.println("----------------------------");
	}

}
