package chapter6_3;

import java.util.Scanner;

public class ArrayClass {
	public static void main(String[] args) {
		Student[] s = new Student[4];
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("�л� ���� �Է�");
		for(int i = 0; i < s.length; i++) {
			s[i] = new Student();
			s[i].setStudentName("������" + i);
			s[i].setStudentAge(15 + i);
			s[i].setStudentGrade("A");
		}
		Integer.parseInt(sc.nextLine());
		
		/*
		for(int i = 0; i < s.length; i++) {
			s[i] = new Student();
			System.out.println((i+1) + "��° �Է�");
			System.out.print("�й�: ");
			s[i].setStudentId(Integer.parseInt(sc.nextLine()));
			
			System.out.println("�̸�: ");
			s[i].setStudentName(sc.nextLine());
			
			System.out.println("����: ");
			s[i].setStudentAge(Integer.parseInt(sc.nextLine()));
			
			System.out.println("����: ");
			s[i].setStudentGrade(sc.nextLine());
		}
		*/
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i].getStudentName() + "�л��� ����");
			System.out.println("�й�: " + s[i].showId());
			System.out.println("����: " + s[i].getStudentAge());
			System.out.println("����: " + s[i].getStudentGrade());
			System.out.println();
		}
	}
}
