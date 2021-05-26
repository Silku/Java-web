package chapter6;

public class Car {
		private String company; //�ڵ��� ȸ��
		private String model; //�ڵ��� ��
		private String color; //����
		private int maxSpeed; //�ִ� �ӵ�
		private int speed; //���� �ӵ�
		
		public Car() { //������
			
		}
		
		public String getCompany() {
			return company;
		}

		public void setCompany(String company) {
			this.company = company;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public int getMaxSpeed() {
			return maxSpeed;
		}

		public void setMaxSpeed(int maxSpeed) {
			this.maxSpeed = maxSpeed;
		}

		public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
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