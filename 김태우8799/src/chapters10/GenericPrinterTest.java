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
//		//Object Ŭ������ �ֻ��� Ŭ������ �����ϱ� ObjectŬ������ ���������ν� ObjectŬ�������� �ٿ�ĳ�������� �������ϴ�..!?!
//		//�Ƹ� �׷��� ������ �˰ڴµ�
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
