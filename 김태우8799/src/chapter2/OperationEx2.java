package chapter2;

public class OperationEx2 {

	public static void main(String[] args) {
		//����������
		int gameScore = 150;
		
		int lastScore = ++gameScore;
		
		System.out.println("gameScore : " +gameScore);
		System.out.println("lastScore : " + lastScore); 
		System.out.println("lastScore : " + ++lastScore); //�������ؼ� 1�����Ѱ��� ���(152)
		System.out.println("lastScore : " +lastScore++); //�������ؼ� ���⼭�� ������ ��� (152), ������ 1�����Ѱ�
		System.out.println("lastScore : " +lastScore);
	
		System.out.println("gameScore : " + --gameScore);
		System.out.println("gameScore : " + gameScore--);
		System.out.println("gameScore : " + gameScore);
	}
		
	
	
//		System.out.println("lastScore : " +gameScore++);
//		System.out.println("lastScore : " +gameScore+++"��");
//		System.out.println("lastScore : " +gameScore+++"��");
//		System.out.println("lastScore : " +gameScore+++"ȣ");
	
}
