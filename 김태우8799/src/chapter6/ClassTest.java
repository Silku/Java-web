package chapter6;

public class ClassTest {

	public static void main(String[] args) {
		Student jun = new Student();  // Student Ŭ������ �ִ°� �ҷ����µ�.. jun�̶�� ������ �ְ� ���ο� �ν��Ͻ��� �����ҰŰ�.
		Student jee = new Student(); //Student Ŭ������ studentId���� �ִµ� �ű�ٰ� �޼ҵ� ������ �ϴ� �� Ŭ�������� 20210000 ���� �־�δϱ� 
		jun.studentID = jun.studentID+525; 	//student id���� �⺻������ 20210000���� ����ְ� �ű�ٰ� + 525�� ��Ű�°Ű�.. 
//		jee.studentID = jee.studentID+526; //
		jun.studentName = "";
		jee.studentName = "����ȣ";
		
		System.out.println(jun.studentName);
		System.out.println(jun.studentID);
		System.out.println(jee.studentName);
		System.out.println(jee.studentID);
	}

		
	
}
