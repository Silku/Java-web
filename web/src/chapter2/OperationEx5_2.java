package chapter2;

public class OperationEx5_2 {

	public static void main(String[] args) {
		
		int schoolYear = 2; //학년
		
		char schoolYearKr = ( (schoolYear == 1) ? '일' : ((schoolYear == 2) ? '이' : ( (schoolYear == 3) ? '삼' : 'X') ) );
		
		System.out.println("저의 학년은 " + schoolYearKr + "학년입니다.");
		
		int type = 3;
		
		int lowSize = 100;
		int calSize = 200;
		
		boolean trueFalse = (type == 1 ? (lowSize > calSize) : (type == 2) ? (lowSize < calSize) : false);
		
		System.out.println("type: " + type + " 결과: " + trueFalse);
		
		int type2 = 4; //1 ~ 3 1: 축구, 2: 농구, 3: 골프
		//type2가 1이면 축구를 출력하고 2면 농구를 출력하고 3이면 골프를 출력해라 그리고 1,2,3이 아니면 아무것도 출력하지 마라.
		
		System.out.println(type2 == 1 ? "축구" : type2 == 2 ? "농구" : type2 == 3 ? "골프" : "");

	}

}
