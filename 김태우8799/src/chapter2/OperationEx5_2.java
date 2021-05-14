 package chapter2;

public class OperationEx5_2 {
//삼항 연산자 문제연습
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 답안 1.
//		int schoolYear = 1; //1학년
//		System.out.println((schoolYear ==1) ? "저의 학년은 1학년입니다." : (schoolYear == 2) ? "저의 학년은 2학년입니다." : "저의 학년은 3학년입니다." );
	
		//2. 답안2.
		int schoolYear = 3;
		char schoolYearKr = (schoolYear ==1) ? '일' : (schoolYear == 2) ? '이' : (schoolYear == 3) ? '삼' : 'X';
				
		System.out.println("저의 학년은 " + schoolYearKr + "학년입니다.");
		
		
		
		
		//3. 삼항연산자 다른예제 , 삼항연산자 중첩해서 쓰는방법임.
		/*
		int type = 2;
		
		int lowSize = 100;
		int calSize = 200;
		boolean trueFalse = (type == 1 ? (lowSize > calSize) : (type ==2) ? (lowSize < calSize) : false);
		
		System.out.println("타입 : "+ type +" 결과 : " + trueFalse);
		*/
		
		
		//4.int type2 = 1;   1~3    1:축구 ,2:농구 3:골프
		
//		int type2 = 3;
//		char subject = (type2 == 1) ? '축' : (type2 == 2) ? '농' : (type2 == 3) ? '골' : 'x';
//		char subject2 = (type2 == 1) ? '구' : (type2 == 2) ? '구' : (type2 == 3) ? '프' : ' ' ;
//		System.out.println("나의 취미는 " + subject + subject2 + "입니다."  );
//		
		
		//4.1 
		int type2 = 1;
		String subject = (type2 == 1) ? "축구" : (type2 == 2) ? "농구" : (type2 == 3) ? "골프" : "";
		System.out.println("나의 취미는 " + subject + "입니다."  );
		
		
	}
	

}




//int trueFalse;
//trueFalse = (schoolYear == 1) ? 1 : 0;
//trueFalse = (schoolYear == 2) ? 2 : 0;
//trueFalse = (schoolYear == 3) ? 3 : 0;
//
//System.out.println("저의 학년은 " + trueFalse+"학년입니다.");
//위에는 시도했던 뻘짓