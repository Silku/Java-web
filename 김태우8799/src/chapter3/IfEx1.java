package chapter3;

public class IfEx1 {

	public static void main(String[] args) {
		int num = 10;
		
//	1.	if �帧 ����.1
//		if(num > 20) {num -=10;}
//		if(num <=20) {num+=10;}
//	2. if���� else���.2	
//		if(num > 20) {num -=10;}
//		else{num+=10;}
		if(num > 20) {
			num -=10; //�鿩����
			}
		else num+=10;   // �ڵ尡 1���϶��� �߰�ȣ ������ �����ϴ�. �������ϋ��� �߰�ȣ ��� ������������ߵȴ�.
			
		System.out.println(num);
		
	}

}
