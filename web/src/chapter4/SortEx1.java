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
	return "�̸�:" + name + " ����:" + age;
}
	@Override
	public int compareTo(People p) {
	return this.age - p.age; // -��, 0 , +��
	}
}


public class SortEx1 {
	//����
	public static void main(String[] args) {
		Integer[] arr = {4, 23, 33, 15, 16, 10};
		Arrays.sort(arr); //�������� �⺻��
		for(int i : arr) {
			System.out.println(i);
		}
	
		Arrays.sort(arr, Collections.reverseOrder());
	
		for(int i : arr) {
			System.out.println(i);
		}
		People[] pe = {new People("����", 20),
				new People("����", 30),
				new People("����", 24),
				new People("���", 22)
		};

		Arrays.sort(pe);
		
		for(People p : pe) {
			System.out.println(p.print());
		}

	}
}	