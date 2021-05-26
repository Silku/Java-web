package chapter6;
//이러케 만들믄 안대... 다른 클래스 데이터 값에 계속 간섭하도록.... (?)
//왜캐 복잡하게 하냐 ... 이게 바로 클래스 내부의 정보 은닉성을 위해서다.
public class PrivateExTest {

	public void output(PrivateEx p) {
		System.out.println(p.getiNum());
		System.out.println(p.getiNum2());
		System.out.println(p.getStr());
		System.out.println(p.getStr2());
	}

	public static void main(String[] args) {
		PrivateExTest t = new PrivateExTest();
		PrivateEx pe = new PrivateEx(100,200,"김준일","이은수");
		PrivateEx pe2 = new PrivateEx(300,400,"최종원","권혁인");

		
		
//		pe.output();
//		pe2.output();
		
//		pe.iNum = 100;
//		pe.iNum2 = 100;
//		pe2.iNum = 300;
//		pe2.iNum2 = 400;
//		
//		pe.str = "김준일";
//		pe.str2 = "안대양";
//		pe2.str = "손효현";
//		pe2.str2 = "박용수";
//		
		t.output(pe);
		t.output(pe2);
		
	}

}
