package chapter5;

public class Car {
		public String company; //�ڵ��� ȸ��
		public String model; //�ڵ��� ��
		public String color; //����
		public int maxSpeed; //�ִ� �ӵ�
		public int speed; //���� �ӵ�
		
		public Car() { //������
			
		}
		
		public Car(String cp, String m, String c, int ms) { //������ �����ε�
			company = cp;
			model = m;
			color = c;
			maxSpeed = ms;
			speed = 0;
		}
		
		void speedUp() {
			if(speed < maxSpeed) {
				speed += 5;
			}else{
				System.out.println("���̻� �ӵ��� �ø� �� �����ϴ�.");
			}
		}
		
		void speedDown() {
			if(0 < speed) {
				speed -= 5;
			}else{
				System.out.println("������ ���� �����Դϴ�.");
			}
		}
		
		void carInfo() {
			if(speed < maxSpeed && speed > 0) {
				System.out.println("���� �ӵ�: �ü� " + speed +"km");
			}else {
				System.out.println("������ ���� �����Դϴ�.");
			}
		}
	}