package chapter8;

public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);		//µ¡¼À
	int substract(int num1, int num2);	//»¬¼À
	int times(int num1, int num2);		//°ö¼À
	int divide(int num1, int num2);		//³ª´°¼À
	
	default void description() {
		System.out.println("Á¤¼ö °è»ê±â¸¦ ±¸ÇöÇÕ´Ï´Ù.");
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		return total;
	}
	/*
	private void myMethod() {
		System.out.println("private ¸Þ¼ÒµåÀÔ´Ï´Ù.");
	}
	
	private static void myStaticMethod() {
		
	}
	*/
}
