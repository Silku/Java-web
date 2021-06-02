package chapters10;

public class GenericPrinterTest {
		
	public static void main(String[] args) {
		ThreeDPrinter<Powder> printerP = new ThreeDPrinter<Powder>();
		ThreeDPrinter<Plastic> printerPt = new ThreeDPrinter<Plastic>();
		
		printerP.setMaterial(new Powder());
		printerPt.setMaterial(new Plastic());
		
		
//		Powder p1 = new Powder();
//		Powder p2;
//		printer.setMaterial(p1);
//		p2 = (Powder)printer.getMaterial();
//		p2.doPrinting();
//		System.out.println(p2);
//		
//		//Object 클래스가 최상위 클래스에 있으니까 Object클래스에 정의함으로써 Object클래스에서 다운캐스팅으로 재정의하는..!?!
//		//아마 그런거 느낌은 알겠는데
////		Object material = p1;
////		Powder p2 = (Powder)material;
//		
//		Plastic pt1 = new Plastic();
//		Plastic pt2;
//		printer.setMaterial(pt1);
//		pt2 = (Plastic)printer.getMaterial();
//		pt2.doPrinting();
//		System.out.println(pt2);
	}

}
