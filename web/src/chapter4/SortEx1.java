package chapter4;

import java.util.Arrays;
import java.util.Collections;

class People implements Comparable<People>{
		private String name;
		private int age;

public People(String name, int age) {
		this.name = name;
		this.age = age;
	
}
public String print() {
	return "이름:" + name + " 나이:" + age;
}
	@Override
	public int compareTo(People p) {
	return this.age - p.age; // -값, 0 , +값
	}
}


public class SortEx1 {
	//정렬
	public static void main(String[] args) {
		Integer[] arr = {4, 23, 33, 15, 16, 10};
		Arrays.sort(arr); //오름차순 기본값
		for(int i : arr) {
			System.out.println(i);
		}
	
		Arrays.sort(arr, Collections.reverseOrder());
	
		for(int i : arr) {
			System.out.println(i);
		}
		People[] pe = {new People("준일", 20),
				new People("은수", 30),
				new People("종원", 24),
				new People("대양", 22)
		};

		Arrays.sort(pe);
		
		for(People p : pe) {
			System.out.println(p.print());
		}

	}
}	