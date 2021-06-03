package chapters11;
/**
 * 
 * 싱글톤 패턴
 * 객체를 유일하게 하나만 생성하여 공유하는 기법
 *	객체가 중복 생성되면 안되는 조건을 가지고 있음.  
 *
 */


public class CarFactory {
	//외부에서 생성할수도 접근할수도 없는데 자기혼자 생성되있는 이 이상한 존재는 뭔가.
		private static CarFactory instance = new CarFactory();
		private Car c;
		private int serialNum = 20210000;
		
		private CarFactory() {
			
		}
		
		public Car creatCar() {
			serialNum++;
			return new Car(serialNum);
		}
	//외부에서 생성된 메소드로 인스턴스로 접근이 됨.	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;	
	}	
		
}
