package chapter2;

public class StringEx_3 {
//���ڿ��� ����ȯ , 
//�ѤѤѤѤ�JSP���� ���̾���.�ѤѤѤѤ� , ���ͳ� Ȩ������ �α���â�� ������.
	

/*[[����ȯ ������ �Ǽ����� ��ȯ]] 
 *Ŭ������ Ŭ������ ��ȯ���Ѿߵȴ�.
 * 
 * ������ �Ǽ����� ��ȯ
	<DataType.parseDataType(����);>
	int i_Num = Interger.parseInt(s_String);
	double d_Num = Double.parseDouble(s_String);
	
 * 	���ڿ����� ��ȯ
	<DataType.toString(����);>
	String s_String = Integer.toString(i_Num)
	String s_String = Double.toString(d_Num)
	
	�̰��� ���� �ڷ����� ����ȯ�ϴ°��� �ƴϴ�. 
*/	
	
	public static void main(String[] args) {
		// TODO Auto-'generated method stub
		String s_Num = "10.21";
		String s_Num2 = "20.31";
		int i = 10;
		int j = 20;
		
		double d_Num, d_Num2;


		
//		int i_Num = s_Num; 
		System.out.println(i + j);
//		System.out.println((int)s_Num + (int)s_Num2); ���ڿ��� ���ڷ� �ٲ㼭 �ϰ������ ��ȯ�� �ȵǰ� ������ �ȵǴ� ��. �̰ɾ��� �Ұų�.
		//�Ʒ��� ���� ����ȯ �Ѵ�.
		System.out.println(Integer.toString(i) + Integer.toString(j));
//		System.out.println(Integer.parseInt(s_Num) + Integer.parseInt(s_Num2)); 
		// ���Ͱ��� ���� �ڷ����� ����ȯ�ϴ°� �ƴϰ� ���ڿ��� ����ȯ�ϴ� ����.
		// ���� �ڷ����� ����ȯ�ϱ� ���ؼ��� �Ʒ��� ���� �� �� ����.
		System.out.println((int)Double.parseDouble(s_Num) + (int)Double.parseDouble(s_Num2)); //
		d_Num = Double.parseDouble(s_Num); //10.21
		d_Num2 = Double.parseDouble(s_Num2); //20.31

//  �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�		
		Boolean.parseBoolean(s_Num2);
		System.out.println(Integer.toString(i) + Integer.toString(j));
		System.out.println((int)Double.parseDouble(s_Num) + (int)Double.parseDouble(s_Num2));
		System.out.println("d_Num + d_Num2: " + (d_Num+d_Num2));
		System.out.println("d_Num, d_Num2�� ���ڿ� �� : " + Double.toString(d_Num) + Double.toString(d_Num2));
		
		
		
		
		
	}

}
