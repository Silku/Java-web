package chapter6_3;

import java.util.Scanner;

public class ArrayClass {
	public static void main(String[] args) {
		Student[] s = new Student[4];
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("학생 정보 입력");
		for(int i = 0; i < s.length; i++) {
			s[i] = new Student();
			s[i].setStudentName("김준일" + i);
			s[i].setStudentAge(15 + i);
			s[i].setStudentGrade("A");
		}
		Integer.parseInt(sc.nextLine());
		
		/*
		for(int i = 0; i < s.length; i++) {
			s[i] = new Student();
			System.out.println((i+1) + "번째 입력");
			System.out.print("학번: ");
			s[i].setStudentId(Integer.parseInt(sc.nextLine()));
			
			System.out.println("이름: ");
			s[i].setStudentName(sc.nextLine());
			
			System.out.println("나이: ");
			s[i].setStudentAge(Integer.parseInt(sc.nextLine()));
			
			System.out.println("성적: ");
			s[i].setStudentGrade(sc.nextLine());
		}
		*/
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i].getStudentName() + "학생의 정보");
			System.out.println("학번: " + s[i].showId());
			System.out.println("나이: " + s[i].getStudentAge());
			System.out.println("성적: " + s[i].getStudentGrade());
			System.out.println();
		}
	}
}
