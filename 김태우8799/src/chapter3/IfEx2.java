package chapter3;
// if , else ������ else if�� ���� 
// else �ؿ� {}�� ����� �ؿ��ִ�  if  else if �ϳ��� ����(�³�? ��ɾ�?)�� �����ϴ°���
/* ���α׷��� ���������� ����Ǳ� ������ ���� �������� �Ųٷ� if ������ ������� ���������� �����̵Ǽ� ���α׷��� ������ �߻����� ������,
 *  ����� ���ϴ� ����� �ȳ��ü� ����.
	������� �Ʒ��Ͱ��� A,b,c ,90,80,70�� �ذ� �ƴ� 
	c b a70 80 90�̷������� ��������
*/

public class IfEx2 {

	public static void main(String[] args) {

		int score = 99;
		if(score >=90) {
			System.out.println("A���");
		}
		else{
			if(score >=80) {
				System.out.println("B���");
			}
			// else �ؿ� {}�� ����� �ؿ��ִ�  if  else if �ϳ��� ����(�³�? ��ɾ�?)�� �����ϴ°���
			else if(score >=70) {
					System.out.println("C���");
				}
				else {
					System.out.println("F���");
				}
			
	}
	}

}
