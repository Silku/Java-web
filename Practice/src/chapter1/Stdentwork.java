package chapter1;

import java.util.Scanner;

public class Stdentwork {
// 작업목표 검색하는대로 다 학생 소속과 이름 다 확인할수있는 검색시스템
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//대학교와 학생이름 두개를 입력받아서 그 학생을 찾아내는 프로그램 숙제로 만들어보세요!
		//초중고 구분, 대학교이름, 학생이름
		
		Scanner sc = new Scanner(System.in);
		
		String [] studentName = { "소지섭", "원빈", "이덕화", "강호동", "유재석", "안정환","손흥민", "이천수", "이재용", "문재인"};
		String [][]schoolName = {{}};
		String [][][]schoolType = {{{"초등", "중","고등", "대"}}};
		
		System.out.println("학생지원시스템에 오신것을 환영합니다.");
		System.out.println("검색하고자 하는 학교의 유형은 무엇입니까?.");
//		for(int i = 0; i < schoolType[0][0][0].length; i ++) {
//			System.out.println( (i+1)+". "+ schoolType[0][0][0] +"학교");
//		}
//		System.out.println("1.초등학교");
//		System.out.println("2.중학교");
//		System.out.println("3.고등학교");
//		System.out.println("4.대학교");
//		
//		System.out.println("검색하고자 하는 학교의 이름은 무엇입니까?.");
//		System.out.println("1.부산초등학교");
//		System.out.println("2.장전초등학교");
//		System.out.println("3.동래초등학교");
//		
//		System.out.println("1.부산중학교");
//		System.out.println("2.장전중학교");
//		System.out.println("3.동래중학교");
//		
//		System.out.println("1.부산고등학교");
//		System.out.println("2.장전고등학교");
//		System.out.println("3.동래고등학교");
//		
//		System.out.println("1.부산대학교");
//		System.out.println("2.장전대학교");
//		System.out.println("3.동래대학교");
		
		System.out.println("검색하고자 하는 학생의 이름은 무엇입니까?.");
		for(int i = 0; i < studentName.length; i ++) {
			System.out.println( (i+1)+". "+studentName[i] +" 학생");
		}
	
		System.out.println("찾으시는 학생의 정보는 다음과 같습니다.");
		System.out.println("학생");
		
	}

}
