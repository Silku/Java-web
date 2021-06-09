package chapter9;

class Student{
	int studentId;
	String studentName;
	
	public Student(int studentId, String sutudentName) {
		this.studentId = studentId;
		this.studentName = sutudentName;
	}
	
	@Override
	public int hashCode() {
		return studentId;
	}
	
	@Override
	public String toString() {
		return studentId + ", " + studentName;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student s = (Student)obj;
		if(this.studentId == s.studentId) {
			if(this.studentName.equals(s.studentName)) {
				return true;
			}
			return false;
		}
		return false;
	}
	
	
}

public class EqualsEx {

	public static void main(String[] args) {
		Student s1 = new Student(100, "������");
		//Student s2 = new Student(200, "����ȣ");
		Student s2 = new Student(100, "������");
		Student s3 = s1;
		
		if(s1 == s3) {
			System.out.println(s1 + ", " + s3 + "�� �ּҴ� �����ϴ�.");
		}else {
			System.out.println(s1 + ", " + s3 + "�� �ּҴ� �ٸ��ϴ�.");
		}
		if(s1.equals(s3)) {
			System.out.println(s1 + ", " + s3 + "�� �����մϴ�.");
		}else {
			System.out.println(s1 + ", " + s3 + "�� �������� �ʽ��ϴ�.");
		}
		
		System.out.println();
		
		if(s1 == s2) {
			System.out.println(s1 + ", " + s2 + "�� �ּҴ� �����ϴ�.");
		}else {
			System.out.println(s1 + ", " + s2 + "�� �ּҴ� �ٸ��ϴ�.");
		}
		if(s1.equals(s2)) {
			System.out.println(s1 + ", " + s2 + "�� �����մϴ�.");
		}else {
			System.out.println(s1 + ", " + s2 + "�� �������� �ʽ��ϴ�.");
		}
		
	}

}
