package chapter3;

import java.util.Scanner;

public class LoopEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String select = null;
		boolean mLoop = true;
		boolean sLoop = true;
		
		//continue  : �ݺ��� �ȿ��� continue�� ������ ������ �۾��� ���������  
		while(mLoop) {
			System.out.println("i. if");
			System.out.println("s. switch");
			System.out.println("q. ���α׷� ����");
			
			select = sc.nextLine();
			System.out.println("�Է��� ������ : " + select);
			if(select.equals("i") || select.equals("s") || select.equals("q") ) {
				if(select.equals("q")) {
					break;
				}else if(select.equals("i") || select.equals("s")) {
					sLoop = true;
					while(sLoop) {
						System.out.println("1. �����Է�");
						System.out.println("b. �ڷΰ���");
						System.out.println("q. ���α׷� ����");
						System.out.println("����� �����ϼ��� : ");
						String select2 = sc.nextLine();
						if(select2.equals("1")) {
							
						}else if(select2.equals("b")) {
							sLoop = false; //���⼭ �극��ũ�ɸ��� while���� ������.
						}
						else if(select2.equals("q")) {
							sLoop = false;
							mLoop = false;
						}else {
							System.out.println("<�Է¿���!>");
						}			
					}
				}
				
				continue;
			}else {
				System.out.println("<�Է¿���!>");
				System.out.println("���ǹ��� �ٽ� �����ϼ���.");				
				break;	
			}
			
		}
		System.out.println("���α׷��� �����մϴ�.");		
	}

}
