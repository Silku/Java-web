package chapter6;

public class PrivateEx2 {
	private int studentID;	
	private String studentName;
	private int  studentYear;
	private int Group;
	
	public PrivateEx2() {
	
	}
	
	public PrivateEx2(int studentID) {
		this.studentID = studentID;
	}
	
	
		public int getStudentID() {
			return studentID;
		}
		public void setStudentID(int studentID) {
			this.studentID = studentID;
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
		public int getGroup() {
			return Group;
		}
		public void setGroup(int group) {
			Group = group;
		}
		
		
		
}