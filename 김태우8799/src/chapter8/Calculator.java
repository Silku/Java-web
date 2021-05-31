package chapter8;
// 인터페이스 구현할때 아래처럼 한다. 
public abstract class Calculator implements Calc{
	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}
	@Override
	public int substract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

}

