package chapters10;

public class GenericPrinterTest {

	public static void main(String[] args) {
		ThreeDPrinter<Powder> printerP = new ThreeDPrinter<Powder>();
		ThreeDPrinter<Plastic> printerPt = new ThreeDPrinter<Plastic>();
		
		printerP.setMaterial(new Powder());
		Powder p2 = printerP.getMaterial();
		
		
		
		
		
		// ��ĳ����(����������ȯ)		�ƺ��� �Ƶ��� �ִ�. �Ƶ��� �ƺ��� ����� �� ���ִ�. 
		// �ٿ�ĳ����(���������ȯ)		�ƺ��� �Ƶ��� �� �� ����.(�Ƶ�)�ƺ�
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
