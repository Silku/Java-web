package chapter6;


public class StudentTest {
	//Student jun , jun이라는 객체를 선언;
	// jun = new Student(); 생성자를 통해 생성을 하면 인스턴스가 된다.
	// 
	static void output(Student s) {
		System.out.println(s.studentID);
		System.out.println(s.studentName);
		System.out.println(s.grade);
		System.out.println(s.address);
	}
	
	
	public static void main(String[] args) {
		StudentTest st = new StudentTest(); //st라는 인스턴스를 만든것이다.
		Student jun = new Student(); //생성자
		jun.studentID = 20210525;
		jun.studentName = "김준일";
		jun.grade = 80;
		jun.address = "부산 동래구";
		jun.test();
		
		Student jee = new Student(); 
		jee.studentID = 20210526;
		jee.studentName = "박지호";
		jee.grade = 90;
		jee.address = "부산 연제구";
		jun.test();
		
		st.output(jun);
		st.output(jee);
	
		

	}

}
