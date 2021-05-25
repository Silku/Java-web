package chapter6;

public class Student {
	String studentName;
	int studentID;
	int grade;
	String address;
	
	void test() {
		System.out.println("테스트 출력문입니다.");
	}
	public Student() {
		studentID = 20210000;
	}
	public Student(String stName) {
		studentName = stName;
	}
}
