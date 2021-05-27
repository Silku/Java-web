package chapter6_3;
//static(정적)을 나타내는 예약어 , 모든영역에서 접근가능한거
//STACK은 메소드들로 나누어져있다.
public class Student {
	public static int createCount = 0;
	//static으로 해버리면 모든 영역에서 공유해버려서 최종적으로 가진값이 나옴. count지정하는방법으로 해결하는경우가 있다 ?! 
	//private static int createCount = 0; 카운트 넣어서 이렇게 아래 스튜던트 메소드(?)에다가 studentId += ++createCount; 이러케
	//static이 인스턴스를 안 만들어도 되는것임(?)
	private int studentId = 20210000;			//학번
	private String studentName; //이름
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
