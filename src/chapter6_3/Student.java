package chapter6_3;

// static(정적)을 나타내는 예약어
// 

public class Student {
	public static int createCount = 0;
	private int studentId = 20210000; 			//학번
	private String studentName;		//이름
	private int studentAge;			//나이
	private String studentGrade;	//성적
	
	public Student() {
		studentId += ++createCount;
		showCount();
	}

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentGrade() {
		return studentGrade;
	}
	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}
	
	public int showId() {
		return studentId;
	}
	
	public static int showCount() {
		return createCount;
	}
	
}
