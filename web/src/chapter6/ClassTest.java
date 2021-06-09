package chapter6;

public class ClassTest {

	public static void main(String[] args) {
		Student jun = new Student();
		Student jee = new Student("¹ÚÁöÈ£");
		
		jun.studentID = jun.studentID + 525;
		
		System.out.println(jun.studentID);
		
		System.out.println(jun.studentName);
		System.out.println(jee.studentName);
		System.out.println(jee.studentID);

	}

}
