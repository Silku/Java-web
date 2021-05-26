package chapter6;

import java.util.Scanner;

import chapter5.Car;


public class Cartest {
	Scanner sc = new Scanner(System.in);
	
	String control(Car c) {
		c.carInfo();
		System.out.println("1. �ӷ� ����");
		System.out.println("2. �ӷ� ����");
		System.out.println("b. �ٸ� ���� ����");
		System.out.print("����� ������ �ּ���: ");
		String select = sc.nextLine();
		
		if(select.equals("1")) {
			c.speedUp();
			c.carInfo();
		}else if(select.equals("2")) {
			c.speedDown();
			c.carInfo();
		}else {
			System.out.println("�Է¿���");
		}
		return select;
	}

	public static void main(String[] args) {
		Cartest ct = new Cartest();
		
		Car tesla1 = new Car();
		Car tesla2 = new Car("TESLA", "Model 3", "BLACK", 280);
		Car tesla3 = new Car("TESLA", "Model X", "WHITE", 290);
		
		tesla1.company = "TESLA";
		tesla1.model = "Model S";
		tesla1.color = "RED";
		tesla1.maxSpeed = 300;
		tesla1.speed = 0;
		
		
		boolean mloop = true;
		
		while(mloop) {
			System.out.println("1. " + tesla1.model);
			System.out.println("2. " + tesla2.model);
			System.out.println("3. " + tesla3.model);
			System.out.print("��Ʈ���� ������ ������ �ּ���: ");
			String select = ct.sc.nextLine();
			
			if(select.equals("1")) {
				while(true) {
					if(ct.control(tesla1).equals("b")) {
						break;
					}
				}
			}else if(select.equals("2")) {
				while(true) {
					if(ct.control(tesla2).equals("b")) {
						break;
					}
				}
			}else if(select.equals("3")) {
				while(true) {
					if(ct.control(tesla3).equals("b")) {
						break;
					}
				}
			}else {
				System.out.println("�Է¿���");
			}
		}

	}

}
