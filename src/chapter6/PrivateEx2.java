package chapter6;

public class PrivateEx2 {
	private int studentId;		//정수형 학번
	private String studentName;	//문자열 이름
	private int studentYear;		//정수형 학년
	private int studentGroup;	//정수형 반
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentYear() {
		return studentYear;
	}

	public void setStudentYear(int studentYear) {
		this.studentYear = studentYear;
	}

	public int getStudentGroup() {
		return studentGroup;
	}

	public void setStudentGroup(int studentGroup) {
		this.studentGroup = studentGroup;
	}

	public PrivateEx2() {
		
	}
	
	public PrivateEx2(int studentId) {
		this.studentId = studentId;
	}
}
