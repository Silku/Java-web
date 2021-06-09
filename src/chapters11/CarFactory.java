package chapters11;

/**
 * 
 * �̱��� ����
 * ��ü�� �����ϰ� �ϳ��� �����Ͽ� �����ϴ� ���
 * ��ü�� �ߺ� �����Ǹ� �ȵǴ� ������ ������ ����.
 */

public class CarFactory {
	private static CarFactory instance = new CarFactory();
	private Car c;
	private int serialNum = 20210000;
	
	private CarFactory() {
		
	}
	
	public Car creatCar() {
		serialNum++;
		return new Car(serialNum);
	}
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}

}
