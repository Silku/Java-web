package chapter6;

public class Car {
		private String company; //자동차 회사
		private String model; //자동차 모델
		private String color; //색상
		private int maxSpeed; //최대 속도
		private int speed; //현재 속도
		
		public Car() { //생성자
			
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

		public Car(String cp, String m, String c, int ms) { //생성자 오버로딩
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
				System.out.println("더이상 속도를 올릴 수 없습니다.");
			}
		}
		
		void speedDown() {
			if(0 < speed) {
				speed -= 5;
			}else{
				System.out.println("차량이 정지 상태입니다.");
			}
		}
		
		void carInfo() {
			if(speed < maxSpeed && speed > 0) {
				System.out.println("현재 속도: 시속 " + speed +"km");
			}else {
				System.out.println("차량이 정지 상태입니다.");
			}
		}
	}