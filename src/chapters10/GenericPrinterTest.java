package chapters10;

public class GenericPrinterTest {

	public static void main(String[] args) {
		ThreeDPrinter<Powder> printerP = new ThreeDPrinter<Powder>();
		ThreeDPrinter<Plastic> printerPt = new ThreeDPrinter<Plastic>();
		
		printerP.setMaterial(new Powder());
		Powder p2 = printerP.getMaterial();
		
		
		
		
		
		// 업캐스팅(묵시적형변환)		아빠와 아들이 있다. 아들은 아빠의 행새를 할 수있다. 
		// 다운캐스팅(명시적형변환)		아빠는 아들이 될 수 없다.(아들)아빠
		/*
		Powder p1 = new Powder();
		Powder p2;
		printer.setMaterial(p1);
		System.out.println(printer.toString());
		p2 = (Powder)printer.getMaterial();
		p2.doPrinting();
		
		Plastic pt1 = new Plastic();
		Plastic pt2;
		printer.setMaterial(pt1);
		System.out.println(printer.toString());
		pt2 = (Plastic)printer.getMaterial();
		pt2.doPrinting();
		*/
	}

}
