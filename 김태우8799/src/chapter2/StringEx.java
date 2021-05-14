package chapter2;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String은 클래스. 대문자로 시작하는건 클래스. 일반적인 자료형은 소문자로 시작하는데 다르죠.
		//문자열은 기본자료형에 속하지 않는다.
		//API에서 제공하는 String class를 이용
		//자바에서는 라이브러리에(JRE) API가 있다.
		
		String name = "코리아";
		String sex = "남";
		String phoneNum = "010-1234-8799";
		String addr = "부산 동래구";		
		
	
		System.out.println("[개인 정보 조회]\n"); 
		System.out.print("이름 : ");
		System.out.println(name);
		System.out.print("성별 : ");
		System.out.println(sex);
		System.out.print("연락처 : ");
		System.out.println(phoneNum);
		System.out.print("주소 : ");
		System.out.println(addr);
		System.out.println("<모든 데이터를 조회하였습니다.>");
		System.out.println("----------------------------");
		
	}

}
