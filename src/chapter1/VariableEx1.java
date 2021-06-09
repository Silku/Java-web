package chapter1;

public class VariableEx1 {

	public static void main(String[] args) {
		int level;
		level = 10;
		level = 20;
		
		System.out.println("level변수의 값은 " + level + "입니다.");
		//level변수의 값은 20입니다.
		
		int year = 2021;
		int month = 5;
		int day = 12;
		
		System.out.println("오늘의 날짜는 " + year + "." + month + "." + day + "입니다.");
		System.out.print("오늘의 날짜는 ");
		System.out.print(year);
		System.out.print(".");
		System.out.print(month);
		System.out.print(".");
		System.out.print(day);
		System.out.println("입니다.");
	}

}
