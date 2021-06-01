package chapter9;
class Student{
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
			this.studentId = studentId;
			this.studentName = studentName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return studentId + " , " + studentName;
	}
	@Override
	public boolean equals(Object obj) { //반환형이 불린
		Student s = (Student)obj; //(Student)로 다운캐스팅
		if(this.studentId == s.studentId) {
			if(this.studentName.equals(s.studentName)) {
				return true;
			}
			return false;
		}
		return false;
	}
	
	
}
public class EqualEx {
	public static void main(String[] args) {
		Student s1 = new Student(100,"김준일");
//		Student s2 = new Student(200,"박준일");
		Student s2 = new Student(100,"김준일");
		Student s3 = s1;
		
		if(s1 == s3) {
			System.out.println(s1 + ", " + s3 + "의 주소는 같습니다.");
		}else {
			System.out.println(s1 + ", " + s3 + "의 주소는 다릅니다.");
		}
		if(s1.equals(s3)) {
			System.out.println(s1 + ", " + s3 + "는 동일합니다.");
		}else {
			System.out.println(s1 + ", " + s3 + "는 동일하지 않습니다");
		}
		
		System.out.println();
		if(s1 == s2) {
			System.out.println(s1 + ", " + s2 + "의 주소는 같습니다.");
		}else {
			System.out.println(s1 + ", " + s2 + "의 주소는 다릅니다.");
		}
		if(s1.equals(s2)) {
			System.out.println(s1 + ", " + s2 + "는 동일합니다.");
		}else {
			System.out.println(s1 + ", " + s2 + "는 동일하지 않습니다");
		}
		
		
	}
}
	
		
		
	