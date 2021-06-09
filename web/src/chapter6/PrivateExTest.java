package chapter6;

public class PrivateExTest {
	
	public void output(PrivateEx p) {
		System.out.println(p.getiNum());
		System.out.println(p.getiNum2());
		System.out.println(p.getStr());
		System.out.println(p.getStr2());
	}

	public static void main(String[] args) {
		PrivateExTest t = new PrivateExTest();
		
		PrivateEx pe = new PrivateEx(100, 200, "김준일", "안대양");
		PrivateEx pe2 = new PrivateEx(300, 400, "손효현", "박용수");
		
		//pe.output();
		//pe2.output();
		/*
		pe.iNum = 100;
		pe.iNum2 = 200;
		pe2.iNum = 300;
		pe2.iNum2 = 400;
		
		pe.str = "김준일";
		pe.str2 = "안대양";
		pe2.str = "손효현";
		pe2.str2 = "박용수";
		*/
		t.output(pe);
		t.output(pe2);
	}

}
