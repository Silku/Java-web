package chapter2;

import java.util.Scanner;

// SC�� Ű������ �Է��� ���� Ŭ����
// SCanner Ŭ����
// ���̺귯��(API)�� Ŭ������ ����ϱ� ���ؼ��� 
// import�� �Ͽ����Ѵ�.
// import java.util.Scanner;
// �ڵ����� ���̺귯�� �߰��ϴ� ���? ->
// ctrl + Shift + O

//Scanner console â�� �Է��� �ޱ� ���� Ŭ����
//System.in / out �ü�� System�� �Է°� ����� �ǹ��Ѵ�.
//Scanner Ŭ���� ���ο� ���ڿ��� �Է� �޴� ���ڿ��� �Է� �޴� �޼ҵ��?
//next() ���ڿ������� ������ �������� �ʴ´�.
//nextline()	���ڿ� ���� ��� ������ ǥ���� �� �ִ�.
public class StringSC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine(); //10000
		String str2 = sc.nextLine(); //555
		String str3 = sc.nextLine(); //3.14
//     �ѤѤѤѤѤѾƷ� ���� Ǯ�� �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�System.out.println("str1+ str2 = " + �����);
//		System.out.println("str1+ str2 = " + �����);
//		System.out.println("str + str2 * str 3 =" +�����);
		
		
		//1. ù��° ���νǽ�. �Ʒ��� ����Ҷ� ��ȣ �����ִ� 10000+555�� 8���� ����� ���� ���� ��ȣ���ִ� ���� �ջ�Ǽ� 10555��		
//		System.out.println("str1+ str2 = " +(Integer.parseInt(str1)+Integer.parseInt(str2) ));
//		System.out.println("str + str2 * str 3 =" +(Integer.parseInt(str1)+Integer.parseInt(str2))*Double.parseDouble(str3) );
		
		//2. �ι�° ���νǽ�. �׽�Ʈ2
//		System.out.println("str1+ str2 = " +((int)Integer.parseInt(str1)+(int)Integer.parseInt(str2) ));
//		System.out.println("str + str2 * str 3 =" +((int)Integer.parseInt(str1)+(int)Integer.parseInt(str2))*(Double)Double.parseDouble(str3) );
		//3. ����� Ǯ�̽ǽ�.
		System.out.println("str1+ str2 = " +(Integer.parseInt(str1)+Integer.parseInt(str2) ));
		System.out.println("str + str2 * str 3 =" +(Integer.parseInt(str1)+Integer.parseInt(str2))*Double.parseDouble(str3) );
// �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�		
//		String test = "12345";
//		char [5] c = {'1','2','3','4','5','\0'};
//		
// �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�				
//		String str1 = sc.next();
//		String str2 = sc.nextLine();
//		String str3 = sc.nextLine();
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str3);
		
	}

}
