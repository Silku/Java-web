package chapter2;

public class OperationEx3 {
//���մ��Կ����� , += ,-= ,*= , /= , %=
	public static void main(String[] args) {
		
		int i_Num = 10;
		int i_Num2 = 20;
		int i_Num3 = 30;
		int i_Num4 = 40;		
		int i_Num5 = 50;		
		
		i_Num = i_Num + 30;   //
		i_Num2 = i_Num2 - 20; // �̷������� ���°� �����ϱ⶧���� ����ϴ°� �Ʒ��� ���� += -=
		
		i_Num += 10;
		i_Num2 -= 10;
		i_Num3 *= 10;
		i_Num4 /= 10;
		i_Num5 %= 10;
		
		System.out.println(i_Num);
		System.out.println(i_Num2);
		System.out.println(i_Num3);
		System.out.println(i_Num4);
		System.out.println(i_Num5);
		

	}

}
