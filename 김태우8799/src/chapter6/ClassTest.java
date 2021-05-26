package chapter6;

public class ClassTest {

	public static void main(String[] args) {
		Student jun = new Student();  // Student 클래스에 있는걸 불러오는데.. jun이라는 변수가 있고 새로운 인스턴스로 생성할거고.
		Student jee = new Student(); //Student 클래스에 studentId값이 있는데 거기다가 메소드 역할을 하는 그 클래스에서 20210000 값을 넣어두니깐 
		jun.studentID = jun.studentID+525; 	//student id에는 기본적으로 20210000값이 들어있고 거기다가 + 525를 시키는거고.. 
//		jee.studentID = jee.studentID+526; //
		jun.studentName = "";
		jee.studentName = "박지호";
		
		System.out.println(jun.studentName);
		System.out.println(jun.studentID);
		System.out.println(jee.studentName);
		System.out.println(jee.studentID);
	}

		
	
}
